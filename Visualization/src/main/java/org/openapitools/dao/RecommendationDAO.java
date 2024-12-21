package org.openapitools.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.openapitools.model.Recomendacion;
import org.openapitools.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class RecommendationDAO {
	private final DataSource dataSource;
	
	@Autowired
    private WebClient webClient;
	
	@Autowired
    public RecommendationDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	public List<Recomendacion> getFilms(int userID) {
		String userServiceUrl = "http://localhost:8082/v1/user/user/"+userID;
		
        String filmServiceUrl = "http://localhost:8080/v1/content/films/genre/{genreID}";
        
        List<Recomendacion> fullList = new ArrayList<>();
        List<Integer> preferences;
        
        Mono<UserData> call = webClient.get()
                .uri(userServiceUrl)
                .retrieve()
                .bodyToMono(UserData.class); // Recibe la respuesta como un Map
        
        UserData user = call.block();
        
        if (user != null) {
            preferences = user.getPreferences();
        }
        else {
            throw new IllegalStateException("El objeto 'user' no debería ser nulo");
        }
        
        List<Mono<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < preferences.size(); i++) {
            Flux<Recomendacion> filmFlux = webClient
                    .get()
                    .uri(filmServiceUrl, preferences.get(i))
                    .retrieve()
                    .bodyToFlux(Recomendacion.class);

            Mono<Void> task = filmFlux.hasElements()
                    .flatMapMany(hasElements -> {
                        if (hasElements) {
                            return filmFlux.take(1).collectList();
                        } else {
                            return Flux.empty();
                        }
                    })
                    .doOnNext(list -> {
                        if (!list.isEmpty()) {
                            synchronized (fullList) {
                                fullList.add(list.get(0)); // Añade solo el primer elemento a fullList
                            }
                        }
                    })
                    .then(); // Conviértelo en un Mono<Void> que representa la finalización de este flujo

            tasks.add(task);
        }
        
        Mono.when(tasks).block();
        
        return fullList;
    }
	
	public List<Recomendacion> getSeries(int userID) {
		String userServiceUrl = "http://localhost:8082/v1/user/user/"+userID;
		
        String serieServiceUrl = "http://localhost:8080/v1/content/series/genre/{genreID}";
        
        List<Recomendacion> fullList = new ArrayList<>();
        List<Integer> preferences;
        
        Mono<UserData> call = webClient.get()
                .uri(userServiceUrl)
                .retrieve()
                .bodyToMono(UserData.class); // Recibe la respuesta como un Map
        
        UserData user = call.block();
        
        if (user != null) {
            preferences = user.getPreferences();
        }
        else {
            throw new IllegalStateException("El objeto 'user' no debería ser nulo");
        }

        List<Mono<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < preferences.size(); i++) {
            Flux<Recomendacion> serieFlux = webClient
                    .get()
                    .uri(serieServiceUrl, preferences.get(i))
                    .retrieve()
                    .bodyToFlux(Recomendacion.class);

            Mono<Void> task = serieFlux.hasElements()
                    .flatMapMany(hasElements -> {
                        if (hasElements) {
                            return serieFlux.take(1).collectList();
                        } else {
                            return Flux.empty();
                        }
                    })
                    .doOnNext(list -> {
                        if (!list.isEmpty()) {
                            synchronized (fullList) {
                                fullList.add(list.get(0)); // Añade solo el primer elemento a fullList
                            }
                        }
                    })
                    .then(); // Conviértelo en un Mono<Void> que representa la finalización de este flujo

            tasks.add(task);
        }
        
        Mono.when(tasks).block();
        
        return fullList;
    }
	
	
	
	
}

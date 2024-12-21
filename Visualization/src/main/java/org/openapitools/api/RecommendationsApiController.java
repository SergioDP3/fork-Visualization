package org.openapitools.api;

import org.openapitools.dao.RecommendationDAO;
import org.openapitools.model.Recomendacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@CrossOrigin(origins = "*")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-06T22:57:10.884527400+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
@Controller
@RequestMapping("${openapi.aPIDeVisualizacionesYRecomendaciones.base-path:/views}")
public class RecommendationsApiController implements RecommendationsApi {

    private final NativeWebRequest request;
    private final RecommendationDAO recommendationDAO;

    @Autowired
    public RecommendationsApiController(NativeWebRequest request, RecommendationDAO recommendationDAO) {
        this.request = request;
        this.recommendationDAO = recommendationDAO;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Override
    public ResponseEntity<List<Recomendacion>> recommendationsFilmUserIDGet(@PathVariable("userID") Integer userID) {
    	List<Recomendacion> list = recommendationDAO.getFilms(userID);
    	
    	if (!list.isEmpty()) {
            return ResponseEntity.ok(list);  // Devuelve las recoemndaciones si existe
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // 404 si no existe
        }
    }
    
    @Override
    public ResponseEntity<List<Recomendacion>> recommendationsSerieUserIDGet(@PathVariable("userID") Integer userID) {
    	List<Recomendacion> list = recommendationDAO.getSeries(userID);
    	
    	if (!list.isEmpty()) {
            return ResponseEntity.ok(list);  // Devuelve las recomendaciones si existe
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // 404 si no existe
        }
    }

}

package org.openapitools.api;

import org.openapitools.dao.VisualizationDAO;
import org.openapitools.model.OpcionesVisualizacion;
import org.openapitools.model.Visualizacion;
import org.openapitools.model.VisualizationUserIDFilmFilmIDDownloadPost200Response;
import org.openapitools.model.VisualizationUserIDFilmFilmIDLanguagePostRequest;
import org.openapitools.model.VisualizationUserIDFilmFilmIDSubtitlesPostRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
public class VisualizationApiController implements VisualizationApi {

    private final NativeWebRequest request;
    private final VisualizationDAO visualizationDAO;

    @Autowired
    public VisualizationApiController(NativeWebRequest request, VisualizationDAO visualizationDAO) {
        this.request = request;
        this.visualizationDAO = visualizationDAO;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    
    @Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDPlayPost (@PathVariable("userID") Integer userID,@PathVariable("filmID") Integer filmID) { 
    	OpcionesVisualizacion opciones = visualizationDAO.playFilm(userID,filmID);
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }
    
    @Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDPlayPost (@PathVariable("userID") Integer userID,@PathVariable("serieID") Integer serieID) { 
    	OpcionesVisualizacion opciones = visualizationDAO.playSerie(userID,serieID);
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

    @Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDPausePost (@PathVariable("userID") Integer userID,@PathVariable("filmID") Integer filmID) {
    	String pause = "Pausado"; 
    	OpcionesVisualizacion opciones = visualizationDAO.changePauseFilm(userID,filmID,pause);
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

    @Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDPausePost (@PathVariable("userID") Integer userID,@PathVariable("serieID") Integer serieID) {
    	String pause = "Pausado"; 
    	OpcionesVisualizacion opciones = visualizationDAO.changePauseSerie(userID,serieID,pause);
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

	@Override
    public ResponseEntity<Void> visualizationUserIDFilmFilmIDEndPost (@PathVariable("userID") Integer userID,@PathVariable("filmID") Integer filmID) { 
    	boolean result = visualizationDAO.endFilm(userID,filmID);
    	
    	if (result) {
            return ResponseEntity.ok().build();  // 200 OK si se ha eliminado correctamente
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // 404 si no existe el actor
    }

	@Override
    public ResponseEntity<Void> visualizationUserIDSerieSerieIDEndPost (@PathVariable("userID") Integer userID,@PathVariable("serieID") Integer serieID) { 
    	boolean result = visualizationDAO.endSerie(userID,serieID);
    	
    	if (result) {
            return ResponseEntity.ok().build();  // 200 OK si se ha eliminado correctamente
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // 404 si no existe el actor
    }

	@Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDLanguagePost (@PathVariable("userID") Integer userID,@PathVariable("filmID") Integer filmID, @RequestBody VisualizationUserIDFilmFilmIDLanguagePostRequest visualizationUserIDFilmFilmIDLanguagePostRequest) {
    	String language = visualizationUserIDFilmFilmIDLanguagePostRequest.getLanguageCode();
    	OpcionesVisualizacion opciones = visualizationDAO.changeLanguageFilm(userID,filmID,language);
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

	@Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDLanguagePost (@PathVariable("userID") Integer userID,@PathVariable("serieID") Integer serieID, @RequestBody VisualizationUserIDFilmFilmIDLanguagePostRequest visualizationUserIDFilmFilmIDLanguagePostRequest) {
    	String language = visualizationUserIDFilmFilmIDLanguagePostRequest.getLanguageCode();
    	OpcionesVisualizacion opciones = visualizationDAO.changeLanguageSerie(userID,serieID,language);
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

	@Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDSubtitlesPost (@PathVariable("userID") Integer userID,@PathVariable("filmID") Integer filmID,@RequestBody VisualizationUserIDFilmFilmIDSubtitlesPostRequest visualizationUserIDFilmFilmIDSubtitlesPostRequest) {
    	String confirm = visualizationUserIDFilmFilmIDSubtitlesPostRequest.getLanguageCode();
    	OpcionesVisualizacion opciones = null;
    	
    	if (confirm.equals("Sí")) {
    		opciones = visualizationDAO.changeSubtitlesFilm(userID,filmID,true);
    	}
    	else {
    		opciones = visualizationDAO.changeSubtitlesFilm(userID,filmID,false);
    	}
    	
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

	@Override
    public ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDSubtitlesPost (@PathVariable("userID") Integer userID,@PathVariable("serieID") Integer filmID,@RequestBody VisualizationUserIDFilmFilmIDSubtitlesPostRequest visualizationUserIDFilmFilmIDSubtitlesPostRequest) {
    	String confirm = visualizationUserIDFilmFilmIDSubtitlesPostRequest.getLanguageCode();
    	OpcionesVisualizacion opciones = null;
    	
    	if (confirm.equals("Sí")) {
    		opciones = visualizationDAO.changeSubtitlesSerie(userID,filmID,true);
    	}
    	else {
    		opciones = visualizationDAO.changeSubtitlesSerie(userID,filmID,false);
    	}
    	
    	
    	if (opciones != null) {
    		return ResponseEntity.ok(opciones);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}

    }

	@Override
    public ResponseEntity<List<Visualizacion>> visualizationUserIDContinueWatchingGet (@PathVariable("userID") Integer userID) {
    	List<Visualizacion> list = visualizationDAO.continueWatching(userID);
    	
    	if (!list.isEmpty()) {
    		return ResponseEntity.ok(list);
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    }

	@Override
    public ResponseEntity<VisualizationUserIDFilmFilmIDDownloadPost200Response> visualizationUserIDFilmFilmIDDownloadPost (@PathVariable("userID") Integer userID,@PathVariable("filmID") Integer filmID) {
    	VisualizationUserIDFilmFilmIDDownloadPost200Response mensaje = new VisualizationUserIDFilmFilmIDDownloadPost200Response();
    	mensaje.message("Descargando película...");
        return ResponseEntity.ok(mensaje); 

    }

}

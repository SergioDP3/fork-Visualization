package org.openapitools.api;

import org.openapitools.dao.VisualizationDAO;
import org.openapitools.model.Visualizacion;
import org.openapitools.model.VisualizationsUserIDDelete200Response;


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
public class VisualizationsApiController implements VisualizationsApi {

    private final NativeWebRequest request;
    private final VisualizationDAO visualizationDAO;

    @Autowired
    public VisualizationsApiController(NativeWebRequest request, VisualizationDAO visualizationDAO) {
        this.request = request;
        this.visualizationDAO = visualizationDAO;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Override
    public ResponseEntity<List<Visualizacion>> visualizationsUserIDGet(@PathVariable("userID") Integer userID) {
    	List<Visualizacion> list = visualizationDAO.getVisualizationsByUserId(userID);

        if (!list.isEmpty()) {
            return ResponseEntity.ok(list);  // Devuelve la película si existe
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // 404 si no existe
        }
    
    }
    
    @Override
    public ResponseEntity<VisualizationsUserIDDelete200Response> visualizationsUserIDDelete (@PathVariable("userID") Integer userID) {
    	boolean respuesta = visualizationDAO.deleteVisualizationsByUserId(userID);
    	VisualizationsUserIDDelete200Response mensaje = new VisualizationsUserIDDelete200Response();
    	
    	if (respuesta) {
    		mensaje.message("Hitorial Borrado");
            return ResponseEntity.ok(mensaje);  // Devuelve la película si existe
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // 404 si no existe
        }
    }

}

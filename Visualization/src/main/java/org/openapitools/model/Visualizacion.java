package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * Visualizacion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class Visualizacion {

  private Integer visualizationID;

  private Integer userID;

  private Integer filmID;

  private Integer serieID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime visualizationDate;

  private String progreso;

  public Visualizacion visualizationID(Integer visualizationID) {
    this.visualizationID = visualizationID;
    return this;
  }

  public Visualizacion(Integer visualizationID,Integer userID,Integer filmID,Integer serieID, OffsetDateTime visualizationDate, String progreso) {
	  this.visualizationID = visualizationID;
	  this.userID = userID;
	  this.filmID = filmID;
	  this.serieID = serieID;
	  this.visualizationDate = visualizationDate;
	  this.progreso = progreso;
  }
  
  /**
   * ID de la visualizacion
   * @return visualizationID
   */
  
  @Schema(name = "visualizationID", example = "1", description = "ID de la visualizacion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visualizationID")
  public Integer getVisualizationID() {
    return visualizationID;
  }

  public void setVisualizationID(Integer visualizationID) {
    this.visualizationID = visualizationID;
  }

  public Visualizacion userID(Integer userID) {
    this.userID = userID;
    return this;
  }

  /**
   * ID del usuario
   * @return userID
   */
  
  @Schema(name = "userID", example = "1", description = "ID del usuario", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userID")
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  public Visualizacion filmID(Integer filmID) {
    this.filmID = filmID;
    return this;
  }

  /**
   * ID de pelicula
   * @return filmID
   */
  
  @Schema(name = "filmID", example = "1", description = "ID de pelicula", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filmID")
  public Integer getFilmID() {
    return filmID;
  }

  public void setFilmID(Integer filmID) {
    this.filmID = filmID;
  }

  public Visualizacion serieID(Integer serieID) {
    this.serieID = serieID;
    return this;
  }

  /**
   * ID de serie
   * @return serieID
   */
  
  @Schema(name = "serieID", example = "1", description = "ID de serie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serieID")
  public Integer getSerieID() {
    return serieID;
  }

  public void setSerieID(Integer serieID) {
    this.serieID = serieID;
  }

  public Visualizacion visualizationDate(OffsetDateTime visualizationDate) {
    this.visualizationDate = visualizationDate;
    return this;
  }

  /**
   * Fecha y hora cuando se visualizó el contenido
   * @return visualizationDate
   */
  @Valid 
  @Schema(name = "visualizationDate", example = "2023-10-09T12:00Z", description = "Fecha y hora cuando se visualizó el contenido", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visualizationDate")
  public OffsetDateTime getVisualizationDate() {
    return visualizationDate;
  }

  public void setVisualizationDate(OffsetDateTime visualizationDate) {
    this.visualizationDate = visualizationDate;
  }

  public Visualizacion progreso(String progreso) {
    this.progreso = progreso;
    return this;
  }

  /**
   * Progreso de la visualizacion
   * @return progreso
   */
  
  @Schema(name = "progreso", example = "Viendo", description = "Progreso de la visualizacion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progreso")
  public String getProgreso() {
    return progreso;
  }

  public void setProgreso(String progreso) {
    this.progreso = progreso;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Visualizacion visualizacion = (Visualizacion) o;
    return Objects.equals(this.visualizationID, visualizacion.visualizationID) &&
        Objects.equals(this.userID, visualizacion.userID) &&
        Objects.equals(this.filmID, visualizacion.filmID) &&
        Objects.equals(this.serieID, visualizacion.serieID) &&
        Objects.equals(this.visualizationDate, visualizacion.visualizationDate) &&
        Objects.equals(this.progreso, visualizacion.progreso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visualizationID, userID, filmID, serieID, visualizationDate, progreso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Visualizacion {\n");
    sb.append("    visualizationID: ").append(toIndentedString(visualizationID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    filmID: ").append(toIndentedString(filmID)).append("\n");
    sb.append("    serieID: ").append(toIndentedString(serieID)).append("\n");
    sb.append("    visualizationDate: ").append(toIndentedString(visualizationDate)).append("\n");
    sb.append("    progreso: ").append(toIndentedString(progreso)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


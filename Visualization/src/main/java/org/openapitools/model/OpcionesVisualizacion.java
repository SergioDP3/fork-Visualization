package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * OpcionesVisualizacion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class OpcionesVisualizacion {

  private Integer visualizationID;

  private String estado;

  private String idioma;

  private Boolean subtitulos;

  public OpcionesVisualizacion visualizationID(Integer visualizationID) {
    this.visualizationID = visualizationID;
    return this;
  }
  
  public OpcionesVisualizacion (Integer visualizationID, String estado, String idioma, Boolean subtitulos) {
	  this.visualizationID = visualizationID;
	  this.estado = estado;
	  this.idioma = idioma;
	  this.subtitulos = subtitulos;
  }
  /**
   * ID único de la visualización
   * @return visualizationID
   */
  
  @Schema(name = "visualizationID", example = "1", description = "ID único de la visualización", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visualizationID")
  public Integer getVisualizationID() {
    return visualizationID;
  }

  public void setVisualizationID(Integer visualizationID) {
    this.visualizationID = visualizationID;
  }

  public OpcionesVisualizacion estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Estado de la visualización
   * @return estado
   */
  
  @Schema(name = "estado", example = "reproduciendo", description = "Estado de la visualización", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estado")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public OpcionesVisualizacion idioma(String idioma) {
    this.idioma = idioma;
    return this;
  }

  /**
   * Idioma de la reproducción
   * @return idioma
   */
  
  @Schema(name = "idioma", example = "español", description = "Idioma de la reproducción", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idioma")
  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }

  public OpcionesVisualizacion subtitulos(Boolean subtitulos) {
    this.subtitulos = subtitulos;
    return this;
  }

  /**
   * Subtítulos activados.
   * @return subtitulos
   */
  
  @Schema(name = "subtitulos", example = "true", description = "Subtítulos activados.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtitulos")
  public Boolean getSubtitulos() {
    return subtitulos;
  }

  public void setSubtitulos(Boolean subtitulos) {
    this.subtitulos = subtitulos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpcionesVisualizacion opcionesVisualizacion = (OpcionesVisualizacion) o;
    return Objects.equals(this.visualizationID, opcionesVisualizacion.visualizationID) &&
        Objects.equals(this.estado, opcionesVisualizacion.estado) &&
        Objects.equals(this.idioma, opcionesVisualizacion.idioma) &&
        Objects.equals(this.subtitulos, opcionesVisualizacion.subtitulos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visualizationID, estado, idioma, subtitulos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpcionesVisualizacion {\n");
    sb.append("    visualizationID: ").append(toIndentedString(visualizationID)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("    subtitulos: ").append(toIndentedString(subtitulos)).append("\n");
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


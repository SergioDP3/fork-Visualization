package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VisualizationUserIDFilmFilmIDLanguagePostRequest
 */

@JsonTypeName("_visualization__userID__film__filmID__language_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class VisualizationUserIDFilmFilmIDLanguagePostRequest {

  private String languageCode;

  public VisualizationUserIDFilmFilmIDLanguagePostRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Nombre del idioma a cambiar
   * @return languageCode
   */
  
  @Schema(name = "languageCode", example = "Español", description = "Nombre del idioma a cambiar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisualizationUserIDFilmFilmIDLanguagePostRequest visualizationUserIDFilmFilmIDLanguagePostRequest = (VisualizationUserIDFilmFilmIDLanguagePostRequest) o;
    return Objects.equals(this.languageCode, visualizationUserIDFilmFilmIDLanguagePostRequest.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisualizationUserIDFilmFilmIDLanguagePostRequest {\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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


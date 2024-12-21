package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * VisualizationUserIDFilmFilmIDDownloadPost200Response
 */

@JsonTypeName("_visualization__userID__film__filmID__download_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class VisualizationUserIDFilmFilmIDDownloadPost200Response {

  private String message;

  public VisualizationUserIDFilmFilmIDDownloadPost200Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", example = "Descarga realizada exitosamente", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisualizationUserIDFilmFilmIDDownloadPost200Response visualizationUserIDFilmFilmIDDownloadPost200Response = (VisualizationUserIDFilmFilmIDDownloadPost200Response) o;
    return Objects.equals(this.message, visualizationUserIDFilmFilmIDDownloadPost200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisualizationUserIDFilmFilmIDDownloadPost200Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


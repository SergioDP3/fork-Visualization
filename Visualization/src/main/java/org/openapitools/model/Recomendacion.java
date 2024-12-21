package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * Recomendacion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class Recomendacion {

  private Integer filmID;

  private Integer serieID;

  private String title;

  private String photoURL;

  public Recomendacion filmID(Integer filmID) {
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

  public Recomendacion serieID(Integer serieID) {
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

  public Recomendacion title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Titulo del contenido
   * @return title
   */
  
  @Schema(name = "title", example = "El Señor de los Anillos", description = "Titulo del contenido", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Recomendacion photoURL(String photoURL) {
    this.photoURL = photoURL;
    return this;
  }

  /**
   * Foto del contenido
   * @return photoURL
   */
  
  @Schema(name = "photoURL", example = "https://example.com/photo.jpg", description = "Foto del contenido", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photoURL")
  public String getPhotoURL() {
    return photoURL;
  }

  public void setPhotoURL(String photoURL) {
    this.photoURL = photoURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recomendacion recomendacion = (Recomendacion) o;
    return Objects.equals(this.filmID, recomendacion.filmID) &&
        Objects.equals(this.serieID, recomendacion.serieID) &&
        Objects.equals(this.title, recomendacion.title) &&
        Objects.equals(this.photoURL, recomendacion.photoURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filmID, serieID, title, photoURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recomendacion {\n");
    sb.append("    filmID: ").append(toIndentedString(filmID)).append("\n");
    sb.append("    serieID: ").append(toIndentedString(serieID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    photoURL: ").append(toIndentedString(photoURL)).append("\n");
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


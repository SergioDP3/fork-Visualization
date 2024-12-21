package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * UserData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class UserData {

  private Integer userID;

  private String username;

  private String password;

  private String email;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @Valid
  private List<Integer> preferences = new ArrayList<>();

  public UserData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserData(Integer userID, String username, String password, String email, String name, OffsetDateTime createdAt, List<Integer> preferences) {
    this.userID = userID;
    this.username = username;
    this.password = password;
    this.email = email;
    this.name = name;
    this.createdAt = createdAt;
    this.preferences = preferences;
  }

  public UserData userID(Integer userID) {
    this.userID = userID;
    return this;
  }

  /**
   * ID único del usuario
   * @return userID
   */
  @NotNull 
  @Schema(name = "userID", example = "1", description = "ID único del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userID")
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  public UserData username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Nombre de usuario
   * @return username
   */
  @NotNull 
  @Schema(name = "username", example = "juanperez", description = "Nombre de usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserData password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Contraseña
   * @return password
   */
  @NotNull 
  @Schema(name = "password", example = "1e34r", description = "Contraseña", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Dirección de correo electrónico del usuario
   * @return email
   */
  @NotNull @javax.validation.constraints.Email 
  @Schema(name = "email", example = "juan.perez@example.com", description = "Dirección de correo electrónico del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre completo del usuario
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Juan Pérez", description = "Nombre completo del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserData createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Fecha y hora en que se creó el usuario
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "createdAt", example = "2023-10-09T10:20:30Z", description = "Fecha y hora en que se creó el usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserData preferences(List<Integer> preferences) {
    this.preferences = preferences;
    return this;
  }

  public UserData addPreferencesItem(Integer preferencesItem) {
    if (this.preferences == null) {
      this.preferences = new ArrayList<>();
    }
    this.preferences.add(preferencesItem);
    return this;
  }

  /**
   * Array con los id's de géneros de contenido que le gustan al usuario
   * @return preferences
   */
  @NotNull 
  @Schema(name = "preferences", example = "[1,3,4]", description = "Array con los id's de géneros de contenido que le gustan al usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preferences")
  public List<Integer> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<Integer> preferences) {
    this.preferences = preferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserData userData = (UserData) o;
    return Objects.equals(this.userID, userData.userID) &&
        Objects.equals(this.username, userData.username) &&
        Objects.equals(this.password, userData.password) &&
        Objects.equals(this.email, userData.email) &&
        Objects.equals(this.name, userData.name) &&
        Objects.equals(this.createdAt, userData.createdAt) &&
        Objects.equals(this.preferences, userData.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, username, password, email, name, createdAt, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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


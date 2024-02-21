package org.npp.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

/**
 * A reference to a deleted identifiable managed object where the identifier is unique. It is described by a string identifying the class of the referenced object (key name) with a unique string identifier as its value, and the deletion instant.
 */

@Schema(name = "DeletedReference", description = "A reference to a deleted identifiable managed object where the identifier is unique. It is described by a string identifying the class of the referenced object (key name) with a unique string identifier as its value, and the deletion instant.")

public class DeletedReference {

  private String id;

  private String className;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deleteTimestamp;

  public DeletedReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeletedReference(String id, String className, OffsetDateTime deleteTimestamp) {
    this.id = id;
    this.className = className;
    this.deleteTimestamp = deleteTimestamp;
  }

  public DeletedReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeletedReference className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
  */
  @NotNull @Pattern(regexp = "^([A-Z][a-z0-9]+)+") 
  @Schema(name = "className", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("className")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public DeletedReference deleteTimestamp(OffsetDateTime deleteTimestamp) {
    this.deleteTimestamp = deleteTimestamp;
    return this;
  }

  /**
   * The instant when the reference was deleted.
   * @return deleteTimestamp
  */
  @NotNull @Valid 
  @Schema(name = "deleteTimestamp", description = "The instant when the reference was deleted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deleteTimestamp")
  public OffsetDateTime getDeleteTimestamp() {
    return deleteTimestamp;
  }

  public void setDeleteTimestamp(OffsetDateTime deleteTimestamp) {
    this.deleteTimestamp = deleteTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedReference deletedReference = (DeletedReference) o;
    return Objects.equals(this.id, deletedReference.id) &&
        Objects.equals(this.className, deletedReference.className) &&
        Objects.equals(this.deleteTimestamp, deletedReference.deleteTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, className, deleteTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    deleteTimestamp: ").append(toIndentedString(deleteTimestamp)).append("\n");
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


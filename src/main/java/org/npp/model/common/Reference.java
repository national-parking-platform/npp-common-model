package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A reference to an identifiable managed object where the identifier is unique.  It is composed of a string identifying the class of the referenced object and a unique string identifier.
 */

@Schema(name = "Reference", description = "A reference to an identifiable managed object where the identifier is unique.  It is composed of a string identifying the class of the referenced object and a unique string identifier.")

public class Reference {

  private String id;

  private String className;

  public Reference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Reference(String id, String className) {
    this.id = id;
    this.className = className;
  }

  public Reference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier within the given class.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "LA51ABC", description = "The unique identifier within the given class.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Reference className(String className) {
    this.className = className;
    return this;
  }

  /**
   * The class name of the referenced object in PascalCase.
   * @return className
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "className", example = "UKNumberPlate", description = "The class name of the referenced object in PascalCase.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("className")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.id, reference.id) &&
        Objects.equals(this.className, reference.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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


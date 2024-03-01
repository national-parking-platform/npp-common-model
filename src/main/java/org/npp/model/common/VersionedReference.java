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
 * A reference to an identifiable version managed object where the combination of the identifier and version is unique.  It comprises an identifier (e.g. GUID), a version (NonNegativeInteger) and a string identifying the class of the referenced object.&#39;
 */

@Schema(name = "VersionedReference", description = "A reference to an identifiable version managed object where the combination of the identifier and version is unique.  It comprises an identifier (e.g. GUID), a version (NonNegativeInteger) and a string identifying the class of the referenced object.'")

public class VersionedReference {

  private String id;

  private Integer version;

  private String className;

  public VersionedReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VersionedReference(String id, Integer version) {
    this.id = id;
    this.version = version;
  }

  public VersionedReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier.
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Unique identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VersionedReference version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version number.
   * minimum: 1
   * @return version
  */
  @NotNull @Min(1) 
  @Schema(name = "version", description = "Version number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public VersionedReference className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Class name of the referenced object.  It's optional, as it might be implied by the attribute name using this reference
   * @return className
  */
  @Pattern(regexp = "^([A-Z][a-z0-9]+)+") 
  @Schema(name = "className", description = "Class name of the referenced object.  It's optional, as it might be implied by the attribute name using this reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VersionedReference versionedReference = (VersionedReference) o;
    return Objects.equals(this.id, versionedReference.id) &&
        Objects.equals(this.version, versionedReference.version) &&
        Objects.equals(this.className, versionedReference.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


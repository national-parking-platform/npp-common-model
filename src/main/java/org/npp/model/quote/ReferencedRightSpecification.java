package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class to support reference to a RightSpecification
 */

@Schema(name = "ReferencedRightSpecification", description = "Class to support reference to a RightSpecification")

public class ReferencedRightSpecification {

  private VersionedReference elementId;

  private VersionedReference rightSpecificationId;

  public ReferencedRightSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReferencedRightSpecification(VersionedReference rightSpecificationId) {
    this.rightSpecificationId = rightSpecificationId;
  }

  public ReferencedRightSpecification elementId(VersionedReference elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
  */
  @Valid 
  @Schema(name = "elementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementId")
  public VersionedReference getElementId() {
    return elementId;
  }

  public void setElementId(VersionedReference elementId) {
    this.elementId = elementId;
  }

  public ReferencedRightSpecification rightSpecificationId(VersionedReference rightSpecificationId) {
    this.rightSpecificationId = rightSpecificationId;
    return this;
  }

  /**
   * Get rightSpecificationId
   * @return rightSpecificationId
  */
  @NotNull @Valid 
  @Schema(name = "rightSpecificationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rightSpecificationId")
  public VersionedReference getRightSpecificationId() {
    return rightSpecificationId;
  }

  public void setRightSpecificationId(VersionedReference rightSpecificationId) {
    this.rightSpecificationId = rightSpecificationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedRightSpecification referencedRightSpecification = (ReferencedRightSpecification) o;
    return Objects.equals(this.elementId, referencedRightSpecification.elementId) &&
        Objects.equals(this.rightSpecificationId, referencedRightSpecification.rightSpecificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementId, rightSpecificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedRightSpecification {\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    rightSpecificationId: ").append(toIndentedString(rightSpecificationId)).append("\n");
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


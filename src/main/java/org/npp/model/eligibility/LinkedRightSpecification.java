package org.npp.model.eligibility;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.eligibility.AssignedRightTimeRelative;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Time-based constrained for a Qualification
 */

@Schema(name = "LinkedRightSpecification", description = "Time-based constrained for a Qualification")

public class LinkedRightSpecification {

  private AssignedRightTimeRelative assignedRightTimeRelative;

  private VersionedReference qualifyingRightSpecification;

  public LinkedRightSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LinkedRightSpecification(AssignedRightTimeRelative assignedRightTimeRelative, VersionedReference qualifyingRightSpecification) {
    this.assignedRightTimeRelative = assignedRightTimeRelative;
    this.qualifyingRightSpecification = qualifyingRightSpecification;
  }

  public LinkedRightSpecification assignedRightTimeRelative(AssignedRightTimeRelative assignedRightTimeRelative) {
    this.assignedRightTimeRelative = assignedRightTimeRelative;
    return this;
  }

  /**
   * Get assignedRightTimeRelative
   * @return assignedRightTimeRelative
  */
  @NotNull @Valid 
  @Schema(name = "assignedRightTimeRelative", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedRightTimeRelative")
  public AssignedRightTimeRelative getAssignedRightTimeRelative() {
    return assignedRightTimeRelative;
  }

  public void setAssignedRightTimeRelative(AssignedRightTimeRelative assignedRightTimeRelative) {
    this.assignedRightTimeRelative = assignedRightTimeRelative;
  }

  public LinkedRightSpecification qualifyingRightSpecification(VersionedReference qualifyingRightSpecification) {
    this.qualifyingRightSpecification = qualifyingRightSpecification;
    return this;
  }

  /**
   * Get qualifyingRightSpecification
   * @return qualifyingRightSpecification
  */
  @NotNull @Valid 
  @Schema(name = "qualifyingRightSpecification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("qualifyingRightSpecification")
  public VersionedReference getQualifyingRightSpecification() {
    return qualifyingRightSpecification;
  }

  public void setQualifyingRightSpecification(VersionedReference qualifyingRightSpecification) {
    this.qualifyingRightSpecification = qualifyingRightSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedRightSpecification linkedRightSpecification = (LinkedRightSpecification) o;
    return Objects.equals(this.assignedRightTimeRelative, linkedRightSpecification.assignedRightTimeRelative) &&
        Objects.equals(this.qualifyingRightSpecification, linkedRightSpecification.qualifyingRightSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedRightTimeRelative, qualifyingRightSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedRightSpecification {\n");
    sb.append("    assignedRightTimeRelative: ").append(toIndentedString(assignedRightTimeRelative)).append("\n");
    sb.append("    qualifyingRightSpecification: ").append(toIndentedString(qualifyingRightSpecification)).append("\n");
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


package org.npp.model.eligibility;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.npp.model.common.enums.ComparisonOperatorEnum;
import org.npp.model.time.enums.UnitOfTimeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Qualification criteria for eligibility based on the duration of time relative to a defined time-based qualification  related to an assigned right.
 */

@Schema(name = "AssignRightTime", description = "Qualification criteria for eligibility based on the duration of time relative to a defined time-based qualification  related to an assigned right.")

public class AssignRightTime {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime assignedRightTime;

  private ComparisonOperatorEnum comparisonOperator;

  private UnitOfTimeEnum unitOfTime;

  public AssignRightTime() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssignRightTime(OffsetDateTime assignedRightTime, ComparisonOperatorEnum comparisonOperator, UnitOfTimeEnum unitOfTime) {
    this.assignedRightTime = assignedRightTime;
    this.comparisonOperator = comparisonOperator;
    this.unitOfTime = unitOfTime;
  }

  public AssignRightTime assignedRightTime(OffsetDateTime assignedRightTime) {
    this.assignedRightTime = assignedRightTime;
    return this;
  }

  /**
   * Assigned right time
   * @return assignedRightTime
  */
  @NotNull @Valid 
  @Schema(name = "assignedRightTime", description = "Assigned right time", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedRightTime")
  public OffsetDateTime getAssignedRightTime() {
    return assignedRightTime;
  }

  public void setAssignedRightTime(OffsetDateTime assignedRightTime) {
    this.assignedRightTime = assignedRightTime;
  }

  public AssignRightTime comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  /**
   * Get comparisonOperator
   * @return comparisonOperator
  */
  @NotNull @Valid 
  @Schema(name = "comparisonOperator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comparisonOperator")
  public ComparisonOperatorEnum getComparisonOperator() {
    return comparisonOperator;
  }

  public void setComparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }

  public AssignRightTime unitOfTime(UnitOfTimeEnum unitOfTime) {
    this.unitOfTime = unitOfTime;
    return this;
  }

  /**
   * Get unitOfTime
   * @return unitOfTime
  */
  @NotNull @Valid 
  @Schema(name = "unitOfTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unitOfTime")
  public UnitOfTimeEnum getUnitOfTime() {
    return unitOfTime;
  }

  public void setUnitOfTime(UnitOfTimeEnum unitOfTime) {
    this.unitOfTime = unitOfTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignRightTime assignRightTime = (AssignRightTime) o;
    return Objects.equals(this.assignedRightTime, assignRightTime.assignedRightTime) &&
        Objects.equals(this.comparisonOperator, assignRightTime.comparisonOperator) &&
        Objects.equals(this.unitOfTime, assignRightTime.unitOfTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedRightTime, comparisonOperator, unitOfTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignRightTime {\n");
    sb.append("    assignedRightTime: ").append(toIndentedString(assignedRightTime)).append("\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    unitOfTime: ").append(toIndentedString(unitOfTime)).append("\n");
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


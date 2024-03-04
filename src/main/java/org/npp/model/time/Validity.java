package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.time.OverallPeriod;
import org.npp.model.time.enums.ValidityStatusEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Specification of validity, either explicitly or by a validity time period specification which may be discontinuous.
 */

@Schema(name = "Validity", description = "Specification of validity, either explicitly or by a validity time period specification which may be discontinuous.")

public class Validity {

  private ValidityStatusEnum validityStatus;

  private OverallPeriod validityTimeSpecification;

  public Validity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Validity(OverallPeriod validityTimeSpecification) {
    this.validityTimeSpecification = validityTimeSpecification;
  }

  public Validity validityStatus(ValidityStatusEnum validityStatus) {
    this.validityStatus = validityStatus;
    return this;
  }

  /**
   * Get validityStatus
   * @return validityStatus
  */
  @Valid 
  @Schema(name = "validityStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityStatus")
  public ValidityStatusEnum getValidityStatus() {
    return validityStatus;
  }

  public void setValidityStatus(ValidityStatusEnum validityStatus) {
    this.validityStatus = validityStatus;
  }

  public Validity validityTimeSpecification(OverallPeriod validityTimeSpecification) {
    this.validityTimeSpecification = validityTimeSpecification;
    return this;
  }

  /**
   * Get validityTimeSpecification
   * @return validityTimeSpecification
  */
  @NotNull @Valid 
  @Schema(name = "validityTimeSpecification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validityTimeSpecification")
  public OverallPeriod getValidityTimeSpecification() {
    return validityTimeSpecification;
  }

  public void setValidityTimeSpecification(OverallPeriod validityTimeSpecification) {
    this.validityTimeSpecification = validityTimeSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validity validity = (Validity) o;
    return Objects.equals(this.validityStatus, validity.validityStatus) &&
        Objects.equals(this.validityTimeSpecification, validity.validityTimeSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validityStatus, validityTimeSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validity {\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
    sb.append("    validityTimeSpecification: ").append(toIndentedString(validityTimeSpecification)).append("\n");
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


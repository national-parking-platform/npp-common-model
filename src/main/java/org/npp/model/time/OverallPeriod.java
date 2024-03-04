package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.time.Period;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A continuous or discontinuous period of validity defined by overall bounding start and end times and the  possible intersection of valid periods (potentially recurring) with the complement of exception periods (also potentially recurring).
 */

@Schema(name = "OverallPeriod", description = "A continuous or discontinuous period of validity defined by overall bounding start and end times and the  possible intersection of valid periods (potentially recurring) with the complement of exception periods (also potentially recurring).")

public class OverallPeriod {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime overallStartTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime overallEndTime;

  @Valid
  private List<@Valid Period> validPeriods;

  @Valid
  private List<@Valid Period> exceptionPeriods;

  public OverallPeriod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverallPeriod(OffsetDateTime overallStartTime) {
    this.overallStartTime = overallStartTime;
  }

  public OverallPeriod overallStartTime(OffsetDateTime overallStartTime) {
    this.overallStartTime = overallStartTime;
    return this;
  }

  /**
   * Start of bounding period of validity defined by date and time.
   * @return overallStartTime
  */
  @NotNull @Valid 
  @Schema(name = "overallStartTime", description = "Start of bounding period of validity defined by date and time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("overallStartTime")
  public OffsetDateTime getOverallStartTime() {
    return overallStartTime;
  }

  public void setOverallStartTime(OffsetDateTime overallStartTime) {
    this.overallStartTime = overallStartTime;
  }

  public OverallPeriod overallEndTime(OffsetDateTime overallEndTime) {
    this.overallEndTime = overallEndTime;
    return this;
  }

  /**
   * End of bounding period of validity defined by date and time.
   * @return overallEndTime
  */
  @Valid 
  @Schema(name = "overallEndTime", description = "End of bounding period of validity defined by date and time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overallEndTime")
  public OffsetDateTime getOverallEndTime() {
    return overallEndTime;
  }

  public void setOverallEndTime(OffsetDateTime overallEndTime) {
    this.overallEndTime = overallEndTime;
  }

  public OverallPeriod validPeriods(List<@Valid Period> validPeriods) {
    this.validPeriods = validPeriods;
    return this;
  }

  public OverallPeriod addValidPeriodsItem(Period validPeriodsItem) {
    if (this.validPeriods == null) {
      this.validPeriods = new ArrayList<>();
    }
    this.validPeriods.add(validPeriodsItem);
    return this;
  }

  /**
   * A single time period, a recurring time `Period` period or a set of different recurring time periods during which validity is true.
   * @return validPeriods
  */
  @Valid 
  @Schema(name = "validPeriods", description = "A single time period, a recurring time `Period` period or a set of different recurring time periods during which validity is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validPeriods")
  public List<@Valid Period> getValidPeriods() {
    return validPeriods;
  }

  public void setValidPeriods(List<@Valid Period> validPeriods) {
    this.validPeriods = validPeriods;
  }

  public OverallPeriod exceptionPeriods(List<@Valid Period> exceptionPeriods) {
    this.exceptionPeriods = exceptionPeriods;
    return this;
  }

  public OverallPeriod addExceptionPeriodsItem(Period exceptionPeriodsItem) {
    if (this.exceptionPeriods == null) {
      this.exceptionPeriods = new ArrayList<>();
    }
    this.exceptionPeriods.add(exceptionPeriodsItem);
    return this;
  }

  /**
   * A single time period, a recurring time Period period or a set of different recurring time periods during which validity is false.
   * @return exceptionPeriods
  */
  @Valid 
  @Schema(name = "exceptionPeriods", description = "A single time period, a recurring time Period period or a set of different recurring time periods during which validity is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptionPeriods")
  public List<@Valid Period> getExceptionPeriods() {
    return exceptionPeriods;
  }

  public void setExceptionPeriods(List<@Valid Period> exceptionPeriods) {
    this.exceptionPeriods = exceptionPeriods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverallPeriod overallPeriod = (OverallPeriod) o;
    return Objects.equals(this.overallStartTime, overallPeriod.overallStartTime) &&
        Objects.equals(this.overallEndTime, overallPeriod.overallEndTime) &&
        Objects.equals(this.validPeriods, overallPeriod.validPeriods) &&
        Objects.equals(this.exceptionPeriods, overallPeriod.exceptionPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallStartTime, overallEndTime, validPeriods, exceptionPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverallPeriod {\n");
    sb.append("    overallStartTime: ").append(toIndentedString(overallStartTime)).append("\n");
    sb.append("    overallEndTime: ").append(toIndentedString(overallEndTime)).append("\n");
    sb.append("    validPeriods: ").append(toIndentedString(validPeriods)).append("\n");
    sb.append("    exceptionPeriods: ").append(toIndentedString(exceptionPeriods)).append("\n");
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


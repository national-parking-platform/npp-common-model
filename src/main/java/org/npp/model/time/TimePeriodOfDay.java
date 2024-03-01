package org.npp.model.time;
  
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
 * Specification of a continuous period of time within a 24 hour period.
 */

@Schema(name = "TimePeriodOfDay", description = "Specification of a continuous period of time within a 24 hour period.")

public class TimePeriodOfDay {

  private String startTimeOfPeriod;

  private String endTimeOfPeriod;

  public TimePeriodOfDay() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TimePeriodOfDay(String startTimeOfPeriod, String endTimeOfPeriod) {
    this.startTimeOfPeriod = startTimeOfPeriod;
    this.endTimeOfPeriod = endTimeOfPeriod;
  }

  public TimePeriodOfDay startTimeOfPeriod(String startTimeOfPeriod) {
    this.startTimeOfPeriod = startTimeOfPeriod;
    return this;
  }

  /**
   * Start of time period.
   * @return startTimeOfPeriod
  */
  @NotNull 
  @Schema(name = "startTimeOfPeriod", description = "Start of time period.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTimeOfPeriod")
  public String getStartTimeOfPeriod() {
    return startTimeOfPeriod;
  }

  public void setStartTimeOfPeriod(String startTimeOfPeriod) {
    this.startTimeOfPeriod = startTimeOfPeriod;
  }

  public TimePeriodOfDay endTimeOfPeriod(String endTimeOfPeriod) {
    this.endTimeOfPeriod = endTimeOfPeriod;
    return this;
  }

  /**
   * End time of period.
   * @return endTimeOfPeriod
  */
  @NotNull 
  @Schema(name = "endTimeOfPeriod", description = "End time of period.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endTimeOfPeriod")
  public String getEndTimeOfPeriod() {
    return endTimeOfPeriod;
  }

  public void setEndTimeOfPeriod(String endTimeOfPeriod) {
    this.endTimeOfPeriod = endTimeOfPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriodOfDay timePeriodOfDay = (TimePeriodOfDay) o;
    return Objects.equals(this.startTimeOfPeriod, timePeriodOfDay.startTimeOfPeriod) &&
        Objects.equals(this.endTimeOfPeriod, timePeriodOfDay.endTimeOfPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeOfPeriod, endTimeOfPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriodOfDay {\n");
    sb.append("    startTimeOfPeriod: ").append(toIndentedString(startTimeOfPeriod)).append("\n");
    sb.append("    endTimeOfPeriod: ").append(toIndentedString(endTimeOfPeriod)).append("\n");
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


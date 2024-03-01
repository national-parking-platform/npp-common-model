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
 * Definition of times used in a time-based constrained.
 */

@Schema(name = "TimesOfDay", description = "Definition of times used in a time-based constrained.")

public class TimesOfDay {

  private String earliestStart;

  private String earliestEnd;

  private String latestStart;

  private String latestEnd;

  public TimesOfDay earliestStart(String earliestStart) {
    this.earliestStart = earliestStart;
    return this;
  }

  /**
   * ISO8601 format definition of a time - format HH:MM.
   * @return earliestStart
  */
  @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$") 
  @Schema(name = "earliestStart", example = "12:15", description = "ISO8601 format definition of a time - format HH:MM.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestStart")
  public String getEarliestStart() {
    return earliestStart;
  }

  public void setEarliestStart(String earliestStart) {
    this.earliestStart = earliestStart;
  }

  public TimesOfDay earliestEnd(String earliestEnd) {
    this.earliestEnd = earliestEnd;
    return this;
  }

  /**
   * ISO8601 format definition of a time - format HH:MM.
   * @return earliestEnd
  */
  @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$") 
  @Schema(name = "earliestEnd", example = "12:15", description = "ISO8601 format definition of a time - format HH:MM.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestEnd")
  public String getEarliestEnd() {
    return earliestEnd;
  }

  public void setEarliestEnd(String earliestEnd) {
    this.earliestEnd = earliestEnd;
  }

  public TimesOfDay latestStart(String latestStart) {
    this.latestStart = latestStart;
    return this;
  }

  /**
   * ISO8601 format definition of a time - format HH:MM.
   * @return latestStart
  */
  @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$") 
  @Schema(name = "latestStart", example = "12:15", description = "ISO8601 format definition of a time - format HH:MM.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestStart")
  public String getLatestStart() {
    return latestStart;
  }

  public void setLatestStart(String latestStart) {
    this.latestStart = latestStart;
  }

  public TimesOfDay latestEnd(String latestEnd) {
    this.latestEnd = latestEnd;
    return this;
  }

  /**
   * ISO8601 format definition of a time - format HH:MM.
   * @return latestEnd
  */
  @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$") 
  @Schema(name = "latestEnd", example = "12:15", description = "ISO8601 format definition of a time - format HH:MM.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestEnd")
  public String getLatestEnd() {
    return latestEnd;
  }

  public void setLatestEnd(String latestEnd) {
    this.latestEnd = latestEnd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesOfDay timesOfDay = (TimesOfDay) o;
    return Objects.equals(this.earliestStart, timesOfDay.earliestStart) &&
        Objects.equals(this.earliestEnd, timesOfDay.earliestEnd) &&
        Objects.equals(this.latestStart, timesOfDay.latestStart) &&
        Objects.equals(this.latestEnd, timesOfDay.latestEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestStart, earliestEnd, latestStart, latestEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesOfDay {\n");
    sb.append("    earliestStart: ").append(toIndentedString(earliestStart)).append("\n");
    sb.append("    earliestEnd: ").append(toIndentedString(earliestEnd)).append("\n");
    sb.append("    latestStart: ").append(toIndentedString(latestStart)).append("\n");
    sb.append("    latestEnd: ").append(toIndentedString(latestEnd)).append("\n");
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


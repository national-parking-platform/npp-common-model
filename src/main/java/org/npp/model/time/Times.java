package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.time.AccessAndEgress;
import org.npp.model.time.OperatingTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Defines forms of time period for specific purposes.  There are four distinct time domain concepts:  * Hours of operation (times at which the facility may be used) * Access and egress (times it is possible to enter and leave the facility) * Entrance open time * Exit open time
 */

@Schema(name = "Times", description = "Defines forms of time period for specific purposes.  There are four distinct time domain concepts:  * Hours of operation (times at which the facility may be used) * Access and egress (times it is possible to enter and leave the facility) * Entrance open time * Exit open time")

public class Times {

  private Boolean available24hours;

  private Boolean openAllYear;

  private Boolean openingTimesNotSpecified;

  private Boolean openingTimesUnknown;

  @Valid
  private List<@Valid AccessAndEgress> accessAndEgress;

  private OperatingTime operatingTime;

  public Times() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Times(Boolean available24hours, Boolean openAllYear, Boolean openingTimesNotSpecified, Boolean openingTimesUnknown) {
    this.available24hours = available24hours;
    this.openAllYear = openAllYear;
    this.openingTimesNotSpecified = openingTimesNotSpecified;
    this.openingTimesUnknown = openingTimesUnknown;
  }

  public Times available24hours(Boolean available24hours) {
    this.available24hours = available24hours;
    return this;
  }

  /**
   * If [TRUE], the identified parking hierarchy entities is available 24 hours per day.
   * @return available24hours
  */
  @NotNull 
  @Schema(name = "available24hours", description = "If [TRUE], the identified parking hierarchy entities is available 24 hours per day.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available24hours")
  public Boolean getAvailable24hours() {
    return available24hours;
  }

  public void setAvailable24hours(Boolean available24hours) {
    this.available24hours = available24hours;
  }

  public Times openAllYear(Boolean openAllYear) {
    this.openAllYear = openAllYear;
    return this;
  }

  /**
   * If [TRUE], the identified parking hierarchy entities is available every day each year.
   * @return openAllYear
  */
  @NotNull 
  @Schema(name = "openAllYear", description = "If [TRUE], the identified parking hierarchy entities is available every day each year.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("openAllYear")
  public Boolean getOpenAllYear() {
    return openAllYear;
  }

  public void setOpenAllYear(Boolean openAllYear) {
    this.openAllYear = openAllYear;
  }

  public Times openingTimesNotSpecified(Boolean openingTimesNotSpecified) {
    this.openingTimesNotSpecified = openingTimesNotSpecified;
    return this;
  }

  /**
   * If [TRUE], the time periods are not specified.
   * @return openingTimesNotSpecified
  */
  @NotNull 
  @Schema(name = "openingTimesNotSpecified", description = "If [TRUE], the time periods are not specified.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("openingTimesNotSpecified")
  public Boolean getOpeningTimesNotSpecified() {
    return openingTimesNotSpecified;
  }

  public void setOpeningTimesNotSpecified(Boolean openingTimesNotSpecified) {
    this.openingTimesNotSpecified = openingTimesNotSpecified;
  }

  public Times openingTimesUnknown(Boolean openingTimesUnknown) {
    this.openingTimesUnknown = openingTimesUnknown;
    return this;
  }

  /**
   * If [TRUE], the time periods are not known.
   * @return openingTimesUnknown
  */
  @NotNull 
  @Schema(name = "openingTimesUnknown", description = "If [TRUE], the time periods are not known.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("openingTimesUnknown")
  public Boolean getOpeningTimesUnknown() {
    return openingTimesUnknown;
  }

  public void setOpeningTimesUnknown(Boolean openingTimesUnknown) {
    this.openingTimesUnknown = openingTimesUnknown;
  }

  public Times accessAndEgress(List<@Valid AccessAndEgress> accessAndEgress) {
    this.accessAndEgress = accessAndEgress;
    return this;
  }

  public Times addAccessAndEgressItem(AccessAndEgress accessAndEgressItem) {
    if (this.accessAndEgress == null) {
      this.accessAndEgress = new ArrayList<>();
    }
    this.accessAndEgress.add(accessAndEgressItem);
    return this;
  }

  /**
   * Get accessAndEgress
   * @return accessAndEgress
  */
  @Valid 
  @Schema(name = "accessAndEgress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessAndEgress")
  public List<@Valid AccessAndEgress> getAccessAndEgress() {
    return accessAndEgress;
  }

  public void setAccessAndEgress(List<@Valid AccessAndEgress> accessAndEgress) {
    this.accessAndEgress = accessAndEgress;
  }

  public Times operatingTime(OperatingTime operatingTime) {
    this.operatingTime = operatingTime;
    return this;
  }

  /**
   * Get operatingTime
   * @return operatingTime
  */
  @Valid 
  @Schema(name = "operatingTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingTime")
  public OperatingTime getOperatingTime() {
    return operatingTime;
  }

  public void setOperatingTime(OperatingTime operatingTime) {
    this.operatingTime = operatingTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Times times = (Times) o;
    return Objects.equals(this.available24hours, times.available24hours) &&
        Objects.equals(this.openAllYear, times.openAllYear) &&
        Objects.equals(this.openingTimesNotSpecified, times.openingTimesNotSpecified) &&
        Objects.equals(this.openingTimesUnknown, times.openingTimesUnknown) &&
        Objects.equals(this.accessAndEgress, times.accessAndEgress) &&
        Objects.equals(this.operatingTime, times.operatingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available24hours, openAllYear, openingTimesNotSpecified, openingTimesUnknown, accessAndEgress, operatingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Times {\n");
    sb.append("    available24hours: ").append(toIndentedString(available24hours)).append("\n");
    sb.append("    openAllYear: ").append(toIndentedString(openAllYear)).append("\n");
    sb.append("    openingTimesNotSpecified: ").append(toIndentedString(openingTimesNotSpecified)).append("\n");
    sb.append("    openingTimesUnknown: ").append(toIndentedString(openingTimesUnknown)).append("\n");
    sb.append("    accessAndEgress: ").append(toIndentedString(accessAndEgress)).append("\n");
    sb.append("    operatingTime: ").append(toIndentedString(operatingTime)).append("\n");
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


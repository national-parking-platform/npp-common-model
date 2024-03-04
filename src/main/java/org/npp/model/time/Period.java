package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.time.DayWeekMonth;
import org.npp.model.time.SpecialDay;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.time.TimePeriodOfDay;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A continuous time period or a set of discontinuous time periods defined by the intersection of a set of criteria  all within an overall delimiting interval.
 */

@Schema(name = "Period", description = "A continuous time period or a set of discontinuous time periods defined by the intersection of a set of criteria  all within an overall delimiting interval.")

public class Period {

  @Valid
  private List<@Valid SpecificLanguageString> periodName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startOfPeriod;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endOfPeriod;

  @Valid
  private List<@Valid DayWeekMonth> recurringDayWeekMonthPeriod;

  @Valid
  private List<@Valid SpecialDay> recurringSpecialDay;

  @Valid
  private List<@Valid TimePeriodOfDay> recurringTimePeriodOfDay;

  public Period periodName(List<@Valid SpecificLanguageString> periodName) {
    this.periodName = periodName;
    return this;
  }

  public Period addPeriodNameItem(SpecificLanguageString periodNameItem) {
    if (this.periodName == null) {
      this.periodName = new ArrayList<>();
    }
    this.periodName.add(periodNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return periodName
  */
  @Valid 
  @Schema(name = "periodName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periodName")
  public List<@Valid SpecificLanguageString> getPeriodName() {
    return periodName;
  }

  public void setPeriodName(List<@Valid SpecificLanguageString> periodName) {
    this.periodName = periodName;
  }

  public Period startOfPeriod(OffsetDateTime startOfPeriod) {
    this.startOfPeriod = startOfPeriod;
    return this;
  }

  /**
   * Start of the period.
   * @return startOfPeriod
  */
  @Valid 
  @Schema(name = "startOfPeriod", description = "Start of the period.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startOfPeriod")
  public OffsetDateTime getStartOfPeriod() {
    return startOfPeriod;
  }

  public void setStartOfPeriod(OffsetDateTime startOfPeriod) {
    this.startOfPeriod = startOfPeriod;
  }

  public Period endOfPeriod(OffsetDateTime endOfPeriod) {
    this.endOfPeriod = endOfPeriod;
    return this;
  }

  /**
   * End of the period.
   * @return endOfPeriod
  */
  @Valid 
  @Schema(name = "endOfPeriod", description = "End of the period.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endOfPeriod")
  public OffsetDateTime getEndOfPeriod() {
    return endOfPeriod;
  }

  public void setEndOfPeriod(OffsetDateTime endOfPeriod) {
    this.endOfPeriod = endOfPeriod;
  }

  public Period recurringDayWeekMonthPeriod(List<@Valid DayWeekMonth> recurringDayWeekMonthPeriod) {
    this.recurringDayWeekMonthPeriod = recurringDayWeekMonthPeriod;
    return this;
  }

  public Period addRecurringDayWeekMonthPeriodItem(DayWeekMonth recurringDayWeekMonthPeriodItem) {
    if (this.recurringDayWeekMonthPeriod == null) {
      this.recurringDayWeekMonthPeriod = new ArrayList<>();
    }
    this.recurringDayWeekMonthPeriod.add(recurringDayWeekMonthPeriodItem);
    return this;
  }

  /**
   * A recurring period defined in terms of days of the week, weeks of the month and months of the year.
   * @return recurringDayWeekMonthPeriod
  */
  @Valid 
  @Schema(name = "recurringDayWeekMonthPeriod", description = "A recurring period defined in terms of days of the week, weeks of the month and months of the year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringDayWeekMonthPeriod")
  public List<@Valid DayWeekMonth> getRecurringDayWeekMonthPeriod() {
    return recurringDayWeekMonthPeriod;
  }

  public void setRecurringDayWeekMonthPeriod(List<@Valid DayWeekMonth> recurringDayWeekMonthPeriod) {
    this.recurringDayWeekMonthPeriod = recurringDayWeekMonthPeriod;
  }

  public Period recurringSpecialDay(List<@Valid SpecialDay> recurringSpecialDay) {
    this.recurringSpecialDay = recurringSpecialDay;
    return this;
  }

  public Period addRecurringSpecialDayItem(SpecialDay recurringSpecialDayItem) {
    if (this.recurringSpecialDay == null) {
      this.recurringSpecialDay = new ArrayList<>();
    }
    this.recurringSpecialDay.add(recurringSpecialDayItem);
    return this;
  }

  /**
   * A recurring period in terms of special days.
   * @return recurringSpecialDay
  */
  @Valid 
  @Schema(name = "recurringSpecialDay", description = "A recurring period in terms of special days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringSpecialDay")
  public List<@Valid SpecialDay> getRecurringSpecialDay() {
    return recurringSpecialDay;
  }

  public void setRecurringSpecialDay(List<@Valid SpecialDay> recurringSpecialDay) {
    this.recurringSpecialDay = recurringSpecialDay;
  }

  public Period recurringTimePeriodOfDay(List<@Valid TimePeriodOfDay> recurringTimePeriodOfDay) {
    this.recurringTimePeriodOfDay = recurringTimePeriodOfDay;
    return this;
  }

  public Period addRecurringTimePeriodOfDayItem(TimePeriodOfDay recurringTimePeriodOfDayItem) {
    if (this.recurringTimePeriodOfDay == null) {
      this.recurringTimePeriodOfDay = new ArrayList<>();
    }
    this.recurringTimePeriodOfDay.add(recurringTimePeriodOfDayItem);
    return this;
  }

  /**
   * A recurring period of a day
   * @return recurringTimePeriodOfDay
  */
  @Valid 
  @Schema(name = "recurringTimePeriodOfDay", description = "A recurring period of a day", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringTimePeriodOfDay")
  public List<@Valid TimePeriodOfDay> getRecurringTimePeriodOfDay() {
    return recurringTimePeriodOfDay;
  }

  public void setRecurringTimePeriodOfDay(List<@Valid TimePeriodOfDay> recurringTimePeriodOfDay) {
    this.recurringTimePeriodOfDay = recurringTimePeriodOfDay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Period period = (Period) o;
    return Objects.equals(this.periodName, period.periodName) &&
        Objects.equals(this.startOfPeriod, period.startOfPeriod) &&
        Objects.equals(this.endOfPeriod, period.endOfPeriod) &&
        Objects.equals(this.recurringDayWeekMonthPeriod, period.recurringDayWeekMonthPeriod) &&
        Objects.equals(this.recurringSpecialDay, period.recurringSpecialDay) &&
        Objects.equals(this.recurringTimePeriodOfDay, period.recurringTimePeriodOfDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodName, startOfPeriod, endOfPeriod, recurringDayWeekMonthPeriod, recurringSpecialDay, recurringTimePeriodOfDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Period {\n");
    sb.append("    periodName: ").append(toIndentedString(periodName)).append("\n");
    sb.append("    startOfPeriod: ").append(toIndentedString(startOfPeriod)).append("\n");
    sb.append("    endOfPeriod: ").append(toIndentedString(endOfPeriod)).append("\n");
    sb.append("    recurringDayWeekMonthPeriod: ").append(toIndentedString(recurringDayWeekMonthPeriod)).append("\n");
    sb.append("    recurringSpecialDay: ").append(toIndentedString(recurringSpecialDay)).append("\n");
    sb.append("    recurringTimePeriodOfDay: ").append(toIndentedString(recurringTimePeriodOfDay)).append("\n");
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


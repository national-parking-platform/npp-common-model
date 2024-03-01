package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.npp.model.time.enums.CalendarWeekInMonthEnum;
import org.npp.model.time.enums.DayEnum;
import org.npp.model.time.DayWeekMonth;
import org.npp.model.time.enums.MonthEnum;
import org.npp.model.time.enums.WeekOfMonthEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Provides information concerning an identifiable calendar week in a calendar month. In accordance with ISO8601 calendar weeks start on a Monday.
 */

@Schema(name = "WeekInMonth", description = "Provides information concerning an identifiable calendar week in a calendar month. In accordance with ISO8601 calendar weeks start on a Monday.")


public class WeekInMonth extends DayWeekMonth {

  private CalendarWeekInMonthEnum weekInMonth;

  public WeekInMonth() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WeekInMonth(CalendarWeekInMonthEnum weekInMonth) {
    super();
    this.weekInMonth = weekInMonth;
  }

  public WeekInMonth weekInMonth(CalendarWeekInMonthEnum weekInMonth) {
    this.weekInMonth = weekInMonth;
    return this;
  }

  /**
   * Get weekInMonth
   * @return weekInMonth
  */
  @NotNull @Valid 
  @Schema(name = "weekInMonth", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weekInMonth")
  public CalendarWeekInMonthEnum getWeekInMonth() {
    return weekInMonth;
  }

  public void setWeekInMonth(CalendarWeekInMonthEnum weekInMonth) {
    this.weekInMonth = weekInMonth;
  }


  public WeekInMonth metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public WeekInMonth applicableDay(Set<@Valid DayEnum> applicableDay) {
    super.applicableDay(applicableDay);
    return this;
  }

  public WeekInMonth addApplicableDayItem(DayEnum applicableDayItem) {
    super.addApplicableDayItem(applicableDayItem);
    return this;
  }

  public WeekInMonth applicableMonth(Set<@Valid MonthEnum> applicableMonth) {
    super.applicableMonth(applicableMonth);
    return this;
  }

  public WeekInMonth addApplicableMonthItem(MonthEnum applicableMonthItem) {
    super.addApplicableMonthItem(applicableMonthItem);
    return this;
  }

  public WeekInMonth applicableWeek(Set<@Valid WeekOfMonthEnum> applicableWeek) {
    super.applicableWeek(applicableWeek);
    return this;
  }

  public WeekInMonth addApplicableWeekItem(WeekOfMonthEnum applicableWeekItem) {
    super.addApplicableWeekItem(applicableWeekItem);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekInMonth weekInMonth = (WeekInMonth) o;
    return Objects.equals(this.weekInMonth, weekInMonth.weekInMonth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekInMonth, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekInMonth {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    weekInMonth: ").append(toIndentedString(weekInMonth)).append("\n");
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


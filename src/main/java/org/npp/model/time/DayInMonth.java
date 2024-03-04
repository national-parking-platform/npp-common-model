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
import org.npp.model.time.enums.DayEnum;
import org.npp.model.time.DayWeekMonth;
import org.npp.model.time.enums.InstanceOfDayInMonthEnum;
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
 * Indicates the instance of a specific day of the week within a month. When using this class, at least &#x60;applicableDay&#x60; must be specified
 */

@Schema(name = "DayInMonth", description = "Indicates the instance of a specific day of the week within a month. When using this class, at least `applicableDay` must be specified")


public class DayInMonth extends DayWeekMonth {

  private InstanceOfDayInMonthEnum dayInMonth;

  public DayInMonth() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DayInMonth(InstanceOfDayInMonthEnum dayInMonth) {
    super();
    this.dayInMonth = dayInMonth;
  }

  public DayInMonth dayInMonth(InstanceOfDayInMonthEnum dayInMonth) {
    this.dayInMonth = dayInMonth;
    return this;
  }

  /**
   * Get dayInMonth
   * @return dayInMonth
  */
  @NotNull @Valid 
  @Schema(name = "dayInMonth", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dayInMonth")
  public InstanceOfDayInMonthEnum getDayInMonth() {
    return dayInMonth;
  }

  public void setDayInMonth(InstanceOfDayInMonthEnum dayInMonth) {
    this.dayInMonth = dayInMonth;
  }


  public DayInMonth metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public DayInMonth applicableDay(Set<@Valid DayEnum> applicableDay) {
    super.applicableDay(applicableDay);
    return this;
  }

  public DayInMonth addApplicableDayItem(DayEnum applicableDayItem) {
    super.addApplicableDayItem(applicableDayItem);
    return this;
  }

  public DayInMonth applicableMonth(Set<@Valid MonthEnum> applicableMonth) {
    super.applicableMonth(applicableMonth);
    return this;
  }

  public DayInMonth addApplicableMonthItem(MonthEnum applicableMonthItem) {
    super.addApplicableMonthItem(applicableMonthItem);
    return this;
  }

  public DayInMonth applicableWeek(Set<@Valid WeekOfMonthEnum> applicableWeek) {
    super.applicableWeek(applicableWeek);
    return this;
  }

  public DayInMonth addApplicableWeekItem(WeekOfMonthEnum applicableWeekItem) {
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
    DayInMonth dayInMonth = (DayInMonth) o;
    return Objects.equals(this.dayInMonth, dayInMonth.dayInMonth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayInMonth, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayInMonth {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dayInMonth: ").append(toIndentedString(dayInMonth)).append("\n");
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


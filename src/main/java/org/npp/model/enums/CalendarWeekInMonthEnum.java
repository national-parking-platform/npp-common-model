package org.npp.model.enums;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines permissible enumerations of identification of calendar weeks within a month * `firstWeek`: First week First calendar week of the month - in accordance with ISO8601. This is the first week, that starts on Monday, and contains the first day of the month. * `secondWeek`: Second week Second calendar week of the month. Calendars weeks commence on a Monday. The second week immediately follows the first week of the month. * `thirdWeek`: Third week Third calendar week of the month. Calendars weeks commence on a Monday. The third week immediately follows the second week of the month. * `fourthWeek`: Fourth week Fourth calendar week of the month. Calendars weeks commence on a Monday. The fourth week immediately follows the third week of the month. * `fifthWeek`: Fifth week Fifth calendar week of the month. Calendars weeks commence on a Monday. The fifth week immediately follows the fourth week of the month. * `sixthWeek`: Sixth week Sixth calendar week of the month. Calendars weeks commence on a Monday. The sixth week immediately follows the fifth week of the month. **NOTE**: this may be the same week as the first calendar week of the following month.
 */


public enum CalendarWeekInMonthEnum {
  
  FIRSTWEEK("firstWeek"),
  
  SECONDWEEK("secondWeek"),
  
  THIRDWEEK("thirdWeek"),
  
  FOURTHWEEK("fourthWeek"),
  
  FIFTHWEEK("fifthWeek"),
  
  SIXTHWEEK("sixthWeek");

  private String value;

  CalendarWeekInMonthEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CalendarWeekInMonthEnum fromValue(String value) {
    for (CalendarWeekInMonthEnum b : CalendarWeekInMonthEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


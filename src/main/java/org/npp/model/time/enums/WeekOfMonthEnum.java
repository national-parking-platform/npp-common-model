package org.npp.model.time.enums;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Weeks of the month * `firstWeekOfMonth`: First week of the month * `secondWeekOfMonth`: Second week of the month * `thirdWeekOfMonth`: Third week of the month * `fourthWeekOfMonth`: Fourth week of the month * `fifthWeekOfMonth`: Fifth week of the month (at most only 3 days and non in February when not a leap year)
 */


public enum WeekOfMonthEnum {
  
  FIRSTWEEKOFMONTH("firstWeekOfMonth"),
  
  SECONDWEEKOFMONTH("secondWeekOfMonth"),
  
  THIRDWEEKOFMONTH("thirdWeekOfMonth"),
  
  FOURTHWEEKOFMONTH("fourthWeekOfMonth"),
  
  FIFTHWEEKOFMONTH("fifthWeekOfMonth");

  private String value;

  WeekOfMonthEnum(String value) {
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
  public static WeekOfMonthEnum fromValue(String value) {
    for (WeekOfMonthEnum b : WeekOfMonthEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


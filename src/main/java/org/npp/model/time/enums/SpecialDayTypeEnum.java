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
 * Collection of special types of days * `dayBeforePublicHoliday`: The day preceding a public holiday * `dayFollowingPublicHoliday`: A day following a public holiday * `inLieuOfPublicHoliday`: A holiday in lieu of a public holiday that falls on a weekend * `longWeekendDay`: A day between a public holiday and the weekend * `other`: Some other special day * `publicEventDay`: A day of a public event. You may use the publicEvent attribute to specify the corresponding event * `publicHoliday`: Public holiday A public holiday in general. You may use the PublicHoliday class to refer on a specific public holiday * `schoolDay`: A school day * `schoolHolidays`: A day within the school holidays
 */


public enum SpecialDayTypeEnum {
  
  DAYBEFOREPUBLICHOLIDAY("dayBeforePublicHoliday"),
  
  DAYFOLLOWINGPUBLICHOLIDAY("dayFollowingPublicHoliday"),
  
  INLIEUOFPUBLICHOLIDAY("inLieuOfPublicHoliday"),
  
  LONGWEEKENDDAY("longWeekendDay"),
  
  OTHER("other"),
  
  PUBLICEVENTDAY("publicEventDay"),
  
  PUBLICHOLIDAY("publicHoliday"),
  
  SCHOOLDAY("schoolDay"),
  
  SCHOOLHOLIDAYS("schoolHolidays");

  private String value;

  SpecialDayTypeEnum(String value) {
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
  public static SpecialDayTypeEnum fromValue(String value) {
    for (SpecialDayTypeEnum b : SpecialDayTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


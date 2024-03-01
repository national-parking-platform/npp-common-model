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
 * Defines permissible enumerations of the instance of a specific day (e.g. Monday, Tuesday) within a calendar month * `firstInstance`: First instance of a specific day (e.g. Monday, Tuesday) within a calendar month * `secondInstance`: Second instance of a specific day (e.g. Monday, Tuesday) within a calendar month * `thirdInstance`: Third instance of a specific day (e.g. Monday, Tuesday) within a calendar month * `fourthInstance`: Fourth instance of a specific day (e.g. Monday, Tuesday) within a calendar month  * `fifthInstance`: Fifth instance of a specific day (e.g. Monday, Tuesday) within a calendar month  * `sixthInstance`: Sixth instance of a specific day (e.g. Monday, Tuesday) within a calendar month
 */


public enum InstanceOfDayInMonthEnum {
  
  FIRSTINSTANCE("firstInstance"),
  
  SECONDINSTANCE("secondInstance"),
  
  THIRDINSTANCE("thirdInstance"),
  
  FOURTHINSTANCE("fourthInstance"),
  
  FIFTHINSTANCE("fifthInstance"),
  
  SIXTHINSTANCE("sixthInstance");

  private String value;

  InstanceOfDayInMonthEnum(String value) {
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
  public static InstanceOfDayInMonthEnum fromValue(String value) {
    for (InstanceOfDayInMonthEnum b : InstanceOfDayInMonthEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


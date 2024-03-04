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
 * Defines permissible enumerations of identification of days within a week * `friday`: Friday * `monday`: Monday * `saturday`: Saturday * `sunday`: Sunday * `thursday`: Thursday * `tuesday`: Tuesday * `wednesday`: Wednesday
 */


public enum DayEnum {
  
  FRIDAY("friday"),
  
  MONDAY("monday"),
  
  SATURDAY("saturday"),
  
  SUNDAY("sunday"),
  
  THURSDAY("thursday"),
  
  TUESDAY("tuesday"),
  
  WEDNESDAY("wednesday");

  private String value;

  DayEnum(String value) {
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
  public static DayEnum fromValue(String value) {
    for (DayEnum b : DayEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


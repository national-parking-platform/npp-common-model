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
 * Defines permissible enumerations of identification of calendar months within a year * `january`: January * `february`: February * `march`: March * `april`: April * `may`: May * `june`: June * `july`: July * `august`: August * `september`: September * `october`: October * `november`: November * `december`: December
 */


public enum MonthEnum {
  
  JANUARY("january"),
  
  FEBRUARY("february"),
  
  MARCH("march"),
  
  APRIL("april"),
  
  MAY("may"),
  
  JUNE("june"),
  
  JULY("july"),
  
  AUGUST("august"),
  
  SEPTEMBER("september"),
  
  OCTOBER("october"),
  
  NOVEMBER("november"),
  
  DECEMBER("december");

  private String value;

  MonthEnum(String value) {
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
  public static MonthEnum fromValue(String value) {
    for (MonthEnum b : MonthEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


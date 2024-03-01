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
 * A list of the supported units of measures of time * `year` * `month` * `week` * `day` * `hour` * `minute` * `second`
 */


public enum UnitOfTimeEnum {
  
  YEAR("year"),
  
  MONTH("month"),
  
  WEEK("week"),
  
  DAY("day"),
  
  HOUR("hour"),
  
  MINUTE("minute"),
  
  SECOND("second");

  private String value;

  UnitOfTimeEnum(String value) {
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
  public static UnitOfTimeEnum fromValue(String value) {
    for (UnitOfTimeEnum b : UnitOfTimeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


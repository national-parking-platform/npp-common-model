package org.npp.model.place.enums;
  
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
 * * `aboveGrade`: Above or over the normal road grade elevation. * `atGrade`: At the normal road grade elevation. * `belowGrade`: Below or under the normal road grade elevation.
 */


public enum HeightGradeEnum {
  
  ABOVEGRADE("aboveGrade"),
  
  ATGRADE("atGrade"),
  
  BELOWGRADE("belowGrade");

  private String value;

  HeightGradeEnum(String value) {
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
  public static HeightGradeEnum fromValue(String value) {
    for (HeightGradeEnum b : HeightGradeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


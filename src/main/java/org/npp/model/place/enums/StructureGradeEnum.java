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
 * Types of layout of the parking site. * `aboveGround`: Parking is above ground level (this may include ground level parking) * `groundLevel`: Parking is at ground level * `underground`: Parking is on one or more floors below ground level
 */


public enum StructureGradeEnum {
  
  ABOVEGROUND("aboveGround"),
  
  GROUNDLEVEL("groundLevel"),
  
  UNDERGROUND("underground");

  private String value;

  StructureGradeEnum(String value) {
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
  public static StructureGradeEnum fromValue(String value) {
    for (StructureGradeEnum b : StructureGradeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


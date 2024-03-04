package org.npp.model.vehicle.enums;
  
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
 * Type of weight - describing the meaning of a vehicle weight value * `actual`: The weight is the actual weight of a specific vehicle * `maximumPermitted`: The weight is the maximum permitted weight for a vehicle
 */


public enum WeightTypeEnum {
  
  ACTUAL("actual"),
  
  MAXIMUMPERMITTED("maximumPermitted");

  private String value;

  WeightTypeEnum(String value) {
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
  public static WeightTypeEnum fromValue(String value) {
    for (WeightTypeEnum b : WeightTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


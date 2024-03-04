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
 * Unit used for weight elements. * `poundsWeight`: 1 lb * `tonnesMetric`: 1000 kilogrammes
 */


public enum UnitOfMeasureWeightEnum {
  
  POUNDSWEIGHT("poundsWeight"),
  
  TONNESMETRIC("tonnesMetric");

  private String value;

  UnitOfMeasureWeightEnum(String value) {
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
  public static UnitOfMeasureWeightEnum fromValue(String value) {
    for (UnitOfMeasureWeightEnum b : UnitOfMeasureWeightEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


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
 * The emission level of a vehicle * `freeOfEmission`: Only vehicles that do not produce emissions (e.g. electric driven). Hybrid driven cars are allowed, when they switch to emission free mode within the considered situation * `lowLevelEmission`: Vehicles with low level emission
 */


public enum LowEmissionLevelEnum {
  
  FREEOFEMISSION("freeOfEmission"),
  
  LOWLEVELEMISSION("lowLevelEmission");

  private String value;

  LowEmissionLevelEnum(String value) {
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
  public static LowEmissionLevelEnum fromValue(String value) {
    for (LowEmissionLevelEnum b : LowEmissionLevelEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


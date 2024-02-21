package org.npp.model.enums;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A list of the supported calculation types for demand. * `counted`: Physical determination if a space is occupied * `derived`: Space occupancy is estimated by using related data such as active payments or sold permits. * `expected`: Future prediction of occupancy levels. * `verified`: Defines an occupancy report that is considered a verified report.
 */


public enum CalculationTypeEnum {
  
  COUNTED("counted"),
  
  DERIVED("derived"),
  
  EXPECTED("expected"),
  
  VERIFIED("verified");

  private String value;

  CalculationTypeEnum(String value) {
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
  public static CalculationTypeEnum fromValue(String value) {
    for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


package org.npp.model.rate.enums;
  
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
 * A list of supported rate usage condition types. * `fixedDuration`: Fixed duration - check Rate Usage Duration Limitation field * `fixedNumber`: check Rate Usage Count Limitation field * `once`: Permit can be used once * `unlimited`: Unlimited usage. 
 */


public enum RateUsageConditionsTypeEnum {
  
  FIXEDDURATION("fixedDuration"),
  
  FIXEDNUMBER("fixedNumber"),
  
  ONCE("once"),
  
  UNLIMITED("unlimited");

  private String value;

  RateUsageConditionsTypeEnum(String value) {
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
  public static RateUsageConditionsTypeEnum fromValue(String value) {
    for (RateUsageConditionsTypeEnum b : RateUsageConditionsTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


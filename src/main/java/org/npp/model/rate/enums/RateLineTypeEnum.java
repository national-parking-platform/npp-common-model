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
 * A list of rate line types. * `flatRate`: A rate applied to the rate line which is not time/duration dependent. i.e. a single fixed payment. * `flatRateTier`: A flat rate charge rate associated with a specific time-based tier. This is a special case of an incrementing rate. * `incrementingRate`: A charge rate that increases by a defined amount in a defined time.
 */


public enum RateLineTypeEnum {
  
  FLATRATE("flatRate"),
  
  FLATRATETIER("flatRateTier"),
  
  INCREMENTINGRATE("incrementingRate");

  private String value;

  RateLineTypeEnum(String value) {
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
  public static RateLineTypeEnum fromValue(String value) {
    for (RateLineTypeEnum b : RateLineTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


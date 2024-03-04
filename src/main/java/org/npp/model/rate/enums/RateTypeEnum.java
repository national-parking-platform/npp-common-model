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
 * * `contract`: Rate provided to contract holders only. * `daily`: Rate provided on a daily rate, per calendar day. * `event`: Rate provided in combination with a specific event. * `hourly`: Rate provided on an hourly basis.
 */


public enum RateTypeEnum {
  
  CONTRACT("contract"),
  
  DAILY("daily"),
  
  EVENT("event"),
  
  HOURLY("hourly");

  private String value;

  RateTypeEnum(String value) {
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
  public static RateTypeEnum fromValue(String value) {
    for (RateTypeEnum b : RateTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


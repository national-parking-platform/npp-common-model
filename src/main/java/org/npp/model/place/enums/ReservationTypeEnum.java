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
 * Different types of reservation. * `mandatory`: Reservation is mandatory. * `notAvailable`: Reservation is not possible. * `optional`: Reservation is optional. * `partly`: There is a specific contingent, that can be reserved. * `unknown`: Possibility of reservation is unknown, * `unspecified`: Possibility of reservation is not specified.
 */


public enum ReservationTypeEnum {
  
  MANDATORY("mandatory"),
  
  NOTAVAILABLE("notAvailable"),
  
  OPTIONAL("optional"),
  
  PARTLY("partly"),
  
  UNKNOWN("unknown"),
  
  UNSPECIFIED("unspecified");

  private String value;

  ReservationTypeEnum(String value) {
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
  public static ReservationTypeEnum fromValue(String value) {
    for (ReservationTypeEnum b : ReservationTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


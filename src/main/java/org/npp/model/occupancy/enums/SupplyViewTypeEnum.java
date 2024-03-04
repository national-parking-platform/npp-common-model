package org.npp.model.occupancy.enums;
  
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
 * Define if space quantity is demarcated or estimated. * `spaceView`: Each space is physically marked and identifiable. * `vehicleView`:  The vehicle capacity in an area is estimated based on calculating a capacity (i.e. curb length divided by a length of vehicle). The distributing party decides on the appropriate length of vehicle to use.
 */


public enum SupplyViewTypeEnum {
  
  SPACEVIEW("spaceView"),
  
  VEHICLEVIEW("vehicleView");

  private String value;

  SupplyViewTypeEnum(String value) {
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
  public static SupplyViewTypeEnum fromValue(String value) {
    for (SupplyViewTypeEnum b : SupplyViewTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


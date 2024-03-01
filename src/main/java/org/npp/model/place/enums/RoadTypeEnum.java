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
 * Categorisation of the  road type (motorway,main road,...). * `mainRoad`: Main road. * `motorway`: Motorway. * `other`: Other. * `trunkRoad`: Trunk road.
 */


public enum RoadTypeEnum {
  
  MAINROAD("mainRoad"),
  
  MOTORWAY("motorway"),
  
  OTHER("other"),
  
  TRUNKROAD("trunkRoad");

  private String value;

  RoadTypeEnum(String value) {
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
  public static RoadTypeEnum fromValue(String value) {
    for (RoadTypeEnum b : RoadTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


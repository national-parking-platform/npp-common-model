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
 * * `areaSeperatedFromSurroundings`: Site is separated from its surroundings. Can also be used to express a space for noise-producing vehicles, e.g. lorries with cooling generators. * `cctv`: CCTV (camera observation). * `dog`: Dog. * `externalSecurity`: External security, e.g. police or staff not directly belonging to the parking. * `fences`: Fences. * `floodLight`: Flood light (stronger than lighting). * `guard24hours`: 24/24 guard. * `lighting`: Site is illuminated in a normal way (but not as strong as 'floodLight'). * `none`: There are no security measures. * `other`: None of the values in this enumeration applies. Use 'parkingAdditionalSecurity' instead. * `securityStaff`: Security staff. * `socialControl`: Social control e.g. parking situated in a neighbourhood. * `unknown`: Unknown.
 */


public enum ParkingSecurityEnum {
  
  AREASEPERATEDFROMSURROUNDINGS("areaSeperatedFromSurroundings"),
  
  CCTV("cctv"),
  
  DOG("dog"),
  
  EXTERNALSECURITY("externalSecurity"),
  
  FENCES("fences"),
  
  FLOODLIGHT("floodLight"),
  
  GUARD24HOURS("guard24hours"),
  
  LIGHTING("lighting"),
  
  NONE("none"),
  
  OTHER("other"),
  
  SECURITYSTAFF("securityStaff"),
  
  SOCIALCONTROL("socialControl"),
  
  UNKNOWN("unknown");

  private String value;

  ParkingSecurityEnum(String value) {
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
  public static ParkingSecurityEnum fromValue(String value) {
    for (ParkingSecurityEnum b : ParkingSecurityEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


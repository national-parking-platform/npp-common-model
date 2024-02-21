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
 * * `assistanceLocation`: indicating the nature of the location point where assistance is available * `entranceAndExitLocation`: indicating the nature of the location is both an entrance and an exit from the Facility * `entranceLocation`: indicating the nature of the location is an entrance to the Facility * `exitLocation`: indicating the nature of the location is an exit from the Facility * `sellingPointLocation`: indicating the nature of the location is a position for the access to ticket machines, or similar vending facilities'
 */


public enum AreaFacilityPointLocationEnum {
  
  ASSISTANCELOCATION("assistanceLocation"),
  
  ENTRANCEANDEXITLOCATION("entranceAndExitLocation"),
  
  ENTRANCELOCATION("entranceLocation"),
  
  EXITLOCATION("exitLocation"),
  
  SELLINGPOINTLOCATION("sellingPointLocation");

  private String value;

  AreaFacilityPointLocationEnum(String value) {
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
  public static AreaFacilityPointLocationEnum fromValue(String value) {
    for (AreaFacilityPointLocationEnum b : AreaFacilityPointLocationEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


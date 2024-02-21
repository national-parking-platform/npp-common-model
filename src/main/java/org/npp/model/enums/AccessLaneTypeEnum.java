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
 * A list of the supported access lane characteristic types : * `entryOnly`: Entry only Lane used for entry to facility only. * `exitOnly`: Exit only Lane used for exit from facility only. * `reversibleLane`: Reversible lane Lane used for both entry and exit to/from facility, depending on operational conditions. * `serviceVehicleLane`: Service vehicle lane Lane used by parking operator service vehicle, not for public use.
 */


public enum AccessLaneTypeEnum {
  
  ENTRYONLY("entryOnly"),
  
  EXITONLY("exitOnly"),
  
  REVERSIBLELANE("reversibleLane"),
  
  SERVICEVEHICLELANE("serviceVehicleLane");

  private String value;

  AccessLaneTypeEnum(String value) {
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
  public static AccessLaneTypeEnum fromValue(String value) {
    for (AccessLaneTypeEnum b : AccessLaneTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


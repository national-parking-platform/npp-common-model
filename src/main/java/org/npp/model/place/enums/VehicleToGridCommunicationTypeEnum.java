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
 * * `iec619802`: Communication according to IEC 61980-2. * `iso15118`: Communication according to ISO15118. * `none`: No communication between vehicle and the grid. * `other`: Communication according to other guidelines/specifications. * `unknown`: The type of communication is unknown.
 */


public enum VehicleToGridCommunicationTypeEnum {
  
  IEC619802("iec619802"),
  
  ISO15118("iso15118"),
  
  NONE("none"),
  
  OTHER("other"),
  
  UNKNOWN("unknown");

  private String value;

  VehicleToGridCommunicationTypeEnum(String value) {
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
  public static VehicleToGridCommunicationTypeEnum fromValue(String value) {
    for (VehicleToGridCommunicationTypeEnum b : VehicleToGridCommunicationTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


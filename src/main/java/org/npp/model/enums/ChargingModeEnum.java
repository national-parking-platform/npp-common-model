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
 * Charging mode according to IEC-61851 terminology * `ccs`: Charging with a combined charging solution (CCS). AC and DC are used simultaneously. * `legacyInductive`: Legacy-Inductive * `mode1AC1p`: Mode 1, AC 1 phase * `mode1AC3p`: Mode 1, AC 3 phases * `mode2AC1p`: Mode 2, AC 1 phase * `mode2AC3p`: Mode 2, AC 3 phases * `mode3AC3p`: Mode 3, AC 3 phases * `mode4DC`: Mode 4, DC * `other`: Some other charging mode * `unknown`: The type of the charging mode is unknown
 */


public enum ChargingModeEnum {
  
  CCS("ccs"),
  
  LEGACYINDUCTIVE("legacyInductive"),
  
  MODE1AC1P("mode1AC1p"),
  
  MODE1AC3P("mode1AC3p"),
  
  MODE2AC1P("mode2AC1p"),
  
  MODE2AC3P("mode2AC3p"),
  
  MODE3AC3P("mode3AC3p"),
  
  MODE4DC("mode4DC"),
  
  OTHER("other"),
  
  UNKNOWN("unknown");

  private String value;

  ChargingModeEnum(String value) {
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
  public static ChargingModeEnum fromValue(String value) {
    for (ChargingModeEnum b : ChargingModeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


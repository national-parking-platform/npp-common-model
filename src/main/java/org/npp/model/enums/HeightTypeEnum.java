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
 * List of coded values for height types, as defined in GML. * `ellipsoidalHeight`: Value measured vertically above the reference ellipsoid * `gravityRelatedHeight`: Height type corresponding a value measured along direction of gravity above the reference geoid i.e. equipotential surface of the Earth's gravity field which globally approximates mean sea level. * `relativeHeight`: Height type corresponding to value measured vertically above the ground level at this point.
 */


public enum HeightTypeEnum {
  
  ELLIPSOIDALHEIGHT("ellipsoidalHeight"),
  
  GRAVITYRELATEDHEIGHT("gravityRelatedHeight"),
  
  RELATIVEHEIGHT("relativeHeight");

  private String value;

  HeightTypeEnum(String value) {
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
  public static HeightTypeEnum fromValue(String value) {
    for (HeightTypeEnum b : HeightTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


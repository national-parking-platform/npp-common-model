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
 * A list of the supported parking element descriptors (e.g. floor, row). * `floorOrLevel`: Describes a place identified as a \"floor\", with typical use to describe a floor or level in a multi-level structure * `row`: Describes a place identified as a \"row\", with typical use to describe a quasi-line parking or other feature of common characteristics * `street`: Describes a place identified as a \"street\", with typical use to describe a part of a road sharing a common given name.
 */


public enum ElementDescriptorEnum {
  
  FLOORORLEVEL("floorOrLevel"),
  
  ROW("row"),
  
  STREET("street");

  private String value;

  ElementDescriptorEnum(String value) {
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
  public static ElementDescriptorEnum fromValue(String value) {
    for (ElementDescriptorEnum b : ElementDescriptorEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


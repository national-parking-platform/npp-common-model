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
 * Types of NUTS codes (Nomenclature of territorial units for statistics) including LAU codes (Local Administrative Units). * `lau1Code`: LAU 1 code * `lau2Code`: LAU 2 code * `nuts1Code`: NUTS 1 code * `nuts2Code`: NUTS 2 code * `nuts3Code`: NUTS 3 code
 */


public enum NutsCodeTypeEnum {
  
  LAU1CODE("lau1Code"),
  
  LAU2CODE("lau2Code"),
  
  NUTS1CODE("nuts1Code"),
  
  NUTS2CODE("nuts2Code"),
  
  NUTS3CODE("nuts3Code");

  private String value;

  NutsCodeTypeEnum(String value) {
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
  public static NutsCodeTypeEnum fromValue(String value) {
    for (NutsCodeTypeEnum b : NutsCodeTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


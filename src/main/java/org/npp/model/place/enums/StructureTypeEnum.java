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
 * A list of types of parking structure. * `offStreetStructure`: Off-street multi-tier parking structure. * `offStreetSurface`: Off-street ground-level at grade parking. * `onStreet`: On-street parking.
 */


public enum StructureTypeEnum {
  
  OFFSTREETSTRUCTURE("offStreetStructure"),
  
  OFFSTREETSURFACE("offStreetSurface"),
  
  ONSTREET("onStreet");

  private String value;

  StructureTypeEnum(String value) {
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
  public static StructureTypeEnum fromValue(String value) {
    for (StructureTypeEnum b : StructureTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


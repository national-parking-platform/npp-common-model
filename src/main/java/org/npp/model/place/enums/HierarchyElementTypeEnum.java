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
 * Defines the supported lists of types of parking hierarchy elements permissible * `campus`: a data structure holding information about a large, often ill-defined area, which may contain many parking structures. * `identifiedArea`: a data structure holding information about a coherent feature, such as a set of parking spaces that all share the same characteristics * `parkingPlace`: a data structure holding information about a single identifiable facility * `space`: a data structure holding information about a single space for parking, usually designed for one vehicle, which may be denoted by painted or other road surface markers * `subPlaceElement`: a reusable data structure holding information about a collection of IdentifiableAreas
 */


public enum HierarchyElementTypeEnum {
  
  CAMPUS("campus"),
  
  IDENTIFIEDAREA("identifiedArea"),
  
  PARKINGPLACE("parkingPlace"),
  
  SPACE("space"),
  
  SUBPLACEELEMENT("subplaceElement");

  private String value;

  HierarchyElementTypeEnum(String value) {
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
  public static HierarchyElementTypeEnum fromValue(String value) {
    for (HierarchyElementTypeEnum b : HierarchyElementTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


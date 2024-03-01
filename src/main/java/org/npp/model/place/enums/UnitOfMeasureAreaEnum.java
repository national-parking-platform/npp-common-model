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
 * Unit used for area/surface elements. * `squareFeet`: Unit of Square feet. * `squareMetres`: Unit of Metres Square. * `squareYards`: Unit of Square yards.
 */


public enum UnitOfMeasureAreaEnum {
  
  SQUAREFEET("squareFeet"),
  
  SQUAREMETRES("squareMetres"),
  
  SQUAREYARDS("squareYards");

  private String value;

  UnitOfMeasureAreaEnum(String value) {
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
  public static UnitOfMeasureAreaEnum fromValue(String value) {
    for (UnitOfMeasureAreaEnum b : UnitOfMeasureAreaEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


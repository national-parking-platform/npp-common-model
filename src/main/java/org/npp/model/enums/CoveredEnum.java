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
 * Defines the supported lists of different types describing roof coverage of the facility or entity * `covered`: Indicates that the facility or specific entity has a roof to provide protection from direct overhead sun or adverse weather * `notCovered`: Indicates that the facility or specific entity has no roof to provide protection from direct overhead sun or adverse weather * `partiallyCovered`: Indicates that the facility or specific entity has a roof offering partial coverage to provide protection from direct overhead sun or adverse weather * `topLevelNotCovered`: Indicates that in a multi-level facility or specific entity the top level(s) have no roof to provide protection from direct overhead sun or adverse weather
 */


public enum CoveredEnum {
  
  COVERED("covered"),
  
  NOTCOVERED("notCovered"),
  
  PARTIALLYCOVERED("partiallyCovered"),
  
  TOPLEVELNOTCOVERED("topLevelNotCovered");

  private String value;

  CoveredEnum(String value) {
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
  public static CoveredEnum fromValue(String value) {
    for (CoveredEnum b : CoveredEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


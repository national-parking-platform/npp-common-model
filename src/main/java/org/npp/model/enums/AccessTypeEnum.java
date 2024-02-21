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
 * A list of the supported access area types : * `entry`: a zone or area that is a place for access into a facility * `exit`: a zone or area that is a place for access from a facility * `reversible`: a zone or area that is a place for access to or egress from a facility. Conditions may be changed by operation circumstances, such as time of day.
 */


public enum AccessTypeEnum {
  
  ENTRY("entry"),
  
  EXIT("exit"),
  
  REVERSIBLE("reversible");

  private String value;

  AccessTypeEnum(String value) {
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
  public static AccessTypeEnum fromValue(String value) {
    for (AccessTypeEnum b : AccessTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


package org.npp.model.time.enums;
  
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
 * Values of validity status that can be assigned to a described event, action or item. * `active`: The described event, action or item is currently active regardless of the definition of the validity time specification. * `definedByValidityTimeSpec`: The validity status of the described event, action or item is in accordance with the definition of the validity time specification. * `planned`: The described event, action or item is currently planned regardless of the definition of the validity time specification. * `suspended`: The described event, action or item is currently suspended, that is inactive, regardless of the definition of the validity time specification.
 */


public enum ValidityStatusEnum {
  
  ACTIVE("active"),
  
  DEFINEDBYVALIDITYTIMESPEC("definedByValidityTimeSpec"),
  
  PLANNED("planned"),
  
  SUSPENDED("suspended");

  private String value;

  ValidityStatusEnum(String value) {
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
  public static ValidityStatusEnum fromValue(String value) {
    for (ValidityStatusEnum b : ValidityStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


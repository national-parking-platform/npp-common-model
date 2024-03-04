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
 * A table of different service levels to be expected for fuelling/charging and payment. * `fullService`: Full fuelling service carried out by an employee. * `selfService`: Self Service for fuelling * `unattended`: Unattended station, fuelling and payment to be done without assistance.
 */


public enum ServiceTypeEnum {
  
  FULLSERVICE("fullService"),
  
  SELFSERVICE("selfService"),
  
  UNATTENDED("unattended");

  private String value;

  ServiceTypeEnum(String value) {
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
  public static ServiceTypeEnum fromValue(String value) {
    for (ServiceTypeEnum b : ServiceTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


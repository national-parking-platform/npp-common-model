package org.npp.model.observation.enums;
  
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
 * A list of the supported observation types. * `anpr`: Automatic vehicle license plate recognition * `chalk`: Chalk-mark observation or similar * `rfTransponder`: Rf transponder radio frequency transponder device, for toll tag or similar radio based devices * `scanner`: Handheld or fixed scanning device (optical) * `visual`: Visual (human) observation
 */


public enum ObservationTypeEnum {
  
  ANPR("anpr"),
  
  CHALK("chalk"),
  
  RFTRANSPONDER("rfTransponder"),
  
  SCANNER("scanner"),
  
  VISUAL("visual");

  private String value;

  ObservationTypeEnum(String value) {
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
  public static ObservationTypeEnum fromValue(String value) {
    for (ObservationTypeEnum b : ObservationTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


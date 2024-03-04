package org.npp.model.rate.enums;
  
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
 * * `private`: where parking access limited to known and authorized individuals. * `public`: Open to the public.  * `restricted`: Open to the public but need a direct purpose or permission to use from owner (e.g. doctor's surgery, storefront)\"
 */


public enum RateAvailabilityTypeEnum {
  
  PRIVATE("private"),
  
  PUBLIC("public"),
  
  RESTRICTED("restricted");

  private String value;

  RateAvailabilityTypeEnum(String value) {
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
  public static RateAvailabilityTypeEnum fromValue(String value) {
    for (RateAvailabilityTypeEnum b : RateAvailabilityTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


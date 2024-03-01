package org.npp.model.common.enums;
  
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
 * A list of supported reasons if a requested quote response is not provided * `eligibilityRequirementNotMet`: a stated eligibility requirement is not considered to be met * `noAvailability`: No availability for request * `noMatchingSpecification`: No matching rights specification found * `other`: other reason (reason not given) * `rightSpecificationNotAvailableAtRequestedTimes`: the requested specification is not available at the requested time 
 */


public enum ResponseReasonEnum {
  
  ELIGIBILITYREQUIREMENTNOTMET("eligibilityRequirementNotMet"),
  
  NOAVAILABILITY("noAvailability"),
  
  NOMATCHINGSPECIFICATION("noMatchingSpecification"),
  
  OTHER("other"),
  
  RIGHTSPECIFICATIONNOTAVAILABLEATREQUESTEDTIMES("rightSpecificationNotAvailableAtRequestedTimes");

  private String value;

  ResponseReasonEnum(String value) {
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
  public static ResponseReasonEnum fromValue(String value) {
    for (ResponseReasonEnum b : ResponseReasonEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


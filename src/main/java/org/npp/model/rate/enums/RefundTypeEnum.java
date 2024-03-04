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
 * A list of available refund categories. * `surchargeFullyRefundable`: The surcharge amount is fully refundable, when termination conditions are met. * `surchargeNonRefundable`: The surcharge amount is nonrefundable, when termination conditions are met. * `surchargePartiallyRefundable`: The surcharge amount is partially but not fully refundable, when termination conditions are met.
 */


public enum RefundTypeEnum {
  
  SURCHARGEFULLYREFUNDABLE("surchargeFullyRefundable"),
  
  SURCHARGENONREFUNDABLE("surchargeNonRefundable"),
  
  SURCHARGEPARTIALLYREFUNDABLE("surchargePartiallyRefundable");

  private String value;

  RefundTypeEnum(String value) {
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
  public static RefundTypeEnum fromValue(String value) {
    for (RefundTypeEnum b : RefundTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


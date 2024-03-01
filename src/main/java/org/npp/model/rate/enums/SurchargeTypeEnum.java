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
 * Reason for surcharge: * `reservation` * `mobilePayment` * `deposit` * `membershipFee`
 */


public enum SurchargeTypeEnum {
  
  RESERVATION("reservation"),
  
  MOBILEPAYMENT("mobilePayment"),
  
  DEPOSIT("deposit"),
  
  MEMBERSHIPFEE("membershipFee");

  private String value;

  SurchargeTypeEnum(String value) {
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
  public static SurchargeTypeEnum fromValue(String value) {
    for (SurchargeTypeEnum b : SurchargeTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


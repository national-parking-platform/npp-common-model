package org.npp.model.payment.enums;
  
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
 * * `americanExpress`: American express * `applePay`: Apple pay * `cirrus`: Cirrus * `dinersClub`: Diners club * `discoverCard`: Discover card * `giroCard`: Giro card * `maestro`: Maestro * `masterCard`: Master card * `other`: Other * `visa`: Visa * `vpay`: Vpay
 */


public enum PaymentBrandsEnum {
  
  AMERICANEXPRESS("americanExpress"),
  
  APPLEPAY("applePay"),
  
  CIRRUS("cirrus"),
  
  DINERSCLUB("dinersClub"),
  
  DISCOVERCARD("discoverCard"),
  
  GIROCARD("giroCard"),
  
  MAESTRO("maestro"),
  
  MASTERCARD("masterCard"),
  
  OTHER("other"),
  
  VISA("visa"),
  
  VPAY("vpay");

  private String value;

  PaymentBrandsEnum(String value) {
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
  public static PaymentBrandsEnum fromValue(String value) {
    for (PaymentBrandsEnum b : PaymentBrandsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


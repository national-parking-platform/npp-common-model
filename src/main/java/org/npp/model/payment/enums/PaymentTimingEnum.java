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
 * Details of when payment is required. * `other`: Other. * `payAfterExit`: Payment on account * `payAndExit`: Pay directly at the exit with a payment card or other means of payment (usually, this payment card must have been used when entering as well). * `payOnEntry`: Pay at start of the parking session (e.g. for pay and display) * `payPriorToExit`: Pay at machine on foot prior to returning to vehicle and use payment ticket to exit. * `prepay`: Pay before entry
 */


public enum PaymentTimingEnum {
  
  OTHER("other"),
  
  PAYAFTEREXIT("payAfterExit"),
  
  PAYANDEXIT("payAndExit"),
  
  PAYONENTRY("payOnEntry"),
  
  PAYPRIORTOEXIT("payPriorToExit"),
  
  PREPAY("prepay");

  private String value;

  PaymentTimingEnum(String value) {
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
  public static PaymentTimingEnum fromValue(String value) {
    for (PaymentTimingEnum b : PaymentTimingEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


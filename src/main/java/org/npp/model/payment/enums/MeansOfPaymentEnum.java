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
 * Means of payment * `cashBillsOnly`: Cash payment using bills only. * `cashCoinsAndBills`: Cash payment using bills and/or coins only. * `cashCoinsOnly`: Cash payment with coins only. * `mobileAccount`: Payment method using an app or other functions typically via a smartphone, to a linked bank or card account. * `paymentCreditCard`: Payment by electronic payment credit card which is a small plastic card issued by a bank, building society, or  other financial institution (ISO/IEC 7813 and other related standards), allowing the holder to purchase goods or services on credit. * `paymentDebitCard`: Payment by electronic payment debit card which is a small plastic card (ISO/IEC 7813 and other related standards), allowing the holder to transfer money electronically from their bank account when making a purchase. * `paymentValueCard`: Payment by electronic payment debit card which is a small plastic card (ISO/IEC 7813 and other related standards)  with a monetary value stored on the card itself, not that may not be linked to an external account maintained by a financial institution. * `prepay`: Advanced payment for parking right. * `tollTag`: Toll tag (RFID) or similar, with associated account. * `unknown`: Unknown.
 */


public enum MeansOfPaymentEnum {
  
  CASHBILLSONLY("cashBillsOnly"),
  
  CASHCOINSANDBILLS("cashCoinsAndBills"),
  
  CASHCOINSONLY("cashCoinsOnly"),
  
  MOBILEACCOUNT("mobileAccount"),
  
  PAYMENTCREDITCARD("paymentCreditCard"),
  
  PAYMENTDEBITCARD("paymentDebitCard"),
  
  PAYMENTVALUECARD("paymentValueCard"),
  
  PREPAY("prepay"),
  
  TOLLTAG("tollTag"),
  
  UNKNOWN("unknown");

  private String value;

  MeansOfPaymentEnum(String value) {
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
  public static MeansOfPaymentEnum fromValue(String value) {
    for (MeansOfPaymentEnum b : MeansOfPaymentEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


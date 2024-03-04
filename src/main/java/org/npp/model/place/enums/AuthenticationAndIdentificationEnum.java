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
 * A table of authentication and/or identification methods:  * `activeRFIDChip`: Phone (active RFID chip) * `apps`: Apps * `calypso`: RFID Calypso * `cashPayment`: No specific authentication by using cash * `creditCard`: Credit card * `debitCard`: Debit card * `mifareClassic`: RFID Card / Phone NFC - Mifare Classic * `mifareDesfire`: RFID Card / Phone NFC - Mifare Desfire * `nfc`: Nearfield communication * `noAccess`: No access granted * `overTheAir`: Over the air according to ISO 15118 * `phoneDialog`: phone (dialog with platform) * `phoneSMS`: Phone (SMS) * `pinpad`: PINPAD * `plc`: PLC according to ISO 15118 * `prepaidCard`: Pre-Paid card * `rfid`: RFID * `unlimitedAccess`: No authentication/identification required. * `website`: Using a website
 */


public enum AuthenticationAndIdentificationEnum {
  
  ACTIVERFIDCHIP("activeRFIDChip"),
  
  APPS("apps"),
  
  CALYPSO("calypso"),
  
  CASHPAYMENT("cashPayment"),
  
  CREDITCARD("creditCard"),
  
  DEBITCARD("debitCard"),
  
  MIFARECLASSIC("mifareClassic"),
  
  MIFAREDESFIRE("mifareDesfire"),
  
  NFC("nfc"),
  
  NOACCESS("noAccess"),
  
  OVERTHEAIR("overTheAir"),
  
  PHONEDIALOG("phoneDialog"),
  
  PHONESMS("phoneSMS"),
  
  PINPAD("pinpad"),
  
  PLC("plc"),
  
  PREPAIDCARD("prepaidCard"),
  
  RFID("rfid"),
  
  UNLIMITEDACCESS("unlimitedAccess"),
  
  WEBSITE("website");

  private String value;

  AuthenticationAndIdentificationEnum(String value) {
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
  public static AuthenticationAndIdentificationEnum fromValue(String value) {
    for (AuthenticationAndIdentificationEnum b : AuthenticationAndIdentificationEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


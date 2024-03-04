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
 * * `barcode`: Barcode or QR digital print pattern, held on any physical media. * `bluetooth`: Specific bluetooth or BLE identification chip used to associate a BLE receiver to a specific user.  Used for both one time and permit uses. * `eticket`: Digital equivalent of a paper ticket, often presentable via smartphone or similar device for control. * `hangtag`: Visible, often removable, credential indicator, with visible markings * `licensePlate`: Fixed plate, in a defined format, used to identify a specific vehicle- Normally a permanent fixture. * `permit`: Issued credential, often in the form of an adhesive label, often placed on the windscreen, credential indicator, with visible markings * `qrCode`: Quick Reference (QR) code * `rfid`: Specific RF identification associated to an RFID-related account.  Used for permit uses. * `ticket`: Typically issued paper with printed details, often with magnetic strips; typically single use disposable. * `electronicID`: An identifier transmitted by electronic means * `permit`: an official document or marker giving someone authorization to do something. * `ticketcoupon`: A visible printed or written paper-based ticket or coupon carrying an identifiable credential. * `vehicleplate`: A fixed identifier (registration plate) visible and fixed to a vehicle.
 */


public enum CredentialTypeEnum {
  
  BARCODE("barcode"),
  
  BLUETOOTH("bluetooth"),
  
  ETICKET("eticket"),
  
  HANGTAG("hangtag"),
  
  LICENSEPLATE("licensePlate"),
  
  PERMIT("permit"),
  
  QRCODE("qrCode"),
  
  RFID("rfid"),
  
  TICKET("ticket"),
  
  ELECTRONICID("electronicID"),
  
  TICKETCOUPON("ticketcoupon"),
  
  VEHICLEPLATE("vehicleplate");

  private String value;

  CredentialTypeEnum(String value) {
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
  public static CredentialTypeEnum fromValue(String value) {
    for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


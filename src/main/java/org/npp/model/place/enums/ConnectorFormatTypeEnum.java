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
 * A list of cable types used during the charging process. * `cableMode2`: The connector is an attached cable; the EV users car needs to have a fitting inlet for a mode 2 cable, common for most domestic sockets * `cableMode3`: The connector is an attached cable; the EV users car needs to have a fitting inlet for a mode 3 cable, can be used for Type 1 and Type 2 sockets. * `otherCable`: The connector is an attached cable; the EV users car needs to have a fitting inlet. * `socket`: The connector is a socket; the EV user needs to bring a fitting plug 
 */


public enum ConnectorFormatTypeEnum {
  
  CABLEMODE2("cableMode2"),
  
  CABLEMODE3("cableMode3"),
  
  OTHERCABLE("otherCable"),
  
  SOCKET("socket");

  private String value;

  ConnectorFormatTypeEnum(String value) {
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
  public static ConnectorFormatTypeEnum fromValue(String value) {
    for (ConnectorFormatTypeEnum b : ConnectorFormatTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


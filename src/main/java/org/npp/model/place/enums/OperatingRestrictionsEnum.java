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
 * Defines operating restrictions to use the of a facility. * `busOnly`: Only buses are permitted. * `busStop`: This is a stopping place of bus pick-up or drop-off; not to be used for parking. * `carpoolOnly`: Only carpool vehicles are permitted. * `commercialVehicleOnly`: Only commercial vehicles are permitted. * `disabledPersonPermitOnly`: Only vehicles of registered disabled person permit holders permitted. * `electricVehicleOnly`: Only electric vehicles permitted. * `freeParking`: No fee for parking * `governmentVehicleOnly`: Only government vehicles permitted. * `loadingZone`: This is a loading zone; not to be used for parking. * `loadingZoneCommercial`: Only government vehicles permitted. * `media`: Only for use by the media * `noParking`: No parking permitted * `noWaiting`: No waiting or parking of vehicles is permitted * `parkingTimeLimit`: Time limited parking. * `residentialPermitOnly`: Only for use by residential permit holders only * `snow`: Snow clearing zone; no parking * `streetCleaning`: Street cleansing zone; no parking * `taxiOnly`: Only taxis are permitted. * `valetOnly`: Only valet service vehicles are permitted.
 */


public enum OperatingRestrictionsEnum {
  
  BUSONLY("busOnly"),
  
  BUSSTOP("busStop"),
  
  CARPOOLONLY("carpoolOnly"),
  
  COMMERCIALVEHICLEONLY("commercialVehicleOnly"),
  
  DISABLEDPERSONPERMITONLY("disabledPersonPermitOnly"),
  
  ELECTRICVEHICLEONLY("electricVehicleOnly"),
  
  FREEPARKING("freeParking"),
  
  GOVERNMENTVEHICLEONLY("governmentVehicleOnly"),
  
  LOADINGZONE("loadingZone"),
  
  LOADINGZONECOMMERCIAL("loadingZoneCommercial"),
  
  MEDIA("media"),
  
  NOPARKING("noParking"),
  
  NOWAITING("noWaiting"),
  
  PARKINGTIMELIMIT("parkingTimeLimit"),
  
  RESIDENTIALPERMITONLY("residentialPermitOnly"),
  
  SNOW("snow"),
  
  STREETCLEANING("streetCleaning"),
  
  TAXIONLY("taxiOnly"),
  
  VALETONLY("valetOnly");

  private String value;

  OperatingRestrictionsEnum(String value) {
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
  public static OperatingRestrictionsEnum fromValue(String value) {
    for (OperatingRestrictionsEnum b : OperatingRestrictionsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


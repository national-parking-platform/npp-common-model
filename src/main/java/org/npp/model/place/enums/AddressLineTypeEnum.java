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
 * A table of types of address lines  * `apartment`: Element indicating a discrete element of a building forming the address  * `building`: Element identifying the number or name and type of the edifice or construction relevant for the address [derived from ISO19160-4]  * `districtTerritory`: Element specifying the geographic or administrative area of the country for the address [Source: 19160-4]  * `floor`: Element indicating the floor or level on which a delivery point is located in a multi-storey building [Source:ISO19160-4]  * `poBox`: A postal delivery location identifier, not necessarily a physical location.  * `region`: Element indicating the name of the area within or adjacent to the town in which delivery address is.  * `street`: Element indicating road or street identifier or name   * `town`: Element indicating the name of the populated place in which a delivery point is located, or near to or via which the delivery point is accessed. [Source: ISO19160-4]  * `unit`: An element representing a section of a building or organisation.Free-text description of the condition that leads to a surcharge beingapplied
 */


public enum AddressLineTypeEnum {
  
  APARTMENT("apartment"),
  
  BUILDING("building"),
  
  DISTRICTTERRITORY("districtTerritory"),
  
  FLOOR("floor"),
  
  POBOX("poBox"),
  
  REGION("region"),
  
  STREET("street"),
  
  TOWN("town"),
  
  UNIT("unit");

  private String value;

  AddressLineTypeEnum(String value) {
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
  public static AddressLineTypeEnum fromValue(String value) {
    for (AddressLineTypeEnum b : AddressLineTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


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
 * A list of supported methods for detection of occupancy by a vehicle in a parking space. * `anpr` Automated License Plate Recognition information is tracked for inbound and outbound traffic. The difference between in and out counts enables an occupancy count. * `imageAnalytics` Image analytics are used to evaluate a picture with known parking space geography and computer vision is used to determine occupancy at a point in time. * `spaceSensor` A sensor in each space detects the presence of a vehicle. * `userDeclaration` User self-declared, where the user enters a space identifier and/or vehicle registration number, typically at the start of a parking session. * `videoAnalytics` Video analytics are used to evaluate a video stream to identify objects (vehicles) and direction of travel. The difference between the inbound objects and outbound objects determines occupancy. * `videoSpace` Video analytics or ANPR technologies are used to evaluate a video stream with known space geometry to identify objects (vehicles or license plates) occupying specific spaces. * `visual` Operator/owner makes periodic visual counts of the facility.
 */


public enum ParkingSpaceOccupancyDetectionEnum {
  
  ANPR("anpr"),
  
  IMAGEANALYTICS("imageAnalytics"),
  
  SPACESENSOR("spaceSensor"),
  
  USERDECLARATION("userDeclaration"),
  
  VIDEOANALYTICS("videoAnalytics"),
  
  VIDEOSPACE("videoSpace"),
  
  VISUAL("visual");

  private String value;

  ParkingSpaceOccupancyDetectionEnum(String value) {
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
  public static ParkingSpaceOccupancyDetectionEnum fromValue(String value) {
    for (ParkingSpaceOccupancyDetectionEnum b : ParkingSpaceOccupancyDetectionEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


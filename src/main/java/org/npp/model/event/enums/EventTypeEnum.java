package org.npp.model.event.enums;
  
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
 * Describes the possible types of event subscriptions, with supported event types: - `PlaceCreated`: A child place hierarchy element was created - `PlaceUpdated`: A place hierarchy element was updated - `PlaceDeleted`: A place hierarchy element was deleted - `AssignedRightCreated`: An assigned right was created at any of scoped place hierarchy elements - `AssignedRightUpdated`: An assigned right was updated at any of scoped place hierarchy elements - `AssignedRightDeleted`: An assigned right was deleted at any of scoped place hierarchy elements - `SessionCreated`: A session was created at any of scoped place hierarchy elements - `SessionUpdated`: A session was updated at any of scoped place hierarchy elements - `SessionDeleted`: A session was deleted at any of scoped place hierarchy elements - `ObservationCreated`: An observation was created at any of scoped place hierarchy elements - `ObservationUpdated`: An observation was updated at any of scoped place hierarchy elements - `ObservationDeleted`: An observation was deleted at any of scoped place hierarchy elements - `RightSpecificationCreated`: A right specification was created and associated with any of scoped place hierarchy elements - `RightSpecificationUpdated`: A right specification associated with any of scoped place hierarchy elements was updated - `RightSpecificationDeleted`: A right specification associated with any of scoped place hierarchy elements was deleted - `RateTableUpdated`: A rate table associated with a right specification in turn associated with any of scoped place hierarchy elements was updated - `RateTableDeleted`: A rate table associated with a right specification in turn associated with any of scoped place hierarchy elements was updated
 */


public enum EventTypeEnum {
  
  PLACECREATED("PlaceCreated"),
  
  PLACEUPDATED("PlaceUpdated"),
  
  PLACEDELETED("PlaceDeleted"),
  
  ASSIGNEDRIGHTCREATED("AssignedRightCreated"),
  
  ASSIGNEDRIGHTUPDATED("AssignedRightUpdated"),
  
  ASSIGNEDRIGHTDELETED("AssignedRightDeleted"),
  
  SESSIONCREATED("SessionCreated"),
  
  SESSIONUPDATED("SessionUpdated"),
  
  SESSIONDELETED("SessionDeleted"),
  
  OBSERVATIONCREATED("ObservationCreated"),
  
  OBSERVATIONUPDATED("ObservationUpdated"),
  
  OBSERVATIONDELETED("ObservationDeleted"),
  
  RIGHTSPECIFICATIONCREATED("RightSpecificationCreated"),
  
  RIGHTSPECIFICATIONUPDATED("RightSpecificationUpdated"),
  
  RIGHTSPECIFICATIONDELETED("RightSpecificationDeleted"),
  
  RATETABLEUPDATED("RateTableUpdated"),
  
  RATETABLEDELETED("RateTableDeleted");

  private String value;

  EventTypeEnum(String value) {
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
  public static EventTypeEnum fromValue(String value) {
    for (EventTypeEnum b : EventTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


package org.npp.model.enums;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * `available`: The refill point is not occupied, has got enough energy resources and can be used. * `blocked`: The refill point is not accessible because of a physical barrier, e.g. a car. * `charging`: The refill point is currently in use for charging. * `faulted`: The refill point has got a fault. * `inoperative`: The refill point is not yet active or it is no longer available (deleted). * `occupied`: The refill point is in use, this might include vehicle charging activity. * `outOfOrder`: The refill point is currently out of order. * `outOfStock`: The refill point is out of stock, i.e. energy resources are empty. * `planned`: The refill point is planned, will be operating soon. * `removed`: The refill point was discontinued/removed. * `reserved`: The refill point is reserved by a customer, i.e. it is not available for other users right now. * `unavailable`: There is no energy available at this refill point. This could be because of a failure or damage or a longer lasting delivery failure (note that there is a literal 'outOfStock' for a short-term shortage). * `unknown`: The status of the refill point is unknown (can also be offline).
 */


public enum RefillPointStatusEnum {
  
  AVAILABLE("available"),
  
  BLOCKED("blocked"),
  
  CHARGING("charging"),
  
  FAULTED("faulted"),
  
  INOPERATIVE("inoperative"),
  
  OCCUPIED("occupied"),
  
  OUTOFORDER("outOfOrder"),
  
  OUTOFSTOCK("outOfStock"),
  
  PLANNED("planned"),
  
  REMOVED("removed"),
  
  RESERVED("reserved"),
  
  UNAVAILABLE("unavailable"),
  
  UNKNOWN("unknown");

  private String value;

  RefillPointStatusEnum(String value) {
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
  public static RefillPointStatusEnum fromValue(String value) {
    for (RefillPointStatusEnum b : RefillPointStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


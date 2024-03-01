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
 * Types of different users,for example used in the context of parking. * `allUsers`: All users. * `commuters`: Commuters. * `customers`: Customers. * `disabled`: Physically impaired people. * `elderlyUsers`: Elderly users. * `employees`: Employees. * `families`: Families. * `handicapped`: Persons with deficiencies in their daily life. * `hearingImpaired`: People with difficulties to hear. * `hotelGuests`: Hotel guests. * `longTermParkers`: Long-term parker. * `members`: Members. * `men`: Men. * `other`: Other. * `overnightParkers`: Overnight parker. * `parkAndCycleUser`: Park and cycle user. * `parkAndRideUsers`: Users that are exchanging into public transport at a park and ride station. * `parkAndWalkUser`: Park and walk user. * `pensioners`: Pensioners. * `pregnantWomen`: Pregnant women. * `registeredDisabledUsers`: Registered disabled persons. * `reservationHolders`: Those who have a valid reservation, e.g. for the duration of parking. * `residents`: Local residents. * `seasonTicketHolders`: Season ticket holders. * `shoppers`: Shoppers. * `shortTermParkers`: Short-term parker. * `sportEventAwaySupporters`: Sport event away supporters. * `sportEventHomeSupporters`: Sport event home supporters. * `staff`: Staff. * `students`: Students. * `subscribers`: Subscribers. * `unknown`: Unknown. * `visitors`: Visitors. * `visuallyImpaired`: People with difficulties to see. * `wheelchairUsers`: Wheelchair users. * `women`: Women.
 */


public enum UserTypeEnum {
  
  ALLUSERS("allUsers"),
  
  COMMUTERS("commuters"),
  
  CUSTOMERS("customers"),
  
  DISABLED("disabled"),
  
  ELDERLYUSERS("elderlyUsers"),
  
  EMPLOYEES("employees"),
  
  FAMILIES("families"),
  
  HANDICAPPED("handicapped"),
  
  HEARINGIMPAIRED("hearingImpaired"),
  
  HOTELGUESTS("hotelGuests"),
  
  LONGTERMPARKERS("longTermParkers"),
  
  MEMBERS("members"),
  
  MEN("men"),
  
  OTHER("other"),
  
  OVERNIGHTPARKERS("overnightParkers"),
  
  PARKANDCYCLEUSER("parkAndCycleUser"),
  
  PARKANDRIDEUSERS("parkAndRideUsers"),
  
  PARKANDWALKUSER("parkAndWalkUser"),
  
  PENSIONERS("pensioners"),
  
  PREGNANTWOMEN("pregnantWomen"),
  
  REGISTEREDDISABLEDUSERS("registeredDisabledUsers"),
  
  RESERVATIONHOLDERS("reservationHolders"),
  
  RESIDENTS("residents"),
  
  SEASONTICKETHOLDERS("seasonTicketHolders"),
  
  SHOPPERS("shoppers"),
  
  SHORTTERMPARKERS("shortTermParkers"),
  
  SPORTEVENTAWAYSUPPORTERS("sportEventAwaySupporters"),
  
  SPORTEVENTHOMESUPPORTERS("sportEventHomeSupporters"),
  
  STAFF("staff"),
  
  STUDENTS("students"),
  
  SUBSCRIBERS("subscribers"),
  
  UNKNOWN("unknown"),
  
  VISITORS("visitors"),
  
  VISUALLYIMPAIRED("visuallyImpaired"),
  
  WHEELCHAIRUSERS("wheelchairUsers"),
  
  WOMEN("women");

  private String value;

  UserTypeEnum(String value) {
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
  public static UserTypeEnum fromValue(String value) {
    for (UserTypeEnum b : UserTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


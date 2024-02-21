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
 * Special forms of accessibility, easements and marking for disabled people. * `barrierFreeAccessible`: Accessible without any steps or other barriers. Does not ensure the same access as `disabledAccessible`. * `disabledAccessible`: Accessible for disabled people. `wheelChairAccessible` is a special form of it. * `disabledEasements`: There are special easements for disabled people, like handrails or disabled-friendly furniture. * `disabledMarkedThere`: is a visible mark to support access by disabled people (e.g. a wheelchair symbol). * `none`: No form of special accessibility, i.e. usually not convenient for disabled people, e.g. because of steps or barriers. * `orientationSystemForBlindPeople`: There is some orientation system, which helps blind or visually impaired people. Examples might be some acoustic system or tactile paving. * `other`: Other. * `unknown`: It is unknown, whether there is a special form of accessibility. * `wheelChairAccessible`: Accessible by people in a wheelchair.
 */


public enum AccessibilityEnum {
  
  BARRIERFREEACCESSIBLE("barrierFreeAccessible"),
  
  DISABLEDACCESSIBLE("disabledAccessible"),
  
  DISABLEDEASEMENTS("disabledEasements"),
  
  DISABLEDMARKEDTHERE("disabledMarkedThere"),
  
  NONE("none"),
  
  ORIENTATIONSYSTEMFORBLINDPEOPLE("orientationSystemForBlindPeople"),
  
  OTHER("other"),
  
  UNKNOWN("unknown"),
  
  WHEELCHAIRACCESSIBLE("wheelChairAccessible");

  private String value;

  AccessibilityEnum(String value) {
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
  public static AccessibilityEnum fromValue(String value) {
    for (AccessibilityEnum b : AccessibilityEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


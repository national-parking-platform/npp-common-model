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
 * * `disabled`: class of user identified as disabled or handicapped travellers. Local definitions may apply * `employees`: class of user identified as employees associated with the Place. Local definitions may apply * `seniors`: class of user identified as senior citizens. Local definitions may apply * `students`: class of user identified as registered students. Local definitions may apply * `tourists`: class of user identified as tourists (non-local users) associated with the Place. Local definitions may apply
 */


public enum UserGroupEnum {
  
  DISABLED("disabled"),
  
  EMPLOYEES("employees"),
  
  SENIORS("seniors"),
  
  STUDENTS("students"),
  
  TOURISTS("tourists");

  private String value;

  UserGroupEnum(String value) {
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
  public static UserGroupEnum fromValue(String value) {
    for (UserGroupEnum b : UserGroupEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


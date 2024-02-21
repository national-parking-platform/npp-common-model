package org.npp.model.common;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

/**
 * Class providing structure to support a specific entry within a user-defined code list.
 */

@Schema(name = "UserDefinedCodeListEntry", description = "Class providing structure to support a specific entry within a user-defined code list.")

public class UserDefinedCodeListEntry {

  private String definedValue;

  private String entryDescription;

  private Integer entryIndex;

  public UserDefinedCodeListEntry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserDefinedCodeListEntry(String definedValue, Integer entryIndex) {
    this.definedValue = definedValue;
    this.entryIndex = entryIndex;
  }

  public UserDefinedCodeListEntry definedValue(String definedValue) {
    this.definedValue = definedValue;
    return this;
  }

  /**
   * Free-text defined text (name) for the code list entry being referenced.
   * @return definedValue
  */
  @NotNull 
  @Schema(name = "definedValue", description = "Free-text defined text (name) for the code list entry being referenced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("definedValue")
  public String getDefinedValue() {
    return definedValue;
  }

  public void setDefinedValue(String definedValue) {
    this.definedValue = definedValue;
  }

  public UserDefinedCodeListEntry entryDescription(String entryDescription) {
    this.entryDescription = entryDescription;
    return this;
  }

  /**
   * Free-text description (explanation) for the code list entry being referenced.
   * @return entryDescription
  */
  
  @Schema(name = "entryDescription", description = "Free-text description (explanation) for the code list entry being referenced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryDescription")
  public String getEntryDescription() {
    return entryDescription;
  }

  public void setEntryDescription(String entryDescription) {
    this.entryDescription = entryDescription;
  }

  public UserDefinedCodeListEntry entryIndex(Integer entryIndex) {
    this.entryIndex = entryIndex;
    return this;
  }

  /**
   * Index number (integer) for the code list entry being referenced.
   * @return entryIndex
  */
  @NotNull 
  @Schema(name = "entryIndex", description = "Index number (integer) for the code list entry being referenced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entryIndex")
  public Integer getEntryIndex() {
    return entryIndex;
  }

  public void setEntryIndex(Integer entryIndex) {
    this.entryIndex = entryIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDefinedCodeListEntry userDefinedCodeListEntry = (UserDefinedCodeListEntry) o;
    return Objects.equals(this.definedValue, userDefinedCodeListEntry.definedValue) &&
        Objects.equals(this.entryDescription, userDefinedCodeListEntry.entryDescription) &&
        Objects.equals(this.entryIndex, userDefinedCodeListEntry.entryIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definedValue, entryDescription, entryIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDefinedCodeListEntry {\n");
    sb.append("    definedValue: ").append(toIndentedString(definedValue)).append("\n");
    sb.append("    entryDescription: ").append(toIndentedString(entryDescription)).append("\n");
    sb.append("    entryIndex: ").append(toIndentedString(entryIndex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.UserDefinedCodeListEntry;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class providing structure to support a user-defined code list.
 */

@Schema(name = "UserDefinedCodeList", description = "Class providing structure to support a user-defined code list.")

public class UserDefinedCodeList {

  private VersionedReference creator;

  private Boolean includeNilReasonType;

  private String locator;

  @Valid
  private List<@Valid UserDefinedCodeListEntry> userDefinedCodeListEntries = new ArrayList<>();

  public UserDefinedCodeList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserDefinedCodeList(VersionedReference creator, Boolean includeNilReasonType, String locator, List<@Valid UserDefinedCodeListEntry> userDefinedCodeListEntries) {
    this.creator = creator;
    this.includeNilReasonType = includeNilReasonType;
    this.locator = locator;
    this.userDefinedCodeListEntries = userDefinedCodeListEntries;
  }

  public UserDefinedCodeList creator(VersionedReference creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  @NotNull @Valid 
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creator")
  public VersionedReference getCreator() {
    return creator;
  }

  public void setCreator(VersionedReference creator) {
    this.creator = creator;
  }

  public UserDefinedCodeList includeNilReasonType(Boolean includeNilReasonType) {
    this.includeNilReasonType = includeNilReasonType;
    return this;
  }

  /**
   * True indicates the NilReasonType list shall be included in this user defined code list.
   * @return includeNilReasonType
  */
  @NotNull 
  @Schema(name = "includeNilReasonType", description = "True indicates the NilReasonType list shall be included in this user defined code list.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("includeNilReasonType")
  public Boolean getIncludeNilReasonType() {
    return includeNilReasonType;
  }

  public void setIncludeNilReasonType(Boolean includeNilReasonType) {
    this.includeNilReasonType = includeNilReasonType;
  }

  public UserDefinedCodeList locator(String locator) {
    this.locator = locator;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return locator
  */
  @NotNull 
  @Schema(name = "locator", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locator")
  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public UserDefinedCodeList userDefinedCodeListEntries(List<@Valid UserDefinedCodeListEntry> userDefinedCodeListEntries) {
    this.userDefinedCodeListEntries = userDefinedCodeListEntries;
    return this;
  }

  public UserDefinedCodeList addUserDefinedCodeListEntriesItem(UserDefinedCodeListEntry userDefinedCodeListEntriesItem) {
    if (this.userDefinedCodeListEntries == null) {
      this.userDefinedCodeListEntries = new ArrayList<>();
    }
    this.userDefinedCodeListEntries.add(userDefinedCodeListEntriesItem);
    return this;
  }

  /**
   * User defined code list entries.
   * @return userDefinedCodeListEntries
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "userDefinedCodeListEntries", description = "User defined code list entries.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userDefinedCodeListEntries")
  public List<@Valid UserDefinedCodeListEntry> getUserDefinedCodeListEntries() {
    return userDefinedCodeListEntries;
  }

  public void setUserDefinedCodeListEntries(List<@Valid UserDefinedCodeListEntry> userDefinedCodeListEntries) {
    this.userDefinedCodeListEntries = userDefinedCodeListEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDefinedCodeList userDefinedCodeList = (UserDefinedCodeList) o;
    return Objects.equals(this.creator, userDefinedCodeList.creator) &&
        Objects.equals(this.includeNilReasonType, userDefinedCodeList.includeNilReasonType) &&
        Objects.equals(this.locator, userDefinedCodeList.locator) &&
        Objects.equals(this.userDefinedCodeListEntries, userDefinedCodeList.userDefinedCodeListEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, includeNilReasonType, locator, userDefinedCodeListEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDefinedCodeList {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    includeNilReasonType: ").append(toIndentedString(includeNilReasonType)).append("\n");
    sb.append("    locator: ").append(toIndentedString(locator)).append("\n");
    sb.append("    userDefinedCodeListEntries: ").append(toIndentedString(userDefinedCodeListEntries)).append("\n");
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


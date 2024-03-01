package org.npp.model.eligibility;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.ReferencedCodeListEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class providing references to a specific user group with reference to enumerations available in the UserGroupEnum enumerated list.
 */

@Schema(name = "UserGroup", description = "Class providing references to a specific user group with reference to enumerations available in the UserGroupEnum enumerated list.")

public class UserGroup {

  private ReferencedCodeListEntry userType;

  public UserGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserGroup(ReferencedCodeListEntry userType) {
    this.userType = userType;
  }

  public UserGroup userType(ReferencedCodeListEntry userType) {
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
  */
  @NotNull @Valid 
  @Schema(name = "userType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userType")
  public ReferencedCodeListEntry getUserType() {
    return userType;
  }

  public void setUserType(ReferencedCodeListEntry userType) {
    this.userType = userType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroup userGroup = (UserGroup) o;
    return Objects.equals(this.userType, userGroup.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroup {\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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


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
 * Class supporting the definition of user group characteristics
 */

@Schema(name = "UserQualification", description = "Class supporting the definition of user group characteristics")

public class UserQualification {

  private ReferencedCodeListEntry userGroup;

  public UserQualification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserQualification(ReferencedCodeListEntry userGroup) {
    this.userGroup = userGroup;
  }

  public UserQualification userGroup(ReferencedCodeListEntry userGroup) {
    this.userGroup = userGroup;
    return this;
  }

  /**
   * Get userGroup
   * @return userGroup
  */
  @NotNull @Valid 
  @Schema(name = "userGroup", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userGroup")
  public ReferencedCodeListEntry getUserGroup() {
    return userGroup;
  }

  public void setUserGroup(ReferencedCodeListEntry userGroup) {
    this.userGroup = userGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQualification userQualification = (UserQualification) o;
    return Objects.equals(this.userGroup, userQualification.userGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQualification {\n");
    sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
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


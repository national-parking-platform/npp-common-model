package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.contact.ContactPoint;
import org.npp.model.place.contact.enums.ContactTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * The assignment of one or more roles to an ORGANISATION regarding the responsibility it will have  regarding the identified Place (e.g. owner, operators, etc.)&#39;
 */

@Schema(name = "ResponsibilityRoleAssignment", description = "The assignment of one or more roles to an ORGANISATION regarding the responsibility it will have  regarding the identified Place (e.g. owner, operators, etc.)'")

public class ResponsibilityRoleAssignment {

  private ContactTypeEnum type;

  @Valid
  private List<@Valid ContactPoint> contactPoints;

  public ResponsibilityRoleAssignment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponsibilityRoleAssignment(ContactTypeEnum type) {
    this.type = type;
  }

  public ResponsibilityRoleAssignment type(ContactTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public ContactTypeEnum getType() {
    return type;
  }

  public void setType(ContactTypeEnum type) {
    this.type = type;
  }

  public ResponsibilityRoleAssignment contactPoints(List<@Valid ContactPoint> contactPoints) {
    this.contactPoints = contactPoints;
    return this;
  }

  public ResponsibilityRoleAssignment addContactPointsItem(ContactPoint contactPointsItem) {
    if (this.contactPoints == null) {
      this.contactPoints = new ArrayList<>();
    }
    this.contactPoints.add(contactPointsItem);
    return this;
  }

  /**
   * Get contactPoints
   * @return contactPoints
  */
  @Valid 
  @Schema(name = "contactPoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPoints")
  public List<@Valid ContactPoint> getContactPoints() {
    return contactPoints;
  }

  public void setContactPoints(List<@Valid ContactPoint> contactPoints) {
    this.contactPoints = contactPoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsibilityRoleAssignment responsibilityRoleAssignment = (ResponsibilityRoleAssignment) o;
    return Objects.equals(this.type, responsibilityRoleAssignment.type) &&
        Objects.equals(this.contactPoints, responsibilityRoleAssignment.contactPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contactPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsibilityRoleAssignment {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contactPoints: ").append(toIndentedString(contactPoints)).append("\n");
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


package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.place.contact.Contact;
import org.npp.model.time.OverallPeriod;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Contact information that is addressed via a reference.
 */

@Schema(name = "ContactByReference", description = "Contact information that is addressed via a reference.")


public class ContactByReference extends Contact {

  private VersionedReference contactReference;

  public ContactByReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContactByReference(VersionedReference contactReference) {
    super();
    this.contactReference = contactReference;
  }

  public ContactByReference contactReference(VersionedReference contactReference) {
    this.contactReference = contactReference;
    return this;
  }

  /**
   * Get contactReference
   * @return contactReference
  */
  @NotNull @Valid 
  @Schema(name = "contactReference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contactReference")
  public VersionedReference getContactReference() {
    return contactReference;
  }

  public void setContactReference(VersionedReference contactReference) {
    this.contactReference = contactReference;
  }


  public ContactByReference contactType(ContactTypeEnum contactType) {
    super.contactType(contactType);
    return this;
  }

  public ContactByReference contactNotDefined(Boolean contactNotDefined) {
    super.contactNotDefined(contactNotDefined);
    return this;
  }

  public ContactByReference contactUnknown(Boolean contactUnknown) {
    super.contactUnknown(contactUnknown);
    return this;
  }

  public ContactByReference shareWithPublic(Boolean shareWithPublic) {
    super.shareWithPublic(shareWithPublic);
    return this;
  }

  public ContactByReference validityOfContact(OverallPeriod validityOfContact) {
    super.validityOfContact(validityOfContact);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactByReference contactByReference = (ContactByReference) o;
    return Objects.equals(this.contactReference, contactByReference.contactReference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactReference, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactByReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contactReference: ").append(toIndentedString(contactReference)).append("\n");
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


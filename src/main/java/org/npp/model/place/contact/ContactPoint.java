package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.characteristics.Address;
import org.npp.model.place.contact.Contact;
import org.npp.model.place.contact.ContactDetails;
import org.npp.model.place.contact.enums.ContactTypeEnum;
import org.npp.model.place.contact.EMailCommonData;
import org.npp.model.time.OverallPeriod;
import org.npp.model.place.location.PointLocation;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.place.contact.TelephoneContact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Defines contact details for specified role.  Organisation name attribute should not be used in combination with role &#x60;parkingSiteAddress&#x60;.
 */

@Schema(name = "ContactPoint", description = "Defines contact details for specified role.  Organisation name attribute should not be used in combination with role `parkingSiteAddress`.")


public class ContactPoint extends Contact {

  private String id;

  private Integer version;

  @Valid
  private List<@Valid SpecificLanguageString> organisationName;

  private ContactTypeEnum type;

  @Valid
  private List<@Valid Address> address;

  @Valid
  private List<@Valid ContactDetails> contactDetails;

  @Valid
  private List<@Valid EMailCommonData> eMailCommonData;

  @Valid
  private List<@Valid TelephoneContact> telephoneContacts;

  @Valid
  private List<@Valid PointLocation> pointLocations;

  public ContactPoint() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContactPoint(String id, Integer version, ContactTypeEnum type) {
    super();
    this.id = id;
    this.version = version;
    this.type = type;
  }

  public ContactPoint id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for object.
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Unique identifier for object.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContactPoint version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Positive integer representing the object version.
   * minimum: 1
   * @return version
  */
  @NotNull @Min(1) 
  @Schema(name = "version", description = "Positive integer representing the object version.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public ContactPoint organisationName(List<@Valid SpecificLanguageString> organisationName) {
    this.organisationName = organisationName;
    return this;
  }

  public ContactPoint addOrganisationNameItem(SpecificLanguageString organisationNameItem) {
    if (this.organisationName == null) {
      this.organisationName = new ArrayList<>();
    }
    this.organisationName.add(organisationNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return organisationName
  */
  @Valid 
  @Schema(name = "organisationName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organisationName")
  public List<@Valid SpecificLanguageString> getOrganisationName() {
    return organisationName;
  }

  public void setOrganisationName(List<@Valid SpecificLanguageString> organisationName) {
    this.organisationName = organisationName;
  }

  public ContactPoint type(ContactTypeEnum type) {
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

  public ContactPoint address(List<@Valid Address> address) {
    this.address = address;
    return this;
  }

  public ContactPoint addAddressItem(Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Addresses.
   * @return address
  */
  @Valid 
  @Schema(name = "address", description = "Addresses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public List<@Valid Address> getAddress() {
    return address;
  }

  public void setAddress(List<@Valid Address> address) {
    this.address = address;
  }

  public ContactPoint contactDetails(List<@Valid ContactDetails> contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

  public ContactPoint addContactDetailsItem(ContactDetails contactDetailsItem) {
    if (this.contactDetails == null) {
      this.contactDetails = new ArrayList<>();
    }
    this.contactDetails.add(contactDetailsItem);
    return this;
  }

  /**
   * Contact details.
   * @return contactDetails
  */
  @Valid 
  @Schema(name = "contactDetails", description = "Contact details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetails")
  public List<@Valid ContactDetails> getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(List<@Valid ContactDetails> contactDetails) {
    this.contactDetails = contactDetails;
  }

  public ContactPoint eMailCommonData(List<@Valid EMailCommonData> eMailCommonData) {
    this.eMailCommonData = eMailCommonData;
    return this;
  }

  public ContactPoint addEMailCommonDataItem(EMailCommonData eMailCommonDataItem) {
    if (this.eMailCommonData == null) {
      this.eMailCommonData = new ArrayList<>();
    }
    this.eMailCommonData.add(eMailCommonDataItem);
    return this;
  }

  /**
   * Email common data.
   * @return eMailCommonData
  */
  @Valid 
  @Schema(name = "eMailCommonData", description = "Email common data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eMailCommonData")
  public List<@Valid EMailCommonData> geteMailCommonData() {
    return eMailCommonData;
  }

  public void seteMailCommonData(List<@Valid EMailCommonData> eMailCommonData) {
    this.eMailCommonData = eMailCommonData;
  }

  public ContactPoint telephoneContacts(List<@Valid TelephoneContact> telephoneContacts) {
    this.telephoneContacts = telephoneContacts;
    return this;
  }

  public ContactPoint addTelephoneContactsItem(TelephoneContact telephoneContactsItem) {
    if (this.telephoneContacts == null) {
      this.telephoneContacts = new ArrayList<>();
    }
    this.telephoneContacts.add(telephoneContactsItem);
    return this;
  }

  /**
   * Telephone contact.
   * @return telephoneContacts
  */
  @Valid 
  @Schema(name = "telephoneContacts", description = "Telephone contact.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("telephoneContacts")
  public List<@Valid TelephoneContact> getTelephoneContacts() {
    return telephoneContacts;
  }

  public void setTelephoneContacts(List<@Valid TelephoneContact> telephoneContacts) {
    this.telephoneContacts = telephoneContacts;
  }

  public ContactPoint pointLocations(List<@Valid PointLocation> pointLocations) {
    this.pointLocations = pointLocations;
    return this;
  }

  public ContactPoint addPointLocationsItem(PointLocation pointLocationsItem) {
    if (this.pointLocations == null) {
      this.pointLocations = new ArrayList<>();
    }
    this.pointLocations.add(pointLocationsItem);
    return this;
  }

  /**
   * Contact point location.
   * @return pointLocations
  */
  @Valid 
  @Schema(name = "pointLocations", description = "Contact point location.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointLocations")
  public List<@Valid PointLocation> getPointLocations() {
    return pointLocations;
  }

  public void setPointLocations(List<@Valid PointLocation> pointLocations) {
    this.pointLocations = pointLocations;
  }


  public ContactPoint contactType(ContactTypeEnum contactType) {
    super.contactType(contactType);
    return this;
  }

  public ContactPoint contactNotDefined(Boolean contactNotDefined) {
    super.contactNotDefined(contactNotDefined);
    return this;
  }

  public ContactPoint contactUnknown(Boolean contactUnknown) {
    super.contactUnknown(contactUnknown);
    return this;
  }

  public ContactPoint shareWithPublic(Boolean shareWithPublic) {
    super.shareWithPublic(shareWithPublic);
    return this;
  }

  public ContactPoint validityOfContact(OverallPeriod validityOfContact) {
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
    ContactPoint contactPoint = (ContactPoint) o;
    return Objects.equals(this.id, contactPoint.id) &&
        Objects.equals(this.version, contactPoint.version) &&
        Objects.equals(this.organisationName, contactPoint.organisationName) &&
        Objects.equals(this.type, contactPoint.type) &&
        Objects.equals(this.address, contactPoint.address) &&
        Objects.equals(this.contactDetails, contactPoint.contactDetails) &&
        Objects.equals(this.eMailCommonData, contactPoint.eMailCommonData) &&
        Objects.equals(this.telephoneContacts, contactPoint.telephoneContacts) &&
        Objects.equals(this.pointLocations, contactPoint.pointLocations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, organisationName, type, address, contactDetails, eMailCommonData, telephoneContacts, pointLocations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    eMailCommonData: ").append(toIndentedString(eMailCommonData)).append("\n");
    sb.append("    telephoneContacts: ").append(toIndentedString(telephoneContacts)).append("\n");
    sb.append("    pointLocations: ").append(toIndentedString(pointLocations)).append("\n");
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


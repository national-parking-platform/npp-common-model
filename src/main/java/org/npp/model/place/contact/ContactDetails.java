package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details for some person, service or the parking site itself, especially address information.
 */

@Schema(name = "ContactDetails", description = "Details for some person, service or the parking site itself, especially address information.")

public class ContactDetails {

  private Boolean available24hours;

  private String contactDetailsFax;

  @Valid
  private List<@Valid String> contactDetailsLanguage;

  private String contactDetailsLogoUrl;

  @Valid
  private List<@Valid SpecificLanguageString> contactDetailsMoreInfo;

  @Valid
  private List<@Valid SpecificLanguageString> contactDetailsResponsibility;

  private String contactPersonFirstName;

  private String contactPersonName;

  @Valid
  private List<@Valid SpecificLanguageString> contactPersonPosition;

  private Boolean publishingAgreement;

  private String urlLinkAddress;

  public ContactDetails available24hours(Boolean available24hours) {
    this.available24hours = available24hours;
    return this;
  }

  /**
   * Specifies if the availability is 24 hours a day. If [TRUE] available 24 hours.  If omitted, this information is unknown or heterogeneous.
   * @return available24hours
  */
  
  @Schema(name = "available24hours", description = "Specifies if the availability is 24 hours a day. If [TRUE] available 24 hours.  If omitted, this information is unknown or heterogeneous.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("available24hours")
  public Boolean getAvailable24hours() {
    return available24hours;
  }

  public void setAvailable24hours(Boolean available24hours) {
    this.available24hours = available24hours;
  }

  public ContactDetails contactDetailsFax(String contactDetailsFax) {
    this.contactDetailsFax = contactDetailsFax;
    return this;
  }

  /**
   * Fax of the contact.
   * @return contactDetailsFax
  */
  
  @Schema(name = "contactDetailsFax", description = "Fax of the contact.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetailsFax")
  public String getContactDetailsFax() {
    return contactDetailsFax;
  }

  public void setContactDetailsFax(String contactDetailsFax) {
    this.contactDetailsFax = contactDetailsFax;
  }

  public ContactDetails contactDetailsLanguage(List<@Valid String> contactDetailsLanguage) {
    this.contactDetailsLanguage = contactDetailsLanguage;
    return this;
  }

  public ContactDetails addContactDetailsLanguageItem(String contactDetailsLanguageItem) {
    if (this.contactDetailsLanguage == null) {
      this.contactDetailsLanguage = new ArrayList<>();
    }
    this.contactDetailsLanguage.add(contactDetailsLanguageItem);
    return this;
  }

  /**
   * Language(s) this contact is able to speak resp. understand.
   * @return contactDetailsLanguage
  */
  
  @Schema(name = "contactDetailsLanguage", description = "Language(s) this contact is able to speak resp. understand.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetailsLanguage")
  public List<@Valid String> getContactDetailsLanguage() {
    return contactDetailsLanguage;
  }

  public void setContactDetailsLanguage(List<@Valid String> contactDetailsLanguage) {
    this.contactDetailsLanguage = contactDetailsLanguage;
  }

  public ContactDetails contactDetailsLogoUrl(String contactDetailsLogoUrl) {
    this.contactDetailsLogoUrl = contactDetailsLogoUrl;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return contactDetailsLogoUrl
  */
  
  @Schema(name = "contactDetailsLogoUrl", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetailsLogoUrl")
  public String getContactDetailsLogoUrl() {
    return contactDetailsLogoUrl;
  }

  public void setContactDetailsLogoUrl(String contactDetailsLogoUrl) {
    this.contactDetailsLogoUrl = contactDetailsLogoUrl;
  }

  public ContactDetails contactDetailsMoreInfo(List<@Valid SpecificLanguageString> contactDetailsMoreInfo) {
    this.contactDetailsMoreInfo = contactDetailsMoreInfo;
    return this;
  }

  public ContactDetails addContactDetailsMoreInfoItem(SpecificLanguageString contactDetailsMoreInfoItem) {
    if (this.contactDetailsMoreInfo == null) {
      this.contactDetailsMoreInfo = new ArrayList<>();
    }
    this.contactDetailsMoreInfo.add(contactDetailsMoreInfoItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return contactDetailsMoreInfo
  */
  @Valid 
  @Schema(name = "contactDetailsMoreInfo", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetailsMoreInfo")
  public List<@Valid SpecificLanguageString> getContactDetailsMoreInfo() {
    return contactDetailsMoreInfo;
  }

  public void setContactDetailsMoreInfo(List<@Valid SpecificLanguageString> contactDetailsMoreInfo) {
    this.contactDetailsMoreInfo = contactDetailsMoreInfo;
  }

  public ContactDetails contactDetailsResponsibility(List<@Valid SpecificLanguageString> contactDetailsResponsibility) {
    this.contactDetailsResponsibility = contactDetailsResponsibility;
    return this;
  }

  public ContactDetails addContactDetailsResponsibilityItem(SpecificLanguageString contactDetailsResponsibilityItem) {
    if (this.contactDetailsResponsibility == null) {
      this.contactDetailsResponsibility = new ArrayList<>();
    }
    this.contactDetailsResponsibility.add(contactDetailsResponsibilityItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return contactDetailsResponsibility
  */
  @Valid 
  @Schema(name = "contactDetailsResponsibility", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetailsResponsibility")
  public List<@Valid SpecificLanguageString> getContactDetailsResponsibility() {
    return contactDetailsResponsibility;
  }

  public void setContactDetailsResponsibility(List<@Valid SpecificLanguageString> contactDetailsResponsibility) {
    this.contactDetailsResponsibility = contactDetailsResponsibility;
  }

  public ContactDetails contactPersonFirstName(String contactPersonFirstName) {
    this.contactPersonFirstName = contactPersonFirstName;
    return this;
  }

  /**
   * First name of the contact person.
   * @return contactPersonFirstName
  */
  
  @Schema(name = "contactPersonFirstName", description = "First name of the contact person.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPersonFirstName")
  public String getContactPersonFirstName() {
    return contactPersonFirstName;
  }

  public void setContactPersonFirstName(String contactPersonFirstName) {
    this.contactPersonFirstName = contactPersonFirstName;
  }

  public ContactDetails contactPersonName(String contactPersonName) {
    this.contactPersonName = contactPersonName;
    return this;
  }

  /**
   * Name of the contact person.
   * @return contactPersonName
  */
  
  @Schema(name = "contactPersonName", description = "Name of the contact person.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPersonName")
  public String getContactPersonName() {
    return contactPersonName;
  }

  public void setContactPersonName(String contactPersonName) {
    this.contactPersonName = contactPersonName;
  }

  public ContactDetails contactPersonPosition(List<@Valid SpecificLanguageString> contactPersonPosition) {
    this.contactPersonPosition = contactPersonPosition;
    return this;
  }

  public ContactDetails addContactPersonPositionItem(SpecificLanguageString contactPersonPositionItem) {
    if (this.contactPersonPosition == null) {
      this.contactPersonPosition = new ArrayList<>();
    }
    this.contactPersonPosition.add(contactPersonPositionItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return contactPersonPosition
  */
  @Valid 
  @Schema(name = "contactPersonPosition", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPersonPosition")
  public List<@Valid SpecificLanguageString> getContactPersonPosition() {
    return contactPersonPosition;
  }

  public void setContactPersonPosition(List<@Valid SpecificLanguageString> contactPersonPosition) {
    this.contactPersonPosition = contactPersonPosition;
  }

  public ContactDetails publishingAgreement(Boolean publishingAgreement) {
    this.publishingAgreement = publishingAgreement;
    return this;
  }

  /**
   * Indication, whether the contact accepted publishing its contact information [TRUE] = accepted.
   * @return publishingAgreement
  */
  
  @Schema(name = "publishingAgreement", description = "Indication, whether the contact accepted publishing its contact information [TRUE] = accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishingAgreement")
  public Boolean getPublishingAgreement() {
    return publishingAgreement;
  }

  public void setPublishingAgreement(Boolean publishingAgreement) {
    this.publishingAgreement = publishingAgreement;
  }

  public ContactDetails urlLinkAddress(String urlLinkAddress) {
    this.urlLinkAddress = urlLinkAddress;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return urlLinkAddress
  */
  
  @Schema(name = "urlLinkAddress", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urlLinkAddress")
  public String getUrlLinkAddress() {
    return urlLinkAddress;
  }

  public void setUrlLinkAddress(String urlLinkAddress) {
    this.urlLinkAddress = urlLinkAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.available24hours, contactDetails.available24hours) &&
        Objects.equals(this.contactDetailsFax, contactDetails.contactDetailsFax) &&
        Objects.equals(this.contactDetailsLanguage, contactDetails.contactDetailsLanguage) &&
        Objects.equals(this.contactDetailsLogoUrl, contactDetails.contactDetailsLogoUrl) &&
        Objects.equals(this.contactDetailsMoreInfo, contactDetails.contactDetailsMoreInfo) &&
        Objects.equals(this.contactDetailsResponsibility, contactDetails.contactDetailsResponsibility) &&
        Objects.equals(this.contactPersonFirstName, contactDetails.contactPersonFirstName) &&
        Objects.equals(this.contactPersonName, contactDetails.contactPersonName) &&
        Objects.equals(this.contactPersonPosition, contactDetails.contactPersonPosition) &&
        Objects.equals(this.publishingAgreement, contactDetails.publishingAgreement) &&
        Objects.equals(this.urlLinkAddress, contactDetails.urlLinkAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available24hours, contactDetailsFax, contactDetailsLanguage, contactDetailsLogoUrl, contactDetailsMoreInfo, contactDetailsResponsibility, contactPersonFirstName, contactPersonName, contactPersonPosition, publishingAgreement, urlLinkAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    sb.append("    available24hours: ").append(toIndentedString(available24hours)).append("\n");
    sb.append("    contactDetailsFax: ").append(toIndentedString(contactDetailsFax)).append("\n");
    sb.append("    contactDetailsLanguage: ").append(toIndentedString(contactDetailsLanguage)).append("\n");
    sb.append("    contactDetailsLogoUrl: ").append(toIndentedString(contactDetailsLogoUrl)).append("\n");
    sb.append("    contactDetailsMoreInfo: ").append(toIndentedString(contactDetailsMoreInfo)).append("\n");
    sb.append("    contactDetailsResponsibility: ").append(toIndentedString(contactDetailsResponsibility)).append("\n");
    sb.append("    contactPersonFirstName: ").append(toIndentedString(contactPersonFirstName)).append("\n");
    sb.append("    contactPersonName: ").append(toIndentedString(contactPersonName)).append("\n");
    sb.append("    contactPersonPosition: ").append(toIndentedString(contactPersonPosition)).append("\n");
    sb.append("    publishingAgreement: ").append(toIndentedString(publishingAgreement)).append("\n");
    sb.append("    urlLinkAddress: ").append(toIndentedString(urlLinkAddress)).append("\n");
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


package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.characteristics.Characteristics;
import org.npp.model.place.contact.Contact;
import org.npp.model.place.characteristics.Marketing;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.payment.PaymentMethod;
import org.npp.model.place.characteristics.RGBColour;
import org.npp.model.common.SafetyStandardClassification;
import org.npp.model.time.Times;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information concerning multiple features relating to parking hierarchy elements.
 */

@Schema(name = "CommonComponents", description = "A class defining information concerning multiple features relating to parking hierarchy elements.")

public class CommonComponents {

  @Valid
  private List<@Valid Characteristics> characteristics;

  @Valid
  private List<@Valid Contact> contacts;

  private Marketing marketing;

  @Valid
  private List<@Valid OperatingRestrictions> operatingRestrictions;

  @Valid
  private List<@Valid RGBColour> rgbColours;

  private Times times;

  @Valid
  private List<@Valid PaymentMethod> paymentMethods;

  @Valid
  private List<@Valid SafetyStandardClassification> safetyStandardClassifications;

  public CommonComponents characteristics(List<@Valid Characteristics> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public CommonComponents addCharacteristicsItem(Characteristics characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

  /**
   * Characteristics for hierarchy element.
   * @return characteristics
  */
  @Valid 
  @Schema(name = "characteristics", description = "Characteristics for hierarchy element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristics")
  public List<@Valid Characteristics> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<@Valid Characteristics> characteristics) {
    this.characteristics = characteristics;
  }

  public CommonComponents contacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public CommonComponents addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Contact info for hierarchy element.
   * @return contacts
  */
  @Valid 
  @Schema(name = "contacts", description = "Contact info for hierarchy element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contacts")
  public List<@Valid Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
  }

  public CommonComponents marketing(Marketing marketing) {
    this.marketing = marketing;
    return this;
  }

  /**
   * Get marketing
   * @return marketing
  */
  @Valid 
  @Schema(name = "marketing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketing")
  public Marketing getMarketing() {
    return marketing;
  }

  public void setMarketing(Marketing marketing) {
    this.marketing = marketing;
  }

  public CommonComponents operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    this.operatingRestrictions = operatingRestrictions;
    return this;
  }

  public CommonComponents addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    if (this.operatingRestrictions == null) {
      this.operatingRestrictions = new ArrayList<>();
    }
    this.operatingRestrictions.add(operatingRestrictionsItem);
    return this;
  }

  /**
   * Operating restrictions for hierarchy element.
   * @return operatingRestrictions
  */
  @Valid 
  @Schema(name = "operatingRestrictions", description = "Operating restrictions for hierarchy element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingRestrictions")
  public List<@Valid OperatingRestrictions> getOperatingRestrictions() {
    return operatingRestrictions;
  }

  public void setOperatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    this.operatingRestrictions = operatingRestrictions;
  }

  public CommonComponents rgbColours(List<@Valid RGBColour> rgbColours) {
    this.rgbColours = rgbColours;
    return this;
  }

  public CommonComponents addRgbColoursItem(RGBColour rgbColoursItem) {
    if (this.rgbColours == null) {
      this.rgbColours = new ArrayList<>();
    }
    this.rgbColours.add(rgbColoursItem);
    return this;
  }

  /**
   * Colours associated with hierarchy element.
   * @return rgbColours
  */
  @Valid 
  @Schema(name = "rgbColours", description = "Colours associated with hierarchy element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rgbColours")
  public List<@Valid RGBColour> getRgbColours() {
    return rgbColours;
  }

  public void setRgbColours(List<@Valid RGBColour> rgbColours) {
    this.rgbColours = rgbColours;
  }

  public CommonComponents times(Times times) {
    this.times = times;
    return this;
  }

  /**
   * Get times
   * @return times
  */
  @Valid 
  @Schema(name = "times", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("times")
  public Times getTimes() {
    return times;
  }

  public void setTimes(Times times) {
    this.times = times;
  }

  public CommonComponents paymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public CommonComponents addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * Accepted payment methods at hierarchy element.
   * @return paymentMethods
  */
  @Valid 
  @Schema(name = "paymentMethods", description = "Accepted payment methods at hierarchy element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethods")
  public List<@Valid PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public CommonComponents safetyStandardClassifications(List<@Valid SafetyStandardClassification> safetyStandardClassifications) {
    this.safetyStandardClassifications = safetyStandardClassifications;
    return this;
  }

  public CommonComponents addSafetyStandardClassificationsItem(SafetyStandardClassification safetyStandardClassificationsItem) {
    if (this.safetyStandardClassifications == null) {
      this.safetyStandardClassifications = new ArrayList<>();
    }
    this.safetyStandardClassifications.add(safetyStandardClassificationsItem);
    return this;
  }

  /**
   * Safety standard classifications.
   * @return safetyStandardClassifications
  */
  @Valid 
  @Schema(name = "safetyStandardClassifications", description = "Safety standard classifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("safetyStandardClassifications")
  public List<@Valid SafetyStandardClassification> getSafetyStandardClassifications() {
    return safetyStandardClassifications;
  }

  public void setSafetyStandardClassifications(List<@Valid SafetyStandardClassification> safetyStandardClassifications) {
    this.safetyStandardClassifications = safetyStandardClassifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonComponents commonComponents = (CommonComponents) o;
    return Objects.equals(this.characteristics, commonComponents.characteristics) &&
        Objects.equals(this.contacts, commonComponents.contacts) &&
        Objects.equals(this.marketing, commonComponents.marketing) &&
        Objects.equals(this.operatingRestrictions, commonComponents.operatingRestrictions) &&
        Objects.equals(this.rgbColours, commonComponents.rgbColours) &&
        Objects.equals(this.times, commonComponents.times) &&
        Objects.equals(this.paymentMethods, commonComponents.paymentMethods) &&
        Objects.equals(this.safetyStandardClassifications, commonComponents.safetyStandardClassifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristics, contacts, marketing, operatingRestrictions, rgbColours, times, paymentMethods, safetyStandardClassifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonComponents {\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
    sb.append("    operatingRestrictions: ").append(toIndentedString(operatingRestrictions)).append("\n");
    sb.append("    rgbColours: ").append(toIndentedString(rgbColours)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    safetyStandardClassifications: ").append(toIndentedString(safetyStandardClassifications)).append("\n");
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


package org.npp.model.place;
  
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
import org.npp.model.place.location.AreaLocation;
import org.npp.model.place.characteristics.Characteristics;
import org.npp.model.place.contact.Contact;
import org.npp.model.place.enums.ElementDescriptorEnum;
import org.npp.model.place.HierarchyElement;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.place.characteristics.Marketing;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.payment.PaymentMethod;
import org.npp.model.place.location.PointLocation;
import org.npp.model.place.characteristics.RGBColour;
import org.npp.model.common.SafetyStandardClassification;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.time.Times;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A sub-division of a Place for the convenience of the operator that may be used for parking related or other purposes.  Examples of HierarchyElement include a floor or level, specific street or row of a car parking facility
 */

@Schema(name = "SubPlaceElement", description = "A sub-division of a Place for the convenience of the operator that may be used for parking related or other purposes.  Examples of HierarchyElement include a floor or level, specific street or row of a car parking facility")


public class SubPlaceElement extends HierarchyElement {

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

  private ElementDescriptorEnum elementDescriptor;

  @Valid
  private List<@Valid Address> elementStreetAddress;

  @Valid
  private List<@Valid AreaLocation> elementAreaLocation;

  @Valid
  private List<@Valid PointLocation> notionalElementLocation;

  public SubPlaceElement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubPlaceElement(String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord) {
    super(id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord);
  }

  public SubPlaceElement characteristics(List<@Valid Characteristics> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public SubPlaceElement addCharacteristicsItem(Characteristics characteristicsItem) {
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

  public SubPlaceElement contacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public SubPlaceElement addContactsItem(Contact contactsItem) {
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

  public SubPlaceElement marketing(Marketing marketing) {
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

  public SubPlaceElement operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    this.operatingRestrictions = operatingRestrictions;
    return this;
  }

  public SubPlaceElement addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
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

  public SubPlaceElement rgbColours(List<@Valid RGBColour> rgbColours) {
    this.rgbColours = rgbColours;
    return this;
  }

  public SubPlaceElement addRgbColoursItem(RGBColour rgbColoursItem) {
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

  public SubPlaceElement times(Times times) {
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

  public SubPlaceElement paymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public SubPlaceElement addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
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

  public SubPlaceElement safetyStandardClassifications(List<@Valid SafetyStandardClassification> safetyStandardClassifications) {
    this.safetyStandardClassifications = safetyStandardClassifications;
    return this;
  }

  public SubPlaceElement addSafetyStandardClassificationsItem(SafetyStandardClassification safetyStandardClassificationsItem) {
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

  public SubPlaceElement elementDescriptor(ElementDescriptorEnum elementDescriptor) {
    this.elementDescriptor = elementDescriptor;
    return this;
  }

  /**
   * Get elementDescriptor
   * @return elementDescriptor
  */
  @Valid 
  @Schema(name = "elementDescriptor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementDescriptor")
  public ElementDescriptorEnum getElementDescriptor() {
    return elementDescriptor;
  }

  public void setElementDescriptor(ElementDescriptorEnum elementDescriptor) {
    this.elementDescriptor = elementDescriptor;
  }

  public SubPlaceElement elementStreetAddress(List<@Valid Address> elementStreetAddress) {
    this.elementStreetAddress = elementStreetAddress;
    return this;
  }

  public SubPlaceElement addElementStreetAddressItem(Address elementStreetAddressItem) {
    if (this.elementStreetAddress == null) {
      this.elementStreetAddress = new ArrayList<>();
    }
    this.elementStreetAddress.add(elementStreetAddressItem);
    return this;
  }

  /**
   * Place street address
   * @return elementStreetAddress
  */
  @Valid 
  @Schema(name = "elementStreetAddress", description = "Place street address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementStreetAddress")
  public List<@Valid Address> getElementStreetAddress() {
    return elementStreetAddress;
  }

  public void setElementStreetAddress(List<@Valid Address> elementStreetAddress) {
    this.elementStreetAddress = elementStreetAddress;
  }

  public SubPlaceElement elementAreaLocation(List<@Valid AreaLocation> elementAreaLocation) {
    this.elementAreaLocation = elementAreaLocation;
    return this;
  }

  public SubPlaceElement addElementAreaLocationItem(AreaLocation elementAreaLocationItem) {
    if (this.elementAreaLocation == null) {
      this.elementAreaLocation = new ArrayList<>();
    }
    this.elementAreaLocation.add(elementAreaLocationItem);
    return this;
  }

  /**
   * Place bounded zone
   * @return elementAreaLocation
  */
  @Valid 
  @Schema(name = "elementAreaLocation", description = "Place bounded zone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementAreaLocation")
  public List<@Valid AreaLocation> getElementAreaLocation() {
    return elementAreaLocation;
  }

  public void setElementAreaLocation(List<@Valid AreaLocation> elementAreaLocation) {
    this.elementAreaLocation = elementAreaLocation;
  }

  public SubPlaceElement notionalElementLocation(List<@Valid PointLocation> notionalElementLocation) {
    this.notionalElementLocation = notionalElementLocation;
    return this;
  }

  public SubPlaceElement addNotionalElementLocationItem(PointLocation notionalElementLocationItem) {
    if (this.notionalElementLocation == null) {
      this.notionalElementLocation = new ArrayList<>();
    }
    this.notionalElementLocation.add(notionalElementLocationItem);
    return this;
  }

  /**
   * Indicative place point location
   * @return notionalElementLocation
  */
  @Valid 
  @Schema(name = "notionalElementLocation", description = "Indicative place point location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notionalElementLocation")
  public List<@Valid PointLocation> getNotionalElementLocation() {
    return notionalElementLocation;
  }

  public void setNotionalElementLocation(List<@Valid PointLocation> notionalElementLocation) {
    this.notionalElementLocation = notionalElementLocation;
  }


  public SubPlaceElement id(String id) {
    super.id(id);
    return this;
  }

  public SubPlaceElement version(Integer version) {
    super.version(version);
    return this;
  }

  public SubPlaceElement hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public SubPlaceElement name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public SubPlaceElement addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public SubPlaceElement description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public SubPlaceElement addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public SubPlaceElement layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public SubPlaceElement type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public SubPlaceElement aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public SubPlaceElement addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public SubPlaceElement parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public SubPlaceElement childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public SubPlaceElement addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public SubPlaceElement operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public SubPlaceElement addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public SubPlaceElement hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public SubPlaceElement rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public SubPlaceElement addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public SubPlaceElement hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public SubPlaceElement occupancyLevel(OccupancyLevel occupancyLevel) {
    super.occupancyLevel(occupancyLevel);
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
    SubPlaceElement subPlaceElement = (SubPlaceElement) o;
    return Objects.equals(this.characteristics, subPlaceElement.characteristics) &&
        Objects.equals(this.contacts, subPlaceElement.contacts) &&
        Objects.equals(this.marketing, subPlaceElement.marketing) &&
        Objects.equals(this.operatingRestrictions, subPlaceElement.operatingRestrictions) &&
        Objects.equals(this.rgbColours, subPlaceElement.rgbColours) &&
        Objects.equals(this.times, subPlaceElement.times) &&
        Objects.equals(this.paymentMethods, subPlaceElement.paymentMethods) &&
        Objects.equals(this.safetyStandardClassifications, subPlaceElement.safetyStandardClassifications) &&
        Objects.equals(this.elementDescriptor, subPlaceElement.elementDescriptor) &&
        Objects.equals(this.elementStreetAddress, subPlaceElement.elementStreetAddress) &&
        Objects.equals(this.elementAreaLocation, subPlaceElement.elementAreaLocation) &&
        Objects.equals(this.notionalElementLocation, subPlaceElement.notionalElementLocation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristics, contacts, marketing, operatingRestrictions, rgbColours, times, paymentMethods, safetyStandardClassifications, elementDescriptor, elementStreetAddress, elementAreaLocation, notionalElementLocation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubPlaceElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
    sb.append("    operatingRestrictions: ").append(toIndentedString(operatingRestrictions)).append("\n");
    sb.append("    rgbColours: ").append(toIndentedString(rgbColours)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    safetyStandardClassifications: ").append(toIndentedString(safetyStandardClassifications)).append("\n");
    sb.append("    elementDescriptor: ").append(toIndentedString(elementDescriptor)).append("\n");
    sb.append("    elementStreetAddress: ").append(toIndentedString(elementStreetAddress)).append("\n");
    sb.append("    elementAreaLocation: ").append(toIndentedString(elementAreaLocation)).append("\n");
    sb.append("    notionalElementLocation: ").append(toIndentedString(notionalElementLocation)).append("\n");
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


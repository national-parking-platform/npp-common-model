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
 * A place or location used for parking, loading, unloading, standing, or some other mobility or transport related activity.  Place typically identifies a parking structure, surface lot or on street parking zone
 */

@Schema(name = "Place", description = "A place or location used for parking, loading, unloading, standing, or some other mobility or transport related activity.  Place typically identifies a parking structure, surface lot or on street parking zone")


public class Place extends HierarchyElement {

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

  private String timeZone;

  @Valid
  private List<@Valid Address> placeStreetAddress;

  @Valid
  private List<@Valid AreaLocation> placeBoundedZone;

  @Valid
  private List<@Valid PointLocation> indicativePlacePointLocation;

  public Place() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Place(String timeZone, String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord) {
    super(id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord);
    this.timeZone = timeZone;
  }

  public Place characteristics(List<@Valid Characteristics> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public Place addCharacteristicsItem(Characteristics characteristicsItem) {
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

  public Place contacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Place addContactsItem(Contact contactsItem) {
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

  public Place marketing(Marketing marketing) {
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

  public Place operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    this.operatingRestrictions = operatingRestrictions;
    return this;
  }

  public Place addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
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

  public Place rgbColours(List<@Valid RGBColour> rgbColours) {
    this.rgbColours = rgbColours;
    return this;
  }

  public Place addRgbColoursItem(RGBColour rgbColoursItem) {
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

  public Place times(Times times) {
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

  public Place paymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public Place addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
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

  public Place safetyStandardClassifications(List<@Valid SafetyStandardClassification> safetyStandardClassifications) {
    this.safetyStandardClassifications = safetyStandardClassifications;
    return this;
  }

  public Place addSafetyStandardClassificationsItem(SafetyStandardClassification safetyStandardClassificationsItem) {
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

  public Place timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * IANA time-zone (see http://www.iana.org/time-zones)
   * @return timeZone
  */
  @NotNull 
  @Schema(name = "timeZone", description = "IANA time-zone (see http://www.iana.org/time-zones)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Place placeStreetAddress(List<@Valid Address> placeStreetAddress) {
    this.placeStreetAddress = placeStreetAddress;
    return this;
  }

  public Place addPlaceStreetAddressItem(Address placeStreetAddressItem) {
    if (this.placeStreetAddress == null) {
      this.placeStreetAddress = new ArrayList<>();
    }
    this.placeStreetAddress.add(placeStreetAddressItem);
    return this;
  }

  /**
   * Place street address
   * @return placeStreetAddress
  */
  @Valid 
  @Schema(name = "placeStreetAddress", description = "Place street address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeStreetAddress")
  public List<@Valid Address> getPlaceStreetAddress() {
    return placeStreetAddress;
  }

  public void setPlaceStreetAddress(List<@Valid Address> placeStreetAddress) {
    this.placeStreetAddress = placeStreetAddress;
  }

  public Place placeBoundedZone(List<@Valid AreaLocation> placeBoundedZone) {
    this.placeBoundedZone = placeBoundedZone;
    return this;
  }

  public Place addPlaceBoundedZoneItem(AreaLocation placeBoundedZoneItem) {
    if (this.placeBoundedZone == null) {
      this.placeBoundedZone = new ArrayList<>();
    }
    this.placeBoundedZone.add(placeBoundedZoneItem);
    return this;
  }

  /**
   * Place bounded zone
   * @return placeBoundedZone
  */
  @Valid 
  @Schema(name = "placeBoundedZone", description = "Place bounded zone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeBoundedZone")
  public List<@Valid AreaLocation> getPlaceBoundedZone() {
    return placeBoundedZone;
  }

  public void setPlaceBoundedZone(List<@Valid AreaLocation> placeBoundedZone) {
    this.placeBoundedZone = placeBoundedZone;
  }

  public Place indicativePlacePointLocation(List<@Valid PointLocation> indicativePlacePointLocation) {
    this.indicativePlacePointLocation = indicativePlacePointLocation;
    return this;
  }

  public Place addIndicativePlacePointLocationItem(PointLocation indicativePlacePointLocationItem) {
    if (this.indicativePlacePointLocation == null) {
      this.indicativePlacePointLocation = new ArrayList<>();
    }
    this.indicativePlacePointLocation.add(indicativePlacePointLocationItem);
    return this;
  }

  /**
   * Indicative place point location
   * @return indicativePlacePointLocation
  */
  @Valid 
  @Schema(name = "indicativePlacePointLocation", description = "Indicative place point location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicativePlacePointLocation")
  public List<@Valid PointLocation> getIndicativePlacePointLocation() {
    return indicativePlacePointLocation;
  }

  public void setIndicativePlacePointLocation(List<@Valid PointLocation> indicativePlacePointLocation) {
    this.indicativePlacePointLocation = indicativePlacePointLocation;
  }


  public Place id(String id) {
    super.id(id);
    return this;
  }

  public Place version(Integer version) {
    super.version(version);
    return this;
  }

  public Place hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public Place name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public Place addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public Place description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public Place addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public Place layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public Place type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public Place aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public Place addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public Place parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public Place childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public Place addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public Place operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public Place addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public Place hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public Place rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public Place addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public Place hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public Place occupancyLevel(OccupancyLevel occupancyLevel) {
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
    Place place = (Place) o;
    return Objects.equals(this.characteristics, place.characteristics) &&
        Objects.equals(this.contacts, place.contacts) &&
        Objects.equals(this.marketing, place.marketing) &&
        Objects.equals(this.operatingRestrictions, place.operatingRestrictions) &&
        Objects.equals(this.rgbColours, place.rgbColours) &&
        Objects.equals(this.times, place.times) &&
        Objects.equals(this.paymentMethods, place.paymentMethods) &&
        Objects.equals(this.safetyStandardClassifications, place.safetyStandardClassifications) &&
        Objects.equals(this.timeZone, place.timeZone) &&
        Objects.equals(this.placeStreetAddress, place.placeStreetAddress) &&
        Objects.equals(this.placeBoundedZone, place.placeBoundedZone) &&
        Objects.equals(this.indicativePlacePointLocation, place.indicativePlacePointLocation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristics, contacts, marketing, operatingRestrictions, rgbColours, times, paymentMethods, safetyStandardClassifications, timeZone, placeStreetAddress, placeBoundedZone, indicativePlacePointLocation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
    sb.append("    operatingRestrictions: ").append(toIndentedString(operatingRestrictions)).append("\n");
    sb.append("    rgbColours: ").append(toIndentedString(rgbColours)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    safetyStandardClassifications: ").append(toIndentedString(safetyStandardClassifications)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    placeStreetAddress: ").append(toIndentedString(placeStreetAddress)).append("\n");
    sb.append("    placeBoundedZone: ").append(toIndentedString(placeBoundedZone)).append("\n");
    sb.append("    indicativePlacePointLocation: ").append(toIndentedString(indicativePlacePointLocation)).append("\n");
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


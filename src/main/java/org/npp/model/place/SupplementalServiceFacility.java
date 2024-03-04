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
import org.npp.model.place.enums.AccessibilityEnum;
import org.npp.model.place.characteristics.Address;
import org.npp.model.place.location.AreaLocation;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.place.location.PointLocation;
import org.npp.model.place.enums.ServiceFacilityTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.place.SupplementalFacility;
import org.npp.model.time.Times;
import org.npp.model.place.enums.UserTypeEnum;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * One type of supplemental service facility.  You can specify the number of this service facility type (e.g. 5 restaurants) as well as the number of sub-items (e.g. 200 restaurant places).
 */

@Schema(name = "SupplementalServiceFacility", description = "One type of supplemental service facility.  You can specify the number of this service facility type (e.g. 5 restaurants) as well as the number of sub-items (e.g. 200 restaurant places).")


public class SupplementalServiceFacility extends SupplementalFacility {

  private Integer distanceFromOriginFacility;

  private Integer numberOfSubItems;

  private ServiceFacilityTypeEnum serviceFacilityType;

  public SupplementalServiceFacility() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplementalServiceFacility(ServiceFacilityTypeEnum serviceFacilityType, String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord, IdentifiedAreaTypeEnum identifiedAreaType, Integer supplementalFacilityIndex) {
    super(supplementalFacilityIndex, id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord, identifiedAreaType);
    this.serviceFacilityType = serviceFacilityType;
  }

  public SupplementalServiceFacility distanceFromOriginFacility(Integer distanceFromOriginFacility) {
    this.distanceFromOriginFacility = distanceFromOriginFacility;
    return this;
  }

  /**
   * Approximate distance (given in metres) between this supplemental facility and some origin facility to  which it is clearly related (typically a larger facility, e.g. a parking site).
   * minimum: 0
   * @return distanceFromOriginFacility
  */
  @Min(0) 
  @Schema(name = "distanceFromOriginFacility", description = "Approximate distance (given in metres) between this supplemental facility and some origin facility to  which it is clearly related (typically a larger facility, e.g. a parking site).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distanceFromOriginFacility")
  public Integer getDistanceFromOriginFacility() {
    return distanceFromOriginFacility;
  }

  public void setDistanceFromOriginFacility(Integer distanceFromOriginFacility) {
    this.distanceFromOriginFacility = distanceFromOriginFacility;
  }

  public SupplementalServiceFacility numberOfSubItems(Integer numberOfSubItems) {
    this.numberOfSubItems = numberOfSubItems;
    return this;
  }

  /**
   * The quantity of sub items to this service facility type, e.g. the total number of restaurant places or fuel dispensers etc.'
   * minimum: 0
   * @return numberOfSubItems
  */
  @Min(0) 
  @Schema(name = "numberOfSubItems", description = "The quantity of sub items to this service facility type, e.g. the total number of restaurant places or fuel dispensers etc.'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfSubItems")
  public Integer getNumberOfSubItems() {
    return numberOfSubItems;
  }

  public void setNumberOfSubItems(Integer numberOfSubItems) {
    this.numberOfSubItems = numberOfSubItems;
  }

  public SupplementalServiceFacility serviceFacilityType(ServiceFacilityTypeEnum serviceFacilityType) {
    this.serviceFacilityType = serviceFacilityType;
    return this;
  }

  /**
   * Get serviceFacilityType
   * @return serviceFacilityType
  */
  @NotNull @Valid 
  @Schema(name = "serviceFacilityType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceFacilityType")
  public ServiceFacilityTypeEnum getServiceFacilityType() {
    return serviceFacilityType;
  }

  public void setServiceFacilityType(ServiceFacilityTypeEnum serviceFacilityType) {
    this.serviceFacilityType = serviceFacilityType;
  }


  public SupplementalServiceFacility supplementalFacilityType(SupplementalFacilityTypeEnum supplementalFacilityType) {
    super.supplementalFacilityType(supplementalFacilityType);
    return this;
  }

  public SupplementalServiceFacility accessibility(List<@Valid AccessibilityEnum> accessibility) {
    super.accessibility(accessibility);
    return this;
  }

  public SupplementalServiceFacility addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    super.addAccessibilityItem(accessibilityItem);
    return this;
  }

  public SupplementalServiceFacility additionalDescription(List<@Valid SpecificLanguageString> additionalDescription) {
    super.additionalDescription(additionalDescription);
    return this;
  }

  public SupplementalServiceFacility addAdditionalDescriptionItem(SpecificLanguageString additionalDescriptionItem) {
    super.addAdditionalDescriptionItem(additionalDescriptionItem);
    return this;
  }

  public SupplementalServiceFacility applicableForUsers(List<@Valid UserTypeEnum> applicableForUsers) {
    super.applicableForUsers(applicableForUsers);
    return this;
  }

  public SupplementalServiceFacility addApplicableForUsersItem(UserTypeEnum applicableForUsersItem) {
    super.addApplicableForUsersItem(applicableForUsersItem);
    return this;
  }

  public SupplementalServiceFacility comment(List<@Valid SpecificLanguageString> comment) {
    super.comment(comment);
    return this;
  }

  public SupplementalServiceFacility addCommentItem(SpecificLanguageString commentItem) {
    super.addCommentItem(commentItem);
    return this;
  }

  public SupplementalServiceFacility externalIdentifiers(List<String> externalIdentifiers) {
    super.externalIdentifiers(externalIdentifiers);
    return this;
  }

  public SupplementalServiceFacility addExternalIdentifiersItem(String externalIdentifiersItem) {
    super.addExternalIdentifiersItem(externalIdentifiersItem);
    return this;
  }

  public SupplementalServiceFacility nameOrBrand(List<@Valid SpecificLanguageString> nameOrBrand) {
    super.nameOrBrand(nameOrBrand);
    return this;
  }

  public SupplementalServiceFacility addNameOrBrandItem(SpecificLanguageString nameOrBrandItem) {
    super.addNameOrBrandItem(nameOrBrandItem);
    return this;
  }

  public SupplementalServiceFacility otherSupplementalFacility(List<@Valid List<@Valid SpecificLanguageString>> otherSupplementalFacility) {
    super.otherSupplementalFacility(otherSupplementalFacility);
    return this;
  }

  public SupplementalServiceFacility addOtherSupplementalFacilityItem(List<@Valid SpecificLanguageString> otherSupplementalFacilityItem) {
    super.addOtherSupplementalFacilityItem(otherSupplementalFacilityItem);
    return this;
  }

  public SupplementalServiceFacility photoUrl(String photoUrl) {
    super.photoUrl(photoUrl);
    return this;
  }

  public SupplementalServiceFacility quantity(Integer quantity) {
    super.quantity(quantity);
    return this;
  }

  public SupplementalServiceFacility regularlyCleaned(Boolean regularlyCleaned) {
    super.regularlyCleaned(regularlyCleaned);
    return this;
  }

  public SupplementalServiceFacility rightSpecificationIds(List<@Valid VersionedReference> rightSpecificationIds) {
    super.rightSpecificationIds(rightSpecificationIds);
    return this;
  }

  public SupplementalServiceFacility addRightSpecificationIdsItem(VersionedReference rightSpecificationIdsItem) {
    super.addRightSpecificationIdsItem(rightSpecificationIdsItem);
    return this;
  }

  public SupplementalServiceFacility supplementalFacilityIndex(Integer supplementalFacilityIndex) {
    super.supplementalFacilityIndex(supplementalFacilityIndex);
    return this;
  }

  public SupplementalServiceFacility identifiedAreaType(IdentifiedAreaTypeEnum identifiedAreaType) {
    super.identifiedAreaType(identifiedAreaType);
    return this;
  }

  public SupplementalServiceFacility streetAddress(List<@Valid Address> streetAddress) {
    super.streetAddress(streetAddress);
    return this;
  }

  public SupplementalServiceFacility addStreetAddressItem(Address streetAddressItem) {
    super.addStreetAddressItem(streetAddressItem);
    return this;
  }

  public SupplementalServiceFacility areaBoundedZone(List<@Valid AreaLocation> areaBoundedZone) {
    super.areaBoundedZone(areaBoundedZone);
    return this;
  }

  public SupplementalServiceFacility addAreaBoundedZoneItem(AreaLocation areaBoundedZoneItem) {
    super.addAreaBoundedZoneItem(areaBoundedZoneItem);
    return this;
  }

  public SupplementalServiceFacility indicativeIdentifiedAreaPointLocation(List<@Valid PointLocation> indicativeIdentifiedAreaPointLocation) {
    super.indicativeIdentifiedAreaPointLocation(indicativeIdentifiedAreaPointLocation);
    return this;
  }

  public SupplementalServiceFacility addIndicativeIdentifiedAreaPointLocationItem(PointLocation indicativeIdentifiedAreaPointLocationItem) {
    super.addIndicativeIdentifiedAreaPointLocationItem(indicativeIdentifiedAreaPointLocationItem);
    return this;
  }

  public SupplementalServiceFacility times(Times times) {
    super.times(times);
    return this;
  }

  public SupplementalServiceFacility operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    super.operatingRestrictions(operatingRestrictions);
    return this;
  }

  public SupplementalServiceFacility addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    super.addOperatingRestrictionsItem(operatingRestrictionsItem);
    return this;
  }

  public SupplementalServiceFacility id(String id) {
    super.id(id);
    return this;
  }

  public SupplementalServiceFacility version(Integer version) {
    super.version(version);
    return this;
  }

  public SupplementalServiceFacility hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public SupplementalServiceFacility name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public SupplementalServiceFacility addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public SupplementalServiceFacility description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public SupplementalServiceFacility addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public SupplementalServiceFacility layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public SupplementalServiceFacility type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public SupplementalServiceFacility aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public SupplementalServiceFacility addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public SupplementalServiceFacility parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public SupplementalServiceFacility childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public SupplementalServiceFacility addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public SupplementalServiceFacility operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public SupplementalServiceFacility addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public SupplementalServiceFacility hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public SupplementalServiceFacility rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public SupplementalServiceFacility addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public SupplementalServiceFacility hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public SupplementalServiceFacility occupancyLevel(OccupancyLevel occupancyLevel) {
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
    SupplementalServiceFacility supplementalServiceFacility = (SupplementalServiceFacility) o;
    return Objects.equals(this.distanceFromOriginFacility, supplementalServiceFacility.distanceFromOriginFacility) &&
        Objects.equals(this.numberOfSubItems, supplementalServiceFacility.numberOfSubItems) &&
        Objects.equals(this.serviceFacilityType, supplementalServiceFacility.serviceFacilityType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceFromOriginFacility, numberOfSubItems, serviceFacilityType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalServiceFacility {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    distanceFromOriginFacility: ").append(toIndentedString(distanceFromOriginFacility)).append("\n");
    sb.append("    numberOfSubItems: ").append(toIndentedString(numberOfSubItems)).append("\n");
    sb.append("    serviceFacilityType: ").append(toIndentedString(serviceFacilityType)).append("\n");
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


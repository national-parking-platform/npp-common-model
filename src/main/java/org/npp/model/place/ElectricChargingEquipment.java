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
import org.npp.model.place.characteristics.ElectricChargingPoint;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.place.location.PointLocation;
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
 * A specialisation to the SupplementalFacility class adding an ElectricChargingPoint.
 */

@Schema(name = "ElectricChargingEquipment", description = "A specialisation to the SupplementalFacility class adding an ElectricChargingPoint.")


public class ElectricChargingEquipment extends SupplementalFacility {

  private ElectricChargingPoint electricChargingPoint;

  public ElectricChargingEquipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ElectricChargingEquipment(ElectricChargingPoint electricChargingPoint, String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord, IdentifiedAreaTypeEnum identifiedAreaType, Integer supplementalFacilityIndex) {
    super(supplementalFacilityIndex, id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord, identifiedAreaType);
    this.electricChargingPoint = electricChargingPoint;
  }

  public ElectricChargingEquipment electricChargingPoint(ElectricChargingPoint electricChargingPoint) {
    this.electricChargingPoint = electricChargingPoint;
    return this;
  }

  /**
   * Get electricChargingPoint
   * @return electricChargingPoint
  */
  @NotNull @Valid 
  @Schema(name = "electricChargingPoint", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("electricChargingPoint")
  public ElectricChargingPoint getElectricChargingPoint() {
    return electricChargingPoint;
  }

  public void setElectricChargingPoint(ElectricChargingPoint electricChargingPoint) {
    this.electricChargingPoint = electricChargingPoint;
  }


  public ElectricChargingEquipment supplementalFacilityType(SupplementalFacilityTypeEnum supplementalFacilityType) {
    super.supplementalFacilityType(supplementalFacilityType);
    return this;
  }

  public ElectricChargingEquipment accessibility(List<@Valid AccessibilityEnum> accessibility) {
    super.accessibility(accessibility);
    return this;
  }

  public ElectricChargingEquipment addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    super.addAccessibilityItem(accessibilityItem);
    return this;
  }

  public ElectricChargingEquipment additionalDescription(List<@Valid SpecificLanguageString> additionalDescription) {
    super.additionalDescription(additionalDescription);
    return this;
  }

  public ElectricChargingEquipment addAdditionalDescriptionItem(SpecificLanguageString additionalDescriptionItem) {
    super.addAdditionalDescriptionItem(additionalDescriptionItem);
    return this;
  }

  public ElectricChargingEquipment applicableForUsers(List<@Valid UserTypeEnum> applicableForUsers) {
    super.applicableForUsers(applicableForUsers);
    return this;
  }

  public ElectricChargingEquipment addApplicableForUsersItem(UserTypeEnum applicableForUsersItem) {
    super.addApplicableForUsersItem(applicableForUsersItem);
    return this;
  }

  public ElectricChargingEquipment comment(List<@Valid SpecificLanguageString> comment) {
    super.comment(comment);
    return this;
  }

  public ElectricChargingEquipment addCommentItem(SpecificLanguageString commentItem) {
    super.addCommentItem(commentItem);
    return this;
  }

  public ElectricChargingEquipment externalIdentifiers(List<String> externalIdentifiers) {
    super.externalIdentifiers(externalIdentifiers);
    return this;
  }

  public ElectricChargingEquipment addExternalIdentifiersItem(String externalIdentifiersItem) {
    super.addExternalIdentifiersItem(externalIdentifiersItem);
    return this;
  }

  public ElectricChargingEquipment nameOrBrand(List<@Valid SpecificLanguageString> nameOrBrand) {
    super.nameOrBrand(nameOrBrand);
    return this;
  }

  public ElectricChargingEquipment addNameOrBrandItem(SpecificLanguageString nameOrBrandItem) {
    super.addNameOrBrandItem(nameOrBrandItem);
    return this;
  }

  public ElectricChargingEquipment otherSupplementalFacility(List<@Valid List<@Valid SpecificLanguageString>> otherSupplementalFacility) {
    super.otherSupplementalFacility(otherSupplementalFacility);
    return this;
  }

  public ElectricChargingEquipment addOtherSupplementalFacilityItem(List<@Valid SpecificLanguageString> otherSupplementalFacilityItem) {
    super.addOtherSupplementalFacilityItem(otherSupplementalFacilityItem);
    return this;
  }

  public ElectricChargingEquipment photoUrl(String photoUrl) {
    super.photoUrl(photoUrl);
    return this;
  }

  public ElectricChargingEquipment quantity(Integer quantity) {
    super.quantity(quantity);
    return this;
  }

  public ElectricChargingEquipment regularlyCleaned(Boolean regularlyCleaned) {
    super.regularlyCleaned(regularlyCleaned);
    return this;
  }

  public ElectricChargingEquipment rightSpecificationIds(List<@Valid VersionedReference> rightSpecificationIds) {
    super.rightSpecificationIds(rightSpecificationIds);
    return this;
  }

  public ElectricChargingEquipment addRightSpecificationIdsItem(VersionedReference rightSpecificationIdsItem) {
    super.addRightSpecificationIdsItem(rightSpecificationIdsItem);
    return this;
  }

  public ElectricChargingEquipment supplementalFacilityIndex(Integer supplementalFacilityIndex) {
    super.supplementalFacilityIndex(supplementalFacilityIndex);
    return this;
  }

  public ElectricChargingEquipment identifiedAreaType(IdentifiedAreaTypeEnum identifiedAreaType) {
    super.identifiedAreaType(identifiedAreaType);
    return this;
  }

  public ElectricChargingEquipment streetAddress(List<@Valid Address> streetAddress) {
    super.streetAddress(streetAddress);
    return this;
  }

  public ElectricChargingEquipment addStreetAddressItem(Address streetAddressItem) {
    super.addStreetAddressItem(streetAddressItem);
    return this;
  }

  public ElectricChargingEquipment areaBoundedZone(List<@Valid AreaLocation> areaBoundedZone) {
    super.areaBoundedZone(areaBoundedZone);
    return this;
  }

  public ElectricChargingEquipment addAreaBoundedZoneItem(AreaLocation areaBoundedZoneItem) {
    super.addAreaBoundedZoneItem(areaBoundedZoneItem);
    return this;
  }

  public ElectricChargingEquipment indicativeIdentifiedAreaPointLocation(List<@Valid PointLocation> indicativeIdentifiedAreaPointLocation) {
    super.indicativeIdentifiedAreaPointLocation(indicativeIdentifiedAreaPointLocation);
    return this;
  }

  public ElectricChargingEquipment addIndicativeIdentifiedAreaPointLocationItem(PointLocation indicativeIdentifiedAreaPointLocationItem) {
    super.addIndicativeIdentifiedAreaPointLocationItem(indicativeIdentifiedAreaPointLocationItem);
    return this;
  }

  public ElectricChargingEquipment times(Times times) {
    super.times(times);
    return this;
  }

  public ElectricChargingEquipment operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    super.operatingRestrictions(operatingRestrictions);
    return this;
  }

  public ElectricChargingEquipment addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    super.addOperatingRestrictionsItem(operatingRestrictionsItem);
    return this;
  }

  public ElectricChargingEquipment id(String id) {
    super.id(id);
    return this;
  }

  public ElectricChargingEquipment version(Integer version) {
    super.version(version);
    return this;
  }

  public ElectricChargingEquipment hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public ElectricChargingEquipment name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public ElectricChargingEquipment addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public ElectricChargingEquipment description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public ElectricChargingEquipment addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public ElectricChargingEquipment layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public ElectricChargingEquipment type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public ElectricChargingEquipment aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public ElectricChargingEquipment addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public ElectricChargingEquipment parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public ElectricChargingEquipment childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public ElectricChargingEquipment addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public ElectricChargingEquipment operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public ElectricChargingEquipment addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public ElectricChargingEquipment hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public ElectricChargingEquipment rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public ElectricChargingEquipment addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public ElectricChargingEquipment hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public ElectricChargingEquipment occupancyLevel(OccupancyLevel occupancyLevel) {
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
    ElectricChargingEquipment electricChargingEquipment = (ElectricChargingEquipment) o;
    return Objects.equals(this.electricChargingPoint, electricChargingEquipment.electricChargingPoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electricChargingPoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectricChargingEquipment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    electricChargingPoint: ").append(toIndentedString(electricChargingPoint)).append("\n");
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


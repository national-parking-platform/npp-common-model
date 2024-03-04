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
import org.npp.model.place.enums.EquipmentTypeEnum;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.place.location.PointLocation;
import org.npp.model.place.characteristics.RefillPoint;
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
 * One type of supplemental equipment, which is available on some site, for example on a rest area.
 */

@Schema(name = "SupplementalEquipment", description = "One type of supplemental equipment, which is available on some site, for example on a rest area.")


public class SupplementalEquipment extends SupplementalFacility {

  private EquipmentTypeEnum equipmentType;

  @Valid
  private List<@Valid RefillPoint> refillPoints;

  public SupplementalEquipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplementalEquipment(EquipmentTypeEnum equipmentType, String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord, IdentifiedAreaTypeEnum identifiedAreaType, Integer supplementalFacilityIndex) {
    super(supplementalFacilityIndex, id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord, identifiedAreaType);
    this.equipmentType = equipmentType;
  }

  public SupplementalEquipment equipmentType(EquipmentTypeEnum equipmentType) {
    this.equipmentType = equipmentType;
    return this;
  }

  /**
   * Get equipmentType
   * @return equipmentType
  */
  @NotNull @Valid 
  @Schema(name = "equipmentType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("equipmentType")
  public EquipmentTypeEnum getEquipmentType() {
    return equipmentType;
  }

  public void setEquipmentType(EquipmentTypeEnum equipmentType) {
    this.equipmentType = equipmentType;
  }

  public SupplementalEquipment refillPoints(List<@Valid RefillPoint> refillPoints) {
    this.refillPoints = refillPoints;
    return this;
  }

  public SupplementalEquipment addRefillPointsItem(RefillPoint refillPointsItem) {
    if (this.refillPoints == null) {
      this.refillPoints = new ArrayList<>();
    }
    this.refillPoints.add(refillPointsItem);
    return this;
  }

  /**
   * Get refillPoints
   * @return refillPoints
  */
  @Valid 
  @Schema(name = "refillPoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refillPoints")
  public List<@Valid RefillPoint> getRefillPoints() {
    return refillPoints;
  }

  public void setRefillPoints(List<@Valid RefillPoint> refillPoints) {
    this.refillPoints = refillPoints;
  }


  public SupplementalEquipment supplementalFacilityType(SupplementalFacilityTypeEnum supplementalFacilityType) {
    super.supplementalFacilityType(supplementalFacilityType);
    return this;
  }

  public SupplementalEquipment accessibility(List<@Valid AccessibilityEnum> accessibility) {
    super.accessibility(accessibility);
    return this;
  }

  public SupplementalEquipment addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    super.addAccessibilityItem(accessibilityItem);
    return this;
  }

  public SupplementalEquipment additionalDescription(List<@Valid SpecificLanguageString> additionalDescription) {
    super.additionalDescription(additionalDescription);
    return this;
  }

  public SupplementalEquipment addAdditionalDescriptionItem(SpecificLanguageString additionalDescriptionItem) {
    super.addAdditionalDescriptionItem(additionalDescriptionItem);
    return this;
  }

  public SupplementalEquipment applicableForUsers(List<@Valid UserTypeEnum> applicableForUsers) {
    super.applicableForUsers(applicableForUsers);
    return this;
  }

  public SupplementalEquipment addApplicableForUsersItem(UserTypeEnum applicableForUsersItem) {
    super.addApplicableForUsersItem(applicableForUsersItem);
    return this;
  }

  public SupplementalEquipment comment(List<@Valid SpecificLanguageString> comment) {
    super.comment(comment);
    return this;
  }

  public SupplementalEquipment addCommentItem(SpecificLanguageString commentItem) {
    super.addCommentItem(commentItem);
    return this;
  }

  public SupplementalEquipment externalIdentifiers(List<String> externalIdentifiers) {
    super.externalIdentifiers(externalIdentifiers);
    return this;
  }

  public SupplementalEquipment addExternalIdentifiersItem(String externalIdentifiersItem) {
    super.addExternalIdentifiersItem(externalIdentifiersItem);
    return this;
  }

  public SupplementalEquipment nameOrBrand(List<@Valid SpecificLanguageString> nameOrBrand) {
    super.nameOrBrand(nameOrBrand);
    return this;
  }

  public SupplementalEquipment addNameOrBrandItem(SpecificLanguageString nameOrBrandItem) {
    super.addNameOrBrandItem(nameOrBrandItem);
    return this;
  }

  public SupplementalEquipment otherSupplementalFacility(List<@Valid List<@Valid SpecificLanguageString>> otherSupplementalFacility) {
    super.otherSupplementalFacility(otherSupplementalFacility);
    return this;
  }

  public SupplementalEquipment addOtherSupplementalFacilityItem(List<@Valid SpecificLanguageString> otherSupplementalFacilityItem) {
    super.addOtherSupplementalFacilityItem(otherSupplementalFacilityItem);
    return this;
  }

  public SupplementalEquipment photoUrl(String photoUrl) {
    super.photoUrl(photoUrl);
    return this;
  }

  public SupplementalEquipment quantity(Integer quantity) {
    super.quantity(quantity);
    return this;
  }

  public SupplementalEquipment regularlyCleaned(Boolean regularlyCleaned) {
    super.regularlyCleaned(regularlyCleaned);
    return this;
  }

  public SupplementalEquipment rightSpecificationIds(List<@Valid VersionedReference> rightSpecificationIds) {
    super.rightSpecificationIds(rightSpecificationIds);
    return this;
  }

  public SupplementalEquipment addRightSpecificationIdsItem(VersionedReference rightSpecificationIdsItem) {
    super.addRightSpecificationIdsItem(rightSpecificationIdsItem);
    return this;
  }

  public SupplementalEquipment supplementalFacilityIndex(Integer supplementalFacilityIndex) {
    super.supplementalFacilityIndex(supplementalFacilityIndex);
    return this;
  }

  public SupplementalEquipment identifiedAreaType(IdentifiedAreaTypeEnum identifiedAreaType) {
    super.identifiedAreaType(identifiedAreaType);
    return this;
  }

  public SupplementalEquipment streetAddress(List<@Valid Address> streetAddress) {
    super.streetAddress(streetAddress);
    return this;
  }

  public SupplementalEquipment addStreetAddressItem(Address streetAddressItem) {
    super.addStreetAddressItem(streetAddressItem);
    return this;
  }

  public SupplementalEquipment areaBoundedZone(List<@Valid AreaLocation> areaBoundedZone) {
    super.areaBoundedZone(areaBoundedZone);
    return this;
  }

  public SupplementalEquipment addAreaBoundedZoneItem(AreaLocation areaBoundedZoneItem) {
    super.addAreaBoundedZoneItem(areaBoundedZoneItem);
    return this;
  }

  public SupplementalEquipment indicativeIdentifiedAreaPointLocation(List<@Valid PointLocation> indicativeIdentifiedAreaPointLocation) {
    super.indicativeIdentifiedAreaPointLocation(indicativeIdentifiedAreaPointLocation);
    return this;
  }

  public SupplementalEquipment addIndicativeIdentifiedAreaPointLocationItem(PointLocation indicativeIdentifiedAreaPointLocationItem) {
    super.addIndicativeIdentifiedAreaPointLocationItem(indicativeIdentifiedAreaPointLocationItem);
    return this;
  }

  public SupplementalEquipment times(Times times) {
    super.times(times);
    return this;
  }

  public SupplementalEquipment operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    super.operatingRestrictions(operatingRestrictions);
    return this;
  }

  public SupplementalEquipment addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    super.addOperatingRestrictionsItem(operatingRestrictionsItem);
    return this;
  }

  public SupplementalEquipment id(String id) {
    super.id(id);
    return this;
  }

  public SupplementalEquipment version(Integer version) {
    super.version(version);
    return this;
  }

  public SupplementalEquipment hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public SupplementalEquipment name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public SupplementalEquipment addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public SupplementalEquipment description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public SupplementalEquipment addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public SupplementalEquipment layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public SupplementalEquipment type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public SupplementalEquipment aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public SupplementalEquipment addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public SupplementalEquipment parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public SupplementalEquipment childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public SupplementalEquipment addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public SupplementalEquipment operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public SupplementalEquipment addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public SupplementalEquipment hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public SupplementalEquipment rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public SupplementalEquipment addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public SupplementalEquipment hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public SupplementalEquipment occupancyLevel(OccupancyLevel occupancyLevel) {
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
    SupplementalEquipment supplementalEquipment = (SupplementalEquipment) o;
    return Objects.equals(this.equipmentType, supplementalEquipment.equipmentType) &&
        Objects.equals(this.refillPoints, supplementalEquipment.refillPoints) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipmentType, refillPoints, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalEquipment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    equipmentType: ").append(toIndentedString(equipmentType)).append("\n");
    sb.append("    refillPoints: ").append(toIndentedString(refillPoints)).append("\n");
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


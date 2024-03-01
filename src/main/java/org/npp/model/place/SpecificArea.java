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
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.place.IdentifiedArea;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.place.location.PointLocation;
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
 * Specific Area class is a type of Identified Area data element that denotes a specific geographic area in a Place that has a common physical infrastructure purpose and common characteristics.  Examples of common infrastructure purpose include parking area, electric charging infrastructure, bike storage. The Specific Area class describes the physical components of a Place. Specific Area type Identified Area is used to assign Rights.
 */

@Schema(name = "SpecificArea", description = "Specific Area class is a type of Identified Area data element that denotes a specific geographic area in a Place that has a common physical infrastructure purpose and common characteristics.  Examples of common infrastructure purpose include parking area, electric charging infrastructure, bike storage. The Specific Area class describes the physical components of a Place. Specific Area type Identified Area is used to assign Rights.")


public class SpecificArea extends IdentifiedArea {

  private Characteristics characteristics;

  public SpecificArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SpecificArea(String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord, IdentifiedAreaTypeEnum identifiedAreaType) {
    super(identifiedAreaType, id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord);
  }

  public SpecificArea characteristics(Characteristics characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  /**
   * Get characteristics
   * @return characteristics
  */
  @Valid 
  @Schema(name = "characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristics")
  public Characteristics getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Characteristics characteristics) {
    this.characteristics = characteristics;
  }


  public SpecificArea identifiedAreaType(IdentifiedAreaTypeEnum identifiedAreaType) {
    super.identifiedAreaType(identifiedAreaType);
    return this;
  }

  public SpecificArea streetAddress(List<@Valid Address> streetAddress) {
    super.streetAddress(streetAddress);
    return this;
  }

  public SpecificArea addStreetAddressItem(Address streetAddressItem) {
    super.addStreetAddressItem(streetAddressItem);
    return this;
  }

  public SpecificArea areaBoundedZone(List<@Valid AreaLocation> areaBoundedZone) {
    super.areaBoundedZone(areaBoundedZone);
    return this;
  }

  public SpecificArea addAreaBoundedZoneItem(AreaLocation areaBoundedZoneItem) {
    super.addAreaBoundedZoneItem(areaBoundedZoneItem);
    return this;
  }

  public SpecificArea indicativeIdentifiedAreaPointLocation(List<@Valid PointLocation> indicativeIdentifiedAreaPointLocation) {
    super.indicativeIdentifiedAreaPointLocation(indicativeIdentifiedAreaPointLocation);
    return this;
  }

  public SpecificArea addIndicativeIdentifiedAreaPointLocationItem(PointLocation indicativeIdentifiedAreaPointLocationItem) {
    super.addIndicativeIdentifiedAreaPointLocationItem(indicativeIdentifiedAreaPointLocationItem);
    return this;
  }

  public SpecificArea times(Times times) {
    super.times(times);
    return this;
  }

  public SpecificArea operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    super.operatingRestrictions(operatingRestrictions);
    return this;
  }

  public SpecificArea addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    super.addOperatingRestrictionsItem(operatingRestrictionsItem);
    return this;
  }

  public SpecificArea id(String id) {
    super.id(id);
    return this;
  }

  public SpecificArea version(Integer version) {
    super.version(version);
    return this;
  }

  public SpecificArea hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public SpecificArea name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public SpecificArea addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public SpecificArea description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public SpecificArea addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public SpecificArea layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public SpecificArea type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public SpecificArea aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public SpecificArea addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public SpecificArea parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public SpecificArea childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public SpecificArea addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public SpecificArea operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public SpecificArea addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public SpecificArea hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public SpecificArea rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public SpecificArea addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public SpecificArea hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public SpecificArea occupancyLevel(OccupancyLevel occupancyLevel) {
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
    SpecificArea specificArea = (SpecificArea) o;
    return Objects.equals(this.characteristics, specificArea.characteristics) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristics, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificArea {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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


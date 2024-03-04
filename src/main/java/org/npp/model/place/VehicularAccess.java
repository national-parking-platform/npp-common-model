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
import org.npp.model.time.AccessAndEgress;
import org.npp.model.place.characteristics.AccessLaneSpecific;
import org.npp.model.place.enums.AccessTypeEnum;
import org.npp.model.place.characteristics.Address;
import org.npp.model.place.location.AreaLocation;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.place.IdentifiedArea;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.place.location.PointLocation;
import org.npp.model.place.Road;
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
 * A specialisation of an identifiedArea defining a VehicularAccess areas. Note: This model only supports the modelling of vehicular accesses at the present time.  Other forms of access (e.g. pedestrian access, rental vehicle return, bicycle access, etc) may be introduced during a later Release if a stakeholder requirement is identified. AccessType enumerations for the Vehicular Access type support the definition of characteristics for access into, from and both to and from a parking facility or part thereof respectively (denoted by the type attribute, using the AccessType enumerations). Each of the AccessLaneType enumerations may support the definition of characteristics for each lane within the specific Identified Area. Preferred practice gives a sequence number to each lane left to right when entering the facility.
 */

@Schema(name = "VehicularAccess", description = "A specialisation of an identifiedArea defining a VehicularAccess areas. Note: This model only supports the modelling of vehicular accesses at the present time.  Other forms of access (e.g. pedestrian access, rental vehicle return, bicycle access, etc) may be introduced during a later Release if a stakeholder requirement is identified. AccessType enumerations for the Vehicular Access type support the definition of characteristics for access into, from and both to and from a parking facility or part thereof respectively (denoted by the type attribute, using the AccessType enumerations). Each of the AccessLaneType enumerations may support the definition of characteristics for each lane within the specific Identified Area. Preferred practice gives a sequence number to each lane left to right when entering the facility.")


public class VehicularAccess extends IdentifiedArea {

  @Valid
  private List<@Valid AccessLaneSpecific> accessLaneSpecifics;

  @Valid
  private List<@Valid AccessAndEgress> accessAndEgress;

  private AccessTypeEnum accessType;

  @Valid
  private List<@Valid Road> primaryRoads;

  public VehicularAccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicularAccess(AccessTypeEnum accessType, String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord, IdentifiedAreaTypeEnum identifiedAreaType) {
    super(identifiedAreaType, id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord);
    this.accessType = accessType;
  }

  public VehicularAccess accessLaneSpecifics(List<@Valid AccessLaneSpecific> accessLaneSpecifics) {
    this.accessLaneSpecifics = accessLaneSpecifics;
    return this;
  }

  public VehicularAccess addAccessLaneSpecificsItem(AccessLaneSpecific accessLaneSpecificsItem) {
    if (this.accessLaneSpecifics == null) {
      this.accessLaneSpecifics = new ArrayList<>();
    }
    this.accessLaneSpecifics.add(accessLaneSpecificsItem);
    return this;
  }

  /**
   * Access lane specific
   * @return accessLaneSpecifics
  */
  @Valid 
  @Schema(name = "accessLaneSpecifics", description = "Access lane specific", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessLaneSpecifics")
  public List<@Valid AccessLaneSpecific> getAccessLaneSpecifics() {
    return accessLaneSpecifics;
  }

  public void setAccessLaneSpecifics(List<@Valid AccessLaneSpecific> accessLaneSpecifics) {
    this.accessLaneSpecifics = accessLaneSpecifics;
  }

  public VehicularAccess accessAndEgress(List<@Valid AccessAndEgress> accessAndEgress) {
    this.accessAndEgress = accessAndEgress;
    return this;
  }

  public VehicularAccess addAccessAndEgressItem(AccessAndEgress accessAndEgressItem) {
    if (this.accessAndEgress == null) {
      this.accessAndEgress = new ArrayList<>();
    }
    this.accessAndEgress.add(accessAndEgressItem);
    return this;
  }

  /**
   * Access and egress
   * @return accessAndEgress
  */
  @Valid 
  @Schema(name = "accessAndEgress", description = "Access and egress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessAndEgress")
  public List<@Valid AccessAndEgress> getAccessAndEgress() {
    return accessAndEgress;
  }

  public void setAccessAndEgress(List<@Valid AccessAndEgress> accessAndEgress) {
    this.accessAndEgress = accessAndEgress;
  }

  public VehicularAccess accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
  */
  @NotNull @Valid 
  @Schema(name = "accessType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accessType")
  public AccessTypeEnum getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }

  public VehicularAccess primaryRoads(List<@Valid Road> primaryRoads) {
    this.primaryRoads = primaryRoads;
    return this;
  }

  public VehicularAccess addPrimaryRoadsItem(Road primaryRoadsItem) {
    if (this.primaryRoads == null) {
      this.primaryRoads = new ArrayList<>();
    }
    this.primaryRoads.add(primaryRoadsItem);
    return this;
  }

  /**
   * Primary road
   * @return primaryRoads
  */
  @Valid 
  @Schema(name = "primaryRoads", description = "Primary road", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryRoads")
  public List<@Valid Road> getPrimaryRoads() {
    return primaryRoads;
  }

  public void setPrimaryRoads(List<@Valid Road> primaryRoads) {
    this.primaryRoads = primaryRoads;
  }


  public VehicularAccess identifiedAreaType(IdentifiedAreaTypeEnum identifiedAreaType) {
    super.identifiedAreaType(identifiedAreaType);
    return this;
  }

  public VehicularAccess streetAddress(List<@Valid Address> streetAddress) {
    super.streetAddress(streetAddress);
    return this;
  }

  public VehicularAccess addStreetAddressItem(Address streetAddressItem) {
    super.addStreetAddressItem(streetAddressItem);
    return this;
  }

  public VehicularAccess areaBoundedZone(List<@Valid AreaLocation> areaBoundedZone) {
    super.areaBoundedZone(areaBoundedZone);
    return this;
  }

  public VehicularAccess addAreaBoundedZoneItem(AreaLocation areaBoundedZoneItem) {
    super.addAreaBoundedZoneItem(areaBoundedZoneItem);
    return this;
  }

  public VehicularAccess indicativeIdentifiedAreaPointLocation(List<@Valid PointLocation> indicativeIdentifiedAreaPointLocation) {
    super.indicativeIdentifiedAreaPointLocation(indicativeIdentifiedAreaPointLocation);
    return this;
  }

  public VehicularAccess addIndicativeIdentifiedAreaPointLocationItem(PointLocation indicativeIdentifiedAreaPointLocationItem) {
    super.addIndicativeIdentifiedAreaPointLocationItem(indicativeIdentifiedAreaPointLocationItem);
    return this;
  }

  public VehicularAccess times(Times times) {
    super.times(times);
    return this;
  }

  public VehicularAccess operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    super.operatingRestrictions(operatingRestrictions);
    return this;
  }

  public VehicularAccess addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    super.addOperatingRestrictionsItem(operatingRestrictionsItem);
    return this;
  }

  public VehicularAccess id(String id) {
    super.id(id);
    return this;
  }

  public VehicularAccess version(Integer version) {
    super.version(version);
    return this;
  }

  public VehicularAccess hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public VehicularAccess name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public VehicularAccess addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public VehicularAccess description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public VehicularAccess addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public VehicularAccess layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public VehicularAccess type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public VehicularAccess aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public VehicularAccess addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public VehicularAccess parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public VehicularAccess childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public VehicularAccess addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public VehicularAccess operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public VehicularAccess addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public VehicularAccess hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public VehicularAccess rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public VehicularAccess addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public VehicularAccess hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public VehicularAccess occupancyLevel(OccupancyLevel occupancyLevel) {
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
    VehicularAccess vehicularAccess = (VehicularAccess) o;
    return Objects.equals(this.accessLaneSpecifics, vehicularAccess.accessLaneSpecifics) &&
        Objects.equals(this.accessAndEgress, vehicularAccess.accessAndEgress) &&
        Objects.equals(this.accessType, vehicularAccess.accessType) &&
        Objects.equals(this.primaryRoads, vehicularAccess.primaryRoads) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLaneSpecifics, accessAndEgress, accessType, primaryRoads, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicularAccess {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessLaneSpecifics: ").append(toIndentedString(accessLaneSpecifics)).append("\n");
    sb.append("    accessAndEgress: ").append(toIndentedString(accessAndEgress)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    primaryRoads: ").append(toIndentedString(primaryRoads)).append("\n");
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


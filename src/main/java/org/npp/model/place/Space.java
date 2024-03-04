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
import org.npp.model.place.location.AreaLocation;
import org.npp.model.place.HierarchyElement;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.place.characteristics.MaximumDimensions;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.place.characteristics.OperatingRestrictions;
import org.npp.model.place.enums.ParkingSpaceOccupancyDetectionEnum;
import org.npp.model.place.location.PointLocation;
import org.npp.model.common.Reference;
import org.npp.model.place.characteristics.SpaceDimension;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A single space for parking, usually designed for one vehicle, which may, but not necessarily, be denoted by painted or other road surface marker.
 */

@Schema(name = "Space", description = "A single space for parking, usually designed for one vehicle, which may, but not necessarily, be denoted by painted or other road surface marker.")


public class Space extends HierarchyElement {

  private Reference spaceId;

  private ParkingSpaceOccupancyDetectionEnum detection;

  private PointLocation indicativePointLocation;

  private AreaLocation spaceBoundedZone;

  private SpaceDimension spaceDimension;

  private MaximumDimensions spaceMaximumDims;

  @Valid
  private List<@Valid OperatingRestrictions> operatingRestrictions;

  public Space() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Space(Reference spaceId, String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord) {
    super(id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord);
    this.spaceId = spaceId;
  }

  public Space spaceId(Reference spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
  */
  @NotNull @Valid 
  @Schema(name = "spaceId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("spaceId")
  public Reference getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Reference spaceId) {
    this.spaceId = spaceId;
  }

  public Space detection(ParkingSpaceOccupancyDetectionEnum detection) {
    this.detection = detection;
    return this;
  }

  /**
   * Get detection
   * @return detection
  */
  @Valid 
  @Schema(name = "detection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detection")
  public ParkingSpaceOccupancyDetectionEnum getDetection() {
    return detection;
  }

  public void setDetection(ParkingSpaceOccupancyDetectionEnum detection) {
    this.detection = detection;
  }

  public Space indicativePointLocation(PointLocation indicativePointLocation) {
    this.indicativePointLocation = indicativePointLocation;
    return this;
  }

  /**
   * Get indicativePointLocation
   * @return indicativePointLocation
  */
  @Valid 
  @Schema(name = "indicativePointLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicativePointLocation")
  public PointLocation getIndicativePointLocation() {
    return indicativePointLocation;
  }

  public void setIndicativePointLocation(PointLocation indicativePointLocation) {
    this.indicativePointLocation = indicativePointLocation;
  }

  public Space spaceBoundedZone(AreaLocation spaceBoundedZone) {
    this.spaceBoundedZone = spaceBoundedZone;
    return this;
  }

  /**
   * Get spaceBoundedZone
   * @return spaceBoundedZone
  */
  @Valid 
  @Schema(name = "spaceBoundedZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spaceBoundedZone")
  public AreaLocation getSpaceBoundedZone() {
    return spaceBoundedZone;
  }

  public void setSpaceBoundedZone(AreaLocation spaceBoundedZone) {
    this.spaceBoundedZone = spaceBoundedZone;
  }

  public Space spaceDimension(SpaceDimension spaceDimension) {
    this.spaceDimension = spaceDimension;
    return this;
  }

  /**
   * Get spaceDimension
   * @return spaceDimension
  */
  @Valid 
  @Schema(name = "spaceDimension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spaceDimension")
  public SpaceDimension getSpaceDimension() {
    return spaceDimension;
  }

  public void setSpaceDimension(SpaceDimension spaceDimension) {
    this.spaceDimension = spaceDimension;
  }

  public Space spaceMaximumDims(MaximumDimensions spaceMaximumDims) {
    this.spaceMaximumDims = spaceMaximumDims;
    return this;
  }

  /**
   * Get spaceMaximumDims
   * @return spaceMaximumDims
  */
  @Valid 
  @Schema(name = "spaceMaximumDims", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spaceMaximumDims")
  public MaximumDimensions getSpaceMaximumDims() {
    return spaceMaximumDims;
  }

  public void setSpaceMaximumDims(MaximumDimensions spaceMaximumDims) {
    this.spaceMaximumDims = spaceMaximumDims;
  }

  public Space operatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    this.operatingRestrictions = operatingRestrictions;
    return this;
  }

  public Space addOperatingRestrictionsItem(OperatingRestrictions operatingRestrictionsItem) {
    if (this.operatingRestrictions == null) {
      this.operatingRestrictions = new ArrayList<>();
    }
    this.operatingRestrictions.add(operatingRestrictionsItem);
    return this;
  }

  /**
   * Operating restrictions for space
   * @return operatingRestrictions
  */
  @Valid 
  @Schema(name = "operatingRestrictions", description = "Operating restrictions for space", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingRestrictions")
  public List<@Valid OperatingRestrictions> getOperatingRestrictions() {
    return operatingRestrictions;
  }

  public void setOperatingRestrictions(List<@Valid OperatingRestrictions> operatingRestrictions) {
    this.operatingRestrictions = operatingRestrictions;
  }


  public Space id(String id) {
    super.id(id);
    return this;
  }

  public Space version(Integer version) {
    super.version(version);
    return this;
  }

  public Space hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public Space name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public Space addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public Space description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public Space addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public Space layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public Space type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public Space aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public Space addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public Space parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public Space childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public Space addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public Space operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public Space addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public Space hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public Space rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public Space addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public Space hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public Space occupancyLevel(OccupancyLevel occupancyLevel) {
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
    Space space = (Space) o;
    return Objects.equals(this.spaceId, space.spaceId) &&
        Objects.equals(this.detection, space.detection) &&
        Objects.equals(this.indicativePointLocation, space.indicativePointLocation) &&
        Objects.equals(this.spaceBoundedZone, space.spaceBoundedZone) &&
        Objects.equals(this.spaceDimension, space.spaceDimension) &&
        Objects.equals(this.spaceMaximumDims, space.spaceMaximumDims) &&
        Objects.equals(this.operatingRestrictions, space.operatingRestrictions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId, detection, indicativePointLocation, spaceBoundedZone, spaceDimension, spaceMaximumDims, operatingRestrictions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Space {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    detection: ").append(toIndentedString(detection)).append("\n");
    sb.append("    indicativePointLocation: ").append(toIndentedString(indicativePointLocation)).append("\n");
    sb.append("    spaceBoundedZone: ").append(toIndentedString(spaceBoundedZone)).append("\n");
    sb.append("    spaceDimension: ").append(toIndentedString(spaceDimension)).append("\n");
    sb.append("    spaceMaximumDims: ").append(toIndentedString(spaceMaximumDims)).append("\n");
    sb.append("    operatingRestrictions: ").append(toIndentedString(operatingRestrictions)).append("\n");
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


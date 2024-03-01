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
import org.npp.model.place.HierarchyElement;
import org.npp.model.place.HierarchyElementRecord;
import org.npp.model.place.HierarchyElementReference;
import org.npp.model.place.enums.HierarchyElementTypeEnum;
import org.npp.model.occupancy.OccupancyLevel;
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
 * The highest level in the hierarchy, it typically defines a large facility (such as a university campus, or an airport),  or a large geographic zone (such as a city or a town), which may contain numerous Places.  A Campus combines and encompasses a number of Places that can be logically reported together.
 */

@Schema(name = "Campus", description = "The highest level in the hierarchy, it typically defines a large facility (such as a university campus, or an airport),  or a large geographic zone (such as a city or a town), which may contain numerous Places.  A Campus combines and encompasses a number of Places that can be logically reported together.")


public class Campus extends HierarchyElement {

  public Campus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Campus(String id, Integer version, HierarchyElementTypeEnum hierarchyElementType, List<@Valid SpecificLanguageString> name, Integer layer, HierarchyElementTypeEnum type, HierarchyElementRecord hierarchyElementRecord) {
    super(id, version, hierarchyElementType, name, layer, type, hierarchyElementRecord);
  }


  public Campus id(String id) {
    super.id(id);
    return this;
  }

  public Campus version(Integer version) {
    super.version(version);
    return this;
  }

  public Campus hierarchyElementType(HierarchyElementTypeEnum hierarchyElementType) {
    super.hierarchyElementType(hierarchyElementType);
    return this;
  }

  public Campus name(List<@Valid SpecificLanguageString> name) {
    super.name(name);
    return this;
  }

  public Campus addNameItem(SpecificLanguageString nameItem) {
    super.addNameItem(nameItem);
    return this;
  }

  public Campus description(List<@Valid SpecificLanguageString> description) {
    super.description(description);
    return this;
  }

  public Campus addDescriptionItem(SpecificLanguageString descriptionItem) {
    super.addDescriptionItem(descriptionItem);
    return this;
  }

  public Campus layer(Integer layer) {
    super.layer(layer);
    return this;
  }

  public Campus type(HierarchyElementTypeEnum type) {
    super.type(type);
    return this;
  }

  public Campus aliases(List<@Valid List<@Valid SpecificLanguageString>> aliases) {
    super.aliases(aliases);
    return this;
  }

  public Campus addAliasesItem(List<@Valid SpecificLanguageString> aliasesItem) {
    super.addAliasesItem(aliasesItem);
    return this;
  }

  public Campus parentId(VersionedReference parentId) {
    super.parentId(parentId);
    return this;
  }

  public Campus childIds(List<@Valid VersionedReference> childIds) {
    super.childIds(childIds);
    return this;
  }

  public Campus addChildIdsItem(VersionedReference childIdsItem) {
    super.addChildIdsItem(childIdsItem);
    return this;
  }

  public Campus operatorDefinedReference(List<@Valid SpecificLanguageString> operatorDefinedReference) {
    super.operatorDefinedReference(operatorDefinedReference);
    return this;
  }

  public Campus addOperatorDefinedReferenceItem(SpecificLanguageString operatorDefinedReferenceItem) {
    super.addOperatorDefinedReferenceItem(operatorDefinedReferenceItem);
    return this;
  }

  public Campus hierarchyElementRecord(HierarchyElementRecord hierarchyElementRecord) {
    super.hierarchyElementRecord(hierarchyElementRecord);
    return this;
  }

  public Campus rightSpecifications(List<@Valid VersionedReference> rightSpecifications) {
    super.rightSpecifications(rightSpecifications);
    return this;
  }

  public Campus addRightSpecificationsItem(VersionedReference rightSpecificationsItem) {
    super.addRightSpecificationsItem(rightSpecificationsItem);
    return this;
  }

  public Campus hierarchyElementReference(HierarchyElementReference hierarchyElementReference) {
    super.hierarchyElementReference(hierarchyElementReference);
    return this;
  }

  public Campus occupancyLevel(OccupancyLevel occupancyLevel) {
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


package org.npp.model.place;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.occupancy.DemandTable;
import org.npp.model.occupancy.Supply;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class providing a unique reference identifier for a discrete part of the parking place hierarchy.  This can indicate a campus, parking place, hierarchy element, identifiable area or space.&#39;
 */

@Schema(name = "HierarchyElementReference", description = "Class providing a unique reference identifier for a discrete part of the parking place hierarchy.  This can indicate a campus, parking place, hierarchy element, identifiable area or space.'")

public class HierarchyElementReference {

  private VersionedReference elementId;

  @Valid
  private List<@Valid DemandTable> demandTable;

  @Valid
  private List<@Valid Supply> supply;

  public HierarchyElementReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HierarchyElementReference(VersionedReference elementId) {
    this.elementId = elementId;
  }

  public HierarchyElementReference elementId(VersionedReference elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
  */
  @NotNull @Valid 
  @Schema(name = "elementId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementId")
  public VersionedReference getElementId() {
    return elementId;
  }

  public void setElementId(VersionedReference elementId) {
    this.elementId = elementId;
  }

  public HierarchyElementReference demandTable(List<@Valid DemandTable> demandTable) {
    this.demandTable = demandTable;
    return this;
  }

  public HierarchyElementReference addDemandTableItem(DemandTable demandTableItem) {
    if (this.demandTable == null) {
      this.demandTable = new ArrayList<>();
    }
    this.demandTable.add(demandTableItem);
    return this;
  }

  /**
   * Get demandTable
   * @return demandTable
  */
  @Valid 
  @Schema(name = "demandTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demandTable")
  public List<@Valid DemandTable> getDemandTable() {
    return demandTable;
  }

  public void setDemandTable(List<@Valid DemandTable> demandTable) {
    this.demandTable = demandTable;
  }

  public HierarchyElementReference supply(List<@Valid Supply> supply) {
    this.supply = supply;
    return this;
  }

  public HierarchyElementReference addSupplyItem(Supply supplyItem) {
    if (this.supply == null) {
      this.supply = new ArrayList<>();
    }
    this.supply.add(supplyItem);
    return this;
  }

  /**
   * Get supply
   * @return supply
  */
  @Valid 
  @Schema(name = "supply", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supply")
  public List<@Valid Supply> getSupply() {
    return supply;
  }

  public void setSupply(List<@Valid Supply> supply) {
    this.supply = supply;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyElementReference hierarchyElementReference = (HierarchyElementReference) o;
    return Objects.equals(this.elementId, hierarchyElementReference.elementId) &&
        Objects.equals(this.demandTable, hierarchyElementReference.demandTable) &&
        Objects.equals(this.supply, hierarchyElementReference.supply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementId, demandTable, supply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyElementReference {\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    demandTable: ").append(toIndentedString(demandTable)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
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


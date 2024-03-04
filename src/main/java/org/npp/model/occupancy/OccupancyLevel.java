package org.npp.model.occupancy;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.ReferencedCodeListEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Defines an occupancy level as specified by the data supplier.
 */

@Schema(name = "OccupancyLevel", description = "Defines an occupancy level as specified by the data supplier.")

public class OccupancyLevel {

  private ReferencedCodeListEntry occupancyIndicator;

  public OccupancyLevel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OccupancyLevel(ReferencedCodeListEntry occupancyIndicator) {
    this.occupancyIndicator = occupancyIndicator;
  }

  public OccupancyLevel occupancyIndicator(ReferencedCodeListEntry occupancyIndicator) {
    this.occupancyIndicator = occupancyIndicator;
    return this;
  }

  /**
   * Get occupancyIndicator
   * @return occupancyIndicator
  */
  @NotNull @Valid 
  @Schema(name = "occupancyIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("occupancyIndicator")
  public ReferencedCodeListEntry getOccupancyIndicator() {
    return occupancyIndicator;
  }

  public void setOccupancyIndicator(ReferencedCodeListEntry occupancyIndicator) {
    this.occupancyIndicator = occupancyIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccupancyLevel occupancyLevel = (OccupancyLevel) o;
    return Objects.equals(this.occupancyIndicator, occupancyLevel.occupancyIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occupancyIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccupancyLevel {\n");
    sb.append("    occupancyIndicator: ").append(toIndentedString(occupancyIndicator)).append("\n");
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


package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.place.enums.AccessLaneTypeEnum;
import org.npp.model.time.EntranceOpenTime;
import org.npp.model.time.ExitOpenTime;
import org.npp.model.place.characteristics.MaximumDimensions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A specialisation of an &#x60;identifiedArea&#x60; defining &#x60;VehicularAccess&#x60; areas.  Defines the sequence and nature of a specific entrance or exit lane.
 */

@Schema(name = "AccessLaneSpecific", description = "A specialisation of an `identifiedArea` defining `VehicularAccess` areas.  Defines the sequence and nature of a specific entrance or exit lane.")

public class AccessLaneSpecific {

  private AccessLaneTypeEnum laneType;

  private Integer sequenceNumber;

  private EntranceOpenTime entranceOpenTimeLaneSpecific;

  private ExitOpenTime exitOpenTimeLaneSpecific;

  private MaximumDimensions maxDimForSpecificLane;

  public AccessLaneSpecific() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccessLaneSpecific(AccessLaneTypeEnum laneType, Integer sequenceNumber) {
    this.laneType = laneType;
    this.sequenceNumber = sequenceNumber;
  }

  public AccessLaneSpecific laneType(AccessLaneTypeEnum laneType) {
    this.laneType = laneType;
    return this;
  }

  /**
   * Get laneType
   * @return laneType
  */
  @NotNull @Valid 
  @Schema(name = "laneType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("laneType")
  public AccessLaneTypeEnum getLaneType() {
    return laneType;
  }

  public void setLaneType(AccessLaneTypeEnum laneType) {
    this.laneType = laneType;
  }

  public AccessLaneSpecific sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Defines a unique sequence number for this specific lane within the identifiedArea. No specific method of numbering is defined.  Preferred practice numbers lanes from right to left as seen in-bound into the parking facility.
   * minimum: 0
   * @return sequenceNumber
  */
  @NotNull @Min(0) 
  @Schema(name = "sequenceNumber", description = "Defines a unique sequence number for this specific lane within the identifiedArea. No specific method of numbering is defined.  Preferred practice numbers lanes from right to left as seen in-bound into the parking facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sequenceNumber")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public AccessLaneSpecific entranceOpenTimeLaneSpecific(EntranceOpenTime entranceOpenTimeLaneSpecific) {
    this.entranceOpenTimeLaneSpecific = entranceOpenTimeLaneSpecific;
    return this;
  }

  /**
   * Get entranceOpenTimeLaneSpecific
   * @return entranceOpenTimeLaneSpecific
  */
  @Valid 
  @Schema(name = "entranceOpenTimeLaneSpecific", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entranceOpenTimeLaneSpecific")
  public EntranceOpenTime getEntranceOpenTimeLaneSpecific() {
    return entranceOpenTimeLaneSpecific;
  }

  public void setEntranceOpenTimeLaneSpecific(EntranceOpenTime entranceOpenTimeLaneSpecific) {
    this.entranceOpenTimeLaneSpecific = entranceOpenTimeLaneSpecific;
  }

  public AccessLaneSpecific exitOpenTimeLaneSpecific(ExitOpenTime exitOpenTimeLaneSpecific) {
    this.exitOpenTimeLaneSpecific = exitOpenTimeLaneSpecific;
    return this;
  }

  /**
   * Get exitOpenTimeLaneSpecific
   * @return exitOpenTimeLaneSpecific
  */
  @Valid 
  @Schema(name = "exitOpenTimeLaneSpecific", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exitOpenTimeLaneSpecific")
  public ExitOpenTime getExitOpenTimeLaneSpecific() {
    return exitOpenTimeLaneSpecific;
  }

  public void setExitOpenTimeLaneSpecific(ExitOpenTime exitOpenTimeLaneSpecific) {
    this.exitOpenTimeLaneSpecific = exitOpenTimeLaneSpecific;
  }

  public AccessLaneSpecific maxDimForSpecificLane(MaximumDimensions maxDimForSpecificLane) {
    this.maxDimForSpecificLane = maxDimForSpecificLane;
    return this;
  }

  /**
   * Get maxDimForSpecificLane
   * @return maxDimForSpecificLane
  */
  @Valid 
  @Schema(name = "maxDimForSpecificLane", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxDimForSpecificLane")
  public MaximumDimensions getMaxDimForSpecificLane() {
    return maxDimForSpecificLane;
  }

  public void setMaxDimForSpecificLane(MaximumDimensions maxDimForSpecificLane) {
    this.maxDimForSpecificLane = maxDimForSpecificLane;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessLaneSpecific accessLaneSpecific = (AccessLaneSpecific) o;
    return Objects.equals(this.laneType, accessLaneSpecific.laneType) &&
        Objects.equals(this.sequenceNumber, accessLaneSpecific.sequenceNumber) &&
        Objects.equals(this.entranceOpenTimeLaneSpecific, accessLaneSpecific.entranceOpenTimeLaneSpecific) &&
        Objects.equals(this.exitOpenTimeLaneSpecific, accessLaneSpecific.exitOpenTimeLaneSpecific) &&
        Objects.equals(this.maxDimForSpecificLane, accessLaneSpecific.maxDimForSpecificLane);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laneType, sequenceNumber, entranceOpenTimeLaneSpecific, exitOpenTimeLaneSpecific, maxDimForSpecificLane);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessLaneSpecific {\n");
    sb.append("    laneType: ").append(toIndentedString(laneType)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    entranceOpenTimeLaneSpecific: ").append(toIndentedString(entranceOpenTimeLaneSpecific)).append("\n");
    sb.append("    exitOpenTimeLaneSpecific: ").append(toIndentedString(exitOpenTimeLaneSpecific)).append("\n");
    sb.append("    maxDimForSpecificLane: ").append(toIndentedString(maxDimForSpecificLane)).append("\n");
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


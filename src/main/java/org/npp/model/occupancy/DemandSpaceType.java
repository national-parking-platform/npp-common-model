package org.npp.model.occupancy;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.npp.model.occupancy.OccupancyLevel;
import org.npp.model.common.Reference;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Identifies when a space was occupied and for how long.
 */

@Schema(name = "DemandSpaceType", description = "Identifies when a space was occupied and for how long.")

public class DemandSpaceType {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime detectionUpdateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occupancyEstimatedStartTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occupancyEstimatedEndTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occupancyStartTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occupancyEndTime;

  private Reference spaceId;

  private OccupancyLevel occupancyLevel;

  public DemandSpaceType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DemandSpaceType(OffsetDateTime detectionUpdateTime) {
    this.detectionUpdateTime = detectionUpdateTime;
  }

  public DemandSpaceType detectionUpdateTime(OffsetDateTime detectionUpdateTime) {
    this.detectionUpdateTime = detectionUpdateTime;
    return this;
  }

  /**
   * Time of update, from detector.
   * @return detectionUpdateTime
  */
  @NotNull @Valid 
  @Schema(name = "detectionUpdateTime", description = "Time of update, from detector.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectionUpdateTime")
  public OffsetDateTime getDetectionUpdateTime() {
    return detectionUpdateTime;
  }

  public void setDetectionUpdateTime(OffsetDateTime detectionUpdateTime) {
    this.detectionUpdateTime = detectionUpdateTime;
  }

  public DemandSpaceType occupancyEstimatedStartTime(OffsetDateTime occupancyEstimatedStartTime) {
    this.occupancyEstimatedStartTime = occupancyEstimatedStartTime;
    return this;
  }

  /**
   * The estimated time a space is expected to be occupied.
   * @return occupancyEstimatedStartTime
  */
  @Valid 
  @Schema(name = "occupancyEstimatedStartTime", description = "The estimated time a space is expected to be occupied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupancyEstimatedStartTime")
  public OffsetDateTime getOccupancyEstimatedStartTime() {
    return occupancyEstimatedStartTime;
  }

  public void setOccupancyEstimatedStartTime(OffsetDateTime occupancyEstimatedStartTime) {
    this.occupancyEstimatedStartTime = occupancyEstimatedStartTime;
  }

  public DemandSpaceType occupancyEstimatedEndTime(OffsetDateTime occupancyEstimatedEndTime) {
    this.occupancyEstimatedEndTime = occupancyEstimatedEndTime;
    return this;
  }

  /**
   * The estimated time a space is expected to be vacated.
   * @return occupancyEstimatedEndTime
  */
  @Valid 
  @Schema(name = "occupancyEstimatedEndTime", description = "The estimated time a space is expected to be vacated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupancyEstimatedEndTime")
  public OffsetDateTime getOccupancyEstimatedEndTime() {
    return occupancyEstimatedEndTime;
  }

  public void setOccupancyEstimatedEndTime(OffsetDateTime occupancyEstimatedEndTime) {
    this.occupancyEstimatedEndTime = occupancyEstimatedEndTime;
  }

  public DemandSpaceType occupancyStartTime(OffsetDateTime occupancyStartTime) {
    this.occupancyStartTime = occupancyStartTime;
    return this;
  }

  /**
   * The actual time space is occupied
   * @return occupancyStartTime
  */
  @Valid 
  @Schema(name = "occupancyStartTime", description = "The actual time space is occupied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupancyStartTime")
  public OffsetDateTime getOccupancyStartTime() {
    return occupancyStartTime;
  }

  public void setOccupancyStartTime(OffsetDateTime occupancyStartTime) {
    this.occupancyStartTime = occupancyStartTime;
  }

  public DemandSpaceType occupancyEndTime(OffsetDateTime occupancyEndTime) {
    this.occupancyEndTime = occupancyEndTime;
    return this;
  }

  /**
   * The actual time space is vacated.
   * @return occupancyEndTime
  */
  @Valid 
  @Schema(name = "occupancyEndTime", description = "The actual time space is vacated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupancyEndTime")
  public OffsetDateTime getOccupancyEndTime() {
    return occupancyEndTime;
  }

  public void setOccupancyEndTime(OffsetDateTime occupancyEndTime) {
    this.occupancyEndTime = occupancyEndTime;
  }

  public DemandSpaceType spaceId(Reference spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
  */
  @Valid 
  @Schema(name = "spaceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spaceId")
  public Reference getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Reference spaceId) {
    this.spaceId = spaceId;
  }

  public DemandSpaceType occupancyLevel(OccupancyLevel occupancyLevel) {
    this.occupancyLevel = occupancyLevel;
    return this;
  }

  /**
   * Get occupancyLevel
   * @return occupancyLevel
  */
  @Valid 
  @Schema(name = "occupancyLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupancyLevel")
  public OccupancyLevel getOccupancyLevel() {
    return occupancyLevel;
  }

  public void setOccupancyLevel(OccupancyLevel occupancyLevel) {
    this.occupancyLevel = occupancyLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandSpaceType demandSpaceType = (DemandSpaceType) o;
    return Objects.equals(this.detectionUpdateTime, demandSpaceType.detectionUpdateTime) &&
        Objects.equals(this.occupancyEstimatedStartTime, demandSpaceType.occupancyEstimatedStartTime) &&
        Objects.equals(this.occupancyEstimatedEndTime, demandSpaceType.occupancyEstimatedEndTime) &&
        Objects.equals(this.occupancyStartTime, demandSpaceType.occupancyStartTime) &&
        Objects.equals(this.occupancyEndTime, demandSpaceType.occupancyEndTime) &&
        Objects.equals(this.spaceId, demandSpaceType.spaceId) &&
        Objects.equals(this.occupancyLevel, demandSpaceType.occupancyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectionUpdateTime, occupancyEstimatedStartTime, occupancyEstimatedEndTime, occupancyStartTime, occupancyEndTime, spaceId, occupancyLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandSpaceType {\n");
    sb.append("    detectionUpdateTime: ").append(toIndentedString(detectionUpdateTime)).append("\n");
    sb.append("    occupancyEstimatedStartTime: ").append(toIndentedString(occupancyEstimatedStartTime)).append("\n");
    sb.append("    occupancyEstimatedEndTime: ").append(toIndentedString(occupancyEstimatedEndTime)).append("\n");
    sb.append("    occupancyStartTime: ").append(toIndentedString(occupancyStartTime)).append("\n");
    sb.append("    occupancyEndTime: ").append(toIndentedString(occupancyEndTime)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    occupancyLevel: ").append(toIndentedString(occupancyLevel)).append("\n");
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


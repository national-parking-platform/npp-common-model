package org.npp.model.occupancy;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.occupancy.DemandSpaceType;
import org.npp.model.occupancy.DemandType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Table structure which defines the parameters of reporting actual usage of parking in a Hierarchy Element
 */

@Schema(name = "DemandTable", description = "Table structure which defines the parameters of reporting actual usage of parking in a Hierarchy Element")

public class DemandTable {

  private String frequency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @Valid
  private List<@Valid DemandType> demandType;

  @Valid
  private List<@Valid DemandSpaceType> demandSpaceType;

  public DemandTable frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].
   * @return frequency
  */
  @Pattern(regexp = "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?(T(?=\\d)(\\d+H)?(\\d+M)?(\\d+S)?)?$") 
  @Schema(name = "frequency", example = "P1Y2M3DT4H5M6S", description = "ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public DemandTable timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp when the demand table data was compiled.
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", description = "Timestamp when the demand table data was compiled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public DemandTable demandType(List<@Valid DemandType> demandType) {
    this.demandType = demandType;
    return this;
  }

  public DemandTable addDemandTypeItem(DemandType demandTypeItem) {
    if (this.demandType == null) {
      this.demandType = new ArrayList<>();
    }
    this.demandType.add(demandTypeItem);
    return this;
  }

  /**
   * Occupancy for area
   * @return demandType
  */
  @Valid 
  @Schema(name = "demandType", description = "Occupancy for area", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demandType")
  public List<@Valid DemandType> getDemandType() {
    return demandType;
  }

  public void setDemandType(List<@Valid DemandType> demandType) {
    this.demandType = demandType;
  }

  public DemandTable demandSpaceType(List<@Valid DemandSpaceType> demandSpaceType) {
    this.demandSpaceType = demandSpaceType;
    return this;
  }

  public DemandTable addDemandSpaceTypeItem(DemandSpaceType demandSpaceTypeItem) {
    if (this.demandSpaceType == null) {
      this.demandSpaceType = new ArrayList<>();
    }
    this.demandSpaceType.add(demandSpaceTypeItem);
    return this;
  }

  /**
   * Occupancy for single spaces
   * @return demandSpaceType
  */
  @Valid 
  @Schema(name = "demandSpaceType", description = "Occupancy for single spaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demandSpaceType")
  public List<@Valid DemandSpaceType> getDemandSpaceType() {
    return demandSpaceType;
  }

  public void setDemandSpaceType(List<@Valid DemandSpaceType> demandSpaceType) {
    this.demandSpaceType = demandSpaceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandTable demandTable = (DemandTable) o;
    return Objects.equals(this.frequency, demandTable.frequency) &&
        Objects.equals(this.timestamp, demandTable.timestamp) &&
        Objects.equals(this.demandType, demandTable.demandType) &&
        Objects.equals(this.demandSpaceType, demandTable.demandSpaceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, timestamp, demandType, demandSpaceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandTable {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    demandType: ").append(toIndentedString(demandType)).append("\n");
    sb.append("    demandSpaceType: ").append(toIndentedString(demandSpaceType)).append("\n");
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


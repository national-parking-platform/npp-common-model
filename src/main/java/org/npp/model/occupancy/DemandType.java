package org.npp.model.occupancy;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.npp.model.occupancy.enums.CalculationTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * This table is dedicated to reporting on actual occupancy in an area.
 */

@Schema(name = "DemandType", description = "This table is dedicated to reporting on actual occupancy in an area.")

public class DemandType {

  private Integer count;

  private CalculationTypeEnum occupancyCalculation;

  private Float percentage;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime recordDateTime;

  public DemandType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DemandType(OffsetDateTime recordDateTime) {
    this.recordDateTime = recordDateTime;
  }

  public DemandType count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of occupied spaces.
   * minimum: 0
   * @return count
  */
  @Min(0) 
  @Schema(name = "count", description = "Number of occupied spaces.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DemandType occupancyCalculation(CalculationTypeEnum occupancyCalculation) {
    this.occupancyCalculation = occupancyCalculation;
    return this;
  }

  /**
   * Get occupancyCalculation
   * @return occupancyCalculation
  */
  @Valid 
  @Schema(name = "occupancyCalculation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupancyCalculation")
  public CalculationTypeEnum getOccupancyCalculation() {
    return occupancyCalculation;
  }

  public void setOccupancyCalculation(CalculationTypeEnum occupancyCalculation) {
    this.occupancyCalculation = occupancyCalculation;
  }

  public DemandType percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percent of spaces occupied.
   * minimum: 0
   * maximum: 100
   * @return percentage
  */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "percentage", description = "Percent of spaces occupied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public DemandType recordDateTime(OffsetDateTime recordDateTime) {
    this.recordDateTime = recordDateTime;
    return this;
  }

  /**
   * When data in the record was compiled.
   * @return recordDateTime
  */
  @NotNull @Valid 
  @Schema(name = "recordDateTime", description = "When data in the record was compiled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recordDateTime")
  public OffsetDateTime getRecordDateTime() {
    return recordDateTime;
  }

  public void setRecordDateTime(OffsetDateTime recordDateTime) {
    this.recordDateTime = recordDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandType demandType = (DemandType) o;
    return Objects.equals(this.count, demandType.count) &&
        Objects.equals(this.occupancyCalculation, demandType.occupancyCalculation) &&
        Objects.equals(this.percentage, demandType.percentage) &&
        Objects.equals(this.recordDateTime, demandType.recordDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, occupancyCalculation, percentage, recordDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandType {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    occupancyCalculation: ").append(toIndentedString(occupancyCalculation)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    recordDateTime: ").append(toIndentedString(recordDateTime)).append("\n");
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


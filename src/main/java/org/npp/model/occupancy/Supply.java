package org.npp.model.occupancy;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.npp.model.occupancy.enums.SupplyViewTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining concepts relating the parameters of the supply of parking.  This is the total number of spaces usable for parking or other mobility operations.  It can be defined as demarcated spaces or non-demarcated.
 */

@Schema(name = "Supply", description = "A class defining concepts relating the parameters of the supply of parking.  This is the total number of spaces usable for parking or other mobility operations.  It can be defined as demarcated spaces or non-demarcated.")

public class Supply {

  private SupplyViewTypeEnum supplyViewType;

  private Integer supplyQuantity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime supplyValidityStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime supplyValidityEnd;

  public Supply() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Supply(SupplyViewTypeEnum supplyViewType, Integer supplyQuantity) {
    this.supplyViewType = supplyViewType;
    this.supplyQuantity = supplyQuantity;
  }

  public Supply supplyViewType(SupplyViewTypeEnum supplyViewType) {
    this.supplyViewType = supplyViewType;
    return this;
  }

  /**
   * Get supplyViewType
   * @return supplyViewType
  */
  @NotNull @Valid 
  @Schema(name = "supplyViewType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supplyViewType")
  public SupplyViewTypeEnum getSupplyViewType() {
    return supplyViewType;
  }

  public void setSupplyViewType(SupplyViewTypeEnum supplyViewType) {
    this.supplyViewType = supplyViewType;
  }

  public Supply supplyQuantity(Integer supplyQuantity) {
    this.supplyQuantity = supplyQuantity;
    return this;
  }

  /**
   * Indicates the numeric value of available parking or other space uses.
   * @return supplyQuantity
  */
  @NotNull 
  @Schema(name = "supplyQuantity", description = "Indicates the numeric value of available parking or other space uses.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supplyQuantity")
  public Integer getSupplyQuantity() {
    return supplyQuantity;
  }

  public void setSupplyQuantity(Integer supplyQuantity) {
    this.supplyQuantity = supplyQuantity;
  }

  public Supply supplyValidityStart(OffsetDateTime supplyValidityStart) {
    this.supplyValidityStart = supplyValidityStart;
    return this;
  }

  /**
   * Valid start date/time for the supply
   * @return supplyValidityStart
  */
  @Valid 
  @Schema(name = "supplyValidityStart", description = "Valid start date/time for the supply", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplyValidityStart")
  public OffsetDateTime getSupplyValidityStart() {
    return supplyValidityStart;
  }

  public void setSupplyValidityStart(OffsetDateTime supplyValidityStart) {
    this.supplyValidityStart = supplyValidityStart;
  }

  public Supply supplyValidityEnd(OffsetDateTime supplyValidityEnd) {
    this.supplyValidityEnd = supplyValidityEnd;
    return this;
  }

  /**
   * Valid end date/time for the supply
   * @return supplyValidityEnd
  */
  @Valid 
  @Schema(name = "supplyValidityEnd", description = "Valid end date/time for the supply", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplyValidityEnd")
  public OffsetDateTime getSupplyValidityEnd() {
    return supplyValidityEnd;
  }

  public void setSupplyValidityEnd(OffsetDateTime supplyValidityEnd) {
    this.supplyValidityEnd = supplyValidityEnd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supply supply = (Supply) o;
    return Objects.equals(this.supplyViewType, supply.supplyViewType) &&
        Objects.equals(this.supplyQuantity, supply.supplyQuantity) &&
        Objects.equals(this.supplyValidityStart, supply.supplyValidityStart) &&
        Objects.equals(this.supplyValidityEnd, supply.supplyValidityEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplyViewType, supplyQuantity, supplyValidityStart, supplyValidityEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supply {\n");
    sb.append("    supplyViewType: ").append(toIndentedString(supplyViewType)).append("\n");
    sb.append("    supplyQuantity: ").append(toIndentedString(supplyQuantity)).append("\n");
    sb.append("    supplyValidityStart: ").append(toIndentedString(supplyValidityStart)).append("\n");
    sb.append("    supplyValidityEnd: ").append(toIndentedString(supplyValidityEnd)).append("\n");
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


package org.npp.model.vehicle;
  
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
 * Class defining load types carried by vehicles.
 */

@Schema(name = "VehicleLoad", description = "Class defining load types carried by vehicles.")

public class VehicleLoad {

  private ReferencedCodeListEntry loadType;

  public VehicleLoad() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleLoad(ReferencedCodeListEntry loadType) {
    this.loadType = loadType;
  }

  public VehicleLoad loadType(ReferencedCodeListEntry loadType) {
    this.loadType = loadType;
    return this;
  }

  /**
   * Get loadType
   * @return loadType
  */
  @NotNull @Valid 
  @Schema(name = "loadType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("loadType")
  public ReferencedCodeListEntry getLoadType() {
    return loadType;
  }

  public void setLoadType(ReferencedCodeListEntry loadType) {
    this.loadType = loadType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleLoad vehicleLoad = (VehicleLoad) o;
    return Objects.equals(this.loadType, vehicleLoad.loadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleLoad {\n");
    sb.append("    loadType: ").append(toIndentedString(loadType)).append("\n");
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


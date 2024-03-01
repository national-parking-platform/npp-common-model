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
 * Class supporting the definition of user group characteristics.
 */

@Schema(name = "VehicleType", description = "Class supporting the definition of user group characteristics.")

public class VehicleType {

  private ReferencedCodeListEntry vehicleType;

  public VehicleType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleType(ReferencedCodeListEntry vehicleType) {
    this.vehicleType = vehicleType;
  }

  public VehicleType vehicleType(ReferencedCodeListEntry vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  /**
   * Get vehicleType
   * @return vehicleType
  */
  @NotNull @Valid 
  @Schema(name = "vehicleType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleType")
  public ReferencedCodeListEntry getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(ReferencedCodeListEntry vehicleType) {
    this.vehicleType = vehicleType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleType vehicleType = (VehicleType) o;
    return Objects.equals(this.vehicleType, vehicleType.vehicleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
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


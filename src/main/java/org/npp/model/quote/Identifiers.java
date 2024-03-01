package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class containing information referencing one rateTable and one related rightSpecification
 */

@Schema(name = "Identifiers", description = "Class containing information referencing one rateTable and one related rightSpecification")

public class Identifiers {

  private VersionedReference rateTableId;

  private VersionedReference rightSpecificationId;

  public Identifiers() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Identifiers(VersionedReference rateTableId, VersionedReference rightSpecificationId) {
    this.rateTableId = rateTableId;
    this.rightSpecificationId = rightSpecificationId;
  }

  public Identifiers rateTableId(VersionedReference rateTableId) {
    this.rateTableId = rateTableId;
    return this;
  }

  /**
   * Get rateTableId
   * @return rateTableId
  */
  @NotNull @Valid 
  @Schema(name = "rateTableId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rateTableId")
  public VersionedReference getRateTableId() {
    return rateTableId;
  }

  public void setRateTableId(VersionedReference rateTableId) {
    this.rateTableId = rateTableId;
  }

  public Identifiers rightSpecificationId(VersionedReference rightSpecificationId) {
    this.rightSpecificationId = rightSpecificationId;
    return this;
  }

  /**
   * Get rightSpecificationId
   * @return rightSpecificationId
  */
  @NotNull @Valid 
  @Schema(name = "rightSpecificationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rightSpecificationId")
  public VersionedReference getRightSpecificationId() {
    return rightSpecificationId;
  }

  public void setRightSpecificationId(VersionedReference rightSpecificationId) {
    this.rightSpecificationId = rightSpecificationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identifiers identifiers = (Identifiers) o;
    return Objects.equals(this.rateTableId, identifiers.rateTableId) &&
        Objects.equals(this.rightSpecificationId, identifiers.rightSpecificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateTableId, rightSpecificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identifiers {\n");
    sb.append("    rateTableId: ").append(toIndentedString(rateTableId)).append("\n");
    sb.append("    rightSpecificationId: ").append(toIndentedString(rightSpecificationId)).append("\n");
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


package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.eligibility.Eligibility;
import org.npp.model.right.RateDiscount;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Defines the combination of Eligibility requirements with RateTables and associates this combination to a RightSpecification.
 */

@Schema(name = "RateEligibility", description = "Defines the combination of Eligibility requirements with RateTables and associates this combination to a RightSpecification.")

public class RateEligibility {

  private String id;

  private Integer version;

  private Integer priority;

  private Boolean combinable;

  private Eligibility eligibility;

  private VersionedReference rateTable;

  private RateDiscount rateDiscount;

  public RateEligibility() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateEligibility(String id, Integer version, Eligibility eligibility) {
    this.id = id;
    this.version = version;
    this.eligibility = eligibility;
  }

  public RateEligibility id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for object.
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Unique identifier for object.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RateEligibility version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Positive integer representing the object version.
   * minimum: 1
   * @return version
  */
  @NotNull @Min(1) 
  @Schema(name = "version", description = "Positive integer representing the object version.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public RateEligibility priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * An integer value, starting at 1, indicating the order in which multiple relevant RateTables shall be considered, with 1 being the highest priority.
   * minimum: 1
   * @return priority
  */
  @Min(1) 
  @Schema(name = "priority", description = "An integer value, starting at 1, indicating the order in which multiple relevant RateTables shall be considered, with 1 being the highest priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public RateEligibility combinable(Boolean combinable) {
    this.combinable = combinable;
    return this;
  }

  /**
   * Boolean attribute that indicates (TRUE) if all `RateTables` associated to a `RightSpecification` with  a common `Eligibility` can be combined to establish a lowest cost tariff or (FALSE) they cannot be combined.
   * @return combinable
  */
  
  @Schema(name = "combinable", description = "Boolean attribute that indicates (TRUE) if all `RateTables` associated to a `RightSpecification` with  a common `Eligibility` can be combined to establish a lowest cost tariff or (FALSE) they cannot be combined.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("combinable")
  public Boolean getCombinable() {
    return combinable;
  }

  public void setCombinable(Boolean combinable) {
    this.combinable = combinable;
  }

  public RateEligibility eligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  */
  @NotNull @Valid 
  @Schema(name = "eligibility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eligibility")
  public Eligibility getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
  }

  public RateEligibility rateTable(VersionedReference rateTable) {
    this.rateTable = rateTable;
    return this;
  }

  /**
   * Get rateTable
   * @return rateTable
  */
  @Valid 
  @Schema(name = "rateTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateTable")
  public VersionedReference getRateTable() {
    return rateTable;
  }

  public void setRateTable(VersionedReference rateTable) {
    this.rateTable = rateTable;
  }

  public RateEligibility rateDiscount(RateDiscount rateDiscount) {
    this.rateDiscount = rateDiscount;
    return this;
  }

  /**
   * Get rateDiscount
   * @return rateDiscount
  */
  @Valid 
  @Schema(name = "rateDiscount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateDiscount")
  public RateDiscount getRateDiscount() {
    return rateDiscount;
  }

  public void setRateDiscount(RateDiscount rateDiscount) {
    this.rateDiscount = rateDiscount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateEligibility rateEligibility = (RateEligibility) o;
    return Objects.equals(this.id, rateEligibility.id) &&
        Objects.equals(this.version, rateEligibility.version) &&
        Objects.equals(this.priority, rateEligibility.priority) &&
        Objects.equals(this.combinable, rateEligibility.combinable) &&
        Objects.equals(this.eligibility, rateEligibility.eligibility) &&
        Objects.equals(this.rateTable, rateEligibility.rateTable) &&
        Objects.equals(this.rateDiscount, rateEligibility.rateDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, priority, combinable, eligibility, rateTable, rateDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateEligibility {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    combinable: ").append(toIndentedString(combinable)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    rateTable: ").append(toIndentedString(rateTable)).append("\n");
    sb.append("    rateDiscount: ").append(toIndentedString(rateDiscount)).append("\n");
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


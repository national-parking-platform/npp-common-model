package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.right.RelativeValidity;
import org.npp.model.time.Validity;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * RightPool
 */


public class RightPool {

  private String id;

  private Integer version;

  private VersionedReference assignedRightsIssuer;

  private Integer availableAssignedRights;

  private Integer distributedAssignedRights;

  private Integer qtyRelation;

  private RelativeValidity relativeValidity;

  private Validity validity;

  public RightPool() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RightPool(String id, Integer version, VersionedReference assignedRightsIssuer, Integer availableAssignedRights, Integer distributedAssignedRights) {
    this.id = id;
    this.version = version;
    this.assignedRightsIssuer = assignedRightsIssuer;
    this.availableAssignedRights = availableAssignedRights;
    this.distributedAssignedRights = distributedAssignedRights;
  }

  public RightPool id(String id) {
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

  public RightPool version(Integer version) {
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

  public RightPool assignedRightsIssuer(VersionedReference assignedRightsIssuer) {
    this.assignedRightsIssuer = assignedRightsIssuer;
    return this;
  }

  /**
   * Get assignedRightsIssuer
   * @return assignedRightsIssuer
  */
  @NotNull @Valid 
  @Schema(name = "assignedRightsIssuer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedRightsIssuer")
  public VersionedReference getAssignedRightsIssuer() {
    return assignedRightsIssuer;
  }

  public void setAssignedRightsIssuer(VersionedReference assignedRightsIssuer) {
    this.assignedRightsIssuer = assignedRightsIssuer;
  }

  public RightPool availableAssignedRights(Integer availableAssignedRights) {
    this.availableAssignedRights = availableAssignedRights;
    return this;
  }

  /**
   * The number of Assigned Rights that have been issued by the Rights creator to a specific Rights Issuer  that are still available to be assigned.
   * @return availableAssignedRights
  */
  @NotNull 
  @Schema(name = "availableAssignedRights", description = "The number of Assigned Rights that have been issued by the Rights creator to a specific Rights Issuer  that are still available to be assigned.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availableAssignedRights")
  public Integer getAvailableAssignedRights() {
    return availableAssignedRights;
  }

  public void setAvailableAssignedRights(Integer availableAssignedRights) {
    this.availableAssignedRights = availableAssignedRights;
  }

  public RightPool distributedAssignedRights(Integer distributedAssignedRights) {
    this.distributedAssignedRights = distributedAssignedRights;
    return this;
  }

  /**
   * The number of Assigned Rights that have been issued by the Rights creator to a specific Rights Issuer.
   * @return distributedAssignedRights
  */
  @NotNull 
  @Schema(name = "distributedAssignedRights", description = "The number of Assigned Rights that have been issued by the Rights creator to a specific Rights Issuer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("distributedAssignedRights")
  public Integer getDistributedAssignedRights() {
    return distributedAssignedRights;
  }

  public void setDistributedAssignedRights(Integer distributedAssignedRights) {
    this.distributedAssignedRights = distributedAssignedRights;
  }

  public RightPool qtyRelation(Integer qtyRelation) {
    this.qtyRelation = qtyRelation;
    return this;
  }

  /**
   * An integer defining the number of actions or parking included in a `RightSpecification`.
   * @return qtyRelation
  */
  
  @Schema(name = "qtyRelation", description = "An integer defining the number of actions or parking included in a `RightSpecification`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qtyRelation")
  public Integer getQtyRelation() {
    return qtyRelation;
  }

  public void setQtyRelation(Integer qtyRelation) {
    this.qtyRelation = qtyRelation;
  }

  public RightPool relativeValidity(RelativeValidity relativeValidity) {
    this.relativeValidity = relativeValidity;
    return this;
  }

  /**
   * Get relativeValidity
   * @return relativeValidity
  */
  @Valid 
  @Schema(name = "relativeValidity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relativeValidity")
  public RelativeValidity getRelativeValidity() {
    return relativeValidity;
  }

  public void setRelativeValidity(RelativeValidity relativeValidity) {
    this.relativeValidity = relativeValidity;
  }

  public RightPool validity(Validity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
  */
  @Valid 
  @Schema(name = "validity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validity")
  public Validity getValidity() {
    return validity;
  }

  public void setValidity(Validity validity) {
    this.validity = validity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RightPool rightPool = (RightPool) o;
    return Objects.equals(this.id, rightPool.id) &&
        Objects.equals(this.version, rightPool.version) &&
        Objects.equals(this.assignedRightsIssuer, rightPool.assignedRightsIssuer) &&
        Objects.equals(this.availableAssignedRights, rightPool.availableAssignedRights) &&
        Objects.equals(this.distributedAssignedRights, rightPool.distributedAssignedRights) &&
        Objects.equals(this.qtyRelation, rightPool.qtyRelation) &&
        Objects.equals(this.relativeValidity, rightPool.relativeValidity) &&
        Objects.equals(this.validity, rightPool.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, assignedRightsIssuer, availableAssignedRights, distributedAssignedRights, qtyRelation, relativeValidity, validity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightPool {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    assignedRightsIssuer: ").append(toIndentedString(assignedRightsIssuer)).append("\n");
    sb.append("    availableAssignedRights: ").append(toIndentedString(availableAssignedRights)).append("\n");
    sb.append("    distributedAssignedRights: ").append(toIndentedString(distributedAssignedRights)).append("\n");
    sb.append("    qtyRelation: ").append(toIndentedString(qtyRelation)).append("\n");
    sb.append("    relativeValidity: ").append(toIndentedString(relativeValidity)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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


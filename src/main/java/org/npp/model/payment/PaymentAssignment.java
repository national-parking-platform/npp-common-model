package org.npp.model.payment;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.payment.Payment;
import org.npp.model.common.VersionedIdentity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Record of association of a payment to an AssignedRight.
 */

@Schema(name = "PaymentAssignment", description = "Record of association of a payment to an AssignedRight.")

public class PaymentAssignment {

  private String id;

  private Integer version;

  private String assignmentId;

  private VersionedIdentity assignedFrom;

  private VersionedIdentity assignedTo;

  private Payment payment;

  @Valid
  private List<@Valid VersionedIdentity> assignedRights = new ArrayList<>();

  public PaymentAssignment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentAssignment(String id, Integer version, String assignmentId, VersionedIdentity assignedFrom, VersionedIdentity assignedTo, Payment payment, List<@Valid VersionedIdentity> assignedRights) {
    this.id = id;
    this.version = version;
    this.assignmentId = assignmentId;
    this.assignedFrom = assignedFrom;
    this.assignedTo = assignedTo;
    this.payment = payment;
    this.assignedRights = assignedRights;
  }

  public PaymentAssignment id(String id) {
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

  public PaymentAssignment version(Integer version) {
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

  public PaymentAssignment assignmentId(String assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

  /**
   * Identifier for the association between AssignedRight and Payment.
   * @return assignmentId
  */
  @NotNull 
  @Schema(name = "assignmentId", description = "Identifier for the association between AssignedRight and Payment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignmentId")
  public String getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(String assignmentId) {
    this.assignmentId = assignmentId;
  }

  public PaymentAssignment assignedFrom(VersionedIdentity assignedFrom) {
    this.assignedFrom = assignedFrom;
    return this;
  }

  /**
   * Get assignedFrom
   * @return assignedFrom
  */
  @NotNull @Valid 
  @Schema(name = "assignedFrom", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedFrom")
  public VersionedIdentity getAssignedFrom() {
    return assignedFrom;
  }

  public void setAssignedFrom(VersionedIdentity assignedFrom) {
    this.assignedFrom = assignedFrom;
  }

  public PaymentAssignment assignedTo(VersionedIdentity assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Get assignedTo
   * @return assignedTo
  */
  @NotNull @Valid 
  @Schema(name = "assignedTo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedTo")
  public VersionedIdentity getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(VersionedIdentity assignedTo) {
    this.assignedTo = assignedTo;
  }

  public PaymentAssignment payment(Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @NotNull @Valid 
  @Schema(name = "payment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payment")
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public PaymentAssignment assignedRights(List<@Valid VersionedIdentity> assignedRights) {
    this.assignedRights = assignedRights;
    return this;
  }

  public PaymentAssignment addAssignedRightsItem(VersionedIdentity assignedRightsItem) {
    if (this.assignedRights == null) {
      this.assignedRights = new ArrayList<>();
    }
    this.assignedRights.add(assignedRightsItem);
    return this;
  }

  /**
   * The matrix of AssignedRight ids that constitute the aggregated funds disbursement.
   * @return assignedRights
  */
  @NotNull @Valid 
  @Schema(name = "assignedRights", description = "The matrix of AssignedRight ids that constitute the aggregated funds disbursement.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedRights")
  public List<@Valid VersionedIdentity> getAssignedRights() {
    return assignedRights;
  }

  public void setAssignedRights(List<@Valid VersionedIdentity> assignedRights) {
    this.assignedRights = assignedRights;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAssignment paymentAssignment = (PaymentAssignment) o;
    return Objects.equals(this.id, paymentAssignment.id) &&
        Objects.equals(this.version, paymentAssignment.version) &&
        Objects.equals(this.assignmentId, paymentAssignment.assignmentId) &&
        Objects.equals(this.assignedFrom, paymentAssignment.assignedFrom) &&
        Objects.equals(this.assignedTo, paymentAssignment.assignedTo) &&
        Objects.equals(this.payment, paymentAssignment.payment) &&
        Objects.equals(this.assignedRights, paymentAssignment.assignedRights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, assignmentId, assignedFrom, assignedTo, payment, assignedRights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    assignedFrom: ").append(toIndentedString(assignedFrom)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    assignedRights: ").append(toIndentedString(assignedRights)).append("\n");
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


package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.payment.AmountInCurrency;
import org.npp.model.right.enums.IssueMethodEnum;
import org.npp.model.right.MonetaryValue;
import org.npp.model.payment.Payment;
import org.npp.model.right.PlannedUse;
import org.npp.model.common.Reference;
import org.npp.model.right.RightHolder;
import org.npp.model.common.VersionedReference;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssignedRight indicates the granting of a specific RightSpecification to a specific RightHolder,  and indicates one instance of a planned use of the Right.
 */

@Schema(name = "AssignedRight", description = "AssignedRight indicates the granting of a specific RightSpecification to a specific RightHolder,  and indicates one instance of a planned use of the Right.")

public class AssignedRight {

  private String id;

  private Integer version;

  private RightHolder rightHolder;

  private VersionedReference rightSpecification;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiry;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime issuanceTime;

  private Reference assignedRightIssuer;

  private Integer instancesAvailable;

  private Integer instancesUsed;

  private Float minutesUsed;

  private Float minutesAvailable;

  private AmountInCurrency remainingValue;

  private Integer totalInstances;

  private Float totalMinutes;

  private AmountInCurrency totalRightValue;

  private IssueMethodEnum issueMethod;

  @Valid
  private List<@Valid PlannedUse> plannedUses;

  @Valid
  private List<@Valid Payment> payments;

  private MonetaryValue monetaryValue;

  public AssignedRight() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssignedRight(String id, Integer version, RightHolder rightHolder, VersionedReference rightSpecification) {
    this.id = id;
    this.version = version;
    this.rightHolder = rightHolder;
    this.rightSpecification = rightSpecification;
  }

  public AssignedRight id(String id) {
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

  public AssignedRight version(Integer version) {
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

  public AssignedRight rightHolder(RightHolder rightHolder) {
    this.rightHolder = rightHolder;
    return this;
  }

  /**
   * Get rightHolder
   * @return rightHolder
  */
  @NotNull @Valid 
  @Schema(name = "rightHolder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rightHolder")
  public RightHolder getRightHolder() {
    return rightHolder;
  }

  public void setRightHolder(RightHolder rightHolder) {
    this.rightHolder = rightHolder;
  }

  public AssignedRight rightSpecification(VersionedReference rightSpecification) {
    this.rightSpecification = rightSpecification;
    return this;
  }

  /**
   * Get rightSpecification
   * @return rightSpecification
  */
  @NotNull @Valid 
  @Schema(name = "rightSpecification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rightSpecification")
  public VersionedReference getRightSpecification() {
    return rightSpecification;
  }

  public void setRightSpecification(VersionedReference rightSpecification) {
    this.rightSpecification = rightSpecification;
  }

  public AssignedRight expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * The date/time when the specific AssignedRight expires, and is not longer available for use.
   * @return expiry
  */
  @Valid 
  @Schema(name = "expiry", description = "The date/time when the specific AssignedRight expires, and is not longer available for use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiry")
  public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public AssignedRight issuanceTime(OffsetDateTime issuanceTime) {
    this.issuanceTime = issuanceTime;
    return this;
  }

  /**
   * The date/time of the issuing of a specific AssignedRight.
   * @return issuanceTime
  */
  @Valid 
  @Schema(name = "issuanceTime", description = "The date/time of the issuing of a specific AssignedRight.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuanceTime")
  public OffsetDateTime getIssuanceTime() {
    return issuanceTime;
  }

  public void setIssuanceTime(OffsetDateTime issuanceTime) {
    this.issuanceTime = issuanceTime;
  }

  public AssignedRight assignedRightIssuer(Reference assignedRightIssuer) {
    this.assignedRightIssuer = assignedRightIssuer;
    return this;
  }

  /**
   * Get assignedRightIssuer
   * @return assignedRightIssuer
  */
  @Valid 
  @Schema(name = "assignedRightIssuer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedRightIssuer")
  public Reference getAssignedRightIssuer() {
    return assignedRightIssuer;
  }

  public void setAssignedRightIssuer(Reference assignedRightIssuer) {
    this.assignedRightIssuer = assignedRightIssuer;
  }

  public AssignedRight instancesAvailable(Integer instancesAvailable) {
    this.instancesAvailable = instancesAvailable;
    return this;
  }

  /**
   * The total number of instances under a specified RightSpecification that are available for use.
   * @return instancesAvailable
  */
  
  @Schema(name = "instancesAvailable", description = "The total number of instances under a specified RightSpecification that are available for use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instancesAvailable")
  public Integer getInstancesAvailable() {
    return instancesAvailable;
  }

  public void setInstancesAvailable(Integer instancesAvailable) {
    this.instancesAvailable = instancesAvailable;
  }

  public AssignedRight instancesUsed(Integer instancesUsed) {
    this.instancesUsed = instancesUsed;
    return this;
  }

  /**
   * The total number of instances under a specified RightSpecification that have been used.
   * @return instancesUsed
  */
  
  @Schema(name = "instancesUsed", description = "The total number of instances under a specified RightSpecification that have been used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instancesUsed")
  public Integer getInstancesUsed() {
    return instancesUsed;
  }

  public void setInstancesUsed(Integer instancesUsed) {
    this.instancesUsed = instancesUsed;
  }

  public AssignedRight minutesUsed(Float minutesUsed) {
    this.minutesUsed = minutesUsed;
    return this;
  }

  /**
   * Number of decimal minutes under a specified Assigned Right that have been used.
   * @return minutesUsed
  */
  
  @Schema(name = "minutesUsed", description = "Number of decimal minutes under a specified Assigned Right that have been used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minutesUsed")
  public Float getMinutesUsed() {
    return minutesUsed;
  }

  public void setMinutesUsed(Float minutesUsed) {
    this.minutesUsed = minutesUsed;
  }

  public AssignedRight minutesAvailable(Float minutesAvailable) {
    this.minutesAvailable = minutesAvailable;
    return this;
  }

  /**
   * Number of decimal minutes under a specified Assigned Right that are remaining for use.
   * @return minutesAvailable
  */
  
  @Schema(name = "minutesAvailable", description = "Number of decimal minutes under a specified Assigned Right that are remaining for use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minutesAvailable")
  public Float getMinutesAvailable() {
    return minutesAvailable;
  }

  public void setMinutesAvailable(Float minutesAvailable) {
    this.minutesAvailable = minutesAvailable;
  }

  public AssignedRight remainingValue(AmountInCurrency remainingValue) {
    this.remainingValue = remainingValue;
    return this;
  }

  /**
   * Get remainingValue
   * @return remainingValue
  */
  @Valid 
  @Schema(name = "remainingValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingValue")
  public AmountInCurrency getRemainingValue() {
    return remainingValue;
  }

  public void setRemainingValue(AmountInCurrency remainingValue) {
    this.remainingValue = remainingValue;
  }

  public AssignedRight totalInstances(Integer totalInstances) {
    this.totalInstances = totalInstances;
    return this;
  }

  /**
   * The total number of instances under a specified Assigned Right that have been issued.
   * @return totalInstances
  */
  
  @Schema(name = "totalInstances", description = "The total number of instances under a specified Assigned Right that have been issued.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalInstances")
  public Integer getTotalInstances() {
    return totalInstances;
  }

  public void setTotalInstances(Integer totalInstances) {
    this.totalInstances = totalInstances;
  }

  public AssignedRight totalMinutes(Float totalMinutes) {
    this.totalMinutes = totalMinutes;
    return this;
  }

  /**
   * Number of minutes under a specified Assigned Right that have been issued. Decimal minutes
   * @return totalMinutes
  */
  
  @Schema(name = "totalMinutes", description = "Number of minutes under a specified Assigned Right that have been issued. Decimal minutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalMinutes")
  public Float getTotalMinutes() {
    return totalMinutes;
  }

  public void setTotalMinutes(Float totalMinutes) {
    this.totalMinutes = totalMinutes;
  }

  public AssignedRight totalRightValue(AmountInCurrency totalRightValue) {
    this.totalRightValue = totalRightValue;
    return this;
  }

  /**
   * Get totalRightValue
   * @return totalRightValue
  */
  @Valid 
  @Schema(name = "totalRightValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRightValue")
  public AmountInCurrency getTotalRightValue() {
    return totalRightValue;
  }

  public void setTotalRightValue(AmountInCurrency totalRightValue) {
    this.totalRightValue = totalRightValue;
  }

  public AssignedRight issueMethod(IssueMethodEnum issueMethod) {
    this.issueMethod = issueMethod;
    return this;
  }

  /**
   * Get issueMethod
   * @return issueMethod
  */
  @Valid 
  @Schema(name = "issueMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueMethod")
  public IssueMethodEnum getIssueMethod() {
    return issueMethod;
  }

  public void setIssueMethod(IssueMethodEnum issueMethod) {
    this.issueMethod = issueMethod;
  }

  public AssignedRight plannedUses(List<@Valid PlannedUse> plannedUses) {
    this.plannedUses = plannedUses;
    return this;
  }

  public AssignedRight addPlannedUsesItem(PlannedUse plannedUsesItem) {
    if (this.plannedUses == null) {
      this.plannedUses = new ArrayList<>();
    }
    this.plannedUses.add(plannedUsesItem);
    return this;
  }

  /**
   * Planned future uses of this `AssignedRight`
   * @return plannedUses
  */
  @Valid 
  @Schema(name = "plannedUses", description = "Planned future uses of this `AssignedRight`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plannedUses")
  public List<@Valid PlannedUse> getPlannedUses() {
    return plannedUses;
  }

  public void setPlannedUses(List<@Valid PlannedUse> plannedUses) {
    this.plannedUses = plannedUses;
  }

  public AssignedRight payments(List<@Valid Payment> payments) {
    this.payments = payments;
    return this;
  }

  public AssignedRight addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Payments made for this AssignedRight
   * @return payments
  */
  @Valid 
  @Schema(name = "payments", description = "Payments made for this AssignedRight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payments")
  public List<@Valid Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid Payment> payments) {
    this.payments = payments;
  }

  public AssignedRight monetaryValue(MonetaryValue monetaryValue) {
    this.monetaryValue = monetaryValue;
    return this;
  }

  /**
   * Get monetaryValue
   * @return monetaryValue
  */
  @Valid 
  @Schema(name = "monetaryValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monetaryValue")
  public MonetaryValue getMonetaryValue() {
    return monetaryValue;
  }

  public void setMonetaryValue(MonetaryValue monetaryValue) {
    this.monetaryValue = monetaryValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedRight assignedRight = (AssignedRight) o;
    return Objects.equals(this.id, assignedRight.id) &&
        Objects.equals(this.version, assignedRight.version) &&
        Objects.equals(this.rightHolder, assignedRight.rightHolder) &&
        Objects.equals(this.rightSpecification, assignedRight.rightSpecification) &&
        Objects.equals(this.expiry, assignedRight.expiry) &&
        Objects.equals(this.issuanceTime, assignedRight.issuanceTime) &&
        Objects.equals(this.assignedRightIssuer, assignedRight.assignedRightIssuer) &&
        Objects.equals(this.instancesAvailable, assignedRight.instancesAvailable) &&
        Objects.equals(this.instancesUsed, assignedRight.instancesUsed) &&
        Objects.equals(this.minutesUsed, assignedRight.minutesUsed) &&
        Objects.equals(this.minutesAvailable, assignedRight.minutesAvailable) &&
        Objects.equals(this.remainingValue, assignedRight.remainingValue) &&
        Objects.equals(this.totalInstances, assignedRight.totalInstances) &&
        Objects.equals(this.totalMinutes, assignedRight.totalMinutes) &&
        Objects.equals(this.totalRightValue, assignedRight.totalRightValue) &&
        Objects.equals(this.issueMethod, assignedRight.issueMethod) &&
        Objects.equals(this.plannedUses, assignedRight.plannedUses) &&
        Objects.equals(this.payments, assignedRight.payments) &&
        Objects.equals(this.monetaryValue, assignedRight.monetaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, rightHolder, rightSpecification, expiry, issuanceTime, assignedRightIssuer, instancesAvailable, instancesUsed, minutesUsed, minutesAvailable, remainingValue, totalInstances, totalMinutes, totalRightValue, issueMethod, plannedUses, payments, monetaryValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedRight {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    rightHolder: ").append(toIndentedString(rightHolder)).append("\n");
    sb.append("    rightSpecification: ").append(toIndentedString(rightSpecification)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    issuanceTime: ").append(toIndentedString(issuanceTime)).append("\n");
    sb.append("    assignedRightIssuer: ").append(toIndentedString(assignedRightIssuer)).append("\n");
    sb.append("    instancesAvailable: ").append(toIndentedString(instancesAvailable)).append("\n");
    sb.append("    instancesUsed: ").append(toIndentedString(instancesUsed)).append("\n");
    sb.append("    minutesUsed: ").append(toIndentedString(minutesUsed)).append("\n");
    sb.append("    minutesAvailable: ").append(toIndentedString(minutesAvailable)).append("\n");
    sb.append("    remainingValue: ").append(toIndentedString(remainingValue)).append("\n");
    sb.append("    totalInstances: ").append(toIndentedString(totalInstances)).append("\n");
    sb.append("    totalMinutes: ").append(toIndentedString(totalMinutes)).append("\n");
    sb.append("    totalRightValue: ").append(toIndentedString(totalRightValue)).append("\n");
    sb.append("    issueMethod: ").append(toIndentedString(issueMethod)).append("\n");
    sb.append("    plannedUses: ").append(toIndentedString(plannedUses)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    monetaryValue: ").append(toIndentedString(monetaryValue)).append("\n");
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


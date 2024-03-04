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
import org.npp.model.right.CredentialAssigned;
import org.npp.model.right.enums.IssueMethodEnum;
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
 * A specific future instance when an &#x60;AssignedRight&#x60; is to be used/initiated.
 */

@Schema(name = "PlannedUse", description = "A specific future instance when an `AssignedRight` is to be used/initiated.")

public class PlannedUse {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiryTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime cancelTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime issuanceTime;

  private IssueMethodEnum issueMethod;

  private VersionedReference issuer;

  @Valid
  private List<@Valid CredentialAssigned> credentialsAssigned;

  public PlannedUse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PlannedUse(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public PlannedUse startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Date/time instance when a `PlannedUse` is considered to start, and be available for use.
   * @return startTime
  */
  @NotNull @Valid 
  @Schema(name = "startTime", description = "Date/time instance when a `PlannedUse` is considered to start, and be available for use.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTime")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public PlannedUse endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Date/time instance when a `PlannedUse` is considered to end, and no longer be available for use.
   * @return endTime
  */
  @Valid 
  @Schema(name = "endTime", description = "Date/time instance when a `PlannedUse` is considered to end, and no longer be available for use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public PlannedUse expiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * Date/time instance when a `PlannedUse` expires, and is no longer available for use.
   * @return expiryTime
  */
  @Valid 
  @Schema(name = "expiryTime", description = "Date/time instance when a `PlannedUse` expires, and is no longer available for use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryTime")
  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  public PlannedUse cancelTime(OffsetDateTime cancelTime) {
    this.cancelTime = cancelTime;
    return this;
  }

  /**
   * Date/time instance when a specific `Planned Use` has been cancelled by the right holder.
   * @return cancelTime
  */
  @Valid 
  @Schema(name = "cancelTime", description = "Date/time instance when a specific `Planned Use` has been cancelled by the right holder.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelTime")
  public OffsetDateTime getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(OffsetDateTime cancelTime) {
    this.cancelTime = cancelTime;
  }

  public PlannedUse issuanceTime(OffsetDateTime issuanceTime) {
    this.issuanceTime = issuanceTime;
    return this;
  }

  /**
   * Date/time at which a specific `PlannedUse` instance was issued.
   * @return issuanceTime
  */
  @Valid 
  @Schema(name = "issuanceTime", description = "Date/time at which a specific `PlannedUse` instance was issued.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuanceTime")
  public OffsetDateTime getIssuanceTime() {
    return issuanceTime;
  }

  public void setIssuanceTime(OffsetDateTime issuanceTime) {
    this.issuanceTime = issuanceTime;
  }

  public PlannedUse issueMethod(IssueMethodEnum issueMethod) {
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

  public PlannedUse issuer(VersionedReference issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
  */
  @Valid 
  @Schema(name = "issuer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuer")
  public VersionedReference getIssuer() {
    return issuer;
  }

  public void setIssuer(VersionedReference issuer) {
    this.issuer = issuer;
  }

  public PlannedUse credentialsAssigned(List<@Valid CredentialAssigned> credentialsAssigned) {
    this.credentialsAssigned = credentialsAssigned;
    return this;
  }

  public PlannedUse addCredentialsAssignedItem(CredentialAssigned credentialsAssignedItem) {
    if (this.credentialsAssigned == null) {
      this.credentialsAssigned = new ArrayList<>();
    }
    this.credentialsAssigned.add(credentialsAssignedItem);
    return this;
  }

  /**
   * Credentials that might be used.
   * @return credentialsAssigned
  */
  @Valid @Size(min = 1) 
  @Schema(name = "credentialsAssigned", description = "Credentials that might be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentialsAssigned")
  public List<@Valid CredentialAssigned> getCredentialsAssigned() {
    return credentialsAssigned;
  }

  public void setCredentialsAssigned(List<@Valid CredentialAssigned> credentialsAssigned) {
    this.credentialsAssigned = credentialsAssigned;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlannedUse plannedUse = (PlannedUse) o;
    return Objects.equals(this.startTime, plannedUse.startTime) &&
        Objects.equals(this.endTime, plannedUse.endTime) &&
        Objects.equals(this.expiryTime, plannedUse.expiryTime) &&
        Objects.equals(this.cancelTime, plannedUse.cancelTime) &&
        Objects.equals(this.issuanceTime, plannedUse.issuanceTime) &&
        Objects.equals(this.issueMethod, plannedUse.issueMethod) &&
        Objects.equals(this.issuer, plannedUse.issuer) &&
        Objects.equals(this.credentialsAssigned, plannedUse.credentialsAssigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, expiryTime, cancelTime, issuanceTime, issueMethod, issuer, credentialsAssigned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlannedUse {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    cancelTime: ").append(toIndentedString(cancelTime)).append("\n");
    sb.append("    issuanceTime: ").append(toIndentedString(issuanceTime)).append("\n");
    sb.append("    issueMethod: ").append(toIndentedString(issueMethod)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    credentialsAssigned: ").append(toIndentedString(credentialsAssigned)).append("\n");
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


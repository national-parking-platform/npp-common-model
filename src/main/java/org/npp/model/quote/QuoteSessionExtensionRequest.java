package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
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
 * class containing detail required to initiate a request for a quote to extend an existing session
 */

@Schema(name = "QuoteSessionExtensionRequest", description = "class containing detail required to initiate a request for a quote to extend an existing session")

public class QuoteSessionExtensionRequest {

  private String id;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestedEndTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestTime;

  private VersionedReference sessionId;

  private VersionedReference suppliedCredential;

  public QuoteSessionExtensionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteSessionExtensionRequest(String id, Integer version, OffsetDateTime requestedEndTime, OffsetDateTime requestTime, VersionedReference sessionId, VersionedReference suppliedCredential) {
    this.id = id;
    this.version = version;
    this.requestedEndTime = requestedEndTime;
    this.requestTime = requestTime;
    this.sessionId = sessionId;
    this.suppliedCredential = suppliedCredential;
  }

  public QuoteSessionExtensionRequest id(String id) {
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

  public QuoteSessionExtensionRequest version(Integer version) {
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

  public QuoteSessionExtensionRequest requestedEndTime(OffsetDateTime requestedEndTime) {
    this.requestedEndTime = requestedEndTime;
    return this;
  }

  /**
   * proposed date/time at which the proposed extended Session would end
   * @return requestedEndTime
  */
  @NotNull @Valid 
  @Schema(name = "requestedEndTime", description = "proposed date/time at which the proposed extended Session would end", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedEndTime")
  public OffsetDateTime getRequestedEndTime() {
    return requestedEndTime;
  }

  public void setRequestedEndTime(OffsetDateTime requestedEndTime) {
    this.requestedEndTime = requestedEndTime;
  }

  public QuoteSessionExtensionRequest requestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  /**
   * reference date/time at which the request for a quote for a session extension is made
   * @return requestTime
  */
  @NotNull @Valid 
  @Schema(name = "requestTime", description = "reference date/time at which the request for a quote for a session extension is made", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestTime")
  public OffsetDateTime getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
  }

  public QuoteSessionExtensionRequest sessionId(VersionedReference sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  @NotNull @Valid 
  @Schema(name = "sessionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sessionId")
  public VersionedReference getSessionId() {
    return sessionId;
  }

  public void setSessionId(VersionedReference sessionId) {
    this.sessionId = sessionId;
  }

  public QuoteSessionExtensionRequest suppliedCredential(VersionedReference suppliedCredential) {
    this.suppliedCredential = suppliedCredential;
    return this;
  }

  /**
   * Get suppliedCredential
   * @return suppliedCredential
  */
  @NotNull @Valid 
  @Schema(name = "suppliedCredential", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("suppliedCredential")
  public VersionedReference getSuppliedCredential() {
    return suppliedCredential;
  }

  public void setSuppliedCredential(VersionedReference suppliedCredential) {
    this.suppliedCredential = suppliedCredential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSessionExtensionRequest quoteSessionExtensionRequest = (QuoteSessionExtensionRequest) o;
    return Objects.equals(this.id, quoteSessionExtensionRequest.id) &&
        Objects.equals(this.version, quoteSessionExtensionRequest.version) &&
        Objects.equals(this.requestedEndTime, quoteSessionExtensionRequest.requestedEndTime) &&
        Objects.equals(this.requestTime, quoteSessionExtensionRequest.requestTime) &&
        Objects.equals(this.sessionId, quoteSessionExtensionRequest.sessionId) &&
        Objects.equals(this.suppliedCredential, quoteSessionExtensionRequest.suppliedCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, requestedEndTime, requestTime, sessionId, suppliedCredential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSessionExtensionRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    requestedEndTime: ").append(toIndentedString(requestedEndTime)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    suppliedCredential: ").append(toIndentedString(suppliedCredential)).append("\n");
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


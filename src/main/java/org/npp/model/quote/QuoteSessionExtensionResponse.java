package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.npp.model.quote.enums.QuoteRightResponseExtensionReasonEnum;
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
 * Class containing data to support response to request for quote to extend an existing Session
 */

@Schema(name = "QuoteSessionExtensionResponse", description = "Class containing data to support response to request for quote to extend an existing Session")

public class QuoteSessionExtensionResponse {

  private String id;

  private Integer version;

  private VersionedReference requestSessionExtensionId;

  private VersionedReference sessionId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime responseTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime revisedEndTime;

  private QuoteRightResponseExtensionReasonEnum reason;

  public QuoteSessionExtensionResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteSessionExtensionResponse(String id, Integer version, VersionedReference requestSessionExtensionId, VersionedReference sessionId, OffsetDateTime requestTime, OffsetDateTime responseTime, OffsetDateTime revisedEndTime) {
    this.id = id;
    this.version = version;
    this.requestSessionExtensionId = requestSessionExtensionId;
    this.sessionId = sessionId;
    this.requestTime = requestTime;
    this.responseTime = responseTime;
    this.revisedEndTime = revisedEndTime;
  }

  public QuoteSessionExtensionResponse id(String id) {
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

  public QuoteSessionExtensionResponse version(Integer version) {
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

  public QuoteSessionExtensionResponse requestSessionExtensionId(VersionedReference requestSessionExtensionId) {
    this.requestSessionExtensionId = requestSessionExtensionId;
    return this;
  }

  /**
   * Get requestSessionExtensionId
   * @return requestSessionExtensionId
  */
  @NotNull @Valid 
  @Schema(name = "requestSessionExtensionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestSessionExtensionId")
  public VersionedReference getRequestSessionExtensionId() {
    return requestSessionExtensionId;
  }

  public void setRequestSessionExtensionId(VersionedReference requestSessionExtensionId) {
    this.requestSessionExtensionId = requestSessionExtensionId;
  }

  public QuoteSessionExtensionResponse sessionId(VersionedReference sessionId) {
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

  public QuoteSessionExtensionResponse requestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  /**
   * date/time at which the request for a quote was recorded/registered by the supplier
   * @return requestTime
  */
  @NotNull @Valid 
  @Schema(name = "requestTime", description = "date/time at which the request for a quote was recorded/registered by the supplier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestTime")
  public OffsetDateTime getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
  }

  public QuoteSessionExtensionResponse responseTime(OffsetDateTime responseTime) {
    this.responseTime = responseTime;
    return this;
  }

  /**
   * date/time at which the response is made by the supplier
   * @return responseTime
  */
  @NotNull @Valid 
  @Schema(name = "responseTime", description = "date/time at which the response is made by the supplier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responseTime")
  public OffsetDateTime getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(OffsetDateTime responseTime) {
    this.responseTime = responseTime;
  }

  public QuoteSessionExtensionResponse revisedEndTime(OffsetDateTime revisedEndTime) {
    this.revisedEndTime = revisedEndTime;
    return this;
  }

  /**
   * Date/time of the revised session end time
   * @return revisedEndTime
  */
  @NotNull @Valid 
  @Schema(name = "revisedEndTime", description = "Date/time of the revised session end time", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("revisedEndTime")
  public OffsetDateTime getRevisedEndTime() {
    return revisedEndTime;
  }

  public void setRevisedEndTime(OffsetDateTime revisedEndTime) {
    this.revisedEndTime = revisedEndTime;
  }

  public QuoteSessionExtensionResponse reason(QuoteRightResponseExtensionReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @Valid 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public QuoteRightResponseExtensionReasonEnum getReason() {
    return reason;
  }

  public void setReason(QuoteRightResponseExtensionReasonEnum reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSessionExtensionResponse quoteSessionExtensionResponse = (QuoteSessionExtensionResponse) o;
    return Objects.equals(this.id, quoteSessionExtensionResponse.id) &&
        Objects.equals(this.version, quoteSessionExtensionResponse.version) &&
        Objects.equals(this.requestSessionExtensionId, quoteSessionExtensionResponse.requestSessionExtensionId) &&
        Objects.equals(this.sessionId, quoteSessionExtensionResponse.sessionId) &&
        Objects.equals(this.requestTime, quoteSessionExtensionResponse.requestTime) &&
        Objects.equals(this.responseTime, quoteSessionExtensionResponse.responseTime) &&
        Objects.equals(this.revisedEndTime, quoteSessionExtensionResponse.revisedEndTime) &&
        Objects.equals(this.reason, quoteSessionExtensionResponse.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, requestSessionExtensionId, sessionId, requestTime, responseTime, revisedEndTime, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSessionExtensionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    requestSessionExtensionId: ").append(toIndentedString(requestSessionExtensionId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    revisedEndTime: ").append(toIndentedString(revisedEndTime)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


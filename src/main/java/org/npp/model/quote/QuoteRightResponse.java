package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.quote.Option;
import org.npp.model.common.enums.ResponseReasonEnum;
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
 * Class containing data to support response to request for quote for a new transaction
 */

@Schema(name = "QuoteRightResponse", description = "Class containing data to support response to request for quote for a new transaction")

public class QuoteRightResponse {

  private String id;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime start;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime end;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestTime;

  private ResponseReasonEnum reason;

  private VersionedReference quoteRequestId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime responseTime;

  @Valid
  private List<@Valid Option> options;

  public QuoteRightResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteRightResponse(String id, Integer version, OffsetDateTime start, OffsetDateTime end, OffsetDateTime requestTime, VersionedReference quoteRequestId, OffsetDateTime responseTime) {
    this.id = id;
    this.version = version;
    this.start = start;
    this.end = end;
    this.requestTime = requestTime;
    this.quoteRequestId = quoteRequestId;
    this.responseTime = responseTime;
  }

  public QuoteRightResponse id(String id) {
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

  public QuoteRightResponse version(Integer version) {
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

  public QuoteRightResponse start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * date/time for the start of the proposed new transaction
   * @return start
  */
  @NotNull @Valid 
  @Schema(name = "start", description = "date/time for the start of the proposed new transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public QuoteRightResponse end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * date/time for the end of the proposed new transaction
   * @return end
  */
  @NotNull @Valid 
  @Schema(name = "end", description = "date/time for the end of the proposed new transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public QuoteRightResponse requestTime(OffsetDateTime requestTime) {
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

  public QuoteRightResponse reason(ResponseReasonEnum reason) {
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
  public ResponseReasonEnum getReason() {
    return reason;
  }

  public void setReason(ResponseReasonEnum reason) {
    this.reason = reason;
  }

  public QuoteRightResponse quoteRequestId(VersionedReference quoteRequestId) {
    this.quoteRequestId = quoteRequestId;
    return this;
  }

  /**
   * Get quoteRequestId
   * @return quoteRequestId
  */
  @NotNull @Valid 
  @Schema(name = "quoteRequestId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quoteRequestId")
  public VersionedReference getQuoteRequestId() {
    return quoteRequestId;
  }

  public void setQuoteRequestId(VersionedReference quoteRequestId) {
    this.quoteRequestId = quoteRequestId;
  }

  public QuoteRightResponse responseTime(OffsetDateTime responseTime) {
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

  public QuoteRightResponse options(List<@Valid Option> options) {
    this.options = options;
    return this;
  }

  public QuoteRightResponse addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid Option> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid Option> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteRightResponse quoteRightResponse = (QuoteRightResponse) o;
    return Objects.equals(this.id, quoteRightResponse.id) &&
        Objects.equals(this.version, quoteRightResponse.version) &&
        Objects.equals(this.start, quoteRightResponse.start) &&
        Objects.equals(this.end, quoteRightResponse.end) &&
        Objects.equals(this.requestTime, quoteRightResponse.requestTime) &&
        Objects.equals(this.reason, quoteRightResponse.reason) &&
        Objects.equals(this.quoteRequestId, quoteRightResponse.quoteRequestId) &&
        Objects.equals(this.responseTime, quoteRightResponse.responseTime) &&
        Objects.equals(this.options, quoteRightResponse.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, start, end, requestTime, reason, quoteRequestId, responseTime, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteRightResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    quoteRequestId: ").append(toIndentedString(quoteRequestId)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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


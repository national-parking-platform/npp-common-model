package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.eligibility.Eligibility;
import org.npp.model.quote.ReferencedRightSpecification;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * class containing data elements required to request a quote for a new transaction
 */

@Schema(name = "QuoteRightRequest", description = "class containing data elements required to request a quote for a new transaction")

public class QuoteRightRequest {

  private String id;

  private Integer version;

  private Eligibility eligibility;

  @Valid
  private List<@Valid ReferencedRightSpecification> referencedRightSpecifications;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime periodStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime periodEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestTime;

  @Valid
  private List<@Valid String> timePeriods;

  public QuoteRightRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteRightRequest(String id, Integer version, OffsetDateTime periodStart, OffsetDateTime requestTime) {
    this.id = id;
    this.version = version;
    this.periodStart = periodStart;
    this.requestTime = requestTime;
  }

  public QuoteRightRequest id(String id) {
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

  public QuoteRightRequest version(Integer version) {
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

  public QuoteRightRequest eligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  */
  @Valid 
  @Schema(name = "eligibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligibility")
  public Eligibility getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
  }

  public QuoteRightRequest referencedRightSpecifications(List<@Valid ReferencedRightSpecification> referencedRightSpecifications) {
    this.referencedRightSpecifications = referencedRightSpecifications;
    return this;
  }

  public QuoteRightRequest addReferencedRightSpecificationsItem(ReferencedRightSpecification referencedRightSpecificationsItem) {
    if (this.referencedRightSpecifications == null) {
      this.referencedRightSpecifications = new ArrayList<>();
    }
    this.referencedRightSpecifications.add(referencedRightSpecificationsItem);
    return this;
  }

  /**
   * Get referencedRightSpecifications
   * @return referencedRightSpecifications
  */
  @Valid 
  @Schema(name = "referencedRightSpecifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referencedRightSpecifications")
  public List<@Valid ReferencedRightSpecification> getReferencedRightSpecifications() {
    return referencedRightSpecifications;
  }

  public void setReferencedRightSpecifications(List<@Valid ReferencedRightSpecification> referencedRightSpecifications) {
    this.referencedRightSpecifications = referencedRightSpecifications;
  }

  public QuoteRightRequest periodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
    return this;
  }

  /**
   * requested date/time for the start of a proposed new transaction
   * @return periodStart
  */
  @NotNull @Valid 
  @Schema(name = "periodStart", description = "requested date/time for the start of a proposed new transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("periodStart")
  public OffsetDateTime getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
  }

  public QuoteRightRequest periodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

  /**
   * requested date/time for the end of a proposed new transaction
   * @return periodEnd
  */
  @Valid 
  @Schema(name = "periodEnd", description = "requested date/time for the end of a proposed new transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periodEnd")
  public OffsetDateTime getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
  }

  public QuoteRightRequest requestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  /**
   * date/time at which the request for a quote was made
   * @return requestTime
  */
  @NotNull @Valid 
  @Schema(name = "requestTime", description = "date/time at which the request for a quote was made", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestTime")
  public OffsetDateTime getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
  }

  public QuoteRightRequest timePeriods(List<@Valid String> timePeriods) {
    this.timePeriods = timePeriods;
    return this;
  }

  public QuoteRightRequest addTimePeriodsItem(String timePeriodsItem) {
    if (this.timePeriods == null) {
      this.timePeriods = new ArrayList<>();
    }
    this.timePeriods.add(timePeriodsItem);
    return this;
  }

  /**
   * requested duration for the proposed new transaction
   * @return timePeriods
  */
  
  @Schema(name = "timePeriods", description = "requested duration for the proposed new transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timePeriods")
  public List<@Valid String> getTimePeriods() {
    return timePeriods;
  }

  public void setTimePeriods(List<@Valid String> timePeriods) {
    this.timePeriods = timePeriods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteRightRequest quoteRightRequest = (QuoteRightRequest) o;
    return Objects.equals(this.id, quoteRightRequest.id) &&
        Objects.equals(this.version, quoteRightRequest.version) &&
        Objects.equals(this.eligibility, quoteRightRequest.eligibility) &&
        Objects.equals(this.referencedRightSpecifications, quoteRightRequest.referencedRightSpecifications) &&
        Objects.equals(this.periodStart, quoteRightRequest.periodStart) &&
        Objects.equals(this.periodEnd, quoteRightRequest.periodEnd) &&
        Objects.equals(this.requestTime, quoteRightRequest.requestTime) &&
        Objects.equals(this.timePeriods, quoteRightRequest.timePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, eligibility, referencedRightSpecifications, periodStart, periodEnd, requestTime, timePeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteRightRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    referencedRightSpecifications: ").append(toIndentedString(referencedRightSpecifications)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    timePeriods: ").append(toIndentedString(timePeriods)).append("\n");
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


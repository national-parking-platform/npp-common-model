package org.npp.model.rate;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.rate.RateLine;
import org.npp.model.rate.RateLineCollection;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class supporting the specification of times for defining rate applicability that are relative to  a defined &#x60;referenceTimeStart&#x60; of an event.
 */

@Schema(name = "RateLineCollectionRelativeTimes", description = "A class supporting the specification of times for defining rate applicability that are relative to  a defined `referenceTimeStart` of an event.")


public class RateLineCollectionRelativeTimes extends RateLineCollection {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime referenceTimeStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime referenceTimeEnd;

  public RateLineCollectionRelativeTimes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateLineCollectionRelativeTimes(OffsetDateTime referenceTimeStart, RateLineCollectionTypeEnum rateLineCollectionType, String applicableCurrency, Integer collectionSequence, String minTime, String maxTime, Boolean relativeTimes, String resetTime, Boolean taxIncluded, List<@Valid RateLine> rateLines) {
    super(rateLineCollectionType, applicableCurrency, collectionSequence, minTime, maxTime, relativeTimes, resetTime, taxIncluded, rateLines);
    this.referenceTimeStart = referenceTimeStart;
  }

  public RateLineCollectionRelativeTimes referenceTimeStart(OffsetDateTime referenceTimeStart) {
    this.referenceTimeStart = referenceTimeStart;
    return this;
  }

  /**
   * Event-related reference start time
   * @return referenceTimeStart
  */
  @NotNull @Valid 
  @Schema(name = "referenceTimeStart", description = "Event-related reference start time", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("referenceTimeStart")
  public OffsetDateTime getReferenceTimeStart() {
    return referenceTimeStart;
  }

  public void setReferenceTimeStart(OffsetDateTime referenceTimeStart) {
    this.referenceTimeStart = referenceTimeStart;
  }

  public RateLineCollectionRelativeTimes referenceTimeEnd(OffsetDateTime referenceTimeEnd) {
    this.referenceTimeEnd = referenceTimeEnd;
    return this;
  }

  /**
   * Event-related reference end time
   * @return referenceTimeEnd
  */
  @Valid 
  @Schema(name = "referenceTimeEnd", description = "Event-related reference end time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceTimeEnd")
  public OffsetDateTime getReferenceTimeEnd() {
    return referenceTimeEnd;
  }

  public void setReferenceTimeEnd(OffsetDateTime referenceTimeEnd) {
    this.referenceTimeEnd = referenceTimeEnd;
  }


  public RateLineCollectionRelativeTimes rateLineCollectionType(RateLineCollectionTypeEnum rateLineCollectionType) {
    super.rateLineCollectionType(rateLineCollectionType);
    return this;
  }

  public RateLineCollectionRelativeTimes applicableCurrency(String applicableCurrency) {
    super.applicableCurrency(applicableCurrency);
    return this;
  }

  public RateLineCollectionRelativeTimes collectionSequence(Integer collectionSequence) {
    super.collectionSequence(collectionSequence);
    return this;
  }

  public RateLineCollectionRelativeTimes minTime(String minTime) {
    super.minTime(minTime);
    return this;
  }

  public RateLineCollectionRelativeTimes maxTime(String maxTime) {
    super.maxTime(maxTime);
    return this;
  }

  public RateLineCollectionRelativeTimes minValueCollection(Float minValueCollection) {
    super.minValueCollection(minValueCollection);
    return this;
  }

  public RateLineCollectionRelativeTimes maxValueCollection(Float maxValueCollection) {
    super.maxValueCollection(maxValueCollection);
    return this;
  }

  public RateLineCollectionRelativeTimes relativeTimes(Boolean relativeTimes) {
    super.relativeTimes(relativeTimes);
    return this;
  }

  public RateLineCollectionRelativeTimes resetTime(String resetTime) {
    super.resetTime(resetTime);
    return this;
  }

  public RateLineCollectionRelativeTimes taxIncluded(Boolean taxIncluded) {
    super.taxIncluded(taxIncluded);
    return this;
  }

  public RateLineCollectionRelativeTimes taxRate(Float taxRate) {
    super.taxRate(taxRate);
    return this;
  }

  public RateLineCollectionRelativeTimes taxValue(Float taxValue) {
    super.taxValue(taxValue);
    return this;
  }

  public RateLineCollectionRelativeTimes rateLines(List<@Valid RateLine> rateLines) {
    super.rateLines(rateLines);
    return this;
  }

  public RateLineCollectionRelativeTimes addRateLinesItem(RateLine rateLinesItem) {
    super.addRateLinesItem(rateLinesItem);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLineCollectionRelativeTimes rateLineCollectionRelativeTimes = (RateLineCollectionRelativeTimes) o;
    return Objects.equals(this.referenceTimeStart, rateLineCollectionRelativeTimes.referenceTimeStart) &&
        Objects.equals(this.referenceTimeEnd, rateLineCollectionRelativeTimes.referenceTimeEnd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTimeStart, referenceTimeEnd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLineCollectionRelativeTimes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referenceTimeStart: ").append(toIndentedString(referenceTimeStart)).append("\n");
    sb.append("    referenceTimeEnd: ").append(toIndentedString(referenceTimeEnd)).append("\n");
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


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
 * A class supporting the specification of times for defining rate applicability that are related to a  defined &#x60;validStart&#x60;.
 */

@Schema(name = "RateLineCollectionAbsoluteTimes", description = "A class supporting the specification of times for defining rate applicability that are related to a  defined `validStart`.")


public class RateLineCollectionAbsoluteTimes extends RateLineCollection {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validEnd;

  public RateLineCollectionAbsoluteTimes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateLineCollectionAbsoluteTimes(OffsetDateTime validStart, RateLineCollectionTypeEnum rateLineCollectionType, String applicableCurrency, Integer collectionSequence, String minTime, String maxTime, Boolean relativeTimes, String resetTime, Boolean taxIncluded, List<@Valid RateLine> rateLines) {
    super(rateLineCollectionType, applicableCurrency, collectionSequence, minTime, maxTime, relativeTimes, resetTime, taxIncluded, rateLines);
    this.validStart = validStart;
  }

  public RateLineCollectionAbsoluteTimes validStart(OffsetDateTime validStart) {
    this.validStart = validStart;
    return this;
  }

  /**
   * The start time for the validity of this rate line collection
   * @return validStart
  */
  @NotNull @Valid 
  @Schema(name = "validStart", description = "The start time for the validity of this rate line collection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validStart")
  public OffsetDateTime getValidStart() {
    return validStart;
  }

  public void setValidStart(OffsetDateTime validStart) {
    this.validStart = validStart;
  }

  public RateLineCollectionAbsoluteTimes validEnd(OffsetDateTime validEnd) {
    this.validEnd = validEnd;
    return this;
  }

  /**
   * The end time for the validity of this rate line collection
   * @return validEnd
  */
  @Valid 
  @Schema(name = "validEnd", description = "The end time for the validity of this rate line collection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validEnd")
  public OffsetDateTime getValidEnd() {
    return validEnd;
  }

  public void setValidEnd(OffsetDateTime validEnd) {
    this.validEnd = validEnd;
  }


  public RateLineCollectionAbsoluteTimes rateLineCollectionType(RateLineCollectionTypeEnum rateLineCollectionType) {
    super.rateLineCollectionType(rateLineCollectionType);
    return this;
  }

  public RateLineCollectionAbsoluteTimes applicableCurrency(String applicableCurrency) {
    super.applicableCurrency(applicableCurrency);
    return this;
  }

  public RateLineCollectionAbsoluteTimes collectionSequence(Integer collectionSequence) {
    super.collectionSequence(collectionSequence);
    return this;
  }

  public RateLineCollectionAbsoluteTimes minTime(String minTime) {
    super.minTime(minTime);
    return this;
  }

  public RateLineCollectionAbsoluteTimes maxTime(String maxTime) {
    super.maxTime(maxTime);
    return this;
  }

  public RateLineCollectionAbsoluteTimes minValueCollection(Float minValueCollection) {
    super.minValueCollection(minValueCollection);
    return this;
  }

  public RateLineCollectionAbsoluteTimes maxValueCollection(Float maxValueCollection) {
    super.maxValueCollection(maxValueCollection);
    return this;
  }

  public RateLineCollectionAbsoluteTimes relativeTimes(Boolean relativeTimes) {
    super.relativeTimes(relativeTimes);
    return this;
  }

  public RateLineCollectionAbsoluteTimes resetTime(String resetTime) {
    super.resetTime(resetTime);
    return this;
  }

  public RateLineCollectionAbsoluteTimes taxIncluded(Boolean taxIncluded) {
    super.taxIncluded(taxIncluded);
    return this;
  }

  public RateLineCollectionAbsoluteTimes taxRate(Float taxRate) {
    super.taxRate(taxRate);
    return this;
  }

  public RateLineCollectionAbsoluteTimes taxValue(Float taxValue) {
    super.taxValue(taxValue);
    return this;
  }

  public RateLineCollectionAbsoluteTimes rateLines(List<@Valid RateLine> rateLines) {
    super.rateLines(rateLines);
    return this;
  }

  public RateLineCollectionAbsoluteTimes addRateLinesItem(RateLine rateLinesItem) {
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
    RateLineCollectionAbsoluteTimes rateLineCollectionAbsoluteTimes = (RateLineCollectionAbsoluteTimes) o;
    return Objects.equals(this.validStart, rateLineCollectionAbsoluteTimes.validStart) &&
        Objects.equals(this.validEnd, rateLineCollectionAbsoluteTimes.validEnd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validStart, validEnd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLineCollectionAbsoluteTimes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    validStart: ").append(toIndentedString(validStart)).append("\n");
    sb.append("    validEnd: ").append(toIndentedString(validEnd)).append("\n");
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


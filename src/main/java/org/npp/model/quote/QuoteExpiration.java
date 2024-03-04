package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class defining conditions indicating the end of the validity of a Quote
 */

@Schema(name = "QuoteExpiration", description = "Class defining conditions indicating the end of the validity of a Quote")

public class QuoteExpiration {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresDateTime;

  private Boolean firstComeFirstServed;

  public QuoteExpiration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteExpiration(Boolean firstComeFirstServed) {
    this.firstComeFirstServed = firstComeFirstServed;
  }

  public QuoteExpiration expiresDateTime(OffsetDateTime expiresDateTime) {
    this.expiresDateTime = expiresDateTime;
    return this;
  }

  /**
   * Defines a specific date/time that the Option and thus the FinancialQuote is valid
   * @return expiresDateTime
  */
  @Valid 
  @Schema(name = "expiresDateTime", description = "Defines a specific date/time that the Option and thus the FinancialQuote is valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiresDateTime")
  public OffsetDateTime getExpiresDateTime() {
    return expiresDateTime;
  }

  public void setExpiresDateTime(OffsetDateTime expiresDateTime) {
    this.expiresDateTime = expiresDateTime;
  }

  public QuoteExpiration firstComeFirstServed(Boolean firstComeFirstServed) {
    this.firstComeFirstServed = firstComeFirstServed;
    return this;
  }

  /**
   * A Boolean value shows that the availability of an Option and thus FinancialQuote are available to  the requester on a first come first served basis, with no assurance that the advertised RightSpecification  will be available based on actual demand
   * @return firstComeFirstServed
  */
  @NotNull 
  @Schema(name = "firstComeFirstServed", description = "A Boolean value shows that the availability of an Option and thus FinancialQuote are available to  the requester on a first come first served basis, with no assurance that the advertised RightSpecification  will be available based on actual demand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstComeFirstServed")
  public Boolean getFirstComeFirstServed() {
    return firstComeFirstServed;
  }

  public void setFirstComeFirstServed(Boolean firstComeFirstServed) {
    this.firstComeFirstServed = firstComeFirstServed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteExpiration quoteExpiration = (QuoteExpiration) o;
    return Objects.equals(this.expiresDateTime, quoteExpiration.expiresDateTime) &&
        Objects.equals(this.firstComeFirstServed, quoteExpiration.firstComeFirstServed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresDateTime, firstComeFirstServed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteExpiration {\n");
    sb.append("    expiresDateTime: ").append(toIndentedString(expiresDateTime)).append("\n");
    sb.append("    firstComeFirstServed: ").append(toIndentedString(firstComeFirstServed)).append("\n");
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


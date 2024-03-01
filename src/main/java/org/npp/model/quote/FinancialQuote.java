package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.payment.AmountInCurrency;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class containing information on financial value of a Quote
 */

@Schema(name = "FinancialQuote", description = "Class containing information on financial value of a Quote")

public class FinancialQuote {

  private VersionedReference serviceProvider;

  private Boolean taxIncluded;

  private String transactionId;

  private AmountInCurrency value;

  public FinancialQuote() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FinancialQuote(Boolean taxIncluded, AmountInCurrency value) {
    this.taxIncluded = taxIncluded;
    this.value = value;
  }

  public FinancialQuote serviceProvider(VersionedReference serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
  */
  @Valid 
  @Schema(name = "serviceProvider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceProvider")
  public VersionedReference getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(VersionedReference serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public FinancialQuote taxIncluded(Boolean taxIncluded) {
    this.taxIncluded = taxIncluded;
    return this;
  }

  /**
   * Whether tax included in monetary value, if yes (TRUE), if not (FALSE).
   * @return taxIncluded
  */
  @NotNull 
  @Schema(name = "taxIncluded", description = "Whether tax included in monetary value, if yes (TRUE), if not (FALSE).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxIncluded")
  public Boolean getTaxIncluded() {
    return taxIncluded;
  }

  public void setTaxIncluded(Boolean taxIncluded) {
    this.taxIncluded = taxIncluded;
  }

  public FinancialQuote transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Identifier for the transaction (e.g. reservation number, credit card transaction reference) as agreed upon by the two entities sharing data.
   * @return transactionId
  */
  
  @Schema(name = "transactionId", description = "Identifier for the transaction (e.g. reservation number, credit card transaction reference) as agreed upon by the two entities sharing data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public FinancialQuote value(AmountInCurrency value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public AmountInCurrency getValue() {
    return value;
  }

  public void setValue(AmountInCurrency value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialQuote financialQuote = (FinancialQuote) o;
    return Objects.equals(this.serviceProvider, financialQuote.serviceProvider) &&
        Objects.equals(this.taxIncluded, financialQuote.taxIncluded) &&
        Objects.equals(this.transactionId, financialQuote.transactionId) &&
        Objects.equals(this.value, financialQuote.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceProvider, taxIncluded, transactionId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialQuote {\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    taxIncluded: ").append(toIndentedString(taxIncluded)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


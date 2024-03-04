package org.npp.model.session;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.SpecificLanguageString;
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
 * Financial transaction data will be expanded upon in future releases of the APDS specification.  To allow basic sharing of financial data immediately, certain financial data is associated to the Segment.  Each Segment has its own financial data defined. An entity is able to sum the financial data of each Segment to determine total Session financial data.  Minimum financial data to include in a Segment includes:  * Total value of Segment based on expected value to be received by Place owner or operator (ie amount of calculated Rate Table based on Session times). * Entity name of the service provider that is responsible for selling/collecting fees associated to the Segment. * Tax included in value - Yes/No (Boolean). * Country currency.  Optional data to include in Segment  * Date Segment fees are collected by service provider. * Transaction ID (reservation #, credit card transaction #, etc) as agreed upon by the two entities sharing data.  The financial data collected under Release 2.1 of the APDS specification is the value of a transaction based on  a defined RateTable that is associated to a Segment via the AssignedRight.  The transaction value shared in the Segment is the amount of the transaction that is expected by the owner or operator of the Place.
 */

@Schema(name = "FinancialTransaction", description = "Financial transaction data will be expanded upon in future releases of the APDS specification.  To allow basic sharing of financial data immediately, certain financial data is associated to the Segment.  Each Segment has its own financial data defined. An entity is able to sum the financial data of each Segment to determine total Session financial data.  Minimum financial data to include in a Segment includes:  * Total value of Segment based on expected value to be received by Place owner or operator (ie amount of calculated Rate Table based on Session times). * Entity name of the service provider that is responsible for selling/collecting fees associated to the Segment. * Tax included in value - Yes/No (Boolean). * Country currency.  Optional data to include in Segment  * Date Segment fees are collected by service provider. * Transaction ID (reservation #, credit card transaction #, etc) as agreed upon by the two entities sharing data.  The financial data collected under Release 2.1 of the APDS specification is the value of a transaction based on  a defined RateTable that is associated to a Segment via the AssignedRight.  The transaction value shared in the Segment is the amount of the transaction that is expected by the owner or operator of the Place.")

public class FinancialTransaction {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateCollected;

  private VersionedReference rateLineId;

  private Double segmentValue;

  @Valid
  private List<@Valid SpecificLanguageString> serviceProvider = new ArrayList<>();

  private Boolean taxIncluded;

  private String transactionId;

  public FinancialTransaction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FinancialTransaction(Double segmentValue, List<@Valid SpecificLanguageString> serviceProvider, Boolean taxIncluded) {
    this.segmentValue = segmentValue;
    this.serviceProvider = serviceProvider;
    this.taxIncluded = taxIncluded;
  }

  public FinancialTransaction dateCollected(OffsetDateTime dateCollected) {
    this.dateCollected = dateCollected;
    return this;
  }

  /**
   * The date / time that the payment related to this financial transaction is recorded as being paid and collected.
   * @return dateCollected
  */
  @Valid 
  @Schema(name = "dateCollected", description = "The date / time that the payment related to this financial transaction is recorded as being paid and collected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateCollected")
  public OffsetDateTime getDateCollected() {
    return dateCollected;
  }

  public void setDateCollected(OffsetDateTime dateCollected) {
    this.dateCollected = dateCollected;
  }

  public FinancialTransaction rateLineId(VersionedReference rateLineId) {
    this.rateLineId = rateLineId;
    return this;
  }

  /**
   * Get rateLineId
   * @return rateLineId
  */
  @Valid 
  @Schema(name = "rateLineId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLineId")
  public VersionedReference getRateLineId() {
    return rateLineId;
  }

  public void setRateLineId(VersionedReference rateLineId) {
    this.rateLineId = rateLineId;
  }

  public FinancialTransaction segmentValue(Double segmentValue) {
    this.segmentValue = segmentValue;
    return this;
  }

  /**
   * The total monetary value associated with this financial transaction, based on expected value to be received  by PLACE owner or operator (i.e. amount of calculated rate table based on segment times).
   * @return segmentValue
  */
  @NotNull 
  @Schema(name = "segmentValue", description = "The total monetary value associated with this financial transaction, based on expected value to be received  by PLACE owner or operator (i.e. amount of calculated rate table based on segment times).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("segmentValue")
  public Double getSegmentValue() {
    return segmentValue;
  }

  public void setSegmentValue(Double segmentValue) {
    this.segmentValue = segmentValue;
  }

  public FinancialTransaction serviceProvider(List<@Valid SpecificLanguageString> serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  public FinancialTransaction addServiceProviderItem(SpecificLanguageString serviceProviderItem) {
    if (this.serviceProvider == null) {
      this.serviceProvider = new ArrayList<>();
    }
    this.serviceProvider.add(serviceProviderItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return serviceProvider
  */
  @NotNull @Valid 
  @Schema(name = "serviceProvider", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceProvider")
  public List<@Valid SpecificLanguageString> getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(List<@Valid SpecificLanguageString> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public FinancialTransaction taxIncluded(Boolean taxIncluded) {
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

  public FinancialTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Identifier for the transaction (e.g. reservation number, credit card transaction reference) as agreed  upon by the two entities sharing data.
   * @return transactionId
  */
  
  @Schema(name = "transactionId", description = "Identifier for the transaction (e.g. reservation number, credit card transaction reference) as agreed  upon by the two entities sharing data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialTransaction financialTransaction = (FinancialTransaction) o;
    return Objects.equals(this.dateCollected, financialTransaction.dateCollected) &&
        Objects.equals(this.rateLineId, financialTransaction.rateLineId) &&
        Objects.equals(this.segmentValue, financialTransaction.segmentValue) &&
        Objects.equals(this.serviceProvider, financialTransaction.serviceProvider) &&
        Objects.equals(this.taxIncluded, financialTransaction.taxIncluded) &&
        Objects.equals(this.transactionId, financialTransaction.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCollected, rateLineId, segmentValue, serviceProvider, taxIncluded, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialTransaction {\n");
    sb.append("    dateCollected: ").append(toIndentedString(dateCollected)).append("\n");
    sb.append("    rateLineId: ").append(toIndentedString(rateLineId)).append("\n");
    sb.append("    segmentValue: ").append(toIndentedString(segmentValue)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    taxIncluded: ").append(toIndentedString(taxIncluded)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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


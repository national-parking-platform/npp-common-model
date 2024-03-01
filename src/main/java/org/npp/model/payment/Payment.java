package org.npp.model.payment;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.payment.PaymentLine;
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
 * Lightweight record of payment for associated AssignedRight (temporary)
 */

@Schema(name = "Payment", description = "Lightweight record of payment for associated AssignedRight (temporary)")

public class Payment {

  private String id;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateCollected;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startPeriodCovered;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endPeriodCovered;

  private String idCode;

  private VersionedReference serviceProvider;

  private String transactionID;

  @Valid
  private List<@Valid PaymentLine> paymentLines = new ArrayList<>();

  public Payment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Payment(String id, Integer version, VersionedReference serviceProvider, List<@Valid PaymentLine> paymentLines) {
    this.id = id;
    this.version = version;
    this.serviceProvider = serviceProvider;
    this.paymentLines = paymentLines;
  }

  public Payment id(String id) {
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

  public Payment version(Integer version) {
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

  public Payment dateCollected(OffsetDateTime dateCollected) {
    this.dateCollected = dateCollected;
    return this;
  }

  /**
   * Date / time that the payment related to this financial transaction is recorded as being paid and collected.
   * @return dateCollected
  */
  @Valid 
  @Schema(name = "dateCollected", description = "Date / time that the payment related to this financial transaction is recorded as being paid and collected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateCollected")
  public OffsetDateTime getDateCollected() {
    return dateCollected;
  }

  public void setDateCollected(OffsetDateTime dateCollected) {
    this.dateCollected = dateCollected;
  }

  public Payment startPeriodCovered(OffsetDateTime startPeriodCovered) {
    this.startPeriodCovered = startPeriodCovered;
    return this;
  }

  /**
   * Note field to describe the period a payment covers.
   * @return startPeriodCovered
  */
  @Valid 
  @Schema(name = "startPeriodCovered", description = "Note field to describe the period a payment covers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startPeriodCovered")
  public OffsetDateTime getStartPeriodCovered() {
    return startPeriodCovered;
  }

  public void setStartPeriodCovered(OffsetDateTime startPeriodCovered) {
    this.startPeriodCovered = startPeriodCovered;
  }

  public Payment endPeriodCovered(OffsetDateTime endPeriodCovered) {
    this.endPeriodCovered = endPeriodCovered;
    return this;
  }

  /**
   * Note field to describe the period a payment covers.
   * @return endPeriodCovered
  */
  @Valid 
  @Schema(name = "endPeriodCovered", description = "Note field to describe the period a payment covers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endPeriodCovered")
  public OffsetDateTime getEndPeriodCovered() {
    return endPeriodCovered;
  }

  public void setEndPeriodCovered(OffsetDateTime endPeriodCovered) {
    this.endPeriodCovered = endPeriodCovered;
  }

  public Payment idCode(String idCode) {
    this.idCode = idCode;
    return this;
  }

  /**
   * User defined field to identity additional details such as customer account number or G/L account number.
   * @return idCode
  */
  
  @Schema(name = "idCode", description = "User defined field to identity additional details such as customer account number or G/L account number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idCode")
  public String getIdCode() {
    return idCode;
  }

  public void setIdCode(String idCode) {
    this.idCode = idCode;
  }

  public Payment serviceProvider(VersionedReference serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
  */
  @NotNull @Valid 
  @Schema(name = "serviceProvider", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceProvider")
  public VersionedReference getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(VersionedReference serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public Payment transactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Identifier for the transaction (e.g. reservation number, credit card transaction reference) as agreed  upon by the two entities sharing data.
   * @return transactionID
  */
  
  @Schema(name = "transactionID", description = "Identifier for the transaction (e.g. reservation number, credit card transaction reference) as agreed  upon by the two entities sharing data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionID")
  public String getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  public Payment paymentLines(List<@Valid PaymentLine> paymentLines) {
    this.paymentLines = paymentLines;
    return this;
  }

  public Payment addPaymentLinesItem(PaymentLine paymentLinesItem) {
    if (this.paymentLines == null) {
      this.paymentLines = new ArrayList<>();
    }
    this.paymentLines.add(paymentLinesItem);
    return this;
  }

  /**
   * A data class that enables transaction details to be accumulated.
   * @return paymentLines
  */
  @NotNull @Valid 
  @Schema(name = "paymentLines", description = "A data class that enables transaction details to be accumulated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentLines")
  public List<@Valid PaymentLine> getPaymentLines() {
    return paymentLines;
  }

  public void setPaymentLines(List<@Valid PaymentLine> paymentLines) {
    this.paymentLines = paymentLines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.version, payment.version) &&
        Objects.equals(this.dateCollected, payment.dateCollected) &&
        Objects.equals(this.startPeriodCovered, payment.startPeriodCovered) &&
        Objects.equals(this.endPeriodCovered, payment.endPeriodCovered) &&
        Objects.equals(this.idCode, payment.idCode) &&
        Objects.equals(this.serviceProvider, payment.serviceProvider) &&
        Objects.equals(this.transactionID, payment.transactionID) &&
        Objects.equals(this.paymentLines, payment.paymentLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, dateCollected, startPeriodCovered, endPeriodCovered, idCode, serviceProvider, transactionID, paymentLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCollected: ").append(toIndentedString(dateCollected)).append("\n");
    sb.append("    startPeriodCovered: ").append(toIndentedString(startPeriodCovered)).append("\n");
    sb.append("    endPeriodCovered: ").append(toIndentedString(endPeriodCovered)).append("\n");
    sb.append("    idCode: ").append(toIndentedString(idCode)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    paymentLines: ").append(toIndentedString(paymentLines)).append("\n");
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


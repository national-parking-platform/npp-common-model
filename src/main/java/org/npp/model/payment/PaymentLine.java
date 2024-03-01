package org.npp.model.payment;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.payment.AmountInCurrency;
import org.npp.model.payment.enums.PaymentTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A data class that enables transaction details to be accumulated based on the type of payment (ie, base fee, taxes, surcharges, etc)
 */

@Schema(name = "PaymentLine", description = "A data class that enables transaction details to be accumulated based on the type of payment (ie, base fee, taxes, surcharges, etc)")

public class PaymentLine {

  private String id;

  private Integer version;

  private AmountInCurrency value;

  private String idCode;

  private String identifierId;

  private PaymentTypeEnum paymentType;

  public PaymentLine() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentLine(String id, Integer version, AmountInCurrency value, PaymentTypeEnum paymentType) {
    this.id = id;
    this.version = version;
    this.value = value;
    this.paymentType = paymentType;
  }

  public PaymentLine id(String id) {
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

  public PaymentLine version(Integer version) {
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

  public PaymentLine value(AmountInCurrency value) {
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

  public PaymentLine idCode(String idCode) {
    this.idCode = idCode;
    return this;
  }

  /**
   * Unique cost code identifier, potentially agreed bi-laterally between data supplier and data receiver.
   * @return idCode
  */
  
  @Schema(name = "idCode", description = "Unique cost code identifier, potentially agreed bi-laterally between data supplier and data receiver.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idCode")
  public String getIdCode() {
    return idCode;
  }

  public void setIdCode(String idCode) {
    this.idCode = idCode;
  }

  public PaymentLine identifierId(String identifierId) {
    this.identifierId = identifierId;
    return this;
  }

  /**
   * Identifier for the transaction (e.g. reservation number, credit card transaction reference).
   * @return identifierId
  */
  
  @Schema(name = "identifierId", description = "Identifier for the transaction (e.g. reservation number, credit card transaction reference).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identifierId")
  public String getIdentifierId() {
    return identifierId;
  }

  public void setIdentifierId(String identifierId) {
    this.identifierId = identifierId;
  }

  public PaymentLine paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @NotNull @Valid 
  @Schema(name = "paymentType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentType")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLine paymentLine = (PaymentLine) o;
    return Objects.equals(this.id, paymentLine.id) &&
        Objects.equals(this.version, paymentLine.version) &&
        Objects.equals(this.value, paymentLine.value) &&
        Objects.equals(this.idCode, paymentLine.idCode) &&
        Objects.equals(this.identifierId, paymentLine.identifierId) &&
        Objects.equals(this.paymentType, paymentLine.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, value, idCode, identifierId, paymentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLine {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    idCode: ").append(toIndentedString(idCode)).append("\n");
    sb.append("    identifierId: ").append(toIndentedString(identifierId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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


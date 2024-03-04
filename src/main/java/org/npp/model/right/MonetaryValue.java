package org.npp.model.right;
  
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
 * Lightweight record of the monetary financial value of the associated AssignedRight (temporary).  Service provider is entity responsible for selling/collecting fees associated to the AR.
 */

@Schema(name = "MonetaryValue", description = "Lightweight record of the monetary financial value of the associated AssignedRight (temporary).  Service provider is entity responsible for selling/collecting fees associated to the AR.")

public class MonetaryValue {

  private Boolean taxIncluded;

  private VersionedReference serviceProvider;

  private AmountInCurrency value;

  public MonetaryValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MonetaryValue(Boolean taxIncluded, VersionedReference serviceProvider, AmountInCurrency value) {
    this.taxIncluded = taxIncluded;
    this.serviceProvider = serviceProvider;
    this.value = value;
  }

  public MonetaryValue taxIncluded(Boolean taxIncluded) {
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

  public MonetaryValue serviceProvider(VersionedReference serviceProvider) {
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

  public MonetaryValue value(AmountInCurrency value) {
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
    MonetaryValue monetaryValue = (MonetaryValue) o;
    return Objects.equals(this.taxIncluded, monetaryValue.taxIncluded) &&
        Objects.equals(this.serviceProvider, monetaryValue.serviceProvider) &&
        Objects.equals(this.value, monetaryValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxIncluded, serviceProvider, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryValue {\n");
    sb.append("    taxIncluded: ").append(toIndentedString(taxIncluded)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
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


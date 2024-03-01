package org.npp.model.payment;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.payment.BrandsAcceptedCodeList;
import org.npp.model.payment.BrandsAcceptedText;
import org.npp.model.payment.enums.MeansOfPaymentEnum;
import org.npp.model.payment.enums.PaymentTimingEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Provides information on the means of payment available
 */

@Schema(name = "PaymentMethod", description = "Provides information on the means of payment available")

public class PaymentMethod {

  @Valid
  private List<@Valid MeansOfPaymentEnum> paymentMeans;

  @Valid
  private List<@Valid PaymentTimingEnum> paymentMode;

  @Valid
  private List<@Valid BrandsAcceptedCodeList> brandsAcceptedCodeList;

  @Valid
  private List<@Valid BrandsAcceptedText> brandsAcceptedText;

  public PaymentMethod paymentMeans(List<@Valid MeansOfPaymentEnum> paymentMeans) {
    this.paymentMeans = paymentMeans;
    return this;
  }

  public PaymentMethod addPaymentMeansItem(MeansOfPaymentEnum paymentMeansItem) {
    if (this.paymentMeans == null) {
      this.paymentMeans = new ArrayList<>();
    }
    this.paymentMeans.add(paymentMeansItem);
    return this;
  }

  /**
   * The means of payment available
   * @return paymentMeans
  */
  @Valid 
  @Schema(name = "paymentMeans", description = "The means of payment available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMeans")
  public List<@Valid MeansOfPaymentEnum> getPaymentMeans() {
    return paymentMeans;
  }

  public void setPaymentMeans(List<@Valid MeansOfPaymentEnum> paymentMeans) {
    this.paymentMeans = paymentMeans;
  }

  public PaymentMethod paymentMode(List<@Valid PaymentTimingEnum> paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  public PaymentMethod addPaymentModeItem(PaymentTimingEnum paymentModeItem) {
    if (this.paymentMode == null) {
      this.paymentMode = new ArrayList<>();
    }
    this.paymentMode.add(paymentModeItem);
    return this;
  }

  /**
   * Defines the timing of the parking or other mobility related payment
   * @return paymentMode
  */
  @Valid 
  @Schema(name = "paymentMode", description = "Defines the timing of the parking or other mobility related payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMode")
  public List<@Valid PaymentTimingEnum> getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(List<@Valid PaymentTimingEnum> paymentMode) {
    this.paymentMode = paymentMode;
  }

  public PaymentMethod brandsAcceptedCodeList(List<@Valid BrandsAcceptedCodeList> brandsAcceptedCodeList) {
    this.brandsAcceptedCodeList = brandsAcceptedCodeList;
    return this;
  }

  public PaymentMethod addBrandsAcceptedCodeListItem(BrandsAcceptedCodeList brandsAcceptedCodeListItem) {
    if (this.brandsAcceptedCodeList == null) {
      this.brandsAcceptedCodeList = new ArrayList<>();
    }
    this.brandsAcceptedCodeList.add(brandsAcceptedCodeListItem);
    return this;
  }

  /**
   * List of accepted brands for payment cards (by code)
   * @return brandsAcceptedCodeList
  */
  @Valid 
  @Schema(name = "brandsAcceptedCodeList", description = "List of accepted brands for payment cards (by code)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brandsAcceptedCodeList")
  public List<@Valid BrandsAcceptedCodeList> getBrandsAcceptedCodeList() {
    return brandsAcceptedCodeList;
  }

  public void setBrandsAcceptedCodeList(List<@Valid BrandsAcceptedCodeList> brandsAcceptedCodeList) {
    this.brandsAcceptedCodeList = brandsAcceptedCodeList;
  }

  public PaymentMethod brandsAcceptedText(List<@Valid BrandsAcceptedText> brandsAcceptedText) {
    this.brandsAcceptedText = brandsAcceptedText;
    return this;
  }

  public PaymentMethod addBrandsAcceptedTextItem(BrandsAcceptedText brandsAcceptedTextItem) {
    if (this.brandsAcceptedText == null) {
      this.brandsAcceptedText = new ArrayList<>();
    }
    this.brandsAcceptedText.add(brandsAcceptedTextItem);
    return this;
  }

  /**
   * List of accepted brands for payment cards (by name)
   * @return brandsAcceptedText
  */
  @Valid 
  @Schema(name = "brandsAcceptedText", description = "List of accepted brands for payment cards (by name)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brandsAcceptedText")
  public List<@Valid BrandsAcceptedText> getBrandsAcceptedText() {
    return brandsAcceptedText;
  }

  public void setBrandsAcceptedText(List<@Valid BrandsAcceptedText> brandsAcceptedText) {
    this.brandsAcceptedText = brandsAcceptedText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.paymentMeans, paymentMethod.paymentMeans) &&
        Objects.equals(this.paymentMode, paymentMethod.paymentMode) &&
        Objects.equals(this.brandsAcceptedCodeList, paymentMethod.brandsAcceptedCodeList) &&
        Objects.equals(this.brandsAcceptedText, paymentMethod.brandsAcceptedText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMeans, paymentMode, brandsAcceptedCodeList, brandsAcceptedText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    paymentMeans: ").append(toIndentedString(paymentMeans)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    brandsAcceptedCodeList: ").append(toIndentedString(brandsAcceptedCodeList)).append("\n");
    sb.append("    brandsAcceptedText: ").append(toIndentedString(brandsAcceptedText)).append("\n");
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


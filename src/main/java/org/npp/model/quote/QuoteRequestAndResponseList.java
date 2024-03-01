package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.quote.QuoteRequestAndResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * List of QuoteRequest and QuoteResponse
 */

@Schema(name = "QuoteRequestAndResponseList", description = "List of QuoteRequest and QuoteResponse")

public class QuoteRequestAndResponseList {

  private Integer referenceInstant;

  private Integer offset;

  private Integer pageSize;

  private Integer total;

  @Valid
  private List<@Valid QuoteRequestAndResponse> data;

  public QuoteRequestAndResponseList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteRequestAndResponseList(Integer referenceInstant, Integer offset, Integer pageSize, Integer total) {
    this.referenceInstant = referenceInstant;
    this.offset = offset;
    this.pageSize = pageSize;
    this.total = total;
  }

  public QuoteRequestAndResponseList referenceInstant(Integer referenceInstant) {
    this.referenceInstant = referenceInstant;
    return this;
  }

  /**
   * Allows a consistent view of data across multiple paged requests.  Unix epoch time to be used as reference for offset > 0 (corresponds to query instant, as returned  by server on first call) - should be the same for all pages'
   * minimum: 0
   * @return referenceInstant
  */
  @NotNull @Min(0) 
  @Schema(name = "referenceInstant", description = "Allows a consistent view of data across multiple paged requests.  Unix epoch time to be used as reference for offset > 0 (corresponds to query instant, as returned  by server on first call) - should be the same for all pages'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("referenceInstant")
  public Integer getReferenceInstant() {
    return referenceInstant;
  }

  public void setReferenceInstant(Integer referenceInstant) {
    this.referenceInstant = referenceInstant;
  }

  public QuoteRequestAndResponseList offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Index of the first item returned in the page.
   * minimum: 0
   * @return offset
  */
  @NotNull @Min(0) 
  @Schema(name = "offset", description = "Index of the first item returned in the page.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public QuoteRequestAndResponseList pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Maximum number of items that can be returned per page.
   * minimum: 0
   * @return pageSize
  */
  @NotNull @Min(0) 
  @Schema(name = "pageSize", description = "Maximum number of items that can be returned per page.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public QuoteRequestAndResponseList total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of items contained in all pages.
   * minimum: 0
   * @return total
  */
  @NotNull @Min(0) 
  @Schema(name = "total", description = "Total number of items contained in all pages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public QuoteRequestAndResponseList data(List<@Valid QuoteRequestAndResponse> data) {
    this.data = data;
    return this;
  }

  public QuoteRequestAndResponseList addDataItem(QuoteRequestAndResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of QuoteRequest and QuoteResponse
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "List of QuoteRequest and QuoteResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid QuoteRequestAndResponse> getData() {
    return data;
  }

  public void setData(List<@Valid QuoteRequestAndResponse> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteRequestAndResponseList quoteRequestAndResponseList = (QuoteRequestAndResponseList) o;
    return Objects.equals(this.referenceInstant, quoteRequestAndResponseList.referenceInstant) &&
        Objects.equals(this.offset, quoteRequestAndResponseList.offset) &&
        Objects.equals(this.pageSize, quoteRequestAndResponseList.pageSize) &&
        Objects.equals(this.total, quoteRequestAndResponseList.total) &&
        Objects.equals(this.data, quoteRequestAndResponseList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceInstant, offset, pageSize, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteRequestAndResponseList {\n");
    sb.append("    referenceInstant: ").append(toIndentedString(referenceInstant)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


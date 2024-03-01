package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.right.RightSpecification;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Paginated list of RightSpecification
 */

@Schema(name = "RightSpecificationList", description = "Paginated list of RightSpecification")

public class RightSpecificationList {

  private Integer referenceInstant;

  private Integer offset;

  private Integer pageSize;

  private Integer total;

  @Valid
  private List<@Valid RightSpecification> data;

  public RightSpecificationList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RightSpecificationList(Integer referenceInstant, Integer offset, Integer pageSize, Integer total) {
    this.referenceInstant = referenceInstant;
    this.offset = offset;
    this.pageSize = pageSize;
    this.total = total;
  }

  public RightSpecificationList referenceInstant(Integer referenceInstant) {
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

  public RightSpecificationList offset(Integer offset) {
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

  public RightSpecificationList pageSize(Integer pageSize) {
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

  public RightSpecificationList total(Integer total) {
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

  public RightSpecificationList data(List<@Valid RightSpecification> data) {
    this.data = data;
    return this;
  }

  public RightSpecificationList addDataItem(RightSpecification dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of RightSpecifications
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "List of RightSpecifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid RightSpecification> getData() {
    return data;
  }

  public void setData(List<@Valid RightSpecification> data) {
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
    RightSpecificationList rightSpecificationList = (RightSpecificationList) o;
    return Objects.equals(this.referenceInstant, rightSpecificationList.referenceInstant) &&
        Objects.equals(this.offset, rightSpecificationList.offset) &&
        Objects.equals(this.pageSize, rightSpecificationList.pageSize) &&
        Objects.equals(this.total, rightSpecificationList.total) &&
        Objects.equals(this.data, rightSpecificationList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceInstant, offset, pageSize, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightSpecificationList {\n");
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


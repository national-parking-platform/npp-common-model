package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Metadata for paginated list of results for Listing APIs&#39;
 */

@Schema(name = "PaginatedListMeta", description = "Metadata for paginated list of results for Listing APIs'")

public class PaginatedListMeta {

  private Integer referenceInstant;

  private Integer offset;

  private Integer pageSize;

  private Integer total;

  public PaginatedListMeta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaginatedListMeta(Integer referenceInstant, Integer offset, Integer pageSize, Integer total) {
    this.referenceInstant = referenceInstant;
    this.offset = offset;
    this.pageSize = pageSize;
    this.total = total;
  }

  public PaginatedListMeta referenceInstant(Integer referenceInstant) {
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

  public PaginatedListMeta offset(Integer offset) {
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

  public PaginatedListMeta pageSize(Integer pageSize) {
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

  public PaginatedListMeta total(Integer total) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedListMeta paginatedListMeta = (PaginatedListMeta) o;
    return Objects.equals(this.referenceInstant, paginatedListMeta.referenceInstant) &&
        Objects.equals(this.offset, paginatedListMeta.offset) &&
        Objects.equals(this.pageSize, paginatedListMeta.pageSize) &&
        Objects.equals(this.total, paginatedListMeta.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceInstant, offset, pageSize, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedListMeta {\n");
    sb.append("    referenceInstant: ").append(toIndentedString(referenceInstant)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


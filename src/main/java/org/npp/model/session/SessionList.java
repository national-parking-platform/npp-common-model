package org.npp.model.session;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.session.Session;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Paginated list of Sessions
 */

@Schema(name = "SessionList", description = "Paginated list of Sessions")

public class SessionList {

  private Integer referenceInstant;

  private Integer offset;

  private Integer pageSize;

  private Integer total;

  @Valid
  private List<@Valid Session> data;

  public SessionList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SessionList(Integer referenceInstant, Integer offset, Integer pageSize, Integer total) {
    this.referenceInstant = referenceInstant;
    this.offset = offset;
    this.pageSize = pageSize;
    this.total = total;
  }

  public SessionList referenceInstant(Integer referenceInstant) {
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

  public SessionList offset(Integer offset) {
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

  public SessionList pageSize(Integer pageSize) {
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

  public SessionList total(Integer total) {
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

  public SessionList data(List<@Valid Session> data) {
    this.data = data;
    return this;
  }

  public SessionList addDataItem(Session dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of Sessions
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "List of Sessions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid Session> getData() {
    return data;
  }

  public void setData(List<@Valid Session> data) {
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
    SessionList sessionList = (SessionList) o;
    return Objects.equals(this.referenceInstant, sessionList.referenceInstant) &&
        Objects.equals(this.offset, sessionList.offset) &&
        Objects.equals(this.pageSize, sessionList.pageSize) &&
        Objects.equals(this.total, sessionList.total) &&
        Objects.equals(this.data, sessionList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceInstant, offset, pageSize, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionList {\n");
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


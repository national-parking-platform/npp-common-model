package org.npp.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.api.DeletedReference;
import org.npp.model.api.PaginatedListMeta;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

/**
 * Paginated list of results for listing APIs
 */

@Schema(name = "PaginatedList", description = "Paginated list of results for listing APIs")

public class PaginatedList {

  private PaginatedListMeta meta;

  @Valid
  private List<@Valid DeletedReference> deletedReferences;

  public PaginatedList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaginatedList(PaginatedListMeta meta) {
    this.meta = meta;
  }

  public PaginatedList meta(PaginatedListMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @NotNull @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("meta")
  public PaginatedListMeta getMeta() {
    return meta;
  }

  public void setMeta(PaginatedListMeta meta) {
    this.meta = meta;
  }

  public PaginatedList deletedReferences(List<@Valid DeletedReference> deletedReferences) {
    this.deletedReferences = deletedReferences;
    return this;
  }

  public PaginatedList addDeletedReferencesItem(DeletedReference deletedReferencesItem) {
    if (this.deletedReferences == null) {
      this.deletedReferences = new ArrayList<>();
    }
    this.deletedReferences.add(deletedReferencesItem);
    return this;
  }

  /**
   * This attribute will returned when the `modified_since` query parameter is used. It will contain references to deleted resources since the provided instant, that would have otherwise been included in the dataset (either at the top-level or as associated objects)
   * @return deletedReferences
  */
  @Valid 
  @Schema(name = "deletedReferences", description = "This attribute will returned when the `modified_since` query parameter is used. It will contain references to deleted resources since the provided instant, that would have otherwise been included in the dataset (either at the top-level or as associated objects)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedReferences")
  public List<@Valid DeletedReference> getDeletedReferences() {
    return deletedReferences;
  }

  public void setDeletedReferences(List<@Valid DeletedReference> deletedReferences) {
    this.deletedReferences = deletedReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedList paginatedList = (PaginatedList) o;
    return Objects.equals(this.meta, paginatedList.meta) &&
        Objects.equals(this.deletedReferences, paginatedList.deletedReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, deletedReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedList {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    deletedReferences: ").append(toIndentedString(deletedReferences)).append("\n");
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


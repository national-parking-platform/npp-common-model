package org.npp.model.payment;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.ReferencedCodeListEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Use this class to describe details of the brands that are accepted.
 */

@Schema(name = "BrandsAcceptedCodeList", description = "Use this class to describe details of the brands that are accepted.")

public class BrandsAcceptedCodeList {

  private ReferencedCodeListEntry brandsAcceptedList;

  public BrandsAcceptedCodeList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BrandsAcceptedCodeList(ReferencedCodeListEntry brandsAcceptedList) {
    this.brandsAcceptedList = brandsAcceptedList;
  }

  public BrandsAcceptedCodeList brandsAcceptedList(ReferencedCodeListEntry brandsAcceptedList) {
    this.brandsAcceptedList = brandsAcceptedList;
    return this;
  }

  /**
   * Get brandsAcceptedList
   * @return brandsAcceptedList
  */
  @NotNull @Valid 
  @Schema(name = "brandsAcceptedList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brandsAcceptedList")
  public ReferencedCodeListEntry getBrandsAcceptedList() {
    return brandsAcceptedList;
  }

  public void setBrandsAcceptedList(ReferencedCodeListEntry brandsAcceptedList) {
    this.brandsAcceptedList = brandsAcceptedList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsAcceptedCodeList brandsAcceptedCodeList = (BrandsAcceptedCodeList) o;
    return Objects.equals(this.brandsAcceptedList, brandsAcceptedCodeList.brandsAcceptedList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandsAcceptedList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsAcceptedCodeList {\n");
    sb.append("    brandsAcceptedList: ").append(toIndentedString(brandsAcceptedList)).append("\n");
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


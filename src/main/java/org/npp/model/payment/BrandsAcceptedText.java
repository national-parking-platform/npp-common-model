package org.npp.model.payment;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.SpecificLanguageString;
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

@Schema(name = "BrandsAcceptedText", description = "Use this class to describe details of the brands that are accepted.")

public class BrandsAcceptedText {

  @Valid
  private List<@Valid SpecificLanguageString> brandsAccepted;

  public BrandsAcceptedText brandsAccepted(List<@Valid SpecificLanguageString> brandsAccepted) {
    this.brandsAccepted = brandsAccepted;
    return this;
  }

  public BrandsAcceptedText addBrandsAcceptedItem(SpecificLanguageString brandsAcceptedItem) {
    if (this.brandsAccepted == null) {
      this.brandsAccepted = new ArrayList<>();
    }
    this.brandsAccepted.add(brandsAcceptedItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return brandsAccepted
  */
  @Valid 
  @Schema(name = "brandsAccepted", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brandsAccepted")
  public List<@Valid SpecificLanguageString> getBrandsAccepted() {
    return brandsAccepted;
  }

  public void setBrandsAccepted(List<@Valid SpecificLanguageString> brandsAccepted) {
    this.brandsAccepted = brandsAccepted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsAcceptedText brandsAcceptedText = (BrandsAcceptedText) o;
    return Objects.equals(this.brandsAccepted, brandsAcceptedText.brandsAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandsAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsAcceptedText {\n");
    sb.append("    brandsAccepted: ").append(toIndentedString(brandsAccepted)).append("\n");
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


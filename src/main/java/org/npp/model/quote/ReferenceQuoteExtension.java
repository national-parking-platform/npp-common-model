package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class providing a versioned reference to a quote for a session extension.
 */

@Schema(name = "ReferenceQuoteExtension", description = "Class providing a versioned reference to a quote for a session extension.")

public class ReferenceQuoteExtension implements ReferenceToQuote {

  private VersionedReference quoteResponseId;

  private VersionedReference optionId;

  public ReferenceQuoteExtension quoteResponseId(VersionedReference quoteResponseId) {
    this.quoteResponseId = quoteResponseId;
    return this;
  }

  /**
   * Get quoteResponseId
   * @return quoteResponseId
  */
  @Valid 
  @Schema(name = "quoteResponseId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteResponseId")
  public VersionedReference getQuoteResponseId() {
    return quoteResponseId;
  }

  public void setQuoteResponseId(VersionedReference quoteResponseId) {
    this.quoteResponseId = quoteResponseId;
  }

  public ReferenceQuoteExtension optionId(VersionedReference optionId) {
    this.optionId = optionId;
    return this;
  }

  /**
   * Get optionId
   * @return optionId
  */
  @Valid 
  @Schema(name = "optionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionId")
  public VersionedReference getOptionId() {
    return optionId;
  }

  public void setOptionId(VersionedReference optionId) {
    this.optionId = optionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceQuoteExtension referenceQuoteExtension = (ReferenceQuoteExtension) o;
    return Objects.equals(this.quoteResponseId, referenceQuoteExtension.quoteResponseId) &&
        Objects.equals(this.optionId, referenceQuoteExtension.optionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteResponseId, optionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceQuoteExtension {\n");
    sb.append("    quoteResponseId: ").append(toIndentedString(quoteResponseId)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
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


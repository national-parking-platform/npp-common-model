package org.npp.model.quote;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.quote.FinancialQuote;
import org.npp.model.quote.Identifiers;
import org.npp.model.quote.QuoteExpiration;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class providing one option to a quote request
 */

@Schema(name = "Option", description = "Class providing one option to a quote request")

public class Option {

  private String id;

  private Integer version;

  private VersionedReference elementId;

  private Boolean exact;

  private QuoteExpiration quoteExpiration;

  @Valid
  private List<@Valid Identifiers> identifiers;

  private FinancialQuote financialQuote;

  public Option() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Option(String id, Integer version, QuoteExpiration quoteExpiration, FinancialQuote financialQuote) {
    this.id = id;
    this.version = version;
    this.quoteExpiration = quoteExpiration;
    this.financialQuote = financialQuote;
  }

  public Option id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for object.
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Unique identifier for object.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Option version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Positive integer representing the object version.
   * minimum: 1
   * @return version
  */
  @NotNull @Min(1) 
  @Schema(name = "version", description = "Positive integer representing the object version.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Option elementId(VersionedReference elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
  */
  @Valid 
  @Schema(name = "elementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementId")
  public VersionedReference getElementId() {
    return elementId;
  }

  public void setElementId(VersionedReference elementId) {
    this.elementId = elementId;
  }

  public Option exact(Boolean exact) {
    this.exact = exact;
    return this;
  }

  /**
   * indicates the supplied Option fully covers the time period requested
   * @return exact
  */
  
  @Schema(name = "exact", description = "indicates the supplied Option fully covers the time period requested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exact")
  public Boolean getExact() {
    return exact;
  }

  public void setExact(Boolean exact) {
    this.exact = exact;
  }

  public Option quoteExpiration(QuoteExpiration quoteExpiration) {
    this.quoteExpiration = quoteExpiration;
    return this;
  }

  /**
   * Get quoteExpiration
   * @return quoteExpiration
  */
  @NotNull @Valid 
  @Schema(name = "quoteExpiration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quoteExpiration")
  public QuoteExpiration getQuoteExpiration() {
    return quoteExpiration;
  }

  public void setQuoteExpiration(QuoteExpiration quoteExpiration) {
    this.quoteExpiration = quoteExpiration;
  }

  public Option identifiers(List<@Valid Identifiers> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public Option addIdentifiersItem(Identifiers identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
  */
  @Valid @Size(min = 1) 
  @Schema(name = "identifiers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identifiers")
  public List<@Valid Identifiers> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<@Valid Identifiers> identifiers) {
    this.identifiers = identifiers;
  }

  public Option financialQuote(FinancialQuote financialQuote) {
    this.financialQuote = financialQuote;
    return this;
  }

  /**
   * Get financialQuote
   * @return financialQuote
  */
  @NotNull @Valid 
  @Schema(name = "financialQuote", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("financialQuote")
  public FinancialQuote getFinancialQuote() {
    return financialQuote;
  }

  public void setFinancialQuote(FinancialQuote financialQuote) {
    this.financialQuote = financialQuote;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.id, option.id) &&
        Objects.equals(this.version, option.version) &&
        Objects.equals(this.elementId, option.elementId) &&
        Objects.equals(this.exact, option.exact) &&
        Objects.equals(this.quoteExpiration, option.quoteExpiration) &&
        Objects.equals(this.identifiers, option.identifiers) &&
        Objects.equals(this.financialQuote, option.financialQuote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, elementId, exact, quoteExpiration, identifiers, financialQuote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    exact: ").append(toIndentedString(exact)).append("\n");
    sb.append("    quoteExpiration: ").append(toIndentedString(quoteExpiration)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    financialQuote: ").append(toIndentedString(financialQuote)).append("\n");
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


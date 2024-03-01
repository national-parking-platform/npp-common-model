package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.Reference;
import org.npp.model.common.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class providing structure to support reference to an entry in a previously defined user-defined code list.
 */

@Schema(name = "ReferencedCodeListEntry", description = "Class providing structure to support reference to an entry in a previously defined user-defined code list.")

public class ReferencedCodeListEntry {

  private Reference codeListEntryId;

  private VersionedReference codeListId;

  private String entryDefinedValue;

  public ReferencedCodeListEntry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReferencedCodeListEntry(String entryDefinedValue) {
    this.entryDefinedValue = entryDefinedValue;
  }

  public ReferencedCodeListEntry codeListEntryId(Reference codeListEntryId) {
    this.codeListEntryId = codeListEntryId;
    return this;
  }

  /**
   * Get codeListEntryId
   * @return codeListEntryId
  */
  @Valid 
  @Schema(name = "codeListEntryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeListEntryId")
  public Reference getCodeListEntryId() {
    return codeListEntryId;
  }

  public void setCodeListEntryId(Reference codeListEntryId) {
    this.codeListEntryId = codeListEntryId;
  }

  public ReferencedCodeListEntry codeListId(VersionedReference codeListId) {
    this.codeListId = codeListId;
    return this;
  }

  /**
   * Get codeListId
   * @return codeListId
  */
  @Valid 
  @Schema(name = "codeListId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeListId")
  public VersionedReference getCodeListId() {
    return codeListId;
  }

  public void setCodeListId(VersionedReference codeListId) {
    this.codeListId = codeListId;
  }

  public ReferencedCodeListEntry entryDefinedValue(String entryDefinedValue) {
    this.entryDefinedValue = entryDefinedValue;
    return this;
  }

  /**
   * Free-text defined text (name) for the code list entry being referenced.
   * @return entryDefinedValue
  */
  @NotNull 
  @Schema(name = "entryDefinedValue", description = "Free-text defined text (name) for the code list entry being referenced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entryDefinedValue")
  public String getEntryDefinedValue() {
    return entryDefinedValue;
  }

  public void setEntryDefinedValue(String entryDefinedValue) {
    this.entryDefinedValue = entryDefinedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedCodeListEntry referencedCodeListEntry = (ReferencedCodeListEntry) o;
    return Objects.equals(this.codeListEntryId, referencedCodeListEntry.codeListEntryId) &&
        Objects.equals(this.codeListId, referencedCodeListEntry.codeListId) &&
        Objects.equals(this.entryDefinedValue, referencedCodeListEntry.entryDefinedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeListEntryId, codeListId, entryDefinedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedCodeListEntry {\n");
    sb.append("    codeListEntryId: ").append(toIndentedString(codeListEntryId)).append("\n");
    sb.append("    codeListId: ").append(toIndentedString(codeListId)).append("\n");
    sb.append("    entryDefinedValue: ").append(toIndentedString(entryDefinedValue)).append("\n");
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

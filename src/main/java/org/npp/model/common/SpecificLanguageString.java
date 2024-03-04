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
 * SpecificLanguageString containing a language code (using ISO 639-1:2002) and the translated string.
 */

@Schema(name = "SpecificLanguageString", description = "SpecificLanguageString containing a language code (using ISO 639-1:2002) and the translated string.")

public class SpecificLanguageString {

  private String language;

  private String string;

  public SpecificLanguageString() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SpecificLanguageString(String language, String string) {
    this.language = language;
    this.string = string;
  }

  public SpecificLanguageString language(String language) {
    this.language = language;
    return this;
  }

  /**
   * ISO 639-1:2002 language code.
   * @return language
  */
  @NotNull @Pattern(regexp = "^[a-z]{2}$") 
  @Schema(name = "language", example = "en", description = "ISO 639-1:2002 language code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public SpecificLanguageString string(String string) {
    this.string = string;
    return this;
  }

  /**
   * Translated string
   * @return string
  */
  @NotNull 
  @Schema(name = "string", example = "string", description = "Translated string", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("string")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificLanguageString specificLanguageString = (SpecificLanguageString) o;
    return Objects.equals(this.language, specificLanguageString.language) &&
        Objects.equals(this.string, specificLanguageString.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, string);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificLanguageString {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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


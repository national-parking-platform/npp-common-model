package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.enums.AddressLineTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information concerning one line of a postal address.
 */

@Schema(name = "AddressLine", description = "A class defining information concerning one line of a postal address.")

public class AddressLine {

  private Integer order;

  @Valid
  private List<@Valid SpecificLanguageString> text = new ArrayList<>();

  private AddressLineTypeEnum type;

  public AddressLine() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddressLine(Integer order, List<@Valid SpecificLanguageString> text, AddressLineTypeEnum type) {
    this.order = order;
    this.text = text;
    this.type = type;
  }

  public AddressLine order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * The sequence order that the address line element should be displayed in
   * minimum: 0
   * @return order
  */
  @NotNull @Min(0) 
  @Schema(name = "order", description = "The sequence order that the address line element should be displayed in", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public AddressLine text(List<@Valid SpecificLanguageString> text) {
    this.text = text;
    return this;
  }

  public AddressLine addTextItem(SpecificLanguageString textItem) {
    if (this.text == null) {
      this.text = new ArrayList<>();
    }
    this.text.add(textItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return text
  */
  @NotNull @Valid 
  @Schema(name = "text", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public List<@Valid SpecificLanguageString> getText() {
    return text;
  }

  public void setText(List<@Valid SpecificLanguageString> text) {
    this.text = text;
  }

  public AddressLine type(AddressLineTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public AddressLineTypeEnum getType() {
    return type;
  }

  public void setType(AddressLineTypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressLine addressLine = (AddressLine) o;
    return Objects.equals(this.order, addressLine.order) &&
        Objects.equals(this.text, addressLine.text) &&
        Objects.equals(this.type, addressLine.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressLine {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


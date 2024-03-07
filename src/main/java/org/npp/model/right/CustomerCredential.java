package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.right.CredentialAssigned;
import org.npp.model.common.enums.CredentialTypeEnum;
import org.npp.model.common.Reference;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details of a credential identifying an individual or organisation as a customer user.
 */

@Schema(name = "CustomerCredential", description = "Details of a credential identifying an individual or organisation as a customer user.")


public class CustomerCredential extends CredentialAssigned implements HolderCredential {

  public CustomerCredential() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerCredential(CredentialTypeEnum credentialType, CredentialTypeEnum type, Reference identifier, List<@Valid SpecificLanguageString> issuer) {
    super(identifier, issuer, credentialType, type);
  }


  public CustomerCredential identifier(Reference identifier) {
    super.identifier(identifier);
    return this;
  }

  public CustomerCredential issuer(List<@Valid SpecificLanguageString> issuer) {
    super.issuer(issuer);
    return this;
  }

  public CustomerCredential addIssuerItem(SpecificLanguageString issuerItem) {
    super.addIssuerItem(issuerItem);
    return this;
  }

  public CustomerCredential credentialType(CredentialTypeEnum credentialType) {
    super.credentialType(credentialType);
    return this;
  }

  public CustomerCredential type(CredentialTypeEnum type) {
    super.type(type);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCredential {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

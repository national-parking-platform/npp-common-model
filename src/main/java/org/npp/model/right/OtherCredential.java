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
 * Details of a credential for identification, not for use in connection with a specific vehicle or customer.
 */

@Schema(name = "OtherCredential", description = "Details of a credential for identification, not for use in connection with a specific vehicle or customer.")


public class OtherCredential extends CredentialAssigned implements HolderCredential {

  public OtherCredential() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OtherCredential(CredentialTypeEnum credentialType, CredentialTypeEnum type, Reference identifier, List<@Valid SpecificLanguageString> issuer) {
    super(identifier, issuer, credentialType, type);
  }


  public OtherCredential identifier(Reference identifier) {
    super.identifier(identifier);
    return this;
  }

  public OtherCredential issuer(List<@Valid SpecificLanguageString> issuer) {
    super.issuer(issuer);
    return this;
  }

  public OtherCredential addIssuerItem(SpecificLanguageString issuerItem) {
    super.addIssuerItem(issuerItem);
    return this;
  }

  public OtherCredential credentialType(CredentialTypeEnum credentialType) {
    super.credentialType(credentialType);
    return this;
  }

  public OtherCredential type(CredentialTypeEnum type) {
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
    sb.append("class OtherCredential {\n");
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


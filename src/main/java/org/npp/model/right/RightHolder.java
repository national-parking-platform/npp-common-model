package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.right.HolderCredential;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information concerning a specific holder of a granted right, corresponding to a defined RightSpecification.
 */

@Schema(name = "RightHolder", description = "Information concerning a specific holder of a granted right, corresponding to a defined RightSpecification.")

public class RightHolder {

  @Valid
  private List<@Valid HolderCredential> credentials;

  public RightHolder credentials(List<@Valid HolderCredential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public RightHolder addCredentialsItem(HolderCredential credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

  /**
   * Get credentials
   * @return credentials
  */
  @Valid 
  @Schema(name = "credentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentials")
  public List<@Valid HolderCredential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<@Valid HolderCredential> credentials) {
    this.credentials = credentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RightHolder rightHolder = (RightHolder) o;
    return Objects.equals(this.credentials, rightHolder.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightHolder {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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


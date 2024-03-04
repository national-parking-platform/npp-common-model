package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.observation.ImageAlbum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Universal resource locator (URI) that points towards a web site carrying marketing material supplied.
 */

@Schema(name = "Marketing", description = "Universal resource locator (URI) that points towards a web site carrying marketing material supplied.")

public class Marketing {

  @Valid
  private List<@Valid ImageAlbum> imageAlbums;

  @Valid
  private List<@Valid String> webURLs;

  public Marketing imageAlbums(List<@Valid ImageAlbum> imageAlbums) {
    this.imageAlbums = imageAlbums;
    return this;
  }

  public Marketing addImageAlbumsItem(ImageAlbum imageAlbumsItem) {
    if (this.imageAlbums == null) {
      this.imageAlbums = new ArrayList<>();
    }
    this.imageAlbums.add(imageAlbumsItem);
    return this;
  }

  /**
   * Image albums associated
   * @return imageAlbums
  */
  @Valid 
  @Schema(name = "imageAlbums", description = "Image albums associated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageAlbums")
  public List<@Valid ImageAlbum> getImageAlbums() {
    return imageAlbums;
  }

  public void setImageAlbums(List<@Valid ImageAlbum> imageAlbums) {
    this.imageAlbums = imageAlbums;
  }

  public Marketing webURLs(List<@Valid String> webURLs) {
    this.webURLs = webURLs;
    return this;
  }

  public Marketing addWebURLsItem(String webURLsItem) {
    if (this.webURLs == null) {
      this.webURLs = new ArrayList<>();
    }
    this.webURLs.add(webURLsItem);
    return this;
  }

  /**
   * Get webURLs
   * @return webURLs
  */
  
  @Schema(name = "webURLs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webURLs")
  public List<@Valid String> getWebURLs() {
    return webURLs;
  }

  public void setWebURLs(List<@Valid String> webURLs) {
    this.webURLs = webURLs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Marketing marketing = (Marketing) o;
    return Objects.equals(this.imageAlbums, marketing.imageAlbums) &&
        Objects.equals(this.webURLs, marketing.webURLs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageAlbums, webURLs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Marketing {\n");
    sb.append("    imageAlbums: ").append(toIndentedString(imageAlbums)).append("\n");
    sb.append("    webURLs: ").append(toIndentedString(webURLs)).append("\n");
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


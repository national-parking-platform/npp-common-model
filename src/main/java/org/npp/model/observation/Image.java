package org.npp.model.observation;
  
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
 * Class containing information relating to still or moving image observation evidence or a reference (link) to  such observation evidence.&#39;
 */

@Schema(name = "Image", description = "Class containing information relating to still or moving image observation evidence or a reference (link) to  such observation evidence.'")

public class Image {

  private String id;

  private String image;

  private String imageLink;

  public Image() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Image(String id) {
    this.id = id;
  }

  public Image id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Reference identifier to a specific image.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Reference identifier to a specific image.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Image image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Base64 File or binary object containing a still or moving image.
   * @return image
  */
  
  @Schema(name = "image", description = "Base64 File or binary object containing a still or moving image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Image imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return imageLink
  */
  
  @Schema(name = "imageLink", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageLink")
  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.id, image.id) &&
        Objects.equals(this.image, image.image) &&
        Objects.equals(this.imageLink, image.imageLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, image, imageLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
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


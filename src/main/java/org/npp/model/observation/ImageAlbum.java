package org.npp.model.observation;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information relating to images for a parking facility.
 */

@Schema(name = "ImageAlbum", description = "A class defining information relating to images for a parking facility.")

public class ImageAlbum {

  private String photo;

  @Valid
  private List<@Valid SpecificLanguageString> caption;

  @Valid
  private List<@Valid String> logoImage;

  public ImageAlbum photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return photo
  */
  
  @Schema(name = "photo", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo")
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public ImageAlbum caption(List<@Valid SpecificLanguageString> caption) {
    this.caption = caption;
    return this;
  }

  public ImageAlbum addCaptionItem(SpecificLanguageString captionItem) {
    if (this.caption == null) {
      this.caption = new ArrayList<>();
    }
    this.caption.add(captionItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return caption
  */
  @Valid 
  @Schema(name = "caption", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caption")
  public List<@Valid SpecificLanguageString> getCaption() {
    return caption;
  }

  public void setCaption(List<@Valid SpecificLanguageString> caption) {
    this.caption = caption;
  }

  public ImageAlbum logoImage(List<@Valid String> logoImage) {
    this.logoImage = logoImage;
    return this;
  }

  public ImageAlbum addLogoImageItem(String logoImageItem) {
    if (this.logoImage == null) {
      this.logoImage = new ArrayList<>();
    }
    this.logoImage.add(logoImageItem);
    return this;
  }

  /**
   * URL to location of logo(s) the parking operator wishes to associate with this parking facility (e.g. their logo, schemes [ParkMark])'
   * @return logoImage
  */
  
  @Schema(name = "logoImage", description = "URL to location of logo(s) the parking operator wishes to associate with this parking facility (e.g. their logo, schemes [ParkMark])'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logoImage")
  public List<@Valid String> getLogoImage() {
    return logoImage;
  }

  public void setLogoImage(List<@Valid String> logoImage) {
    this.logoImage = logoImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAlbum imageAlbum = (ImageAlbum) o;
    return Objects.equals(this.photo, imageAlbum.photo) &&
        Objects.equals(this.caption, imageAlbum.caption) &&
        Objects.equals(this.logoImage, imageAlbum.logoImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photo, caption, logoImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAlbum {\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    logoImage: ").append(toIndentedString(logoImage)).append("\n");
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


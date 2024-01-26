package org.apds.model.observation;

public class Image {

    private String id;
    private String image;
    private String imageLink;

    public Image() {}

    public String getId() { return id;}
    public String getImage() { return image;}
    public String getImageLInk() { return imageLink;}

    public void setId( String id) {
        this.id = id;
    }

    public void setImage( String image) {
        this.image = image;
    }

    public void setImageLink( String imageLink) {
        this.imageLink = imageLink;
    }
}

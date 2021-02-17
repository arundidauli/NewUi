package com.wingshield.technologies.newui.model;

public class Stories {
    String image_id;
    String Image_url;

    public Stories() {
    }

    public Stories(String image_id, String image_url) {
        this.image_id = image_id;
        Image_url = image_url;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }
}

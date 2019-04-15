package com.wongmantap.kulinerindo;

/**
 * Created by 0431260118 on 3/26/2019.
 */

public class Kuliner {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String name, remarks, photo;
}

package com.smaz.androidversions.Model;



public class AndroidVersion {
    private String name;
    private String api;
    private String ver;
    private String image;


    public AndroidVersion(String mname, String mapi, String mver, String mimage) {
        this.name = mname;
        this.api = mapi;
        this.ver = mver;
        this.image =mimage;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getApi() {
        return api;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getVer() {
        return ver;
    }
}
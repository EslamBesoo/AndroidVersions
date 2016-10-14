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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }
}
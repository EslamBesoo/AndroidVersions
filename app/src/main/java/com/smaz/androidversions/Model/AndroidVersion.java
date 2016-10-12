package com.smaz.androidversions.Model;

/**
 * Created by eslam on 10/12/2016.
 */

public class AndroidVersion {
    private String android_name;
    private String android_api;
    private String android_ver;
    private String android_img_url;


    public AndroidVersion(String android_name, String android_api, String android_ver, String android_img_url) {
        this.android_name = android_name;
        this.android_api = android_api;
        this.android_ver = android_ver;
        this.android_img_url = android_img_url;
    }

    public void setAndroid_img_url(String android_img_url) {
        this.android_img_url = android_img_url;
    }

    public String getAndroid_img_url() {
        return android_img_url;
    }

    public void setAndroid_api(String android_api) {
        this.android_api = android_api;
    }

    public String getAndroid_api() {
        return android_api;
    }

    public void setAndroid_name(String android_name) {
        this.android_name = android_name;
    }

    public String getAndroid_name() {
        return android_name;
    }

    public void setAndroid_ver(String android_ver) {
        this.android_ver = android_ver;
    }

    public String getAndroid_ver() {
        return android_ver;
    }
}

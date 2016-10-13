
package com.smaz.androidversions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Version {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("version")
    @Expose
    private Double version;
    @SerializedName("api_level")
    @Expose
    private Integer apiLevel;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Version() {
    }

    /**
     * 
     * @param apiLevel
     * @param name
     * @param image
     * @param version
     */
    public Version(String image, Double version, Integer apiLevel, String name) {
        this.image = image;
        this.version = version;
        this.apiLevel = apiLevel;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    public Version withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 
     * @return
     *     The version
     */
    public Double getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Double version) {
        this.version = version;
    }

    public Version withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * @return
     *     The apiLevel
     */
    public Integer getApiLevel() {
        return apiLevel;
    }

    /**
     * 
     * @param apiLevel
     *     The api_level
     */
    public void setApiLevel(Integer apiLevel) {
        this.apiLevel = apiLevel;
    }

    public Version withApiLevel(Integer apiLevel) {
        this.apiLevel = apiLevel;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Version withName(String name) {
        this.name = name;
        return this;
    }



}

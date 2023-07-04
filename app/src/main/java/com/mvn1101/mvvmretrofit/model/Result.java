package com.mvn1101.mvvmretrofit.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result implements Parcelable {

    @SerializedName("genre")
    @Expose
    private List<String> genre;
    @SerializedName("imageUrl")
    @Expose
    private List<String> imageUrl;
    @SerializedName("imdbId")
    @Expose
    private String imdbId;
    @SerializedName("imdbrating")
    @Expose
    private Double imdbRating;
    @SerializedName("released")
    @Expose
    private Integer released;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        public Result createFromParcel(android.os.Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    };

    @SuppressWarnings({
            "unchecked"
    })
    protected Result(android.os.Parcel in) {
        in.readList(this.genre, (java.lang.String.class.getClassLoader()));
        in.readList(this.imageUrl, (java.lang.String.class.getClassLoader()));
        this.imdbId = ((String) in.readValue((String.class.getClassLoader())));
        this.imdbRating = ((Double) in.readValue((Double.class.getClassLoader())));
        this.released = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.synopsis = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Result() {
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Integer getReleased() {
        return released;
    }

    public void setReleased(Integer released) {
        this.released = released;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(genre);
        dest.writeList(imageUrl);
        dest.writeValue(imdbId);
        dest.writeValue(imdbRating);
        dest.writeValue(released);
        dest.writeValue(synopsis);
        dest.writeValue(title);
        dest.writeValue(type);
    }

    public int describeContents() {
        return 0;
    }

}
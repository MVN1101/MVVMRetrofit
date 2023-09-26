package com.mvn1101.mvvmretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {

    @SerializedName("genre")
    @Expose
    private List<String> genre;
    @SerializedName("imageurl")
    @Expose
    private List<String> imageurl;
    @SerializedName("imdbid")
    @Expose
    private String imdbid;
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
//    public final static Creator<Result> CREATOR = new Creator<Result>() {
//
//
//        public Result createFromParcel(Parcel in) {
//            return new Result(in);
//        }
//
//        public Result[] newArray(int size) {
//            return (new Result[size]);
//        }
//
//    };
//
//    @SuppressWarnings({
//            "unchecked"
//    })
//    protected Result(Parcel in) {
//        this.imdbid = in.readString();
//        this.imdbRating = in.readDouble();
//        this.released = in.readInt();
//        this.synopsis = in.readString();
//        this.title = in.readString();
//        this.type = in.readString();
////        this.genre = in.readArrayList(java.lang.String.class.getClassLoader());
////        in.readList(this.imageurl, (java.lang.String.class.getClassLoader()));
//    }

    public Result() {
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getImageurl() {
        return imageurl;
    }

    public void setImageurl(List<String> imageurl) {
        this.imageurl = imageurl;
    }

    public String getImdbid() {
        return imdbid;
    }

    public void setImdbid(String imdbid) {
        this.imdbid = imdbid;
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

//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeList(genre);
//        dest.writeList(imageurl);
//        dest.writeValue(imdbid);
//        dest.writeValue(imdbRating);
//        dest.writeValue(released);
//        dest.writeValue(synopsis);
//        dest.writeValue(title);
//        dest.writeValue(type);
//    }
//
//    public int describeContents() {
//        return 0;
//    }

}
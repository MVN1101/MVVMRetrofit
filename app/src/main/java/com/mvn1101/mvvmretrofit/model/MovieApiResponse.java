package com.mvn1101.mvvmretrofit.model;


import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MovieApiResponse implements Parcelable {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<Result> results;
    public final static Parcelable.Creator<MovieApiResponse> CREATOR = new Creator<MovieApiResponse>() {


        public MovieApiResponse createFromParcel(android.os.Parcel in) {
            return new MovieApiResponse(in);
        }

        public MovieApiResponse[] newArray(int size) {
            return (new MovieApiResponse[size]);
        }

    };

    @SuppressWarnings({
            "unchecked"
    })
    protected MovieApiResponse(android.os.Parcel in) {
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.results, (com.mvn1101.mvvmretrofit.model.Result.class.getClassLoader()));
    }

    public MovieApiResponse() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(page);
        dest.writeList(results);
    }

    public int describeContents() {
        return 0;
    }

}
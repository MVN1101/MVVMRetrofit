package com.mvn1101.mvvmretrofit.service;

import com.mvn1101.mvvmretrofit.model.MovieApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface MovieApiService {

    @Headers({
            "Accept: application/json",
            "X-RapidAPI-Host: ott-details.p.rapidapi.com",
            "X-RapidAPI-Key: 57e0297377msh013d8f65e831018p1989d5jsnf1ff5884ca92"

    })

    @GET("advancedsearch?start_year=1970&end_year=2020&min_imdb=6&max_imdb=7.8&genre=action&language=english&type=movie&sort=latest&page=1")
    Call<MovieApiResponse> getMovies (@Query("api_key") String apiKey);

}

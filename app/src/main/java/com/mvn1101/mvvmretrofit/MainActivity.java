package com.mvn1101.mvvmretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mvn1101.mvvmretrofit.model.MovieApiResponse;
import com.mvn1101.mvvmretrofit.service.MovieApiService;
import com.mvn1101.mvvmretrofit.service.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMovies();
    }

    public void getMovies (){

        MovieApiService movieApiService = RetrofitInstance.getService();

        Call<MovieApiResponse> call = movieApiService.getMovies(getString(R.string.api_key));
        call.enqueue(new Callback<MovieApiResponse>() {
            @Override
            public void onResponse(Call<MovieApiResponse> call, Response<MovieApiResponse> response) {
                MovieApiResponse movieApiResponse =
                        response.body();
            }

            @Override
            public void onFailure(Call<MovieApiResponse> call, Throwable t) {

            }
        });
    }
}
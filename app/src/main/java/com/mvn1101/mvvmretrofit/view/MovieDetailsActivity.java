package com.mvn1101.mvvmretrofit.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.mvn1101.mvvmretrofit.R;
import com.mvn1101.mvvmretrofit.model.Result;

public class MovieDetailsActivity extends AppCompatActivity {

    private Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        Bundle arguments = getIntent().getExtras();


        if (arguments != null) {
            result = (Result) arguments.getSerializable("movieDetails");
            Toast.makeText(this, result.getTitle(), Toast.LENGTH_LONG).show();
        }

    }


}
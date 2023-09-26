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

        Bundle arguments =getIntent().getExtras();
        result = (Result) arguments.getSerializable("movieDetails");

//        if (intent != null && intent.hasExtra("movieDetails")) {
//        if (intent == null) {

//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//                result = intent.getParcelableExtra("movieDetails", Result.class);
//            }
        Toast.makeText(this, result.getImdbid(), Toast.LENGTH_LONG).show();
//            String s = intent.getStringExtra("movieDetails");
//            Toast.makeText(this, s , Toast.LENGTH_LONG).show();
//
//            Toast.makeText(this, "Intent null", Toast.LENGTH_LONG).show();

//        } else {
//            Toast.makeText(this, "Intent not null", Toast.LENGTH_LONG).show();
//        }
    }


}
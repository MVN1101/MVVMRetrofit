package com.mvn1101.mvvmretrofit.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mvn1101.mvvmretrofit.R;
import com.mvn1101.mvvmretrofit.model.Result;

public class MovieDetailsActivity extends AppCompatActivity {

    private Result result;
    private ImageView posterImageView;
    private String posterPath;
    private TextView titleTextView;
    private TextView genreTextView;
    private TextView synopsisTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        posterImageView = findViewById(R.id.posterImageView);
        posterPath = "https://img10.joyreactor.cc/pics/post/anon-5573344.png";


        titleTextView = findViewById(R.id.titleTextView);
        genreTextView = findViewById(R.id.genreTextView);
        synopsisTextView = findViewById(R.id.synopsisTextView);

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            result = (Result) arguments.getSerializable("movieDetails");

            if (result.getImageurl().size() != 0) {
                posterPath = result.getImageurl().get(0);

                Glide.with(this)
                        .load(posterPath)
                        .placeholder(R.drawable.progress_circle)
                        .into(posterImageView);
            }

            titleTextView.setText(result.getTitle());
            genreTextView.setText(result.getGenre().get(0));
            synopsisTextView.setText(result.getSynopsis());

        }

    }


}
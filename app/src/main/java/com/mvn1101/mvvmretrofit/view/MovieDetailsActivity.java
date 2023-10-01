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
        posterPath = "https://m.media-amazon.com/images/M/MV5BNzY3YTUwYTQtNjkwNy00OTAyLWE0OWEtYmE3MGIyOWZkODY1XkEyXkFqcGdeQXVyMjkyNzYwMTc@._V1_UX182_CR0,0,182,268_AL_.jpg";


        titleTextView = findViewById(R.id.titleTextView);
        genreTextView = findViewById(R.id.genreTextView);
        synopsisTextView = findViewById(R.id.synopsisTextView);




        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            result = (Result) arguments.getSerializable("movieDetails");
            Toast.makeText(this, result.getTitle(), Toast.LENGTH_LONG).show();
            posterPath = result.getImageurl().get(0);

            Glide.with(this)
                    .load(posterPath)
                    .placeholder(R.drawable.progress_circle)
                    .into(posterImageView);

            titleTextView.setText(result.getTitle());
            genreTextView.setText(result.getGenre().get(0));
            synopsisTextView.setText(result.getSynopsis());

        }

    }


}
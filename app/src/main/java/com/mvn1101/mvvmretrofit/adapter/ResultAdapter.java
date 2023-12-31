package com.mvn1101.mvvmretrofit.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mvn1101.mvvmretrofit.R;
import com.mvn1101.mvvmretrofit.model.Result;
import com.mvn1101.mvvmretrofit.view.MovieDetailsActivity;

import java.util.ArrayList;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {

    private Context context;
    private ArrayList<Result> results;

    public ResultAdapter(Context context, ArrayList<Result> results) {
        this.context = context;
        this.results = results;
    }

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.result_list_item,parent,false);
        return new ResultViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {

        holder.titleTextView.setText(results.get(position).getTitle());
        holder.imdbRating.setText("IMDB: " + results.get(position).getImdbRating().toString());
        String imagePath;
        if (results.get(position).getImageurl().size() <= 0) {

            imagePath = "https://img10.joyreactor.cc/pics/post/anon-5573344.png";
        } else {
            imagePath = results.get(position).getImageurl().get(0);
        }

        Glide.with(context)
                .load(imagePath)
                .placeholder(R.drawable.progress_circle)
                .into(holder.movieImageView);
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ResultViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;
        public TextView imdbRating;
        public ImageView movieImageView;


        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            imdbRating = itemView.findViewById(R.id.imdbRatingTextView);
            movieImageView = itemView.findViewById(R.id.movieImageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getAdapterPosition();

                    if (position != RecyclerView.NO_POSITION) {

                        Result result = results.get(position);
                        Intent intent = new Intent(context, MovieDetailsActivity.class);
                        intent.putExtra("movieDetails", result);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}

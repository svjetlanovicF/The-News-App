package com.example.thenewsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<ModelClassNews> modelClassNews;

    public Adapter(Context context, ArrayList<ModelClassNews> modelClassNews) {
        this.context = context;
        this.modelClassNews = modelClassNews;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, WebViewActivity.class);
                intent.putExtra("url", modelClassNews.get(position).getUrl());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.titleTv.setText(modelClassNews.get(position).getTitle());
        holder.dateTimeTv.setText(Helper.setTime(modelClassNews.get(position).getPublished_at()));
        holder.contentTv.setText(modelClassNews.get(position).getDescription());
        Glide.with(context).load(modelClassNews.get(position).getImage_url()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return modelClassNews.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView titleTv, contentTv, dateTimeTv;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            titleTv = itemView.findViewById(R.id.titleTv);
            contentTv = itemView.findViewById(R.id.contentTv);
            dateTimeTv = itemView.findViewById(R.id.dateTimeTv);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

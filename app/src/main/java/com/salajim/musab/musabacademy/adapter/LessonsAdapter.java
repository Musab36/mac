package com.salajim.musab.musabacademy.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.basicLessons.LessonOne;
import com.salajim.musab.musabacademy.model.Lessons;

import java.util.ArrayList;
import java.util.List;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.MyViewHolder> {
    Context mContext;
    List<String> titlesArray;

    public LessonsAdapter(Context context, List<String> titles) {
        this.mContext = context;
        this.titlesArray = titles;
    }

    @NonNull
    @Override
    public LessonsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.lessons, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LessonsAdapter.MyViewHolder holder, int position) {
        holder.titlesT.setText(titlesArray.get(position));
    }

    @Override
    public int getItemCount() {
        return titlesArray.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titlesT;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titlesT = (TextView) itemView.findViewById(R.id.titleTxt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, LessonOne.class);
                    intent.putExtra("title", titlesArray.get(getAdapterPosition()));
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}

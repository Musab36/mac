package com.salajim.musab.musabacademy.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.interm.IntermDetail;

import java.util.List;

public class IntermediateAdapter extends RecyclerView.Adapter<IntermediateAdapter.MyViewHolder> {
    Context mContext;
    List<String> titlesArray;
    List<String> videosArray;

    public IntermediateAdapter(Context context, List<String> titles, List<String> videosArray) {
        this.mContext = context;
        this.titlesArray = titles;
        this.videosArray = videosArray;
    }

    @NonNull
    @Override
    public IntermediateAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IntermediateAdapter.MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.interm_lessons_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull IntermediateAdapter.MyViewHolder holder, int position) {
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
                    Intent intent = new Intent(mContext, IntermDetail.class);
                    intent.putExtra("title", titlesArray.get(getAdapterPosition()));
                    intent.putExtra("video", videosArray.get(getAdapterPosition()));
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}

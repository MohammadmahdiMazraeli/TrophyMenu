package com.a20q.mohammadmahdi.trophymenu;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TrophyRecyclerAdapter extends RecyclerView.Adapter<TrophyRecyclerAdapter.ViewHolder>{

    private String[] texts;
    private int[] ids;

    public TrophyRecyclerAdapter(String[] texts, int[] ids){
        this.texts = texts;
        this.ids = ids;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.card_view_trophy, parent, false);

        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CardView cardView = holder.cardView;

//        TextView textView = (TextView)cardView.findViewById(R.id.text);
//        textView.setText(texts[position]);

        ImageView imageView = (ImageView)cardView.findViewById(R.id.image_view);
        Drawable drawable = cardView.getResources().getDrawable(ids[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(texts[position]);

    }

    @Override
    public int getItemCount() {
        return texts.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }
}

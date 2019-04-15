package com.wongmantap.kulinerindo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Created by 0431260118 on 3/26/2019.
 */

public class ListKulinerAdapter extends RecyclerView.Adapter<ListKulinerAdapter.CategoryViewHolder> {
    public ListKulinerAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Kuliner> getListKuliner() {
        return listKuliner;
    }

    public void setListKuliner(ArrayList<Kuliner> listKuliner) {
        this.listKuliner = listKuliner;
    }

    private ArrayList<Kuliner> listKuliner;
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kuliner_list, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListKuliner().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListKuliner().get(position).getRemarks());
        Glide.with(context)
                .load(getListKuliner().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListKuliner().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

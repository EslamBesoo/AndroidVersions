package com.smaz.androidversions.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smaz.androidversions.Model.AndroidVersion;
import com.smaz.androidversions.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by eslam on 10/12/2016.
 */

public class AndroidVersionAdapter extends RecyclerView.Adapter<AndroidVersionAdapter.ViewHolder> {

    private ArrayList<AndroidVersion> androidVersions;
    private Context context;

    public AndroidVersionAdapter(Context context, ArrayList<AndroidVersion> androidVersions) {

        this.androidVersions =androidVersions;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.android_name.setText(androidVersions.get(position).getName());
        holder.android_api.setText(androidVersions.get(position).getApi());
        holder.android_ver.setText(androidVersions.get(position).getVer());
        Picasso.with(context).load(androidVersions.get(position).getImage()).resize(100, 100).into(holder.android_img);


    }

    @Override
    public int getItemCount() {
        return androidVersions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView android_name;
        private ImageView android_img;
        private TextView android_ver;
        private TextView android_api;

        public ViewHolder(View view) {
            super(view);
            android_name = (TextView)view.findViewById(R.id.name);
          android_img = (ImageView)view.findViewById(R.id.image);
            android_api = (TextView)view.findViewById(R.id.api);
            android_ver = (TextView)view.findViewById(R.id.ver);


        }
    }


}

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

import java.util.ArrayList;

/**
 * Created by eslam on 10/12/2016.
 */

public class AndroidVerionAdapter extends RecyclerView.Adapter<AndroidVerionAdapter.ViewHolder> {

    private ArrayList<AndroidVersion> androidVersions;
    private Context context;
    public AndroidVerionAdapter(Context context,ArrayList<AndroidVersion> androidVersions){

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

        holder.android_name.setText(androidVersions.get(position).getAndroid_name());
        holder.android_api.setText(androidVersions.get(position).getAndroid_api());
        holder.android_ver.setText(androidVersions.get(position).getAndroid_ver());



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView android_name;
        private ImageView android_img;
        private TextView android_ver;
        private TextView android_api;

        public ViewHolder(View view) {
            super(view);
            android_name = (TextView)view.findViewById(R.id.android_name);
            android_img = (ImageView)view.findViewById(R.id.android_img);
            android_api = (TextView)view.findViewById(R.id.android_api);
            android_ver = (TextView)view.findViewById(R.id.android_ver);


        }
    }


}

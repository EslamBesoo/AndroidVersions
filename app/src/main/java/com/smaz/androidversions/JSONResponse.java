package com.smaz.androidversions;


import com.smaz.androidversions.Model.AndroidVersion;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by eslam on 10/12/2016.
 */

public class JSONResponse {

    public static final String API_BASE_URL = "https://gist.githubusercontent.com/anonymous/0adcc7e908f7bf2dd9380a89f13c9b28/raw/33c9520e0b9c38d4a3f56e6c8fb7a74d27dd87c4/blob.json/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
}
}

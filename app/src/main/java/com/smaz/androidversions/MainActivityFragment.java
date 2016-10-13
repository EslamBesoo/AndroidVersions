package com.smaz.androidversions;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.JsonIOException;
import com.smaz.androidversions.Adapters.AndroidVersionAdapter;
import com.smaz.androidversions.Model.AndroidVersion;


import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<AndroidVersion> data;
    private AndroidVersionAdapter adapter;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
loadJSON();


        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings){


        }
        return super.onOptionsItemSelected(item);
    }

    private void loadJSON(){
      /*  RequestInterface client = JSONResponse.createService(RequestInterface.class);

        // Fetch and print a list of the contributors to this library.
        Call<List<Version>> call =
                (Call<List<Version>>) client.versions("image",5.0,2,"name");

        try {

            List<Version> versions = call.execute().body();
            ArrayList<Version> versionArrayList = new ArrayList<Version>();
            for (int i = 0 ;i<versions.size();i++) {
                Version version = new Version();
                version =versions.get(i);

                versionArrayList.add(version);

            }
            adapter = new AndroidVersionAdapter(getContext(),versionArrayList);
            recyclerView.setAdapter(adapter);



        } catch (IOException e) {
            // handle errors
        }
*/
        FetchTask task = new FetchTask();
        task.execute();


    }
    public class FetchTask extends AsyncTask<String,Void,String>{

private String [] getData (String jsonStr) throws JSONException {



    return null;
}



        @Override
        protected String doInBackground(String... strings) {

            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;

            // Will contain the raw JSON response as a string.
            String jsonStr = null;

            try{
                URL url = new URL("https://gist.githubusercontent.com/anonymous/0adcc7e908f7bf2dd9380a89f13c9b28/raw/33c9520e0b9c38d4a3f56e6c8fb7a74d27dd87c4/blob.json");



                // Create the request to OpenWeatherMap, and open the connection
                        urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    // Since it's JSON, adding a newline isn't necessary (it won't affect parsing)
                    // But it does make debugging a *lot* easier if you print out the completed
                    // buffer for debugging.
                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                jsonStr = buffer.toString();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jsonStr;
        }

        @Override
        protected void onPostExecute(String strings) {
            Log.i("Data is: " , strings);
        }
    }
}

package com.smaz.androidversions;

/**
 * Created by eslam on 10/12/2016.
 */



        import java.util.List;

        import retrofit2.Call;
        import retrofit2.http.GET;
        import retrofit2.http.Path;

public interface RequestInterface {

    @GET("[android]/{versions")
    List<Version> versions(
            @Path("image") String image,
            @Path("version") Double version,
            @Path("api_level") Integer apiLevel,
            @Path("name") String name

    );
}
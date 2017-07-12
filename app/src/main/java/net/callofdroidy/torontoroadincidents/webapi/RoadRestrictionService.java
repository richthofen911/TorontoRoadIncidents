package net.callofdroidy.torontoroadincidents.webapi;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by Richthofen80 on 7/10/2017.
 */

public interface RoadRestrictionService {
    @GET("/transportation/roadrestrictions/RoadRestrictionsSN.json")
    Call<String> getVersionNumber();

    @GET("/transportation/roadrestrictions/RoadRestrictions.json")
    Call<String> getRoadInfo();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www1.toronto.ca")
            .build();
}

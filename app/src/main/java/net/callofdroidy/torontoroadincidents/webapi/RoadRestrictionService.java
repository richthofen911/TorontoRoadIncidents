package net.callofdroidy.torontoroadincidents.webapi;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Richthofen80 on 7/10/2017.
 */

public interface RoadRestrictionService {
    @GET("/transportation/roadrestrictions/RoadRestrictionsSN.json")
    Call<String> checkVersionNumber();

    @GET("/transportation/roadrestrictions/RoadRestrictions.json")
    Call<String> getRoadInfo();
}

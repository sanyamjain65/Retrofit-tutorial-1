package mypocketvakil.example.com.retrofitexample;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by sanyam jain on 23-03-2017.
 */

public interface APInterface {
    @GET("/api/unknown/2")
    Call<SingleUser> singleUser();

    @POST("/api/login")
    Call<User> loginUser(@Body User user);


    @Headers("Content-Type:application/json;charset=utf-8")
    @POST("py/login")
    Call<Example> login(@Body Example example);

}

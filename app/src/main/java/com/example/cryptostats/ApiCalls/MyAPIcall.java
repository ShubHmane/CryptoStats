package com.example.cryptostats.ApiCalls;

import com.example.cryptostats.Model.Home.DataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MyAPIcall {

    //https://jsonplaceholder.typicode.com        todos/1


    @GET("ADDRESS")
//    Call<String> STRING_CALL();
    Call<List<DataModel>> getData(@Query("page") int page);






//

}
//&per-page=100&page=1
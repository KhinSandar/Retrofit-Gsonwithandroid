package com.ept.staffmange;

import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface JsonGetPost {
	
	@GET(value = "/index_home.php")
	void getdata(@Query("page_id")String page_id,@Query("offset") int offset, @Query("count") int count,Callback<JsonObject> callback);
	@GET(value = "/preload.json")
	void getDataTest(Callback<JsonObject> callback);
}

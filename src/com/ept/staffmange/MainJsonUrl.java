package com.ept.staffmange;

import org.apache.http.client.HttpClient;

import retrofit.RestAdapter;
import retrofit.client.ApacheClient;

public class MainJsonUrl {
	static JsonGetPost instance;
	public static JsonGetPost getInstance() {
		if (instance==null) {			
			HttpClient client = StaffManageApplication.getNewHttpClient();
			RestAdapter adapter = new RestAdapter.Builder().setEndpoint("http://www.doemyanmar.com/android-api").setClient(new ApacheClient(client)).build();
			instance = adapter.create(JsonGetPost.class);
		}
		return instance;
	}
}

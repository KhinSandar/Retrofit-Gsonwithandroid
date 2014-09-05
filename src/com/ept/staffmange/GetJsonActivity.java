package com.ept.staffmange;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class GetJsonActivity extends Activity {
TextView txtshow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.getdata);
		txtshow = (TextView) findViewById(R.id.getjson);
		getData();
	}
	
	private void getData(){
		String page_id="379";
		int offset=0;
		int count=5;
		//page_id=379&offset=0&count=5
		MainJsonUrl.getInstance().getdata(page_id,offset, count,  new Callback<JsonObject>() {
			
			@Override
			public void success(JsonObject arg0, Response arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), arg1.getUrl(), Toast.LENGTH_SHORT).show();
				Log.d("Test Url", arg1.getUrl());
				try {
					switch (arg1.getStatus()) {
					case 200:
						
						DataObj data = new Gson().fromJson(arg0, DataObj.class);
						
						txtshow.append("ID : "+arg0);
						
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				
			}
			
			@Override
			public void failure(RetrofitError arg0) {
				// TODO Auto-generated method stub
				txtshow.setText("Can't get data"+arg0.getUrl());
			}
		});
	}
}

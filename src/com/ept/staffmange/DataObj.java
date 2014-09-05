package com.ept.staffmange;

import com.google.gson.annotations.Expose;

public class DataObj {
	@Expose
	String id;
	@Expose
	String title;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub	
		return "info [id=" + id + ", title=" + title + ", time_stamp=" + id + ", content="
		+ title + ", start_time=" + id + ", end_time=" + id
		+ ", location=" + id + ", link=" + title + ", image_path="
		+ title + ", category=" + title + "]";
		
	}
	
	
}

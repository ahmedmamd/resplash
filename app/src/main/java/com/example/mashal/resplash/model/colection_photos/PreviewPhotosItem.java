package com.example.mashal.resplash.model.colection_photos;

import com.google.gson.annotations.SerializedName;

public class PreviewPhotosItem{

	@SerializedName("id")
	private int id;

	@SerializedName("urls")
	private Urls urls;

	public int getId(){
		return id;
	}

	public Urls getUrls(){
		return urls;
	}
}
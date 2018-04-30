package com.example.mashal.resplash.model.colection_photos;

import com.google.gson.annotations.SerializedName;

public class TagsItem{

	@SerializedName("title")
	private String title;

	public String getTitle(){
		return title;
	}
}
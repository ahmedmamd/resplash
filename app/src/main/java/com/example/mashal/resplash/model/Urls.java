package com.example.mashal.resplash.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Urls  {

	@SerializedName("raw")
	private String raw;

	@SerializedName("full")
	private String full;

	@SerializedName("regular")
	private String regular;

	@SerializedName("small")
	private String small;

	@SerializedName("thumb")
	private String thumb;

	public String getRaw(){
		return raw;
	}

	public String getFull(){
		return full;
	}

	public String getRegular(){
		return regular;
	}

	public String getSmall(){
		return small;
	}

	public String getThumb(){
		return thumb;
	}
}
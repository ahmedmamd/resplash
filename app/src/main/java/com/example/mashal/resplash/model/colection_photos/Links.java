package com.example.mashal.resplash.model.colection_photos;

import com.google.gson.annotations.SerializedName;

public class Links{

	@SerializedName("photos")
	private String photos;

	@SerializedName("following")
	private String following;

	@SerializedName("followers")
	private String followers;

	@SerializedName("likes")
	private String likes;

	@SerializedName("portfolio")
	private String portfolio;

	@SerializedName("self")
	private String self;

	@SerializedName("html")
	private String html;

	public String getPhotos(){
		return photos;
	}

	public String getFollowing(){
		return following;
	}

	public String getFollowers(){
		return followers;
	}

	public String getLikes(){
		return likes;
	}

	public String getPortfolio(){
		return portfolio;
	}

	public String getSelf(){
		return self;
	}

	public String getHtml(){
		return html;
	}
}
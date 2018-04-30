package com.example.mashal.resplash.model.colection_photos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CoverPhoto{

	@SerializedName("id")
	private String id;

	@SerializedName("height")
	private int height;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("color")
	private String color;

	@SerializedName("description")
	private Object description;

	@SerializedName("urls")
	private Urls urls;

	@SerializedName("likes")
	private int likes;

	@SerializedName("width")
	private int width;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("categories")
	private List<Object> categories;

	@SerializedName("links")
	private Links links;

	@SerializedName("sponsored")
	private boolean sponsored;

	@SerializedName("user")
	private User user;

	@SerializedName("liked_by_user")
	private boolean likedByUser;

	public String getId(){
		return id;
	}

	public int getHeight(){
		return height;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getColor(){
		return color;
	}

	public Object getDescription(){
		return description;
	}

	public Urls getUrls(){
		return urls;
	}

	public int getLikes(){
		return likes;
	}

	public int getWidth(){
		return width;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public List<Object> getCategories(){
		return categories;
	}

	public Links getLinks(){
		return links;
	}

	public boolean isSponsored(){
		return sponsored;
	}

	public User getUser(){
		return user;
	}

	public boolean isLikedByUser(){
		return likedByUser;
	}
}
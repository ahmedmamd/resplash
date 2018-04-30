package com.example.mashal.resplash.model.colection_photos;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("location")
	private Object location;

	@SerializedName("portfolio_url")
	private Object portfolioUrl;

	@SerializedName("profile_image")
	private ProfileImage profileImage;

	@SerializedName("links")
	private Links links;

	@SerializedName("total_photos")
	private int totalPhotos;

	@SerializedName("total_likes")
	private int totalLikes;

	@SerializedName("id")
	private String id;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("instagram_username")
	private Object instagramUsername;

	@SerializedName("username")
	private String username;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("bio")
	private Object bio;

	@SerializedName("followed_by_user")
	private boolean followedByUser;

	@SerializedName("name")
	private String name;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("total_collections")
	private int totalCollections;

	@SerializedName("twitter_username")
	private Object twitterUsername;

	public Object getLocation(){
		return location;
	}

	public Object getPortfolioUrl(){
		return portfolioUrl;
	}

	public ProfileImage getProfileImage(){
		return profileImage;
	}

	public Links getLinks(){
		return links;
	}

	public int getTotalPhotos(){
		return totalPhotos;
	}

	public int getTotalLikes(){
		return totalLikes;
	}

	public String getId(){
		return id;
	}

	public String getFirstName(){
		return firstName;
	}

	public Object getInstagramUsername(){
		return instagramUsername;
	}

	public String getUsername(){
		return username;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public Object getBio(){
		return bio;
	}

	public boolean isFollowedByUser(){
		return followedByUser;
	}

	public String getName(){
		return name;
	}

	public String getLastName(){
		return lastName;
	}

	public int getTotalCollections(){
		return totalCollections;
	}

	public Object getTwitterUsername(){
		return twitterUsername;
	}
}
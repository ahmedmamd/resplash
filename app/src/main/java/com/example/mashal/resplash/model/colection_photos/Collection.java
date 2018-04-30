package com.example.mashal.resplash.model.colection_photos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Collection{

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("cover_photo")
	private CoverPhoto coverPhoto;

	@SerializedName("links")
	private Links links;

	@SerializedName("featured")
	private boolean featured;

	@SerializedName("preview_photos")
	private List<PreviewPhotosItem> previewPhotos;

	@SerializedName("total_photos")
	private int totalPhotos;

	@SerializedName("published_at")
	private String publishedAt;

	@SerializedName("private")
	private boolean jsonMemberPrivate;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("description")
	private Object description;

	@SerializedName("curated")
	private boolean curated;

	@SerializedName("share_key")
	private String shareKey;

	@SerializedName("user")
	private User user;

	public List<TagsItem> getTags(){
		return tags;
	}

	public CoverPhoto getCoverPhoto(){
		return coverPhoto;
	}

	public Links getLinks(){
		return links;
	}

	public boolean isFeatured(){
		return featured;
	}

	public List<PreviewPhotosItem> getPreviewPhotos(){
		return previewPhotos;
	}

	public int getTotalPhotos(){
		return totalPhotos;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public boolean isJsonMemberPrivate(){
		return jsonMemberPrivate;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public Object getDescription(){
		return description;
	}

	public boolean isCurated(){
		return curated;
	}

	public String getShareKey(){
		return shareKey;
	}

	public User getUser(){
		return user;
	}
}
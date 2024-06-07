// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LinkMetadata {
	private String title;
	private String description;
	private String image;
	@SerializedName("embed_video_url")
	private String embedVideoUrl;
	@SerializedName("content_type")
	private String contentType;

	public LinkMetadata(String title, String description, String image, String embedVideoUrl, String contentType) {
		this.title = title;
		this.description = description;
		this.image = image;
		this.embedVideoUrl = embedVideoUrl;
		this.contentType = contentType;
	}

	public String getTitle() {
	    return title;
	}

	public void setTitle(String title) {
	    this.title = title;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public String getImage() {
	    return image;
	}

	public void setImage(String image) {
	    this.image = image;
	}

	public String getEmbedVideoUrl() {
	    return embedVideoUrl;
	}

	public void setEmbedVideoUrl(String embedVideoUrl) {
	    this.embedVideoUrl = embedVideoUrl;
	}

	public String getContentType() {
	    return contentType;
	}

	public void setContentType(String contentType) {
	    this.contentType = contentType;
	}
}
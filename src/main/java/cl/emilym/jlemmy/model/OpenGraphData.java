// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class OpenGraphData {
	private String title;
	private String description;
	private String image;
	@SerializedName("embed_video_url")
	private String embedVideoUrl;

	public OpenGraphData(String title, String description, String image, String embedVideoUrl) {
		this.title = title;
		this.description = description;
		this.image = image;
		this.embedVideoUrl = embedVideoUrl;
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
}
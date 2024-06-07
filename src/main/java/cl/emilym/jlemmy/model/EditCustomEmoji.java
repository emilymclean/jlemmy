// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class EditCustomEmoji {
	private long id;
	private String category;
	@SerializedName("image_url")
	private String imageUrl;
	@SerializedName("alt_text")
	private String altText;
	private String[] keywords;

	public EditCustomEmoji(long id, String category, String imageUrl, String altText, String[] keywords) {
		this.id = id;
		this.category = category;
		this.imageUrl = imageUrl;
		this.altText = altText;
		this.keywords = keywords;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public String getCategory() {
	    return category;
	}

	public void setCategory(String category) {
	    this.category = category;
	}

	public String getImageUrl() {
	    return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
	    this.imageUrl = imageUrl;
	}

	public String getAltText() {
	    return altText;
	}

	public void setAltText(String altText) {
	    this.altText = altText;
	}

	public String[] getKeywords() {
	    return keywords;
	}

	public void setKeywords(String[] keywords) {
	    this.keywords = keywords;
	}
}
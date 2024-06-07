// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CreateCustomEmoji {
	private String category;
	private String shortcode;
	@SerializedName("image_url")
	private String imageUrl;
	@SerializedName("alt_text")
	private String altText;
	private String[] keywords;

	public CreateCustomEmoji(String category, String shortcode, String imageUrl, String altText, String[] keywords) {
		this.category = category;
		this.shortcode = shortcode;
		this.imageUrl = imageUrl;
		this.altText = altText;
		this.keywords = keywords;
	}

	public String getCategory() {
	    return category;
	}

	public void setCategory(String category) {
	    this.category = category;
	}

	public String getShortcode() {
	    return shortcode;
	}

	public void setShortcode(String shortcode) {
	    this.shortcode = shortcode;
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
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CustomEmoji {
	private long id;
	@SerializedName("local_site_id")
	private long localSiteId;
	private String shortcode;
	@SerializedName("image_url")
	private String imageUrl;
	@SerializedName("alt_text")
	private String altText;
	private String category;
	private String published;
	private String updated;

	public CustomEmoji(long id, long localSiteId, String shortcode, String imageUrl, String altText, String category, String published, String updated) {
		this.id = id;
		this.localSiteId = localSiteId;
		this.shortcode = shortcode;
		this.imageUrl = imageUrl;
		this.altText = altText;
		this.category = category;
		this.published = published;
		this.updated = updated;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getLocalSiteId() {
	    return localSiteId;
	}

	public void setLocalSiteId(long localSiteId) {
	    this.localSiteId = localSiteId;
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

	public String getCategory() {
	    return category;
	}

	public void setCategory(String category) {
	    this.category = category;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public String getUpdated() {
	    return updated;
	}

	public void setUpdated(String updated) {
	    this.updated = updated;
	}
}
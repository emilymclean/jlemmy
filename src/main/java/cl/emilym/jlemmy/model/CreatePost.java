// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CreatePost {
	private String name;
	@SerializedName("community_id")
	private long communityId;
	private String url;
	private String body;
	@SerializedName("alt_text")
	private String altText;
	private String honeypot;
	private boolean nsfw;
	@SerializedName("language_id")
	private long languageId;
	@SerializedName("custom_thumbnail")
	private String customThumbnail;

	public CreatePost(String name, long communityId, String url, String body, String altText, String honeypot, boolean nsfw, long languageId, String customThumbnail) {
		this.name = name;
		this.communityId = communityId;
		this.url = url;
		this.body = body;
		this.altText = altText;
		this.honeypot = honeypot;
		this.nsfw = nsfw;
		this.languageId = languageId;
		this.customThumbnail = customThumbnail;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public String getUrl() {
	    return url;
	}

	public void setUrl(String url) {
	    this.url = url;
	}

	public String getBody() {
	    return body;
	}

	public void setBody(String body) {
	    this.body = body;
	}

	public String getAltText() {
	    return altText;
	}

	public void setAltText(String altText) {
	    this.altText = altText;
	}

	public String getHoneypot() {
	    return honeypot;
	}

	public void setHoneypot(String honeypot) {
	    this.honeypot = honeypot;
	}

	public boolean getNsfw() {
	    return nsfw;
	}

	public void setNsfw(boolean nsfw) {
	    this.nsfw = nsfw;
	}

	public long getLanguageId() {
	    return languageId;
	}

	public void setLanguageId(long languageId) {
	    this.languageId = languageId;
	}

	public String getCustomThumbnail() {
	    return customThumbnail;
	}

	public void setCustomThumbnail(String customThumbnail) {
	    this.customThumbnail = customThumbnail;
	}
}
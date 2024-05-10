// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class EditPost {
	@SerializedName("post_id")
	private long postId;
	private String name;
	private String url;
	private String body;
	@SerializedName("alt_text")
	private String altText;
	private boolean nsfw;
	@SerializedName("language_id")
	private long languageId;
	@SerializedName("custom_thumbnail")
	private String customThumbnail;

	public EditPost(long postId, String name, String url, String body, String altText, boolean nsfw, long languageId, String customThumbnail) {
		this.postId = postId;
		this.name = name;
		this.url = url;
		this.body = body;
		this.altText = altText;
		this.nsfw = nsfw;
		this.languageId = languageId;
		this.customThumbnail = customThumbnail;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
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
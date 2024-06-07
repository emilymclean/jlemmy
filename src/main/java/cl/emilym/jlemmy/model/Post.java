// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Post {
	private long id;
	private String name;
	private String url;
	private String body;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("community_id")
	private long communityId;
	private boolean removed;
	private boolean locked;
	private String published;
	private String updated;
	private boolean deleted;
	private boolean nsfw;
	@SerializedName("embed_title")
	private String embedTitle;
	@SerializedName("embed_description")
	private String embedDescription;
	@SerializedName("thumbnail_url")
	private String thumbnailUrl;
	@SerializedName("ap_id")
	private String apId;
	private boolean local;
	@SerializedName("embed_video_url")
	private String embedVideoUrl;
	@SerializedName("language_id")
	private long languageId;
	@SerializedName("featured_community")
	private boolean featuredCommunity;
	@SerializedName("featured_local")
	private boolean featuredLocal;
	@SerializedName("url_content_type")
	private String urlContentType;
	@SerializedName("alt_text")
	private String altText;

	public Post(long id, String name, String url, String body, long creatorId, long communityId, boolean removed, boolean locked, String published, String updated, boolean deleted, boolean nsfw, String embedTitle, String embedDescription, String thumbnailUrl, String apId, boolean local, String embedVideoUrl, long languageId, boolean featuredCommunity, boolean featuredLocal, String urlContentType, String altText) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.body = body;
		this.creatorId = creatorId;
		this.communityId = communityId;
		this.removed = removed;
		this.locked = locked;
		this.published = published;
		this.updated = updated;
		this.deleted = deleted;
		this.nsfw = nsfw;
		this.embedTitle = embedTitle;
		this.embedDescription = embedDescription;
		this.thumbnailUrl = thumbnailUrl;
		this.apId = apId;
		this.local = local;
		this.embedVideoUrl = embedVideoUrl;
		this.languageId = languageId;
		this.featuredCommunity = featuredCommunity;
		this.featuredLocal = featuredLocal;
		this.urlContentType = urlContentType;
		this.altText = altText;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
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

	public long getCreatorId() {
	    return creatorId;
	}

	public void setCreatorId(long creatorId) {
	    this.creatorId = creatorId;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
	}

	public boolean getLocked() {
	    return locked;
	}

	public void setLocked(boolean locked) {
	    this.locked = locked;
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

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}

	public boolean getNsfw() {
	    return nsfw;
	}

	public void setNsfw(boolean nsfw) {
	    this.nsfw = nsfw;
	}

	public String getEmbedTitle() {
	    return embedTitle;
	}

	public void setEmbedTitle(String embedTitle) {
	    this.embedTitle = embedTitle;
	}

	public String getEmbedDescription() {
	    return embedDescription;
	}

	public void setEmbedDescription(String embedDescription) {
	    this.embedDescription = embedDescription;
	}

	public String getThumbnailUrl() {
	    return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
	    this.thumbnailUrl = thumbnailUrl;
	}

	public String getApId() {
	    return apId;
	}

	public void setApId(String apId) {
	    this.apId = apId;
	}

	public boolean getLocal() {
	    return local;
	}

	public void setLocal(boolean local) {
	    this.local = local;
	}

	public String getEmbedVideoUrl() {
	    return embedVideoUrl;
	}

	public void setEmbedVideoUrl(String embedVideoUrl) {
	    this.embedVideoUrl = embedVideoUrl;
	}

	public long getLanguageId() {
	    return languageId;
	}

	public void setLanguageId(long languageId) {
	    this.languageId = languageId;
	}

	public boolean getFeaturedCommunity() {
	    return featuredCommunity;
	}

	public void setFeaturedCommunity(boolean featuredCommunity) {
	    this.featuredCommunity = featuredCommunity;
	}

	public boolean getFeaturedLocal() {
	    return featuredLocal;
	}

	public void setFeaturedLocal(boolean featuredLocal) {
	    this.featuredLocal = featuredLocal;
	}

	public String getUrlContentType() {
	    return urlContentType;
	}

	public void setUrlContentType(String urlContentType) {
	    this.urlContentType = urlContentType;
	}

	public String getAltText() {
	    return altText;
	}

	public void setAltText(String altText) {
	    this.altText = altText;
	}
}
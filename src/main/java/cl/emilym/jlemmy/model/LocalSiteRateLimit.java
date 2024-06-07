// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LocalSiteRateLimit {
	@SerializedName("local_site_id")
	private long localSiteId;
	private long message;
	@SerializedName("message_per_second")
	private long messagePerSecond;
	private long post;
	@SerializedName("post_per_second")
	private long postPerSecond;
	private long register;
	@SerializedName("register_per_second")
	private long registerPerSecond;
	private long image;
	@SerializedName("image_per_second")
	private long imagePerSecond;
	private long comment;
	@SerializedName("comment_per_second")
	private long commentPerSecond;
	private long search;
	@SerializedName("search_per_second")
	private long searchPerSecond;
	private String published;
	private String updated;
	@SerializedName("import_user_settings")
	private long importUserSettings;
	@SerializedName("import_user_settings_per_second")
	private long importUserSettingsPerSecond;

	public LocalSiteRateLimit(long localSiteId, long message, long messagePerSecond, long post, long postPerSecond, long register, long registerPerSecond, long image, long imagePerSecond, long comment, long commentPerSecond, long search, long searchPerSecond, String published, String updated, long importUserSettings, long importUserSettingsPerSecond) {
		this.localSiteId = localSiteId;
		this.message = message;
		this.messagePerSecond = messagePerSecond;
		this.post = post;
		this.postPerSecond = postPerSecond;
		this.register = register;
		this.registerPerSecond = registerPerSecond;
		this.image = image;
		this.imagePerSecond = imagePerSecond;
		this.comment = comment;
		this.commentPerSecond = commentPerSecond;
		this.search = search;
		this.searchPerSecond = searchPerSecond;
		this.published = published;
		this.updated = updated;
		this.importUserSettings = importUserSettings;
		this.importUserSettingsPerSecond = importUserSettingsPerSecond;
	}

	public long getLocalSiteId() {
	    return localSiteId;
	}

	public void setLocalSiteId(long localSiteId) {
	    this.localSiteId = localSiteId;
	}

	public long getMessage() {
	    return message;
	}

	public void setMessage(long message) {
	    this.message = message;
	}

	public long getMessagePerSecond() {
	    return messagePerSecond;
	}

	public void setMessagePerSecond(long messagePerSecond) {
	    this.messagePerSecond = messagePerSecond;
	}

	public long getPost() {
	    return post;
	}

	public void setPost(long post) {
	    this.post = post;
	}

	public long getPostPerSecond() {
	    return postPerSecond;
	}

	public void setPostPerSecond(long postPerSecond) {
	    this.postPerSecond = postPerSecond;
	}

	public long getRegister() {
	    return register;
	}

	public void setRegister(long register) {
	    this.register = register;
	}

	public long getRegisterPerSecond() {
	    return registerPerSecond;
	}

	public void setRegisterPerSecond(long registerPerSecond) {
	    this.registerPerSecond = registerPerSecond;
	}

	public long getImage() {
	    return image;
	}

	public void setImage(long image) {
	    this.image = image;
	}

	public long getImagePerSecond() {
	    return imagePerSecond;
	}

	public void setImagePerSecond(long imagePerSecond) {
	    this.imagePerSecond = imagePerSecond;
	}

	public long getComment() {
	    return comment;
	}

	public void setComment(long comment) {
	    this.comment = comment;
	}

	public long getCommentPerSecond() {
	    return commentPerSecond;
	}

	public void setCommentPerSecond(long commentPerSecond) {
	    this.commentPerSecond = commentPerSecond;
	}

	public long getSearch() {
	    return search;
	}

	public void setSearch(long search) {
	    this.search = search;
	}

	public long getSearchPerSecond() {
	    return searchPerSecond;
	}

	public void setSearchPerSecond(long searchPerSecond) {
	    this.searchPerSecond = searchPerSecond;
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

	public long getImportUserSettings() {
	    return importUserSettings;
	}

	public void setImportUserSettings(long importUserSettings) {
	    this.importUserSettings = importUserSettings;
	}

	public long getImportUserSettingsPerSecond() {
	    return importUserSettingsPerSecond;
	}

	public void setImportUserSettingsPerSecond(long importUserSettingsPerSecond) {
	    this.importUserSettingsPerSecond = importUserSettingsPerSecond;
	}
}
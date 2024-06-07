// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Comment {
	private long id;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("post_id")
	private long postId;
	private String content;
	private boolean removed;
	private String published;
	private String updated;
	private boolean deleted;
	@SerializedName("ap_id")
	private String apId;
	private boolean local;
	private String path;
	private boolean distinguished;
	@SerializedName("language_id")
	private long languageId;

	public Comment(long id, long creatorId, long postId, String content, boolean removed, String published, String updated, boolean deleted, String apId, boolean local, String path, boolean distinguished, long languageId) {
		this.id = id;
		this.creatorId = creatorId;
		this.postId = postId;
		this.content = content;
		this.removed = removed;
		this.published = published;
		this.updated = updated;
		this.deleted = deleted;
		this.apId = apId;
		this.local = local;
		this.path = path;
		this.distinguished = distinguished;
		this.languageId = languageId;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getCreatorId() {
	    return creatorId;
	}

	public void setCreatorId(long creatorId) {
	    this.creatorId = creatorId;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
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

	public String getPath() {
	    return path;
	}

	public void setPath(String path) {
	    this.path = path;
	}

	public boolean getDistinguished() {
	    return distinguished;
	}

	public void setDistinguished(boolean distinguished) {
	    this.distinguished = distinguished;
	}

	public long getLanguageId() {
	    return languageId;
	}

	public void setLanguageId(long languageId) {
	    this.languageId = languageId;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PostReport {
	private long id;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("post_id")
	private long postId;
	@SerializedName("original_post_name")
	private String originalPostName;
	@SerializedName("original_post_url")
	private String originalPostUrl;
	@SerializedName("original_post_body")
	private String originalPostBody;
	private String reason;
	private boolean resolved;
	@SerializedName("resolver_id")
	private long resolverId;
	private String published;
	private String updated;

	public PostReport(long id, long creatorId, long postId, String originalPostName, String originalPostUrl, String originalPostBody, String reason, boolean resolved, long resolverId, String published, String updated) {
		this.id = id;
		this.creatorId = creatorId;
		this.postId = postId;
		this.originalPostName = originalPostName;
		this.originalPostUrl = originalPostUrl;
		this.originalPostBody = originalPostBody;
		this.reason = reason;
		this.resolved = resolved;
		this.resolverId = resolverId;
		this.published = published;
		this.updated = updated;
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

	public String getOriginalPostName() {
	    return originalPostName;
	}

	public void setOriginalPostName(String originalPostName) {
	    this.originalPostName = originalPostName;
	}

	public String getOriginalPostUrl() {
	    return originalPostUrl;
	}

	public void setOriginalPostUrl(String originalPostUrl) {
	    this.originalPostUrl = originalPostUrl;
	}

	public String getOriginalPostBody() {
	    return originalPostBody;
	}

	public void setOriginalPostBody(String originalPostBody) {
	    this.originalPostBody = originalPostBody;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public boolean getResolved() {
	    return resolved;
	}

	public void setResolved(boolean resolved) {
	    this.resolved = resolved;
	}

	public long getResolverId() {
	    return resolverId;
	}

	public void setResolverId(long resolverId) {
	    this.resolverId = resolverId;
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
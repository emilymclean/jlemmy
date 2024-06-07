// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentReport {
	private long id;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("comment_id")
	private long commentId;
	@SerializedName("original_comment_text")
	private String originalCommentText;
	private String reason;
	private boolean resolved;
	@SerializedName("resolver_id")
	private long resolverId;
	private String published;
	private String updated;

	public CommentReport(long id, long creatorId, long commentId, String originalCommentText, String reason, boolean resolved, long resolverId, String published, String updated) {
		this.id = id;
		this.creatorId = creatorId;
		this.commentId = commentId;
		this.originalCommentText = originalCommentText;
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

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public String getOriginalCommentText() {
	    return originalCommentText;
	}

	public void setOriginalCommentText(String originalCommentText) {
	    this.originalCommentText = originalCommentText;
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
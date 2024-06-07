// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PurgeComment {
	@SerializedName("comment_id")
	private long commentId;
	private String reason;

	public PurgeComment(long commentId, String reason) {
		this.commentId = commentId;
		this.reason = reason;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
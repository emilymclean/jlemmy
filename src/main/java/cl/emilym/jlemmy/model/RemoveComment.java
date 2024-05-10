// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class RemoveComment {
	@SerializedName("comment_id")
	private long commentId;
	private boolean removed;
	private String reason;

	public RemoveComment(long commentId, boolean removed, String reason) {
		this.commentId = commentId;
		this.removed = removed;
		this.reason = reason;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
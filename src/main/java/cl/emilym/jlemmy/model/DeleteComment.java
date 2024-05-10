// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class DeleteComment {
	@SerializedName("comment_id")
	private long commentId;
	private boolean deleted;

	public DeleteComment(long commentId, boolean deleted) {
		this.commentId = commentId;
		this.deleted = deleted;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CreateCommentReport {
	@SerializedName("comment_id")
	private long commentId;
	private String reason;

	public CreateCommentReport(long commentId, String reason) {
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
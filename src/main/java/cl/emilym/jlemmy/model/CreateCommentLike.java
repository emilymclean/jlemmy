// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CreateCommentLike {
	@SerializedName("comment_id")
	private long commentId;
	private long score;

	public CreateCommentLike(long commentId, long score) {
		this.commentId = commentId;
		this.score = score;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public long getScore() {
	    return score;
	}

	public void setScore(long score) {
	    this.score = score;
	}
}
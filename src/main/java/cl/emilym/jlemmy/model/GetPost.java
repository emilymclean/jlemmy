// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetPost {
	private long id;
	@SerializedName("comment_id")
	private long commentId;

	public GetPost(long id, long commentId) {
		this.id = id;
		this.commentId = commentId;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}
}
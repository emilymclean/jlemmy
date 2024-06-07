// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class DistinguishComment {
	@SerializedName("comment_id")
	private long commentId;
	private boolean distinguished;

	public DistinguishComment(long commentId, boolean distinguished) {
		this.commentId = commentId;
		this.distinguished = distinguished;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public boolean getDistinguished() {
	    return distinguished;
	}

	public void setDistinguished(boolean distinguished) {
	    this.distinguished = distinguished;
	}
}
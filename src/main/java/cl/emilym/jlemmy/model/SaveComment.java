// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class SaveComment {
	@SerializedName("comment_id")
	private long commentId;
	private boolean save;

	public SaveComment(long commentId, boolean save) {
		this.commentId = commentId;
		this.save = save;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public boolean getSave() {
	    return save;
	}

	public void setSave(boolean save) {
	    this.save = save;
	}
}
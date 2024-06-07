// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class MarkCommentReplyAsRead {
	@SerializedName("comment_reply_id")
	private long commentReplyId;
	private boolean read;

	public MarkCommentReplyAsRead(long commentReplyId, boolean read) {
		this.commentReplyId = commentReplyId;
		this.read = read;
	}

	public long getCommentReplyId() {
	    return commentReplyId;
	}

	public void setCommentReplyId(long commentReplyId) {
	    this.commentReplyId = commentReplyId;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
	}
}
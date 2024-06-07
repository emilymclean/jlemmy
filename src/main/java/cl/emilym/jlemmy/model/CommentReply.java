// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentReply {
	private long id;
	@SerializedName("recipient_id")
	private long recipientId;
	@SerializedName("comment_id")
	private long commentId;
	private boolean read;
	private String published;

	public CommentReply(long id, long recipientId, long commentId, boolean read, String published) {
		this.id = id;
		this.recipientId = recipientId;
		this.commentId = commentId;
		this.read = read;
		this.published = published;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getRecipientId() {
	    return recipientId;
	}

	public void setRecipientId(long recipientId) {
	    this.recipientId = recipientId;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}
}
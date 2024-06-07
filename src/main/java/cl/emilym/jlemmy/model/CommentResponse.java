// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentResponse {
	@SerializedName("comment_view")
	private CommentView commentView;
	@SerializedName("recipient_ids")
	private long[] recipientIds;

	public CommentResponse(CommentView commentView, long[] recipientIds) {
		this.commentView = commentView;
		this.recipientIds = recipientIds;
	}

	public CommentView getCommentView() {
	    return commentView;
	}

	public void setCommentView(CommentView commentView) {
	    this.commentView = commentView;
	}

	public long[] getRecipientIds() {
	    return recipientIds;
	}

	public void setRecipientIds(long[] recipientIds) {
	    this.recipientIds = recipientIds;
	}
}
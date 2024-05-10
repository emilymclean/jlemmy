// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
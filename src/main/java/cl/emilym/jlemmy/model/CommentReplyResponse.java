// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentReplyResponse {
	@SerializedName("comment_reply_view")
	private CommentReplyView commentReplyView;

	public CommentReplyResponse(CommentReplyView commentReplyView) {
		this.commentReplyView = commentReplyView;
	}

	public CommentReplyView getCommentReplyView() {
	    return commentReplyView;
	}

	public void setCommentReplyView(CommentReplyView commentReplyView) {
	    this.commentReplyView = commentReplyView;
	}
}
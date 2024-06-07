// This class was generated, do not modify it directly
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
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
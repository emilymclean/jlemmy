// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetRepliesResponse {
	private CommentReplyView[] replies;

	public GetRepliesResponse(CommentReplyView[] replies) {
		this.replies = replies;
	}

	public CommentReplyView[] getReplies() {
	    return replies;
	}

	public void setReplies(CommentReplyView[] replies) {
	    this.replies = replies;
	}
}
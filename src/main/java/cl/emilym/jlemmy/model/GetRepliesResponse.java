// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
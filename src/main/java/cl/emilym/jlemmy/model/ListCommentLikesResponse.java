// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListCommentLikesResponse {
	@SerializedName("comment_likes")
	private VoteView[] commentLikes;

	public ListCommentLikesResponse(VoteView[] commentLikes) {
		this.commentLikes = commentLikes;
	}

	public VoteView[] getCommentLikes() {
	    return commentLikes;
	}

	public void setCommentLikes(VoteView[] commentLikes) {
	    this.commentLikes = commentLikes;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ListPostLikesResponse {
	@SerializedName("post_likes")
	private VoteView[] postLikes;

	public ListPostLikesResponse(VoteView[] postLikes) {
		this.postLikes = postLikes;
	}

	public VoteView[] getPostLikes() {
	    return postLikes;
	}

	public void setPostLikes(VoteView[] postLikes) {
	    this.postLikes = postLikes;
	}
}
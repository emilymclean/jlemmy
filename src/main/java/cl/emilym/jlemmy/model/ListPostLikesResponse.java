// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPostResponse {
	@SerializedName("post_view")
	private PostView postView;
	@SerializedName("community_view")
	private CommunityView communityView;
	private CommunityModeratorView[] moderators;
	@SerializedName("cross_posts")
	private PostView[] crossPosts;

	public GetPostResponse(PostView postView, CommunityView communityView, CommunityModeratorView[] moderators, PostView[] crossPosts) {
		this.postView = postView;
		this.communityView = communityView;
		this.moderators = moderators;
		this.crossPosts = crossPosts;
	}

	public PostView getPostView() {
	    return postView;
	}

	public void setPostView(PostView postView) {
	    this.postView = postView;
	}

	public CommunityView getCommunityView() {
	    return communityView;
	}

	public void setCommunityView(CommunityView communityView) {
	    this.communityView = communityView;
	}

	public CommunityModeratorView[] getModerators() {
	    return moderators;
	}

	public void setModerators(CommunityModeratorView[] moderators) {
	    this.moderators = moderators;
	}

	public PostView[] getCrossPosts() {
	    return crossPosts;
	}

	public void setCrossPosts(PostView[] crossPosts) {
	    this.crossPosts = crossPosts;
	}
}
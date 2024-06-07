// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommunityResponse {
	@SerializedName("community_view")
	private CommunityView communityView;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;

	public CommunityResponse(CommunityView communityView, long[] discussionLanguages) {
		this.communityView = communityView;
		this.discussionLanguages = discussionLanguages;
	}

	public CommunityView getCommunityView() {
	    return communityView;
	}

	public void setCommunityView(CommunityView communityView) {
	    this.communityView = communityView;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}
}
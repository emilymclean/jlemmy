// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetCommunityResponse {
	@SerializedName("community_view")
	private CommunityView communityView;
	private Site site;
	private CommunityModeratorView[] moderators;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;

	public GetCommunityResponse(CommunityView communityView, Site site, CommunityModeratorView[] moderators, long[] discussionLanguages) {
		this.communityView = communityView;
		this.site = site;
		this.moderators = moderators;
		this.discussionLanguages = discussionLanguages;
	}

	public CommunityView getCommunityView() {
	    return communityView;
	}

	public void setCommunityView(CommunityView communityView) {
	    this.communityView = communityView;
	}

	public Site getSite() {
	    return site;
	}

	public void setSite(Site site) {
	    this.site = site;
	}

	public CommunityModeratorView[] getModerators() {
	    return moderators;
	}

	public void setModerators(CommunityModeratorView[] moderators) {
	    this.moderators = moderators;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}
}
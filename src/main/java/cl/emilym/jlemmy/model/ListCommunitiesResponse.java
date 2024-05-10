// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ListCommunitiesResponse {
	private CommunityView[] communities;

	public ListCommunitiesResponse(CommunityView[] communities) {
		this.communities = communities;
	}

	public CommunityView[] getCommunities() {
	    return communities;
	}

	public void setCommunities(CommunityView[] communities) {
	    this.communities = communities;
	}
}
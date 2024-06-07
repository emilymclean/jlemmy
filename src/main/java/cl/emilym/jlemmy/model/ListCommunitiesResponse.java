// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
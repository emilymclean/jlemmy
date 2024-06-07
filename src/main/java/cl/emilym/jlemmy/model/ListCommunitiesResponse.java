// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
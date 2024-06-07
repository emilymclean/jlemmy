// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetReportCount {
	@SerializedName("community_id")
	private long communityId;

	public GetReportCount(long communityId) {
		this.communityId = communityId;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}
}
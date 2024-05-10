// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
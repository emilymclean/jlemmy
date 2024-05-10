// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PurgeCommunity {
	@SerializedName("community_id")
	private long communityId;
	private String reason;

	public PurgeCommunity(long communityId, String reason) {
		this.communityId = communityId;
		this.reason = reason;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
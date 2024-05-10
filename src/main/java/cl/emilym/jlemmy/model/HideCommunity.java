// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class HideCommunity {
	@SerializedName("community_id")
	private long communityId;
	private boolean hidden;
	private String reason;

	public HideCommunity(long communityId, boolean hidden, String reason) {
		this.communityId = communityId;
		this.hidden = hidden;
		this.reason = reason;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public boolean getHidden() {
	    return hidden;
	}

	public void setHidden(boolean hidden) {
	    this.hidden = hidden;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class RemoveCommunity {
	@SerializedName("community_id")
	private long communityId;
	private boolean removed;
	private String reason;

	public RemoveCommunity(long communityId, boolean removed, String reason) {
		this.communityId = communityId;
		this.removed = removed;
		this.reason = reason;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
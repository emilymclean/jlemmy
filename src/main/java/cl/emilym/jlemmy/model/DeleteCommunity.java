// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class DeleteCommunity {
	@SerializedName("community_id")
	private long communityId;
	private boolean deleted;

	public DeleteCommunity(long communityId, boolean deleted) {
		this.communityId = communityId;
		this.deleted = deleted;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}
}
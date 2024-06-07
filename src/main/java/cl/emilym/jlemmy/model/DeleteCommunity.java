// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
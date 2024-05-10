// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
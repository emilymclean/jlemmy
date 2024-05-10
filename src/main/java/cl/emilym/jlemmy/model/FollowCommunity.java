// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class FollowCommunity {
	@SerializedName("community_id")
	private long communityId;
	private boolean follow;

	public FollowCommunity(long communityId, boolean follow) {
		this.communityId = communityId;
		this.follow = follow;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public boolean getFollow() {
	    return follow;
	}

	public void setFollow(boolean follow) {
	    this.follow = follow;
	}
}
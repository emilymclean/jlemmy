// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
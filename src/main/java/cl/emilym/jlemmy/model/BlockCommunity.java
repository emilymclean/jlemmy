// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class BlockCommunity {
	@SerializedName("community_id")
	private long communityId;
	private boolean block;

	public BlockCommunity(long communityId, boolean block) {
		this.communityId = communityId;
		this.block = block;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public boolean getBlock() {
	    return block;
	}

	public void setBlock(boolean block) {
	    this.block = block;
	}
}
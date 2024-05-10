// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class BlockCommunityResponse {
	@SerializedName("community_view")
	private CommunityView communityView;
	private boolean blocked;

	public BlockCommunityResponse(CommunityView communityView, boolean blocked) {
		this.communityView = communityView;
		this.blocked = blocked;
	}

	public CommunityView getCommunityView() {
	    return communityView;
	}

	public void setCommunityView(CommunityView communityView) {
	    this.communityView = communityView;
	}

	public boolean getBlocked() {
	    return blocked;
	}

	public void setBlocked(boolean blocked) {
	    this.blocked = blocked;
	}
}
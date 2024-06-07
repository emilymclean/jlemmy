// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class AddModToCommunityResponse {
	private CommunityModeratorView[] moderators;

	public AddModToCommunityResponse(CommunityModeratorView[] moderators) {
		this.moderators = moderators;
	}

	public CommunityModeratorView[] getModerators() {
	    return moderators;
	}

	public void setModerators(CommunityModeratorView[] moderators) {
	    this.moderators = moderators;
	}
}
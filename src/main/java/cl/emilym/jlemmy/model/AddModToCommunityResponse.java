// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
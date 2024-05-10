// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
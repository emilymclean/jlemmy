// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CommunityModeratorView {
	private Community community;
	private Person moderator;

	public CommunityModeratorView(Community community, Person moderator) {
		this.community = community;
		this.moderator = moderator;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}

	public Person getModerator() {
	    return moderator;
	}

	public void setModerator(Person moderator) {
	    this.moderator = moderator;
	}
}
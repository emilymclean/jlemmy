// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModRemoveCommunityView {
	@SerializedName("mod_remove_community")
	private ModRemoveCommunity modRemoveCommunity;
	private Person moderator;
	private Community community;

	public ModRemoveCommunityView(ModRemoveCommunity modRemoveCommunity, Person moderator, Community community) {
		this.modRemoveCommunity = modRemoveCommunity;
		this.moderator = moderator;
		this.community = community;
	}

	public ModRemoveCommunity getModRemoveCommunity() {
	    return modRemoveCommunity;
	}

	public void setModRemoveCommunity(ModRemoveCommunity modRemoveCommunity) {
	    this.modRemoveCommunity = modRemoveCommunity;
	}

	public Person getModerator() {
	    return moderator;
	}

	public void setModerator(Person moderator) {
	    this.moderator = moderator;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModHideCommunityView {
	@SerializedName("mod_hide_community")
	private ModHideCommunity modHideCommunity;
	private Person admin;
	private Community community;

	public ModHideCommunityView(ModHideCommunity modHideCommunity, Person admin, Community community) {
		this.modHideCommunity = modHideCommunity;
		this.admin = admin;
		this.community = community;
	}

	public ModHideCommunity getModHideCommunity() {
	    return modHideCommunity;
	}

	public void setModHideCommunity(ModHideCommunity modHideCommunity) {
	    this.modHideCommunity = modHideCommunity;
	}

	public Person getAdmin() {
	    return admin;
	}

	public void setAdmin(Person admin) {
	    this.admin = admin;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}
}
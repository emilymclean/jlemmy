// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModAddCommunityView {
	@SerializedName("mod_add_community")
	private ModAddCommunity modAddCommunity;
	private Person moderator;
	private Community community;
	@SerializedName("modded_person")
	private Person moddedPerson;

	public ModAddCommunityView(ModAddCommunity modAddCommunity, Person moderator, Community community, Person moddedPerson) {
		this.modAddCommunity = modAddCommunity;
		this.moderator = moderator;
		this.community = community;
		this.moddedPerson = moddedPerson;
	}

	public ModAddCommunity getModAddCommunity() {
	    return modAddCommunity;
	}

	public void setModAddCommunity(ModAddCommunity modAddCommunity) {
	    this.modAddCommunity = modAddCommunity;
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

	public Person getModdedPerson() {
	    return moddedPerson;
	}

	public void setModdedPerson(Person moddedPerson) {
	    this.moddedPerson = moddedPerson;
	}
}
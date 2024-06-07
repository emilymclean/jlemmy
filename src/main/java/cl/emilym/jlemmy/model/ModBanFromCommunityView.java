// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModBanFromCommunityView {
	@SerializedName("mod_ban_from_community")
	private ModBanFromCommunity modBanFromCommunity;
	private Person moderator;
	private Community community;
	@SerializedName("banned_person")
	private Person bannedPerson;

	public ModBanFromCommunityView(ModBanFromCommunity modBanFromCommunity, Person moderator, Community community, Person bannedPerson) {
		this.modBanFromCommunity = modBanFromCommunity;
		this.moderator = moderator;
		this.community = community;
		this.bannedPerson = bannedPerson;
	}

	public ModBanFromCommunity getModBanFromCommunity() {
	    return modBanFromCommunity;
	}

	public void setModBanFromCommunity(ModBanFromCommunity modBanFromCommunity) {
	    this.modBanFromCommunity = modBanFromCommunity;
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

	public Person getBannedPerson() {
	    return bannedPerson;
	}

	public void setBannedPerson(Person bannedPerson) {
	    this.bannedPerson = bannedPerson;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModTransferCommunityView {
	@SerializedName("mod_transfer_community")
	private ModTransferCommunity modTransferCommunity;
	private Person moderator;
	private Community community;
	@SerializedName("modded_person")
	private Person moddedPerson;

	public ModTransferCommunityView(ModTransferCommunity modTransferCommunity, Person moderator, Community community, Person moddedPerson) {
		this.modTransferCommunity = modTransferCommunity;
		this.moderator = moderator;
		this.community = community;
		this.moddedPerson = moddedPerson;
	}

	public ModTransferCommunity getModTransferCommunity() {
	    return modTransferCommunity;
	}

	public void setModTransferCommunity(ModTransferCommunity modTransferCommunity) {
	    this.modTransferCommunity = modTransferCommunity;
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
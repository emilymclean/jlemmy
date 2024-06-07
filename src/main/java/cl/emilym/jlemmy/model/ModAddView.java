// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModAddView {
	@SerializedName("mod_add")
	private ModAdd modAdd;
	private Person moderator;
	@SerializedName("modded_person")
	private Person moddedPerson;

	public ModAddView(ModAdd modAdd, Person moderator, Person moddedPerson) {
		this.modAdd = modAdd;
		this.moderator = moderator;
		this.moddedPerson = moddedPerson;
	}

	public ModAdd getModAdd() {
	    return modAdd;
	}

	public void setModAdd(ModAdd modAdd) {
	    this.modAdd = modAdd;
	}

	public Person getModerator() {
	    return moderator;
	}

	public void setModerator(Person moderator) {
	    this.moderator = moderator;
	}

	public Person getModdedPerson() {
	    return moddedPerson;
	}

	public void setModdedPerson(Person moddedPerson) {
	    this.moddedPerson = moddedPerson;
	}
}
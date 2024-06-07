// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class AddAdmin {
	@SerializedName("person_id")
	private long personId;
	private boolean added;

	public AddAdmin(long personId, boolean added) {
		this.personId = personId;
		this.added = added;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public boolean getAdded() {
	    return added;
	}

	public void setAdded(boolean added) {
	    this.added = added;
	}
}
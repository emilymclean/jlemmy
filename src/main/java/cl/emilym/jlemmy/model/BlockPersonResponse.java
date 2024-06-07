// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class BlockPersonResponse {
	@SerializedName("person_view")
	private PersonView personView;
	private boolean blocked;

	public BlockPersonResponse(PersonView personView, boolean blocked) {
		this.personView = personView;
		this.blocked = blocked;
	}

	public PersonView getPersonView() {
	    return personView;
	}

	public void setPersonView(PersonView personView) {
	    this.personView = personView;
	}

	public boolean getBlocked() {
	    return blocked;
	}

	public void setBlocked(boolean blocked) {
	    this.blocked = blocked;
	}
}
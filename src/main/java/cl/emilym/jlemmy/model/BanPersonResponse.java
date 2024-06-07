// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class BanPersonResponse {
	@SerializedName("person_view")
	private PersonView personView;
	private boolean banned;

	public BanPersonResponse(PersonView personView, boolean banned) {
		this.personView = personView;
		this.banned = banned;
	}

	public PersonView getPersonView() {
	    return personView;
	}

	public void setPersonView(PersonView personView) {
	    this.personView = personView;
	}

	public boolean getBanned() {
	    return banned;
	}

	public void setBanned(boolean banned) {
	    this.banned = banned;
	}
}
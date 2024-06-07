// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class BannedPersonsResponse {
	private PersonView[] banned;

	public BannedPersonsResponse(PersonView[] banned) {
		this.banned = banned;
	}

	public PersonView[] getBanned() {
	    return banned;
	}

	public void setBanned(PersonView[] banned) {
	    this.banned = banned;
	}
}
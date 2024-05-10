// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
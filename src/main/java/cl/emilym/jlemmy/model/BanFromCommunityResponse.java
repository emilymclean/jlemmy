// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class BanFromCommunityResponse {
	@SerializedName("person_view")
	private PersonView personView;
	private boolean banned;

	public BanFromCommunityResponse(PersonView personView, boolean banned) {
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
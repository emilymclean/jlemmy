// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class AddAdminResponse {
	private PersonView[] admins;

	public AddAdminResponse(PersonView[] admins) {
		this.admins = admins;
	}

	public PersonView[] getAdmins() {
	    return admins;
	}

	public void setAdmins(PersonView[] admins) {
	    this.admins = admins;
	}
}
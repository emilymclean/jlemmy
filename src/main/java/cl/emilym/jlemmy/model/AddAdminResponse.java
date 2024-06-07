// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
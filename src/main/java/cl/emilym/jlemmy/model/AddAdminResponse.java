// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
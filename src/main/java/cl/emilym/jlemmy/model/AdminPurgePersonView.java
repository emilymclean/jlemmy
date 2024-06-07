// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class AdminPurgePersonView {
	@SerializedName("admin_purge_person")
	private AdminPurgePerson adminPurgePerson;
	private Person admin;

	public AdminPurgePersonView(AdminPurgePerson adminPurgePerson, Person admin) {
		this.adminPurgePerson = adminPurgePerson;
		this.admin = admin;
	}

	public AdminPurgePerson getAdminPurgePerson() {
	    return adminPurgePerson;
	}

	public void setAdminPurgePerson(AdminPurgePerson adminPurgePerson) {
	    this.adminPurgePerson = adminPurgePerson;
	}

	public Person getAdmin() {
	    return admin;
	}

	public void setAdmin(Person admin) {
	    this.admin = admin;
	}
}
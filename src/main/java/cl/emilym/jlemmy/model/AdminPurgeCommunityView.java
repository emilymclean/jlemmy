// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class AdminPurgeCommunityView {
	@SerializedName("admin_purge_community")
	private AdminPurgeCommunity adminPurgeCommunity;
	private Person admin;

	public AdminPurgeCommunityView(AdminPurgeCommunity adminPurgeCommunity, Person admin) {
		this.adminPurgeCommunity = adminPurgeCommunity;
		this.admin = admin;
	}

	public AdminPurgeCommunity getAdminPurgeCommunity() {
	    return adminPurgeCommunity;
	}

	public void setAdminPurgeCommunity(AdminPurgeCommunity adminPurgeCommunity) {
	    this.adminPurgeCommunity = adminPurgeCommunity;
	}

	public Person getAdmin() {
	    return admin;
	}

	public void setAdmin(Person admin) {
	    this.admin = admin;
	}
}
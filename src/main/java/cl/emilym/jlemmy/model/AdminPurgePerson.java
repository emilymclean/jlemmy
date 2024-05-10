// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class AdminPurgePerson {
	private long id;
	@SerializedName("admin_person_id")
	private long adminPersonId;
	private String reason;
	@SerializedName("when_")
	private String when;

	public AdminPurgePerson(long id, long adminPersonId, String reason, String when) {
		this.id = id;
		this.adminPersonId = adminPersonId;
		this.reason = reason;
		this.when = when;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getAdminPersonId() {
	    return adminPersonId;
	}

	public void setAdminPersonId(long adminPersonId) {
	    this.adminPersonId = adminPersonId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
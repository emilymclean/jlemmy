// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PurgePerson {
	@SerializedName("person_id")
	private long personId;
	private String reason;

	public PurgePerson(long personId, String reason) {
		this.personId = personId;
		this.reason = reason;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
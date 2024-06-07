// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
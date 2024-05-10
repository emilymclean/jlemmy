// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class BanPerson {
	@SerializedName("person_id")
	private long personId;
	private boolean ban;
	@SerializedName("remove_data")
	private boolean removeData;
	private String reason;
	private long expires;

	public BanPerson(long personId, boolean ban, boolean removeData, String reason, long expires) {
		this.personId = personId;
		this.ban = ban;
		this.removeData = removeData;
		this.reason = reason;
		this.expires = expires;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public boolean getBan() {
	    return ban;
	}

	public void setBan(boolean ban) {
	    this.ban = ban;
	}

	public boolean getRemoveData() {
	    return removeData;
	}

	public void setRemoveData(boolean removeData) {
	    this.removeData = removeData;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public long getExpires() {
	    return expires;
	}

	public void setExpires(long expires) {
	    this.expires = expires;
	}
}
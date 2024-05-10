// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModBan {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("other_person_id")
	private long otherPersonId;
	private String reason;
	private boolean banned;
	private String expires;
	@SerializedName("when_")
	private String when;

	public ModBan(long id, long modPersonId, long otherPersonId, String reason, boolean banned, String expires, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.otherPersonId = otherPersonId;
		this.reason = reason;
		this.banned = banned;
		this.expires = expires;
		this.when = when;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getModPersonId() {
	    return modPersonId;
	}

	public void setModPersonId(long modPersonId) {
	    this.modPersonId = modPersonId;
	}

	public long getOtherPersonId() {
	    return otherPersonId;
	}

	public void setOtherPersonId(long otherPersonId) {
	    this.otherPersonId = otherPersonId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public boolean getBanned() {
	    return banned;
	}

	public void setBanned(boolean banned) {
	    this.banned = banned;
	}

	public String getExpires() {
	    return expires;
	}

	public void setExpires(String expires) {
	    this.expires = expires;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
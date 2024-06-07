// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModHideCommunity {
	private long id;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("when_")
	private String when;
	private String reason;
	private boolean hidden;

	public ModHideCommunity(long id, long communityId, long modPersonId, String when, String reason, boolean hidden) {
		this.id = id;
		this.communityId = communityId;
		this.modPersonId = modPersonId;
		this.when = when;
		this.reason = reason;
		this.hidden = hidden;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public long getModPersonId() {
	    return modPersonId;
	}

	public void setModPersonId(long modPersonId) {
	    this.modPersonId = modPersonId;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public boolean getHidden() {
	    return hidden;
	}

	public void setHidden(boolean hidden) {
	    this.hidden = hidden;
	}
}
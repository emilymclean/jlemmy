// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModRemoveCommunity {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("community_id")
	private long communityId;
	private String reason;
	private boolean removed;
	@SerializedName("when_")
	private String when;

	public ModRemoveCommunity(long id, long modPersonId, long communityId, String reason, boolean removed, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.communityId = communityId;
		this.reason = reason;
		this.removed = removed;
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

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
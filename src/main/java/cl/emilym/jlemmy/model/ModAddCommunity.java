// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModAddCommunity {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("other_person_id")
	private long otherPersonId;
	@SerializedName("community_id")
	private long communityId;
	private boolean removed;
	@SerializedName("when_")
	private String when;

	public ModAddCommunity(long id, long modPersonId, long otherPersonId, long communityId, boolean removed, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.otherPersonId = otherPersonId;
		this.communityId = communityId;
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

	public long getOtherPersonId() {
	    return otherPersonId;
	}

	public void setOtherPersonId(long otherPersonId) {
	    this.otherPersonId = otherPersonId;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
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
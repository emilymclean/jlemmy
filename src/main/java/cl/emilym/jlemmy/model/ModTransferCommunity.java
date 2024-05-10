// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModTransferCommunity {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("other_person_id")
	private long otherPersonId;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("when_")
	private String when;

	public ModTransferCommunity(long id, long modPersonId, long otherPersonId, long communityId, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.otherPersonId = otherPersonId;
		this.communityId = communityId;
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

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
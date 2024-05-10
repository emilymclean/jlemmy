// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class AddModToCommunity {
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("person_id")
	private long personId;
	private boolean added;

	public AddModToCommunity(long communityId, long personId, boolean added) {
		this.communityId = communityId;
		this.personId = personId;
		this.added = added;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public boolean getAdded() {
	    return added;
	}

	public void setAdded(boolean added) {
	    this.added = added;
	}
}
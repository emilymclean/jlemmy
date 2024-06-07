// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class AdminPurgePost {
	private long id;
	@SerializedName("admin_person_id")
	private long adminPersonId;
	@SerializedName("community_id")
	private long communityId;
	private String reason;
	@SerializedName("when_")
	private String when;

	public AdminPurgePost(long id, long adminPersonId, long communityId, String reason, String when) {
		this.id = id;
		this.adminPersonId = adminPersonId;
		this.communityId = communityId;
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

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
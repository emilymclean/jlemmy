// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModRemovePost {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("post_id")
	private long postId;
	private String reason;
	private boolean removed;
	@SerializedName("when_")
	private String when;

	public ModRemovePost(long id, long modPersonId, long postId, String reason, boolean removed, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.postId = postId;
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

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
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
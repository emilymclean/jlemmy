// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModLockPost {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("post_id")
	private long postId;
	private boolean locked;
	@SerializedName("when_")
	private String when;

	public ModLockPost(long id, long modPersonId, long postId, boolean locked, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.postId = postId;
		this.locked = locked;
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

	public boolean getLocked() {
	    return locked;
	}

	public void setLocked(boolean locked) {
	    this.locked = locked;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
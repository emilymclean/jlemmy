// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class LockPost {
	@SerializedName("post_id")
	private long postId;
	private boolean locked;

	public LockPost(long postId, boolean locked) {
		this.postId = postId;
		this.locked = locked;
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
}
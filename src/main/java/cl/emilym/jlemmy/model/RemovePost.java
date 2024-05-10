// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class RemovePost {
	@SerializedName("post_id")
	private long postId;
	private boolean removed;
	private String reason;

	public RemovePost(long postId, boolean removed, String reason) {
		this.postId = postId;
		this.removed = removed;
		this.reason = reason;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
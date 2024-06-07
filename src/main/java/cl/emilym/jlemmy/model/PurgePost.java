// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PurgePost {
	@SerializedName("post_id")
	private long postId;
	private String reason;

	public PurgePost(long postId, String reason) {
		this.postId = postId;
		this.reason = reason;
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
}
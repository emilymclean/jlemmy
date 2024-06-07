// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CreatePostReport {
	@SerializedName("post_id")
	private long postId;
	private String reason;

	public CreatePostReport(long postId, String reason) {
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
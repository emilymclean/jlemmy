// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
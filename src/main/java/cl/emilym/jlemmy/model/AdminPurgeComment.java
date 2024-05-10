// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class AdminPurgeComment {
	private long id;
	@SerializedName("admin_person_id")
	private long adminPersonId;
	@SerializedName("post_id")
	private long postId;
	private String reason;
	@SerializedName("when_")
	private String when;

	public AdminPurgeComment(long id, long adminPersonId, long postId, String reason, String when) {
		this.id = id;
		this.adminPersonId = adminPersonId;
		this.postId = postId;
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

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
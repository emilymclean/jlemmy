// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class RegistrationApplication {
	private long id;
	@SerializedName("local_user_id")
	private long localUserId;
	private String answer;
	@SerializedName("admin_id")
	private long adminId;
	@SerializedName("deny_reason")
	private String denyReason;
	private String published;

	public RegistrationApplication(long id, long localUserId, String answer, long adminId, String denyReason, String published) {
		this.id = id;
		this.localUserId = localUserId;
		this.answer = answer;
		this.adminId = adminId;
		this.denyReason = denyReason;
		this.published = published;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getLocalUserId() {
	    return localUserId;
	}

	public void setLocalUserId(long localUserId) {
	    this.localUserId = localUserId;
	}

	public String getAnswer() {
	    return answer;
	}

	public void setAnswer(String answer) {
	    this.answer = answer;
	}

	public long getAdminId() {
	    return adminId;
	}

	public void setAdminId(long adminId) {
	    this.adminId = adminId;
	}

	public String getDenyReason() {
	    return denyReason;
	}

	public void setDenyReason(String denyReason) {
	    this.denyReason = denyReason;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}
}
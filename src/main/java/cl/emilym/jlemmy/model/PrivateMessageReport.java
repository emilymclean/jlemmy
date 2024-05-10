// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PrivateMessageReport {
	private long id;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("private_message_id")
	private long privateMessageId;
	@SerializedName("original_pm_text")
	private String originalPmText;
	private String reason;
	private boolean resolved;
	@SerializedName("resolver_id")
	private long resolverId;
	private String published;
	private String updated;

	public PrivateMessageReport(long id, long creatorId, long privateMessageId, String originalPmText, String reason, boolean resolved, long resolverId, String published, String updated) {
		this.id = id;
		this.creatorId = creatorId;
		this.privateMessageId = privateMessageId;
		this.originalPmText = originalPmText;
		this.reason = reason;
		this.resolved = resolved;
		this.resolverId = resolverId;
		this.published = published;
		this.updated = updated;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getCreatorId() {
	    return creatorId;
	}

	public void setCreatorId(long creatorId) {
	    this.creatorId = creatorId;
	}

	public long getPrivateMessageId() {
	    return privateMessageId;
	}

	public void setPrivateMessageId(long privateMessageId) {
	    this.privateMessageId = privateMessageId;
	}

	public String getOriginalPmText() {
	    return originalPmText;
	}

	public void setOriginalPmText(String originalPmText) {
	    this.originalPmText = originalPmText;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public boolean getResolved() {
	    return resolved;
	}

	public void setResolved(boolean resolved) {
	    this.resolved = resolved;
	}

	public long getResolverId() {
	    return resolverId;
	}

	public void setResolverId(long resolverId) {
	    this.resolverId = resolverId;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public String getUpdated() {
	    return updated;
	}

	public void setUpdated(String updated) {
	    this.updated = updated;
	}
}
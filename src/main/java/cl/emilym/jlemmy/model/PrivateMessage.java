// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PrivateMessage {
	private long id;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("recipient_id")
	private long recipientId;
	private String content;
	private boolean deleted;
	private boolean read;
	private String published;
	private String updated;
	@SerializedName("ap_id")
	private String apId;
	private boolean local;

	public PrivateMessage(long id, long creatorId, long recipientId, String content, boolean deleted, boolean read, String published, String updated, String apId, boolean local) {
		this.id = id;
		this.creatorId = creatorId;
		this.recipientId = recipientId;
		this.content = content;
		this.deleted = deleted;
		this.read = read;
		this.published = published;
		this.updated = updated;
		this.apId = apId;
		this.local = local;
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

	public long getRecipientId() {
	    return recipientId;
	}

	public void setRecipientId(long recipientId) {
	    this.recipientId = recipientId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
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

	public String getApId() {
	    return apId;
	}

	public void setApId(String apId) {
	    this.apId = apId;
	}

	public boolean getLocal() {
	    return local;
	}

	public void setLocal(boolean local) {
	    this.local = local;
	}
}
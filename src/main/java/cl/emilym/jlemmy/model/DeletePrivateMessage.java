// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class DeletePrivateMessage {
	@SerializedName("private_message_id")
	private long privateMessageId;
	private boolean deleted;

	public DeletePrivateMessage(long privateMessageId, boolean deleted) {
		this.privateMessageId = privateMessageId;
		this.deleted = deleted;
	}

	public long getPrivateMessageId() {
	    return privateMessageId;
	}

	public void setPrivateMessageId(long privateMessageId) {
	    this.privateMessageId = privateMessageId;
	}

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}
}
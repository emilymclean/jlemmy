// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
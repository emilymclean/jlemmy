// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class MarkPrivateMessageAsRead {
	@SerializedName("private_message_id")
	private long privateMessageId;
	private boolean read;

	public MarkPrivateMessageAsRead(long privateMessageId, boolean read) {
		this.privateMessageId = privateMessageId;
		this.read = read;
	}

	public long getPrivateMessageId() {
	    return privateMessageId;
	}

	public void setPrivateMessageId(long privateMessageId) {
	    this.privateMessageId = privateMessageId;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
	}
}
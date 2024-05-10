// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
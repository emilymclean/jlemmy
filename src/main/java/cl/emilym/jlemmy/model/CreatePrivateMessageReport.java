// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CreatePrivateMessageReport {
	@SerializedName("private_message_id")
	private long privateMessageId;
	private String reason;

	public CreatePrivateMessageReport(long privateMessageId, String reason) {
		this.privateMessageId = privateMessageId;
		this.reason = reason;
	}

	public long getPrivateMessageId() {
	    return privateMessageId;
	}

	public void setPrivateMessageId(long privateMessageId) {
	    this.privateMessageId = privateMessageId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}
}
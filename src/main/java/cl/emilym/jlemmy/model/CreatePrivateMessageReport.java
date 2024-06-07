// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
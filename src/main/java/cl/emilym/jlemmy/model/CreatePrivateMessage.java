// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CreatePrivateMessage {
	private String content;
	@SerializedName("recipient_id")
	private long recipientId;

	public CreatePrivateMessage(String content, long recipientId) {
		this.content = content;
		this.recipientId = recipientId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public long getRecipientId() {
	    return recipientId;
	}

	public void setRecipientId(long recipientId) {
	    this.recipientId = recipientId;
	}
}
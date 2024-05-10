// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
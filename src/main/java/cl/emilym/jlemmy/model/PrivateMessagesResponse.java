// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PrivateMessagesResponse {
	@SerializedName("private_messages")
	private PrivateMessageView[] privateMessages;

	public PrivateMessagesResponse(PrivateMessageView[] privateMessages) {
		this.privateMessages = privateMessages;
	}

	public PrivateMessageView[] getPrivateMessages() {
	    return privateMessages;
	}

	public void setPrivateMessages(PrivateMessageView[] privateMessages) {
	    this.privateMessages = privateMessages;
	}
}
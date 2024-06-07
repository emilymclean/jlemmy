// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
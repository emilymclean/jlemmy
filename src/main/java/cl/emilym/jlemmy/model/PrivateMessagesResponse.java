// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
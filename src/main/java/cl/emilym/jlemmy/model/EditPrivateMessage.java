// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class EditPrivateMessage {
	@SerializedName("private_message_id")
	private long privateMessageId;
	private String content;

	public EditPrivateMessage(long privateMessageId, String content) {
		this.privateMessageId = privateMessageId;
		this.content = content;
	}

	public long getPrivateMessageId() {
	    return privateMessageId;
	}

	public void setPrivateMessageId(long privateMessageId) {
	    this.privateMessageId = privateMessageId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}
}
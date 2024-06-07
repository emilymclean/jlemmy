// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetUnreadCountResponse {
	private long replies;
	private long mentions;
	@SerializedName("private_messages")
	private long privateMessages;

	public GetUnreadCountResponse(long replies, long mentions, long privateMessages) {
		this.replies = replies;
		this.mentions = mentions;
		this.privateMessages = privateMessages;
	}

	public long getReplies() {
	    return replies;
	}

	public void setReplies(long replies) {
	    this.replies = replies;
	}

	public long getMentions() {
	    return mentions;
	}

	public void setMentions(long mentions) {
	    this.mentions = mentions;
	}

	public long getPrivateMessages() {
	    return privateMessages;
	}

	public void setPrivateMessages(long privateMessages) {
	    this.privateMessages = privateMessages;
	}
}
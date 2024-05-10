// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PrivateMessageView {
	@SerializedName("private_message")
	private PrivateMessage privateMessage;
	private Person creator;
	private Person recipient;

	public PrivateMessageView(PrivateMessage privateMessage, Person creator, Person recipient) {
		this.privateMessage = privateMessage;
		this.creator = creator;
		this.recipient = recipient;
	}

	public PrivateMessage getPrivateMessage() {
	    return privateMessage;
	}

	public void setPrivateMessage(PrivateMessage privateMessage) {
	    this.privateMessage = privateMessage;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
	}

	public Person getRecipient() {
	    return recipient;
	}

	public void setRecipient(Person recipient) {
	    this.recipient = recipient;
	}
}
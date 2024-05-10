// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PrivateMessageResponse {
	@SerializedName("private_message_view")
	private PrivateMessageView privateMessageView;

	public PrivateMessageResponse(PrivateMessageView privateMessageView) {
		this.privateMessageView = privateMessageView;
	}

	public PrivateMessageView getPrivateMessageView() {
	    return privateMessageView;
	}

	public void setPrivateMessageView(PrivateMessageView privateMessageView) {
	    this.privateMessageView = privateMessageView;
	}
}
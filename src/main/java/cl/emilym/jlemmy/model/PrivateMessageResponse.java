// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PrivateMessageReportView {
	@SerializedName("private_message_report")
	private PrivateMessageReport privateMessageReport;
	@SerializedName("private_message")
	private PrivateMessage privateMessage;
	@SerializedName("private_message_creator")
	private Person privateMessageCreator;
	private Person creator;
	private Person resolver;

	public PrivateMessageReportView(PrivateMessageReport privateMessageReport, PrivateMessage privateMessage, Person privateMessageCreator, Person creator, Person resolver) {
		this.privateMessageReport = privateMessageReport;
		this.privateMessage = privateMessage;
		this.privateMessageCreator = privateMessageCreator;
		this.creator = creator;
		this.resolver = resolver;
	}

	public PrivateMessageReport getPrivateMessageReport() {
	    return privateMessageReport;
	}

	public void setPrivateMessageReport(PrivateMessageReport privateMessageReport) {
	    this.privateMessageReport = privateMessageReport;
	}

	public PrivateMessage getPrivateMessage() {
	    return privateMessage;
	}

	public void setPrivateMessage(PrivateMessage privateMessage) {
	    this.privateMessage = privateMessage;
	}

	public Person getPrivateMessageCreator() {
	    return privateMessageCreator;
	}

	public void setPrivateMessageCreator(Person privateMessageCreator) {
	    this.privateMessageCreator = privateMessageCreator;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
	}

	public Person getResolver() {
	    return resolver;
	}

	public void setResolver(Person resolver) {
	    this.resolver = resolver;
	}
}
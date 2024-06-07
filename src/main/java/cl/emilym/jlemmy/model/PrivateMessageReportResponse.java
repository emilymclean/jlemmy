// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PrivateMessageReportResponse {
	@SerializedName("private_message_report_view")
	private PrivateMessageReportView privateMessageReportView;

	public PrivateMessageReportResponse(PrivateMessageReportView privateMessageReportView) {
		this.privateMessageReportView = privateMessageReportView;
	}

	public PrivateMessageReportView getPrivateMessageReportView() {
	    return privateMessageReportView;
	}

	public void setPrivateMessageReportView(PrivateMessageReportView privateMessageReportView) {
	    this.privateMessageReportView = privateMessageReportView;
	}
}
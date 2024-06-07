// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
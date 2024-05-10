// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
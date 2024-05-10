// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ListPrivateMessageReportsResponse {
	@SerializedName("private_message_reports")
	private PrivateMessageReportView[] privateMessageReports;

	public ListPrivateMessageReportsResponse(PrivateMessageReportView[] privateMessageReports) {
		this.privateMessageReports = privateMessageReports;
	}

	public PrivateMessageReportView[] getPrivateMessageReports() {
	    return privateMessageReports;
	}

	public void setPrivateMessageReports(PrivateMessageReportView[] privateMessageReports) {
	    this.privateMessageReports = privateMessageReports;
	}
}
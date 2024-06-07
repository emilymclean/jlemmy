// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
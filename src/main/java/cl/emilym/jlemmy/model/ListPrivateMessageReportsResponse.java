// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
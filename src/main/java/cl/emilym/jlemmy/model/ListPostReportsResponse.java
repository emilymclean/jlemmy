// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListPostReportsResponse {
	@SerializedName("post_reports")
	private PostReportView[] postReports;

	public ListPostReportsResponse(PostReportView[] postReports) {
		this.postReports = postReports;
	}

	public PostReportView[] getPostReports() {
	    return postReports;
	}

	public void setPostReports(PostReportView[] postReports) {
	    this.postReports = postReports;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
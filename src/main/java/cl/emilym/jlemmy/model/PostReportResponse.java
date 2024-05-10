// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PostReportResponse {
	@SerializedName("post_report_view")
	private PostReportView postReportView;

	public PostReportResponse(PostReportView postReportView) {
		this.postReportView = postReportView;
	}

	public PostReportView getPostReportView() {
	    return postReportView;
	}

	public void setPostReportView(PostReportView postReportView) {
	    this.postReportView = postReportView;
	}
}
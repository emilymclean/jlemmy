// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
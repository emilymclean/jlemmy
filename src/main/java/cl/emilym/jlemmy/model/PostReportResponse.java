// This class was generated, do not modify it directly
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
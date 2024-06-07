// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentReportResponse {
	@SerializedName("comment_report_view")
	private CommentReportView commentReportView;

	public CommentReportResponse(CommentReportView commentReportView) {
		this.commentReportView = commentReportView;
	}

	public CommentReportView getCommentReportView() {
	    return commentReportView;
	}

	public void setCommentReportView(CommentReportView commentReportView) {
	    this.commentReportView = commentReportView;
	}
}
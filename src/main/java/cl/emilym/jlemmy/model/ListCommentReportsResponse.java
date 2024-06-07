// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListCommentReportsResponse {
	@SerializedName("comment_reports")
	private CommentReportView[] commentReports;

	public ListCommentReportsResponse(CommentReportView[] commentReports) {
		this.commentReports = commentReports;
	}

	public CommentReportView[] getCommentReports() {
	    return commentReports;
	}

	public void setCommentReports(CommentReportView[] commentReports) {
	    this.commentReports = commentReports;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
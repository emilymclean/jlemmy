// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
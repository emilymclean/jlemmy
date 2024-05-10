// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetCommentsResponse {
	private CommentView[] comments;

	public GetCommentsResponse(CommentView[] comments) {
		this.comments = comments;
	}

	public CommentView[] getComments() {
	    return comments;
	}

	public void setComments(CommentView[] comments) {
	    this.comments = comments;
	}
}
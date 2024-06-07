// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
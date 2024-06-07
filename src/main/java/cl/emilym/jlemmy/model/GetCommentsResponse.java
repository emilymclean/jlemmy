// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
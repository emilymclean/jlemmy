// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PostResponse {
	@SerializedName("post_view")
	private PostView postView;

	public PostResponse(PostView postView) {
		this.postView = postView;
	}

	public PostView getPostView() {
	    return postView;
	}

	public void setPostView(PostView postView) {
	    this.postView = postView;
	}
}
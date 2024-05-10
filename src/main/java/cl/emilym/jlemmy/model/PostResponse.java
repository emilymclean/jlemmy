// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
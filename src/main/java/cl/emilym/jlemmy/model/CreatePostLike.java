// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CreatePostLike {
	@SerializedName("post_id")
	private long postId;
	private long score;

	public CreatePostLike(long postId, long score) {
		this.postId = postId;
		this.score = score;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public long getScore() {
	    return score;
	}

	public void setScore(long score) {
	    this.score = score;
	}
}
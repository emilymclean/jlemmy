// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class DeletePost {
	@SerializedName("post_id")
	private long postId;
	private boolean deleted;

	public DeletePost(long postId, boolean deleted) {
		this.postId = postId;
		this.deleted = deleted;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}
}
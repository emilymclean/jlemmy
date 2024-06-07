// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class SavePost {
	@SerializedName("post_id")
	private long postId;
	private boolean save;

	public SavePost(long postId, boolean save) {
		this.postId = postId;
		this.save = save;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public boolean getSave() {
	    return save;
	}

	public void setSave(boolean save) {
	    this.save = save;
	}
}
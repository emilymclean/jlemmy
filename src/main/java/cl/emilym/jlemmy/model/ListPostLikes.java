// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListPostLikes {
	@SerializedName("post_id")
	private long postId;
	private long page;
	private long limit;

	public ListPostLikes(long postId, long page, long limit) {
		this.postId = postId;
		this.page = page;
		this.limit = limit;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public long getPage() {
	    return page;
	}

	public void setPage(long page) {
	    this.page = page;
	}

	public long getLimit() {
	    return limit;
	}

	public void setLimit(long limit) {
	    this.limit = limit;
	}
}
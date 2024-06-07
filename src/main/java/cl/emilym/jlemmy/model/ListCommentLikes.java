// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListCommentLikes {
	@SerializedName("comment_id")
	private long commentId;
	private long page;
	private long limit;

	public ListCommentLikes(long commentId, long page, long limit) {
		this.commentId = commentId;
		this.page = page;
		this.limit = limit;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
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
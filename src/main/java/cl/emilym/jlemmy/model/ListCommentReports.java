// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListCommentReports {
	@SerializedName("comment_id")
	private long commentId;
	private long page;
	private long limit;
	@SerializedName("unresolved_only")
	private boolean unresolvedOnly;
	@SerializedName("community_id")
	private long communityId;

	public ListCommentReports(long commentId, long page, long limit, boolean unresolvedOnly, long communityId) {
		this.commentId = commentId;
		this.page = page;
		this.limit = limit;
		this.unresolvedOnly = unresolvedOnly;
		this.communityId = communityId;
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

	public boolean getUnresolvedOnly() {
	    return unresolvedOnly;
	}

	public void setUnresolvedOnly(boolean unresolvedOnly) {
	    this.unresolvedOnly = unresolvedOnly;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}
}
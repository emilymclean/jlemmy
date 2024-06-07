// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListPostReports {
	private long page;
	private long limit;
	@SerializedName("unresolved_only")
	private boolean unresolvedOnly;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("post_id")
	private long postId;

	public ListPostReports(long page, long limit, boolean unresolvedOnly, long communityId, long postId) {
		this.page = page;
		this.limit = limit;
		this.unresolvedOnly = unresolvedOnly;
		this.communityId = communityId;
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

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModlogListParams {
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("other_person_id")
	private long otherPersonId;
	@SerializedName("post_id")
	private long postId;
	@SerializedName("comment_id")
	private long commentId;
	private long page;
	private long limit;
	@SerializedName("hide_modlog_names")
	private boolean hideModlogNames;

	public ModlogListParams(long communityId, long modPersonId, long otherPersonId, long postId, long commentId, long page, long limit, boolean hideModlogNames) {
		this.communityId = communityId;
		this.modPersonId = modPersonId;
		this.otherPersonId = otherPersonId;
		this.postId = postId;
		this.commentId = commentId;
		this.page = page;
		this.limit = limit;
		this.hideModlogNames = hideModlogNames;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public long getModPersonId() {
	    return modPersonId;
	}

	public void setModPersonId(long modPersonId) {
	    this.modPersonId = modPersonId;
	}

	public long getOtherPersonId() {
	    return otherPersonId;
	}

	public void setOtherPersonId(long otherPersonId) {
	    this.otherPersonId = otherPersonId;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
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

	public boolean getHideModlogNames() {
	    return hideModlogNames;
	}

	public void setHideModlogNames(boolean hideModlogNames) {
	    this.hideModlogNames = hideModlogNames;
	}
}
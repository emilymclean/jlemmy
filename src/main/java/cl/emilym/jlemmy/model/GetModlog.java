// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetModlog {
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("community_id")
	private long communityId;
	private long page;
	private long limit;
	@SerializedName("type_")
	private ModlogActionType type;
	@SerializedName("other_person_id")
	private long otherPersonId;
	@SerializedName("post_id")
	private long postId;
	@SerializedName("comment_id")
	private long commentId;

	public GetModlog(long modPersonId, long communityId, long page, long limit, ModlogActionType type, long otherPersonId, long postId, long commentId) {
		this.modPersonId = modPersonId;
		this.communityId = communityId;
		this.page = page;
		this.limit = limit;
		this.type = type;
		this.otherPersonId = otherPersonId;
		this.postId = postId;
		this.commentId = commentId;
	}

	public long getModPersonId() {
	    return modPersonId;
	}

	public void setModPersonId(long modPersonId) {
	    this.modPersonId = modPersonId;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
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

	public ModlogActionType getType() {
	    return type;
	}

	public void setType(ModlogActionType type) {
	    this.type = type;
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
}
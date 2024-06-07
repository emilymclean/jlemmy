// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetComments {
	@SerializedName("type_")
	private ListingType type;
	private CommentSortType sort;
	@SerializedName("max_depth")
	private long maxDepth;
	private long page;
	private long limit;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("community_name")
	private String communityName;
	@SerializedName("post_id")
	private long postId;
	@SerializedName("parent_id")
	private long parentId;
	@SerializedName("saved_only")
	private boolean savedOnly;
	@SerializedName("liked_only")
	private boolean likedOnly;
	@SerializedName("disliked_only")
	private boolean dislikedOnly;

	public GetComments(ListingType type, CommentSortType sort, long maxDepth, long page, long limit, long communityId, String communityName, long postId, long parentId, boolean savedOnly, boolean likedOnly, boolean dislikedOnly) {
		this.type = type;
		this.sort = sort;
		this.maxDepth = maxDepth;
		this.page = page;
		this.limit = limit;
		this.communityId = communityId;
		this.communityName = communityName;
		this.postId = postId;
		this.parentId = parentId;
		this.savedOnly = savedOnly;
		this.likedOnly = likedOnly;
		this.dislikedOnly = dislikedOnly;
	}

	public ListingType getType() {
	    return type;
	}

	public void setType(ListingType type) {
	    this.type = type;
	}

	public CommentSortType getSort() {
	    return sort;
	}

	public void setSort(CommentSortType sort) {
	    this.sort = sort;
	}

	public long getMaxDepth() {
	    return maxDepth;
	}

	public void setMaxDepth(long maxDepth) {
	    this.maxDepth = maxDepth;
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

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public String getCommunityName() {
	    return communityName;
	}

	public void setCommunityName(String communityName) {
	    this.communityName = communityName;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public long getParentId() {
	    return parentId;
	}

	public void setParentId(long parentId) {
	    this.parentId = parentId;
	}

	public boolean getSavedOnly() {
	    return savedOnly;
	}

	public void setSavedOnly(boolean savedOnly) {
	    this.savedOnly = savedOnly;
	}

	public boolean getLikedOnly() {
	    return likedOnly;
	}

	public void setLikedOnly(boolean likedOnly) {
	    this.likedOnly = likedOnly;
	}

	public boolean getDislikedOnly() {
	    return dislikedOnly;
	}

	public void setDislikedOnly(boolean dislikedOnly) {
	    this.dislikedOnly = dislikedOnly;
	}
}
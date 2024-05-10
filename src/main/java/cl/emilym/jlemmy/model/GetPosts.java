// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetPosts {
	@SerializedName("type_")
	private ListingType type;
	private SortType sort;
	private long page;
	private long limit;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("community_name")
	private String communityName;
	@SerializedName("saved_only")
	private boolean savedOnly;
	@SerializedName("liked_only")
	private boolean likedOnly;
	@SerializedName("disliked_only")
	private boolean dislikedOnly;
	@SerializedName("show_hidden")
	private boolean showHidden;
	@SerializedName("page_cursor")
	private PaginationCursor pageCursor;

	public GetPosts(ListingType type, SortType sort, long page, long limit, long communityId, String communityName, boolean savedOnly, boolean likedOnly, boolean dislikedOnly, boolean showHidden, PaginationCursor pageCursor) {
		this.type = type;
		this.sort = sort;
		this.page = page;
		this.limit = limit;
		this.communityId = communityId;
		this.communityName = communityName;
		this.savedOnly = savedOnly;
		this.likedOnly = likedOnly;
		this.dislikedOnly = dislikedOnly;
		this.showHidden = showHidden;
		this.pageCursor = pageCursor;
	}

	public ListingType getType() {
	    return type;
	}

	public void setType(ListingType type) {
	    this.type = type;
	}

	public SortType getSort() {
	    return sort;
	}

	public void setSort(SortType sort) {
	    this.sort = sort;
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

	public boolean getShowHidden() {
	    return showHidden;
	}

	public void setShowHidden(boolean showHidden) {
	    this.showHidden = showHidden;
	}

	public PaginationCursor getPageCursor() {
	    return pageCursor;
	}

	public void setPageCursor(PaginationCursor pageCursor) {
	    this.pageCursor = pageCursor;
	}
}
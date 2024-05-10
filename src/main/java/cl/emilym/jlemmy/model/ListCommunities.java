// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ListCommunities {
	@SerializedName("type_")
	private ListingType type;
	private SortType sort;
	@SerializedName("show_nsfw")
	private boolean showNsfw;
	private long page;
	private long limit;

	public ListCommunities(ListingType type, SortType sort, boolean showNsfw, long page, long limit) {
		this.type = type;
		this.sort = sort;
		this.showNsfw = showNsfw;
		this.page = page;
		this.limit = limit;
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

	public boolean getShowNsfw() {
	    return showNsfw;
	}

	public void setShowNsfw(boolean showNsfw) {
	    this.showNsfw = showNsfw;
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
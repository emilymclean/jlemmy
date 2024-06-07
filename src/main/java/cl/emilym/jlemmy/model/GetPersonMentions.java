// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPersonMentions {
	private CommentSortType sort;
	private long page;
	private long limit;
	@SerializedName("unread_only")
	private boolean unreadOnly;

	public GetPersonMentions(CommentSortType sort, long page, long limit, boolean unreadOnly) {
		this.sort = sort;
		this.page = page;
		this.limit = limit;
		this.unreadOnly = unreadOnly;
	}

	public CommentSortType getSort() {
	    return sort;
	}

	public void setSort(CommentSortType sort) {
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

	public boolean getUnreadOnly() {
	    return unreadOnly;
	}

	public void setUnreadOnly(boolean unreadOnly) {
	    this.unreadOnly = unreadOnly;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListPrivateMessageReports {
	private long page;
	private long limit;
	@SerializedName("unresolved_only")
	private boolean unresolvedOnly;

	public ListPrivateMessageReports(long page, long limit, boolean unresolvedOnly) {
		this.page = page;
		this.limit = limit;
		this.unresolvedOnly = unresolvedOnly;
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
}
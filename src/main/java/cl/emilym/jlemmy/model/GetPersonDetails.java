// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPersonDetails {
	@SerializedName("person_id")
	private long personId;
	private String username;
	private SortType sort;
	private long page;
	private long limit;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("saved_only")
	private boolean savedOnly;

	public GetPersonDetails(long personId, String username, SortType sort, long page, long limit, long communityId, boolean savedOnly) {
		this.personId = personId;
		this.username = username;
		this.sort = sort;
		this.page = page;
		this.limit = limit;
		this.communityId = communityId;
		this.savedOnly = savedOnly;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public String getUsername() {
	    return username;
	}

	public void setUsername(String username) {
	    this.username = username;
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

	public boolean getSavedOnly() {
	    return savedOnly;
	}

	public void setSavedOnly(boolean savedOnly) {
	    this.savedOnly = savedOnly;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Search {
	private String q;
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("community_name")
	private String communityName;
	@SerializedName("creator_id")
	private long creatorId;
	@SerializedName("type_")
	private SearchType type;
	private SortType sort;
	@SerializedName("listing_type")
	private ListingType listingType;
	private long page;
	private long limit;

	public Search(String q, long communityId, String communityName, long creatorId, SearchType type, SortType sort, ListingType listingType, long page, long limit) {
		this.q = q;
		this.communityId = communityId;
		this.communityName = communityName;
		this.creatorId = creatorId;
		this.type = type;
		this.sort = sort;
		this.listingType = listingType;
		this.page = page;
		this.limit = limit;
	}

	public String getQ() {
	    return q;
	}

	public void setQ(String q) {
	    this.q = q;
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

	public long getCreatorId() {
	    return creatorId;
	}

	public void setCreatorId(long creatorId) {
	    this.creatorId = creatorId;
	}

	public SearchType getType() {
	    return type;
	}

	public void setType(SearchType type) {
	    this.type = type;
	}

	public SortType getSort() {
	    return sort;
	}

	public void setSort(SortType sort) {
	    this.sort = sort;
	}

	public ListingType getListingType() {
	    return listingType;
	}

	public void setListingType(ListingType listingType) {
	    this.listingType = listingType;
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
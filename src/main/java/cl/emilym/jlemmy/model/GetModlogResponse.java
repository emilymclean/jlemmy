// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetModlogResponse {
	@SerializedName("removed_posts")
	private ModRemovePostView[] removedPosts;
	@SerializedName("locked_posts")
	private ModLockPostView[] lockedPosts;
	@SerializedName("featured_posts")
	private ModFeaturePostView[] featuredPosts;
	@SerializedName("removed_comments")
	private ModRemoveCommentView[] removedComments;
	@SerializedName("removed_communities")
	private ModRemoveCommunityView[] removedCommunities;
	@SerializedName("banned_from_community")
	private ModBanFromCommunityView[] bannedFromCommunity;
	private ModBanView[] banned;
	@SerializedName("added_to_community")
	private ModAddCommunityView[] addedToCommunity;
	@SerializedName("transferred_to_community")
	private ModTransferCommunityView[] transferredToCommunity;
	private ModAddView[] added;
	@SerializedName("admin_purged_persons")
	private AdminPurgePersonView[] adminPurgedPersons;
	@SerializedName("admin_purged_communities")
	private AdminPurgeCommunityView[] adminPurgedCommunities;
	@SerializedName("admin_purged_posts")
	private AdminPurgePostView[] adminPurgedPosts;
	@SerializedName("admin_purged_comments")
	private AdminPurgeCommentView[] adminPurgedComments;
	@SerializedName("hidden_communities")
	private ModHideCommunityView[] hiddenCommunities;

	public GetModlogResponse(ModRemovePostView[] removedPosts, ModLockPostView[] lockedPosts, ModFeaturePostView[] featuredPosts, ModRemoveCommentView[] removedComments, ModRemoveCommunityView[] removedCommunities, ModBanFromCommunityView[] bannedFromCommunity, ModBanView[] banned, ModAddCommunityView[] addedToCommunity, ModTransferCommunityView[] transferredToCommunity, ModAddView[] added, AdminPurgePersonView[] adminPurgedPersons, AdminPurgeCommunityView[] adminPurgedCommunities, AdminPurgePostView[] adminPurgedPosts, AdminPurgeCommentView[] adminPurgedComments, ModHideCommunityView[] hiddenCommunities) {
		this.removedPosts = removedPosts;
		this.lockedPosts = lockedPosts;
		this.featuredPosts = featuredPosts;
		this.removedComments = removedComments;
		this.removedCommunities = removedCommunities;
		this.bannedFromCommunity = bannedFromCommunity;
		this.banned = banned;
		this.addedToCommunity = addedToCommunity;
		this.transferredToCommunity = transferredToCommunity;
		this.added = added;
		this.adminPurgedPersons = adminPurgedPersons;
		this.adminPurgedCommunities = adminPurgedCommunities;
		this.adminPurgedPosts = adminPurgedPosts;
		this.adminPurgedComments = adminPurgedComments;
		this.hiddenCommunities = hiddenCommunities;
	}

	public ModRemovePostView[] getRemovedPosts() {
	    return removedPosts;
	}

	public void setRemovedPosts(ModRemovePostView[] removedPosts) {
	    this.removedPosts = removedPosts;
	}

	public ModLockPostView[] getLockedPosts() {
	    return lockedPosts;
	}

	public void setLockedPosts(ModLockPostView[] lockedPosts) {
	    this.lockedPosts = lockedPosts;
	}

	public ModFeaturePostView[] getFeaturedPosts() {
	    return featuredPosts;
	}

	public void setFeaturedPosts(ModFeaturePostView[] featuredPosts) {
	    this.featuredPosts = featuredPosts;
	}

	public ModRemoveCommentView[] getRemovedComments() {
	    return removedComments;
	}

	public void setRemovedComments(ModRemoveCommentView[] removedComments) {
	    this.removedComments = removedComments;
	}

	public ModRemoveCommunityView[] getRemovedCommunities() {
	    return removedCommunities;
	}

	public void setRemovedCommunities(ModRemoveCommunityView[] removedCommunities) {
	    this.removedCommunities = removedCommunities;
	}

	public ModBanFromCommunityView[] getBannedFromCommunity() {
	    return bannedFromCommunity;
	}

	public void setBannedFromCommunity(ModBanFromCommunityView[] bannedFromCommunity) {
	    this.bannedFromCommunity = bannedFromCommunity;
	}

	public ModBanView[] getBanned() {
	    return banned;
	}

	public void setBanned(ModBanView[] banned) {
	    this.banned = banned;
	}

	public ModAddCommunityView[] getAddedToCommunity() {
	    return addedToCommunity;
	}

	public void setAddedToCommunity(ModAddCommunityView[] addedToCommunity) {
	    this.addedToCommunity = addedToCommunity;
	}

	public ModTransferCommunityView[] getTransferredToCommunity() {
	    return transferredToCommunity;
	}

	public void setTransferredToCommunity(ModTransferCommunityView[] transferredToCommunity) {
	    this.transferredToCommunity = transferredToCommunity;
	}

	public ModAddView[] getAdded() {
	    return added;
	}

	public void setAdded(ModAddView[] added) {
	    this.added = added;
	}

	public AdminPurgePersonView[] getAdminPurgedPersons() {
	    return adminPurgedPersons;
	}

	public void setAdminPurgedPersons(AdminPurgePersonView[] adminPurgedPersons) {
	    this.adminPurgedPersons = adminPurgedPersons;
	}

	public AdminPurgeCommunityView[] getAdminPurgedCommunities() {
	    return adminPurgedCommunities;
	}

	public void setAdminPurgedCommunities(AdminPurgeCommunityView[] adminPurgedCommunities) {
	    this.adminPurgedCommunities = adminPurgedCommunities;
	}

	public AdminPurgePostView[] getAdminPurgedPosts() {
	    return adminPurgedPosts;
	}

	public void setAdminPurgedPosts(AdminPurgePostView[] adminPurgedPosts) {
	    this.adminPurgedPosts = adminPurgedPosts;
	}

	public AdminPurgeCommentView[] getAdminPurgedComments() {
	    return adminPurgedComments;
	}

	public void setAdminPurgedComments(AdminPurgeCommentView[] adminPurgedComments) {
	    this.adminPurgedComments = adminPurgedComments;
	}

	public ModHideCommunityView[] getHiddenCommunities() {
	    return hiddenCommunities;
	}

	public void setHiddenCommunities(ModHideCommunityView[] hiddenCommunities) {
	    this.hiddenCommunities = hiddenCommunities;
	}
}
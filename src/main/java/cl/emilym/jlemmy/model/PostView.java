// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PostView {
	private Post post;
	private Person creator;
	private Community community;
	@SerializedName("creator_banned_from_community")
	private boolean creatorBannedFromCommunity;
	@SerializedName("banned_from_community")
	private boolean bannedFromCommunity;
	@SerializedName("creator_is_moderator")
	private boolean creatorIsModerator;
	@SerializedName("creator_is_admin")
	private boolean creatorIsAdmin;
	private PostAggregates counts;
	private SubscribedType subscribed;
	private boolean saved;
	private boolean read;
	private boolean hidden;
	@SerializedName("creator_blocked")
	private boolean creatorBlocked;
	@SerializedName("my_vote")
	private long myVote;
	@SerializedName("unread_comments")
	private long unreadComments;

	public PostView(Post post, Person creator, Community community, boolean creatorBannedFromCommunity, boolean bannedFromCommunity, boolean creatorIsModerator, boolean creatorIsAdmin, PostAggregates counts, SubscribedType subscribed, boolean saved, boolean read, boolean hidden, boolean creatorBlocked, long myVote, long unreadComments) {
		this.post = post;
		this.creator = creator;
		this.community = community;
		this.creatorBannedFromCommunity = creatorBannedFromCommunity;
		this.bannedFromCommunity = bannedFromCommunity;
		this.creatorIsModerator = creatorIsModerator;
		this.creatorIsAdmin = creatorIsAdmin;
		this.counts = counts;
		this.subscribed = subscribed;
		this.saved = saved;
		this.read = read;
		this.hidden = hidden;
		this.creatorBlocked = creatorBlocked;
		this.myVote = myVote;
		this.unreadComments = unreadComments;
	}

	public Post getPost() {
	    return post;
	}

	public void setPost(Post post) {
	    this.post = post;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}

	public boolean getCreatorBannedFromCommunity() {
	    return creatorBannedFromCommunity;
	}

	public void setCreatorBannedFromCommunity(boolean creatorBannedFromCommunity) {
	    this.creatorBannedFromCommunity = creatorBannedFromCommunity;
	}

	public boolean getBannedFromCommunity() {
	    return bannedFromCommunity;
	}

	public void setBannedFromCommunity(boolean bannedFromCommunity) {
	    this.bannedFromCommunity = bannedFromCommunity;
	}

	public boolean getCreatorIsModerator() {
	    return creatorIsModerator;
	}

	public void setCreatorIsModerator(boolean creatorIsModerator) {
	    this.creatorIsModerator = creatorIsModerator;
	}

	public boolean getCreatorIsAdmin() {
	    return creatorIsAdmin;
	}

	public void setCreatorIsAdmin(boolean creatorIsAdmin) {
	    this.creatorIsAdmin = creatorIsAdmin;
	}

	public PostAggregates getCounts() {
	    return counts;
	}

	public void setCounts(PostAggregates counts) {
	    this.counts = counts;
	}

	public SubscribedType getSubscribed() {
	    return subscribed;
	}

	public void setSubscribed(SubscribedType subscribed) {
	    this.subscribed = subscribed;
	}

	public boolean getSaved() {
	    return saved;
	}

	public void setSaved(boolean saved) {
	    this.saved = saved;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
	}

	public boolean getHidden() {
	    return hidden;
	}

	public void setHidden(boolean hidden) {
	    this.hidden = hidden;
	}

	public boolean getCreatorBlocked() {
	    return creatorBlocked;
	}

	public void setCreatorBlocked(boolean creatorBlocked) {
	    this.creatorBlocked = creatorBlocked;
	}

	public long getMyVote() {
	    return myVote;
	}

	public void setMyVote(long myVote) {
	    this.myVote = myVote;
	}

	public long getUnreadComments() {
	    return unreadComments;
	}

	public void setUnreadComments(long unreadComments) {
	    this.unreadComments = unreadComments;
	}
}
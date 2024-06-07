// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PostReportView {
	@SerializedName("post_report")
	private PostReport postReport;
	private Post post;
	private Community community;
	private Person creator;
	@SerializedName("post_creator")
	private Person postCreator;
	@SerializedName("creator_banned_from_community")
	private boolean creatorBannedFromCommunity;
	@SerializedName("creator_is_moderator")
	private boolean creatorIsModerator;
	@SerializedName("creator_is_admin")
	private boolean creatorIsAdmin;
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
	private PostAggregates counts;
	private Person resolver;

	public PostReportView(PostReport postReport, Post post, Community community, Person creator, Person postCreator, boolean creatorBannedFromCommunity, boolean creatorIsModerator, boolean creatorIsAdmin, SubscribedType subscribed, boolean saved, boolean read, boolean hidden, boolean creatorBlocked, long myVote, long unreadComments, PostAggregates counts, Person resolver) {
		this.postReport = postReport;
		this.post = post;
		this.community = community;
		this.creator = creator;
		this.postCreator = postCreator;
		this.creatorBannedFromCommunity = creatorBannedFromCommunity;
		this.creatorIsModerator = creatorIsModerator;
		this.creatorIsAdmin = creatorIsAdmin;
		this.subscribed = subscribed;
		this.saved = saved;
		this.read = read;
		this.hidden = hidden;
		this.creatorBlocked = creatorBlocked;
		this.myVote = myVote;
		this.unreadComments = unreadComments;
		this.counts = counts;
		this.resolver = resolver;
	}

	public PostReport getPostReport() {
	    return postReport;
	}

	public void setPostReport(PostReport postReport) {
	    this.postReport = postReport;
	}

	public Post getPost() {
	    return post;
	}

	public void setPost(Post post) {
	    this.post = post;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
	}

	public Person getPostCreator() {
	    return postCreator;
	}

	public void setPostCreator(Person postCreator) {
	    this.postCreator = postCreator;
	}

	public boolean getCreatorBannedFromCommunity() {
	    return creatorBannedFromCommunity;
	}

	public void setCreatorBannedFromCommunity(boolean creatorBannedFromCommunity) {
	    this.creatorBannedFromCommunity = creatorBannedFromCommunity;
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

	public PostAggregates getCounts() {
	    return counts;
	}

	public void setCounts(PostAggregates counts) {
	    this.counts = counts;
	}

	public Person getResolver() {
	    return resolver;
	}

	public void setResolver(Person resolver) {
	    this.resolver = resolver;
	}
}
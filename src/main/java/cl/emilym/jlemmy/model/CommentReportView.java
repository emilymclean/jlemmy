// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentReportView {
	@SerializedName("comment_report")
	private CommentReport commentReport;
	private Comment comment;
	private Post post;
	private Community community;
	private Person creator;
	@SerializedName("comment_creator")
	private Person commentCreator;
	private CommentAggregates counts;
	@SerializedName("creator_banned_from_community")
	private boolean creatorBannedFromCommunity;
	@SerializedName("creator_is_moderator")
	private boolean creatorIsModerator;
	@SerializedName("creator_is_admin")
	private boolean creatorIsAdmin;
	@SerializedName("creator_blocked")
	private boolean creatorBlocked;
	private SubscribedType subscribed;
	private boolean saved;
	@SerializedName("my_vote")
	private long myVote;
	private Person resolver;

	public CommentReportView(CommentReport commentReport, Comment comment, Post post, Community community, Person creator, Person commentCreator, CommentAggregates counts, boolean creatorBannedFromCommunity, boolean creatorIsModerator, boolean creatorIsAdmin, boolean creatorBlocked, SubscribedType subscribed, boolean saved, long myVote, Person resolver) {
		this.commentReport = commentReport;
		this.comment = comment;
		this.post = post;
		this.community = community;
		this.creator = creator;
		this.commentCreator = commentCreator;
		this.counts = counts;
		this.creatorBannedFromCommunity = creatorBannedFromCommunity;
		this.creatorIsModerator = creatorIsModerator;
		this.creatorIsAdmin = creatorIsAdmin;
		this.creatorBlocked = creatorBlocked;
		this.subscribed = subscribed;
		this.saved = saved;
		this.myVote = myVote;
		this.resolver = resolver;
	}

	public CommentReport getCommentReport() {
	    return commentReport;
	}

	public void setCommentReport(CommentReport commentReport) {
	    this.commentReport = commentReport;
	}

	public Comment getComment() {
	    return comment;
	}

	public void setComment(Comment comment) {
	    this.comment = comment;
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

	public Person getCommentCreator() {
	    return commentCreator;
	}

	public void setCommentCreator(Person commentCreator) {
	    this.commentCreator = commentCreator;
	}

	public CommentAggregates getCounts() {
	    return counts;
	}

	public void setCounts(CommentAggregates counts) {
	    this.counts = counts;
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

	public boolean getCreatorBlocked() {
	    return creatorBlocked;
	}

	public void setCreatorBlocked(boolean creatorBlocked) {
	    this.creatorBlocked = creatorBlocked;
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

	public long getMyVote() {
	    return myVote;
	}

	public void setMyVote(long myVote) {
	    this.myVote = myVote;
	}

	public Person getResolver() {
	    return resolver;
	}

	public void setResolver(Person resolver) {
	    this.resolver = resolver;
	}
}
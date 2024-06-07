// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PersonMentionView {
	@SerializedName("person_mention")
	private PersonMention personMention;
	private Comment comment;
	private Person creator;
	private Post post;
	private Community community;
	private Person recipient;
	private CommentAggregates counts;
	@SerializedName("creator_banned_from_community")
	private boolean creatorBannedFromCommunity;
	@SerializedName("banned_from_community")
	private boolean bannedFromCommunity;
	@SerializedName("creator_is_moderator")
	private boolean creatorIsModerator;
	@SerializedName("creator_is_admin")
	private boolean creatorIsAdmin;
	private SubscribedType subscribed;
	private boolean saved;
	@SerializedName("creator_blocked")
	private boolean creatorBlocked;
	@SerializedName("my_vote")
	private long myVote;

	public PersonMentionView(PersonMention personMention, Comment comment, Person creator, Post post, Community community, Person recipient, CommentAggregates counts, boolean creatorBannedFromCommunity, boolean bannedFromCommunity, boolean creatorIsModerator, boolean creatorIsAdmin, SubscribedType subscribed, boolean saved, boolean creatorBlocked, long myVote) {
		this.personMention = personMention;
		this.comment = comment;
		this.creator = creator;
		this.post = post;
		this.community = community;
		this.recipient = recipient;
		this.counts = counts;
		this.creatorBannedFromCommunity = creatorBannedFromCommunity;
		this.bannedFromCommunity = bannedFromCommunity;
		this.creatorIsModerator = creatorIsModerator;
		this.creatorIsAdmin = creatorIsAdmin;
		this.subscribed = subscribed;
		this.saved = saved;
		this.creatorBlocked = creatorBlocked;
		this.myVote = myVote;
	}

	public PersonMention getPersonMention() {
	    return personMention;
	}

	public void setPersonMention(PersonMention personMention) {
	    this.personMention = personMention;
	}

	public Comment getComment() {
	    return comment;
	}

	public void setComment(Comment comment) {
	    this.comment = comment;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
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

	public Person getRecipient() {
	    return recipient;
	}

	public void setRecipient(Person recipient) {
	    this.recipient = recipient;
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
}
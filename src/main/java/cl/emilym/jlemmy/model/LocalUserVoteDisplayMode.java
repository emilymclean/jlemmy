// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class LocalUserVoteDisplayMode {
	@SerializedName("local_user_id")
	private long localUserId;
	private boolean score;
	private boolean upvotes;
	private boolean downvotes;
	@SerializedName("upvote_percentage")
	private boolean upvotePercentage;

	public LocalUserVoteDisplayMode(long localUserId, boolean score, boolean upvotes, boolean downvotes, boolean upvotePercentage) {
		this.localUserId = localUserId;
		this.score = score;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
		this.upvotePercentage = upvotePercentage;
	}

	public long getLocalUserId() {
	    return localUserId;
	}

	public void setLocalUserId(long localUserId) {
	    this.localUserId = localUserId;
	}

	public boolean getScore() {
	    return score;
	}

	public void setScore(boolean score) {
	    this.score = score;
	}

	public boolean getUpvotes() {
	    return upvotes;
	}

	public void setUpvotes(boolean upvotes) {
	    this.upvotes = upvotes;
	}

	public boolean getDownvotes() {
	    return downvotes;
	}

	public void setDownvotes(boolean downvotes) {
	    this.downvotes = downvotes;
	}

	public boolean getUpvotePercentage() {
	    return upvotePercentage;
	}

	public void setUpvotePercentage(boolean upvotePercentage) {
	    this.upvotePercentage = upvotePercentage;
	}
}
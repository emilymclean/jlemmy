// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PostAggregates {
	@SerializedName("post_id")
	private long postId;
	private long comments;
	private long score;
	private long upvotes;
	private long downvotes;
	private String published;
	@SerializedName("newest_comment_time")
	private String newestCommentTime;

	public PostAggregates(long postId, long comments, long score, long upvotes, long downvotes, String published, String newestCommentTime) {
		this.postId = postId;
		this.comments = comments;
		this.score = score;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
		this.published = published;
		this.newestCommentTime = newestCommentTime;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public long getComments() {
	    return comments;
	}

	public void setComments(long comments) {
	    this.comments = comments;
	}

	public long getScore() {
	    return score;
	}

	public void setScore(long score) {
	    this.score = score;
	}

	public long getUpvotes() {
	    return upvotes;
	}

	public void setUpvotes(long upvotes) {
	    this.upvotes = upvotes;
	}

	public long getDownvotes() {
	    return downvotes;
	}

	public void setDownvotes(long downvotes) {
	    this.downvotes = downvotes;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public String getNewestCommentTime() {
	    return newestCommentTime;
	}

	public void setNewestCommentTime(String newestCommentTime) {
	    this.newestCommentTime = newestCommentTime;
	}
}
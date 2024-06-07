// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommentAggregates {
	@SerializedName("comment_id")
	private long commentId;
	private long score;
	private long upvotes;
	private long downvotes;
	private String published;
	@SerializedName("child_count")
	private long childCount;

	public CommentAggregates(long commentId, long score, long upvotes, long downvotes, String published, long childCount) {
		this.commentId = commentId;
		this.score = score;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
		this.published = published;
		this.childCount = childCount;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
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

	public long getChildCount() {
	    return childCount;
	}

	public void setChildCount(long childCount) {
	    this.childCount = childCount;
	}
}
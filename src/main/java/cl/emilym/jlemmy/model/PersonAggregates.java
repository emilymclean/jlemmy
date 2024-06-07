// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PersonAggregates {
	@SerializedName("person_id")
	private long personId;
	@SerializedName("post_count")
	private long postCount;
	@SerializedName("comment_count")
	private long commentCount;

	public PersonAggregates(long personId, long postCount, long commentCount) {
		this.personId = personId;
		this.postCount = postCount;
		this.commentCount = commentCount;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public long getPostCount() {
	    return postCount;
	}

	public void setPostCount(long postCount) {
	    this.postCount = postCount;
	}

	public long getCommentCount() {
	    return commentCount;
	}

	public void setCommentCount(long commentCount) {
	    this.commentCount = commentCount;
	}
}
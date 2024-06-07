// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommunityAggregates {
	@SerializedName("community_id")
	private long communityId;
	private long subscribers;
	private long posts;
	private long comments;
	private String published;
	@SerializedName("users_active_day")
	private long usersActiveDay;
	@SerializedName("users_active_week")
	private long usersActiveWeek;
	@SerializedName("users_active_month")
	private long usersActiveMonth;
	@SerializedName("users_active_half_year")
	private long usersActiveHalfYear;
	@SerializedName("subscribers_local")
	private long subscribersLocal;

	public CommunityAggregates(long communityId, long subscribers, long posts, long comments, String published, long usersActiveDay, long usersActiveWeek, long usersActiveMonth, long usersActiveHalfYear, long subscribersLocal) {
		this.communityId = communityId;
		this.subscribers = subscribers;
		this.posts = posts;
		this.comments = comments;
		this.published = published;
		this.usersActiveDay = usersActiveDay;
		this.usersActiveWeek = usersActiveWeek;
		this.usersActiveMonth = usersActiveMonth;
		this.usersActiveHalfYear = usersActiveHalfYear;
		this.subscribersLocal = subscribersLocal;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public long getSubscribers() {
	    return subscribers;
	}

	public void setSubscribers(long subscribers) {
	    this.subscribers = subscribers;
	}

	public long getPosts() {
	    return posts;
	}

	public void setPosts(long posts) {
	    this.posts = posts;
	}

	public long getComments() {
	    return comments;
	}

	public void setComments(long comments) {
	    this.comments = comments;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public long getUsersActiveDay() {
	    return usersActiveDay;
	}

	public void setUsersActiveDay(long usersActiveDay) {
	    this.usersActiveDay = usersActiveDay;
	}

	public long getUsersActiveWeek() {
	    return usersActiveWeek;
	}

	public void setUsersActiveWeek(long usersActiveWeek) {
	    this.usersActiveWeek = usersActiveWeek;
	}

	public long getUsersActiveMonth() {
	    return usersActiveMonth;
	}

	public void setUsersActiveMonth(long usersActiveMonth) {
	    this.usersActiveMonth = usersActiveMonth;
	}

	public long getUsersActiveHalfYear() {
	    return usersActiveHalfYear;
	}

	public void setUsersActiveHalfYear(long usersActiveHalfYear) {
	    this.usersActiveHalfYear = usersActiveHalfYear;
	}

	public long getSubscribersLocal() {
	    return subscribersLocal;
	}

	public void setSubscribersLocal(long subscribersLocal) {
	    this.subscribersLocal = subscribersLocal;
	}
}
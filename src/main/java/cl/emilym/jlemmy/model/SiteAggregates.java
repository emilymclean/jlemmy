// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class SiteAggregates {
	@SerializedName("site_id")
	private long siteId;
	private long users;
	private long posts;
	private long comments;
	private long communities;
	@SerializedName("users_active_day")
	private long usersActiveDay;
	@SerializedName("users_active_week")
	private long usersActiveWeek;
	@SerializedName("users_active_month")
	private long usersActiveMonth;
	@SerializedName("users_active_half_year")
	private long usersActiveHalfYear;

	public SiteAggregates(long siteId, long users, long posts, long comments, long communities, long usersActiveDay, long usersActiveWeek, long usersActiveMonth, long usersActiveHalfYear) {
		this.siteId = siteId;
		this.users = users;
		this.posts = posts;
		this.comments = comments;
		this.communities = communities;
		this.usersActiveDay = usersActiveDay;
		this.usersActiveWeek = usersActiveWeek;
		this.usersActiveMonth = usersActiveMonth;
		this.usersActiveHalfYear = usersActiveHalfYear;
	}

	public long getSiteId() {
	    return siteId;
	}

	public void setSiteId(long siteId) {
	    this.siteId = siteId;
	}

	public long getUsers() {
	    return users;
	}

	public void setUsers(long users) {
	    this.users = users;
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

	public long getCommunities() {
	    return communities;
	}

	public void setCommunities(long communities) {
	    this.communities = communities;
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
}
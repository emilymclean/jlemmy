// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class LoginToken {
	@SerializedName("user_id")
	private long userId;
	private String published;
	private String ip;
	@SerializedName("user_agent")
	private String userAgent;

	public LoginToken(long userId, String published, String ip, String userAgent) {
		this.userId = userId;
		this.published = published;
		this.ip = ip;
		this.userAgent = userAgent;
	}

	public long getUserId() {
	    return userId;
	}

	public void setUserId(long userId) {
	    this.userId = userId;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public String getIp() {
	    return ip;
	}

	public void setIp(String ip) {
	    this.ip = ip;
	}

	public String getUserAgent() {
	    return userAgent;
	}

	public void setUserAgent(String userAgent) {
	    this.userAgent = userAgent;
	}
}
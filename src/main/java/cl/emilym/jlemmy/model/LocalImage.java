// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class LocalImage {
	@SerializedName("local_user_id")
	private long localUserId;
	@SerializedName("pictrs_alias")
	private String pictrsAlias;
	@SerializedName("pictrs_delete_token")
	private String pictrsDeleteToken;
	private String published;

	public LocalImage(long localUserId, String pictrsAlias, String pictrsDeleteToken, String published) {
		this.localUserId = localUserId;
		this.pictrsAlias = pictrsAlias;
		this.pictrsDeleteToken = pictrsDeleteToken;
		this.published = published;
	}

	public long getLocalUserId() {
	    return localUserId;
	}

	public void setLocalUserId(long localUserId) {
	    this.localUserId = localUserId;
	}

	public String getPictrsAlias() {
	    return pictrsAlias;
	}

	public void setPictrsAlias(String pictrsAlias) {
	    this.pictrsAlias = pictrsAlias;
	}

	public String getPictrsDeleteToken() {
	    return pictrsDeleteToken;
	}

	public void setPictrsDeleteToken(String pictrsDeleteToken) {
	    this.pictrsDeleteToken = pictrsDeleteToken;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}
}
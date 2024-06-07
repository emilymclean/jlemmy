// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Site {
	private long id;
	private String name;
	private String sidebar;
	private String published;
	private String updated;
	private String icon;
	private String banner;
	private String description;
	@SerializedName("actor_id")
	private String actorId;
	@SerializedName("last_refreshed_at")
	private String lastRefreshedAt;
	@SerializedName("inbox_url")
	private String inboxUrl;
	@SerializedName("public_key")
	private String publicKey;
	@SerializedName("instance_id")
	private long instanceId;
	@SerializedName("content_warning")
	private String contentWarning;

	public Site(long id, String name, String sidebar, String published, String updated, String icon, String banner, String description, String actorId, String lastRefreshedAt, String inboxUrl, String publicKey, long instanceId, String contentWarning) {
		this.id = id;
		this.name = name;
		this.sidebar = sidebar;
		this.published = published;
		this.updated = updated;
		this.icon = icon;
		this.banner = banner;
		this.description = description;
		this.actorId = actorId;
		this.lastRefreshedAt = lastRefreshedAt;
		this.inboxUrl = inboxUrl;
		this.publicKey = publicKey;
		this.instanceId = instanceId;
		this.contentWarning = contentWarning;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getSidebar() {
	    return sidebar;
	}

	public void setSidebar(String sidebar) {
	    this.sidebar = sidebar;
	}

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public String getUpdated() {
	    return updated;
	}

	public void setUpdated(String updated) {
	    this.updated = updated;
	}

	public String getIcon() {
	    return icon;
	}

	public void setIcon(String icon) {
	    this.icon = icon;
	}

	public String getBanner() {
	    return banner;
	}

	public void setBanner(String banner) {
	    this.banner = banner;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public String getActorId() {
	    return actorId;
	}

	public void setActorId(String actorId) {
	    this.actorId = actorId;
	}

	public String getLastRefreshedAt() {
	    return lastRefreshedAt;
	}

	public void setLastRefreshedAt(String lastRefreshedAt) {
	    this.lastRefreshedAt = lastRefreshedAt;
	}

	public String getInboxUrl() {
	    return inboxUrl;
	}

	public void setInboxUrl(String inboxUrl) {
	    this.inboxUrl = inboxUrl;
	}

	public String getPublicKey() {
	    return publicKey;
	}

	public void setPublicKey(String publicKey) {
	    this.publicKey = publicKey;
	}

	public long getInstanceId() {
	    return instanceId;
	}

	public void setInstanceId(long instanceId) {
	    this.instanceId = instanceId;
	}

	public String getContentWarning() {
	    return contentWarning;
	}

	public void setContentWarning(String contentWarning) {
	    this.contentWarning = contentWarning;
	}
}
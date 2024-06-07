// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Tagline {
	private long id;
	@SerializedName("local_site_id")
	private long localSiteId;
	private String content;
	private String published;
	private String updated;

	public Tagline(long id, long localSiteId, String content, String published, String updated) {
		this.id = id;
		this.localSiteId = localSiteId;
		this.content = content;
		this.published = published;
		this.updated = updated;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getLocalSiteId() {
	    return localSiteId;
	}

	public void setLocalSiteId(long localSiteId) {
	    this.localSiteId = localSiteId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
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
}
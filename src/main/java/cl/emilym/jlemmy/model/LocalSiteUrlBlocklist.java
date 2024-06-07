// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LocalSiteUrlBlocklist {
	private long id;
	private String url;
	private String published;
	private String updated;

	public LocalSiteUrlBlocklist(long id, String url, String published, String updated) {
		this.id = id;
		this.url = url;
		this.published = published;
		this.updated = updated;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public String getUrl() {
	    return url;
	}

	public void setUrl(String url) {
	    this.url = url;
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
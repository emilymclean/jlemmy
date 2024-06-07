// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Instance {
	private long id;
	private String domain;
	private String published;
	private String updated;
	private String software;
	private String version;

	public Instance(long id, String domain, String published, String updated, String software, String version) {
		this.id = id;
		this.domain = domain;
		this.published = published;
		this.updated = updated;
		this.software = software;
		this.version = version;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public String getDomain() {
	    return domain;
	}

	public void setDomain(String domain) {
	    this.domain = domain;
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

	public String getSoftware() {
	    return software;
	}

	public void setSoftware(String software) {
	    this.software = software;
	}

	public String getVersion() {
	    return version;
	}

	public void setVersion(String version) {
	    this.version = version;
	}
}
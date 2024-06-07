// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class SiteResponse {
	@SerializedName("site_view")
	private SiteView siteView;
	private Tagline[] taglines;

	public SiteResponse(SiteView siteView, Tagline[] taglines) {
		this.siteView = siteView;
		this.taglines = taglines;
	}

	public SiteView getSiteView() {
	    return siteView;
	}

	public void setSiteView(SiteView siteView) {
	    this.siteView = siteView;
	}

	public Tagline[] getTaglines() {
	    return taglines;
	}

	public void setTaglines(Tagline[] taglines) {
	    this.taglines = taglines;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class SiteView {
	private Site site;
	@SerializedName("local_site")
	private LocalSite localSite;
	@SerializedName("local_site_rate_limit")
	private LocalSiteRateLimit localSiteRateLimit;
	private SiteAggregates counts;

	public SiteView(Site site, LocalSite localSite, LocalSiteRateLimit localSiteRateLimit, SiteAggregates counts) {
		this.site = site;
		this.localSite = localSite;
		this.localSiteRateLimit = localSiteRateLimit;
		this.counts = counts;
	}

	public Site getSite() {
	    return site;
	}

	public void setSite(Site site) {
	    this.site = site;
	}

	public LocalSite getLocalSite() {
	    return localSite;
	}

	public void setLocalSite(LocalSite localSite) {
	    this.localSite = localSite;
	}

	public LocalSiteRateLimit getLocalSiteRateLimit() {
	    return localSiteRateLimit;
	}

	public void setLocalSiteRateLimit(LocalSiteRateLimit localSiteRateLimit) {
	    this.localSiteRateLimit = localSiteRateLimit;
	}

	public SiteAggregates getCounts() {
	    return counts;
	}

	public void setCounts(SiteAggregates counts) {
	    this.counts = counts;
	}
}
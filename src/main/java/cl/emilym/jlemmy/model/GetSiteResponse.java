// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetSiteResponse {
	@SerializedName("site_view")
	private SiteView siteView;
	private PersonView[] admins;
	private String version;
	@SerializedName("my_user")
	private MyUserInfo myUser;
	@SerializedName("all_languages")
	private Language[] allLanguages;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;
	private Tagline[] taglines;
	@SerializedName("custom_emojis")
	private CustomEmojiView[] customEmojis;
	@SerializedName("blocked_urls")
	private LocalSiteUrlBlocklist[] blockedUrls;

	public GetSiteResponse(SiteView siteView, PersonView[] admins, String version, MyUserInfo myUser, Language[] allLanguages, long[] discussionLanguages, Tagline[] taglines, CustomEmojiView[] customEmojis, LocalSiteUrlBlocklist[] blockedUrls) {
		this.siteView = siteView;
		this.admins = admins;
		this.version = version;
		this.myUser = myUser;
		this.allLanguages = allLanguages;
		this.discussionLanguages = discussionLanguages;
		this.taglines = taglines;
		this.customEmojis = customEmojis;
		this.blockedUrls = blockedUrls;
	}

	public SiteView getSiteView() {
	    return siteView;
	}

	public void setSiteView(SiteView siteView) {
	    this.siteView = siteView;
	}

	public PersonView[] getAdmins() {
	    return admins;
	}

	public void setAdmins(PersonView[] admins) {
	    this.admins = admins;
	}

	public String getVersion() {
	    return version;
	}

	public void setVersion(String version) {
	    this.version = version;
	}

	public MyUserInfo getMyUser() {
	    return myUser;
	}

	public void setMyUser(MyUserInfo myUser) {
	    this.myUser = myUser;
	}

	public Language[] getAllLanguages() {
	    return allLanguages;
	}

	public void setAllLanguages(Language[] allLanguages) {
	    this.allLanguages = allLanguages;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}

	public Tagline[] getTaglines() {
	    return taglines;
	}

	public void setTaglines(Tagline[] taglines) {
	    this.taglines = taglines;
	}

	public CustomEmojiView[] getCustomEmojis() {
	    return customEmojis;
	}

	public void setCustomEmojis(CustomEmojiView[] customEmojis) {
	    this.customEmojis = customEmojis;
	}

	public LocalSiteUrlBlocklist[] getBlockedUrls() {
	    return blockedUrls;
	}

	public void setBlockedUrls(LocalSiteUrlBlocklist[] blockedUrls) {
	    this.blockedUrls = blockedUrls;
	}
}
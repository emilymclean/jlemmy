// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CreateCommunity {
	private String name;
	private String title;
	private String description;
	private String icon;
	private String banner;
	private boolean nsfw;
	@SerializedName("posting_restricted_to_mods")
	private boolean postingRestrictedToMods;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;
	private CommunityVisibility visibility;

	public CreateCommunity(String name, String title, String description, String icon, String banner, boolean nsfw, boolean postingRestrictedToMods, long[] discussionLanguages, CommunityVisibility visibility) {
		this.name = name;
		this.title = title;
		this.description = description;
		this.icon = icon;
		this.banner = banner;
		this.nsfw = nsfw;
		this.postingRestrictedToMods = postingRestrictedToMods;
		this.discussionLanguages = discussionLanguages;
		this.visibility = visibility;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getTitle() {
	    return title;
	}

	public void setTitle(String title) {
	    this.title = title;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
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

	public boolean getNsfw() {
	    return nsfw;
	}

	public void setNsfw(boolean nsfw) {
	    this.nsfw = nsfw;
	}

	public boolean getPostingRestrictedToMods() {
	    return postingRestrictedToMods;
	}

	public void setPostingRestrictedToMods(boolean postingRestrictedToMods) {
	    this.postingRestrictedToMods = postingRestrictedToMods;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}

	public CommunityVisibility getVisibility() {
	    return visibility;
	}

	public void setVisibility(CommunityVisibility visibility) {
	    this.visibility = visibility;
	}
}
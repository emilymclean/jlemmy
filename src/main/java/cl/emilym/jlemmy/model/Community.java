// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class Community {
	private long id;
	private String name;
	private String title;
	private String description;
	private boolean removed;
	private String published;
	private String updated;
	private boolean deleted;
	private boolean nsfw;
	@SerializedName("actor_id")
	private String actorId;
	private boolean local;
	private String icon;
	private String banner;
	private boolean hidden;
	@SerializedName("posting_restricted_to_mods")
	private boolean postingRestrictedToMods;
	@SerializedName("instance_id")
	private long instanceId;
	private CommunityVisibility visibility;

	public Community(long id, String name, String title, String description, boolean removed, String published, String updated, boolean deleted, boolean nsfw, String actorId, boolean local, String icon, String banner, boolean hidden, boolean postingRestrictedToMods, long instanceId, CommunityVisibility visibility) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.description = description;
		this.removed = removed;
		this.published = published;
		this.updated = updated;
		this.deleted = deleted;
		this.nsfw = nsfw;
		this.actorId = actorId;
		this.local = local;
		this.icon = icon;
		this.banner = banner;
		this.hidden = hidden;
		this.postingRestrictedToMods = postingRestrictedToMods;
		this.instanceId = instanceId;
		this.visibility = visibility;
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

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
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

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}

	public boolean getNsfw() {
	    return nsfw;
	}

	public void setNsfw(boolean nsfw) {
	    this.nsfw = nsfw;
	}

	public String getActorId() {
	    return actorId;
	}

	public void setActorId(String actorId) {
	    this.actorId = actorId;
	}

	public boolean getLocal() {
	    return local;
	}

	public void setLocal(boolean local) {
	    this.local = local;
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

	public boolean getHidden() {
	    return hidden;
	}

	public void setHidden(boolean hidden) {
	    this.hidden = hidden;
	}

	public boolean getPostingRestrictedToMods() {
	    return postingRestrictedToMods;
	}

	public void setPostingRestrictedToMods(boolean postingRestrictedToMods) {
	    this.postingRestrictedToMods = postingRestrictedToMods;
	}

	public long getInstanceId() {
	    return instanceId;
	}

	public void setInstanceId(long instanceId) {
	    this.instanceId = instanceId;
	}

	public CommunityVisibility getVisibility() {
	    return visibility;
	}

	public void setVisibility(CommunityVisibility visibility) {
	    this.visibility = visibility;
	}
}
// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class Person {
	private long id;
	private String name;
	@SerializedName("display_name")
	private String displayName;
	private String avatar;
	private boolean banned;
	private String published;
	private String updated;
	@SerializedName("actor_id")
	private String actorId;
	private String bio;
	private boolean local;
	private String banner;
	private boolean deleted;
	@SerializedName("matrix_user_id")
	private String matrixUserId;
	@SerializedName("bot_account")
	private boolean botAccount;
	@SerializedName("ban_expires")
	private String banExpires;
	@SerializedName("instance_id")
	private long instanceId;

	public Person(long id, String name, String displayName, String avatar, boolean banned, String published, String updated, String actorId, String bio, boolean local, String banner, boolean deleted, String matrixUserId, boolean botAccount, String banExpires, long instanceId) {
		this.id = id;
		this.name = name;
		this.displayName = displayName;
		this.avatar = avatar;
		this.banned = banned;
		this.published = published;
		this.updated = updated;
		this.actorId = actorId;
		this.bio = bio;
		this.local = local;
		this.banner = banner;
		this.deleted = deleted;
		this.matrixUserId = matrixUserId;
		this.botAccount = botAccount;
		this.banExpires = banExpires;
		this.instanceId = instanceId;
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

	public String getDisplayName() {
	    return displayName;
	}

	public void setDisplayName(String displayName) {
	    this.displayName = displayName;
	}

	public String getAvatar() {
	    return avatar;
	}

	public void setAvatar(String avatar) {
	    this.avatar = avatar;
	}

	public boolean getBanned() {
	    return banned;
	}

	public void setBanned(boolean banned) {
	    this.banned = banned;
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

	public String getActorId() {
	    return actorId;
	}

	public void setActorId(String actorId) {
	    this.actorId = actorId;
	}

	public String getBio() {
	    return bio;
	}

	public void setBio(String bio) {
	    this.bio = bio;
	}

	public boolean getLocal() {
	    return local;
	}

	public void setLocal(boolean local) {
	    this.local = local;
	}

	public String getBanner() {
	    return banner;
	}

	public void setBanner(String banner) {
	    this.banner = banner;
	}

	public boolean getDeleted() {
	    return deleted;
	}

	public void setDeleted(boolean deleted) {
	    this.deleted = deleted;
	}

	public String getMatrixUserId() {
	    return matrixUserId;
	}

	public void setMatrixUserId(String matrixUserId) {
	    this.matrixUserId = matrixUserId;
	}

	public boolean getBotAccount() {
	    return botAccount;
	}

	public void setBotAccount(boolean botAccount) {
	    this.botAccount = botAccount;
	}

	public String getBanExpires() {
	    return banExpires;
	}

	public void setBanExpires(String banExpires) {
	    this.banExpires = banExpires;
	}

	public long getInstanceId() {
	    return instanceId;
	}

	public void setInstanceId(long instanceId) {
	    this.instanceId = instanceId;
	}
}
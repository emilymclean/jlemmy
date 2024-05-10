// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModFeaturePost {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("post_id")
	private long postId;
	private boolean featured;
	@SerializedName("when_")
	private String when;
	@SerializedName("is_featured_community")
	private boolean isFeaturedCommunity;

	public ModFeaturePost(long id, long modPersonId, long postId, boolean featured, String when, boolean isFeaturedCommunity) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.postId = postId;
		this.featured = featured;
		this.when = when;
		this.isFeaturedCommunity = isFeaturedCommunity;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getModPersonId() {
	    return modPersonId;
	}

	public void setModPersonId(long modPersonId) {
	    this.modPersonId = modPersonId;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public boolean getFeatured() {
	    return featured;
	}

	public void setFeatured(boolean featured) {
	    this.featured = featured;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}

	public boolean getIsFeaturedCommunity() {
	    return isFeaturedCommunity;
	}

	public void setIsFeaturedCommunity(boolean isFeaturedCommunity) {
	    this.isFeaturedCommunity = isFeaturedCommunity;
	}
}
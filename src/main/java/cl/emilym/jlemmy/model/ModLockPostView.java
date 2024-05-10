// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModLockPostView {
	@SerializedName("mod_lock_post")
	private ModLockPost modLockPost;
	private Person moderator;
	private Post post;
	private Community community;

	public ModLockPostView(ModLockPost modLockPost, Person moderator, Post post, Community community) {
		this.modLockPost = modLockPost;
		this.moderator = moderator;
		this.post = post;
		this.community = community;
	}

	public ModLockPost getModLockPost() {
	    return modLockPost;
	}

	public void setModLockPost(ModLockPost modLockPost) {
	    this.modLockPost = modLockPost;
	}

	public Person getModerator() {
	    return moderator;
	}

	public void setModerator(Person moderator) {
	    this.moderator = moderator;
	}

	public Post getPost() {
	    return post;
	}

	public void setPost(Post post) {
	    this.post = post;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}
}
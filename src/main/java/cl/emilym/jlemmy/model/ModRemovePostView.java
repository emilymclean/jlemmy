// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModRemovePostView {
	@SerializedName("mod_remove_post")
	private ModRemovePost modRemovePost;
	private Person moderator;
	private Post post;
	private Community community;

	public ModRemovePostView(ModRemovePost modRemovePost, Person moderator, Post post, Community community) {
		this.modRemovePost = modRemovePost;
		this.moderator = moderator;
		this.post = post;
		this.community = community;
	}

	public ModRemovePost getModRemovePost() {
	    return modRemovePost;
	}

	public void setModRemovePost(ModRemovePost modRemovePost) {
	    this.modRemovePost = modRemovePost;
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
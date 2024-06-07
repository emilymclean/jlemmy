// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModFeaturePostView {
	@SerializedName("mod_feature_post")
	private ModFeaturePost modFeaturePost;
	private Person moderator;
	private Post post;
	private Community community;

	public ModFeaturePostView(ModFeaturePost modFeaturePost, Person moderator, Post post, Community community) {
		this.modFeaturePost = modFeaturePost;
		this.moderator = moderator;
		this.post = post;
		this.community = community;
	}

	public ModFeaturePost getModFeaturePost() {
	    return modFeaturePost;
	}

	public void setModFeaturePost(ModFeaturePost modFeaturePost) {
	    this.modFeaturePost = modFeaturePost;
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
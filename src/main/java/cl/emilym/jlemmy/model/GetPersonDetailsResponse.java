// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPersonDetailsResponse {
	@SerializedName("person_view")
	private PersonView personView;
	private Site site;
	private CommentView[] comments;
	private PostView[] posts;
	private CommunityModeratorView[] moderates;

	public GetPersonDetailsResponse(PersonView personView, Site site, CommentView[] comments, PostView[] posts, CommunityModeratorView[] moderates) {
		this.personView = personView;
		this.site = site;
		this.comments = comments;
		this.posts = posts;
		this.moderates = moderates;
	}

	public PersonView getPersonView() {
	    return personView;
	}

	public void setPersonView(PersonView personView) {
	    this.personView = personView;
	}

	public Site getSite() {
	    return site;
	}

	public void setSite(Site site) {
	    this.site = site;
	}

	public CommentView[] getComments() {
	    return comments;
	}

	public void setComments(CommentView[] comments) {
	    this.comments = comments;
	}

	public PostView[] getPosts() {
	    return posts;
	}

	public void setPosts(PostView[] posts) {
	    this.posts = posts;
	}

	public CommunityModeratorView[] getModerates() {
	    return moderates;
	}

	public void setModerates(CommunityModeratorView[] moderates) {
	    this.moderates = moderates;
	}
}
// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class SearchResponse {
	@SerializedName("type_")
	private SearchType type;
	private CommentView[] comments;
	private PostView[] posts;
	private CommunityView[] communities;
	private PersonView[] users;

	public SearchResponse(SearchType type, CommentView[] comments, PostView[] posts, CommunityView[] communities, PersonView[] users) {
		this.type = type;
		this.comments = comments;
		this.posts = posts;
		this.communities = communities;
		this.users = users;
	}

	public SearchType getType() {
	    return type;
	}

	public void setType(SearchType type) {
	    this.type = type;
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

	public CommunityView[] getCommunities() {
	    return communities;
	}

	public void setCommunities(CommunityView[] communities) {
	    this.communities = communities;
	}

	public PersonView[] getUsers() {
	    return users;
	}

	public void setUsers(PersonView[] users) {
	    this.users = users;
	}
}
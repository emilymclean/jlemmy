// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ResolveObjectResponse {
	private CommentView comment;
	private PostView post;
	private CommunityView community;
	private PersonView person;

	public ResolveObjectResponse(CommentView comment, PostView post, CommunityView community, PersonView person) {
		this.comment = comment;
		this.post = post;
		this.community = community;
		this.person = person;
	}

	public CommentView getComment() {
	    return comment;
	}

	public void setComment(CommentView comment) {
	    this.comment = comment;
	}

	public PostView getPost() {
	    return post;
	}

	public void setPost(PostView post) {
	    this.post = post;
	}

	public CommunityView getCommunity() {
	    return community;
	}

	public void setCommunity(CommunityView community) {
	    this.community = community;
	}

	public PersonView getPerson() {
	    return person;
	}

	public void setPerson(PersonView person) {
	    this.person = person;
	}
}
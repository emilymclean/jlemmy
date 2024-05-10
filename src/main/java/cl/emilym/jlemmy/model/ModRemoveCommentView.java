// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModRemoveCommentView {
	@SerializedName("mod_remove_comment")
	private ModRemoveComment modRemoveComment;
	private Person moderator;
	private Comment comment;
	private Person commenter;
	private Post post;
	private Community community;

	public ModRemoveCommentView(ModRemoveComment modRemoveComment, Person moderator, Comment comment, Person commenter, Post post, Community community) {
		this.modRemoveComment = modRemoveComment;
		this.moderator = moderator;
		this.comment = comment;
		this.commenter = commenter;
		this.post = post;
		this.community = community;
	}

	public ModRemoveComment getModRemoveComment() {
	    return modRemoveComment;
	}

	public void setModRemoveComment(ModRemoveComment modRemoveComment) {
	    this.modRemoveComment = modRemoveComment;
	}

	public Person getModerator() {
	    return moderator;
	}

	public void setModerator(Person moderator) {
	    this.moderator = moderator;
	}

	public Comment getComment() {
	    return comment;
	}

	public void setComment(Comment comment) {
	    this.comment = comment;
	}

	public Person getCommenter() {
	    return commenter;
	}

	public void setCommenter(Person commenter) {
	    this.commenter = commenter;
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
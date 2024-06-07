// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class AdminPurgeCommentView {
	@SerializedName("admin_purge_comment")
	private AdminPurgeComment adminPurgeComment;
	private Person admin;
	private Post post;

	public AdminPurgeCommentView(AdminPurgeComment adminPurgeComment, Person admin, Post post) {
		this.adminPurgeComment = adminPurgeComment;
		this.admin = admin;
		this.post = post;
	}

	public AdminPurgeComment getAdminPurgeComment() {
	    return adminPurgeComment;
	}

	public void setAdminPurgeComment(AdminPurgeComment adminPurgeComment) {
	    this.adminPurgeComment = adminPurgeComment;
	}

	public Person getAdmin() {
	    return admin;
	}

	public void setAdmin(Person admin) {
	    this.admin = admin;
	}

	public Post getPost() {
	    return post;
	}

	public void setPost(Post post) {
	    this.post = post;
	}
}
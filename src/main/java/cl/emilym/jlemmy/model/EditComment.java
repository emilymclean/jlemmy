// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class EditComment {
	@SerializedName("comment_id")
	private long commentId;
	private String content;
	@SerializedName("language_id")
	private long languageId;

	public EditComment(long commentId, String content, long languageId) {
		this.commentId = commentId;
		this.content = content;
		this.languageId = languageId;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public long getLanguageId() {
	    return languageId;
	}

	public void setLanguageId(long languageId) {
	    this.languageId = languageId;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CreateComment {
	private String content;
	@SerializedName("post_id")
	private long postId;
	@SerializedName("parent_id")
	private long parentId;
	@SerializedName("language_id")
	private long languageId;

	public CreateComment(String content, long postId, long parentId, long languageId) {
		this.content = content;
		this.postId = postId;
		this.parentId = parentId;
		this.languageId = languageId;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public long getParentId() {
	    return parentId;
	}

	public void setParentId(long parentId) {
	    this.parentId = parentId;
	}

	public long getLanguageId() {
	    return languageId;
	}

	public void setLanguageId(long languageId) {
	    this.languageId = languageId;
	}
}
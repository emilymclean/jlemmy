// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ModRemoveComment {
	private long id;
	@SerializedName("mod_person_id")
	private long modPersonId;
	@SerializedName("comment_id")
	private long commentId;
	private String reason;
	private boolean removed;
	@SerializedName("when_")
	private String when;

	public ModRemoveComment(long id, long modPersonId, long commentId, String reason, boolean removed, String when) {
		this.id = id;
		this.modPersonId = modPersonId;
		this.commentId = commentId;
		this.reason = reason;
		this.removed = removed;
		this.when = when;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getModPersonId() {
	    return modPersonId;
	}

	public void setModPersonId(long modPersonId) {
	    this.modPersonId = modPersonId;
	}

	public long getCommentId() {
	    return commentId;
	}

	public void setCommentId(long commentId) {
	    this.commentId = commentId;
	}

	public String getReason() {
	    return reason;
	}

	public void setReason(String reason) {
	    this.reason = reason;
	}

	public boolean getRemoved() {
	    return removed;
	}

	public void setRemoved(boolean removed) {
	    this.removed = removed;
	}

	public String getWhen() {
	    return when;
	}

	public void setWhen(String when) {
	    this.when = when;
	}
}
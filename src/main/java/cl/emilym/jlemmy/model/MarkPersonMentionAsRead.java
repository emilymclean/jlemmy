// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class MarkPersonMentionAsRead {
	@SerializedName("person_mention_id")
	private long personMentionId;
	private boolean read;

	public MarkPersonMentionAsRead(long personMentionId, boolean read) {
		this.personMentionId = personMentionId;
		this.read = read;
	}

	public long getPersonMentionId() {
	    return personMentionId;
	}

	public void setPersonMentionId(long personMentionId) {
	    this.personMentionId = personMentionId;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
	}
}
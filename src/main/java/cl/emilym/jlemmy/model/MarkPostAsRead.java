// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class MarkPostAsRead {
	@SerializedName("post_ids")
	private long[] postIds;
	private boolean read;

	public MarkPostAsRead(long[] postIds, boolean read) {
		this.postIds = postIds;
		this.read = read;
	}

	public long[] getPostIds() {
	    return postIds;
	}

	public void setPostIds(long[] postIds) {
	    this.postIds = postIds;
	}

	public boolean getRead() {
	    return read;
	}

	public void setRead(boolean read) {
	    this.read = read;
	}
}
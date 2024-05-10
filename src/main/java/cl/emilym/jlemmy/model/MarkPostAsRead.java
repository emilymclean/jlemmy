// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
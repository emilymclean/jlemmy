// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class HidePost {
	@SerializedName("post_ids")
	private long[] postIds;
	private boolean hide;

	public HidePost(long[] postIds, boolean hide) {
		this.postIds = postIds;
		this.hide = hide;
	}

	public long[] getPostIds() {
	    return postIds;
	}

	public void setPostIds(long[] postIds) {
	    this.postIds = postIds;
	}

	public boolean getHide() {
	    return hide;
	}

	public void setHide(boolean hide) {
	    this.hide = hide;
	}
}
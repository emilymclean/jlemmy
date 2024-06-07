// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class VoteView {
	private Person creator;
	@SerializedName("creator_banned_from_community")
	private boolean creatorBannedFromCommunity;
	private long score;

	public VoteView(Person creator, boolean creatorBannedFromCommunity, long score) {
		this.creator = creator;
		this.creatorBannedFromCommunity = creatorBannedFromCommunity;
		this.score = score;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
	}

	public boolean getCreatorBannedFromCommunity() {
	    return creatorBannedFromCommunity;
	}

	public void setCreatorBannedFromCommunity(boolean creatorBannedFromCommunity) {
	    this.creatorBannedFromCommunity = creatorBannedFromCommunity;
	}

	public long getScore() {
	    return score;
	}

	public void setScore(long score) {
	    this.score = score;
	}
}
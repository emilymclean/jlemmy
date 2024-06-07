// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommunityFollowerView {
	private Community community;
	private Person follower;

	public CommunityFollowerView(Community community, Person follower) {
		this.community = community;
		this.follower = follower;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}

	public Person getFollower() {
	    return follower;
	}

	public void setFollower(Person follower) {
	    this.follower = follower;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class MyUserInfo {
	@SerializedName("local_user_view")
	private LocalUserView localUserView;
	private CommunityFollowerView[] follows;
	private CommunityModeratorView[] moderates;
	@SerializedName("community_blocks")
	private CommunityBlockView[] communityBlocks;
	@SerializedName("instance_blocks")
	private InstanceBlockView[] instanceBlocks;
	@SerializedName("person_blocks")
	private PersonBlockView[] personBlocks;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;

	public MyUserInfo(LocalUserView localUserView, CommunityFollowerView[] follows, CommunityModeratorView[] moderates, CommunityBlockView[] communityBlocks, InstanceBlockView[] instanceBlocks, PersonBlockView[] personBlocks, long[] discussionLanguages) {
		this.localUserView = localUserView;
		this.follows = follows;
		this.moderates = moderates;
		this.communityBlocks = communityBlocks;
		this.instanceBlocks = instanceBlocks;
		this.personBlocks = personBlocks;
		this.discussionLanguages = discussionLanguages;
	}

	public LocalUserView getLocalUserView() {
	    return localUserView;
	}

	public void setLocalUserView(LocalUserView localUserView) {
	    this.localUserView = localUserView;
	}

	public CommunityFollowerView[] getFollows() {
	    return follows;
	}

	public void setFollows(CommunityFollowerView[] follows) {
	    this.follows = follows;
	}

	public CommunityModeratorView[] getModerates() {
	    return moderates;
	}

	public void setModerates(CommunityModeratorView[] moderates) {
	    this.moderates = moderates;
	}

	public CommunityBlockView[] getCommunityBlocks() {
	    return communityBlocks;
	}

	public void setCommunityBlocks(CommunityBlockView[] communityBlocks) {
	    this.communityBlocks = communityBlocks;
	}

	public InstanceBlockView[] getInstanceBlocks() {
	    return instanceBlocks;
	}

	public void setInstanceBlocks(InstanceBlockView[] instanceBlocks) {
	    this.instanceBlocks = instanceBlocks;
	}

	public PersonBlockView[] getPersonBlocks() {
	    return personBlocks;
	}

	public void setPersonBlocks(PersonBlockView[] personBlocks) {
	    this.personBlocks = personBlocks;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}
}
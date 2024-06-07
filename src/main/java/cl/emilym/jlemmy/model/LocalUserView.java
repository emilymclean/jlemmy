// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LocalUserView {
	@SerializedName("local_user")
	private LocalUser localUser;
	@SerializedName("local_user_vote_display_mode")
	private LocalUserVoteDisplayMode localUserVoteDisplayMode;
	private Person person;
	private PersonAggregates counts;

	public LocalUserView(LocalUser localUser, LocalUserVoteDisplayMode localUserVoteDisplayMode, Person person, PersonAggregates counts) {
		this.localUser = localUser;
		this.localUserVoteDisplayMode = localUserVoteDisplayMode;
		this.person = person;
		this.counts = counts;
	}

	public LocalUser getLocalUser() {
	    return localUser;
	}

	public void setLocalUser(LocalUser localUser) {
	    this.localUser = localUser;
	}

	public LocalUserVoteDisplayMode getLocalUserVoteDisplayMode() {
	    return localUserVoteDisplayMode;
	}

	public void setLocalUserVoteDisplayMode(LocalUserVoteDisplayMode localUserVoteDisplayMode) {
	    this.localUserVoteDisplayMode = localUserVoteDisplayMode;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person person) {
	    this.person = person;
	}

	public PersonAggregates getCounts() {
	    return counts;
	}

	public void setCounts(PersonAggregates counts) {
	    this.counts = counts;
	}
}
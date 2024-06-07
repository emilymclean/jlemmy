// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PersonMentionResponse {
	@SerializedName("person_mention_view")
	private PersonMentionView personMentionView;

	public PersonMentionResponse(PersonMentionView personMentionView) {
		this.personMentionView = personMentionView;
	}

	public PersonMentionView getPersonMentionView() {
	    return personMentionView;
	}

	public void setPersonMentionView(PersonMentionView personMentionView) {
	    this.personMentionView = personMentionView;
	}
}
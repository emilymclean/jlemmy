// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
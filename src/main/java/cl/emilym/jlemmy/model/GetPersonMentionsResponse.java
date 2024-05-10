// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class GetPersonMentionsResponse {
	private PersonMentionView[] mentions;

	public GetPersonMentionsResponse(PersonMentionView[] mentions) {
		this.mentions = mentions;
	}

	public PersonMentionView[] getMentions() {
	    return mentions;
	}

	public void setMentions(PersonMentionView[] mentions) {
	    this.mentions = mentions;
	}
}
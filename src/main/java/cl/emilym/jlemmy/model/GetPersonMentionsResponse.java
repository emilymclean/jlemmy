// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
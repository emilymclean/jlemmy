// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class CustomEmojiResponse {
	@SerializedName("custom_emoji")
	private CustomEmojiView customEmoji;

	public CustomEmojiResponse(CustomEmojiView customEmoji) {
		this.customEmoji = customEmoji;
	}

	public CustomEmojiView getCustomEmoji() {
	    return customEmoji;
	}

	public void setCustomEmoji(CustomEmojiView customEmoji) {
	    this.customEmoji = customEmoji;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CustomEmojiView {
	@SerializedName("custom_emoji")
	private CustomEmoji customEmoji;
	private CustomEmojiKeyword[] keywords;

	public CustomEmojiView(CustomEmoji customEmoji, CustomEmojiKeyword[] keywords) {
		this.customEmoji = customEmoji;
		this.keywords = keywords;
	}

	public CustomEmoji getCustomEmoji() {
	    return customEmoji;
	}

	public void setCustomEmoji(CustomEmoji customEmoji) {
	    this.customEmoji = customEmoji;
	}

	public CustomEmojiKeyword[] getKeywords() {
	    return keywords;
	}

	public void setKeywords(CustomEmojiKeyword[] keywords) {
	    this.keywords = keywords;
	}
}
// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CustomEmojiKeyword {
	@SerializedName("custom_emoji_id")
	private long customEmojiId;
	private String keyword;

	public CustomEmojiKeyword(long customEmojiId, String keyword) {
		this.customEmojiId = customEmojiId;
		this.keyword = keyword;
	}

	public long getCustomEmojiId() {
	    return customEmojiId;
	}

	public void setCustomEmojiId(long customEmojiId) {
	    this.customEmojiId = customEmojiId;
	}

	public String getKeyword() {
	    return keyword;
	}

	public void setKeyword(String keyword) {
	    this.keyword = keyword;
	}
}
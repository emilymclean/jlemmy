// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
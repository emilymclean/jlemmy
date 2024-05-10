// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class SaveUserSettings {
	@SerializedName("show_nsfw")
	private boolean showNsfw;
	@SerializedName("blur_nsfw")
	private boolean blurNsfw;
	@SerializedName("auto_expand")
	private boolean autoExpand;
	private String theme;
	@SerializedName("default_sort_type")
	private SortType defaultSortType;
	@SerializedName("default_listing_type")
	private ListingType defaultListingType;
	@SerializedName("interface_language")
	private String interfaceLanguage;
	private String avatar;
	private String banner;
	@SerializedName("display_name")
	private String displayName;
	private String email;
	private String bio;
	@SerializedName("matrix_user_id")
	private String matrixUserId;
	@SerializedName("show_avatars")
	private boolean showAvatars;
	@SerializedName("send_notifications_to_email")
	private boolean sendNotificationsToEmail;
	@SerializedName("bot_account")
	private boolean botAccount;
	@SerializedName("show_bot_accounts")
	private boolean showBotAccounts;
	@SerializedName("show_read_posts")
	private boolean showReadPosts;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;
	@SerializedName("open_links_in_new_tab")
	private boolean openLinksInNewTab;
	@SerializedName("infinite_scroll_enabled")
	private boolean infiniteScrollEnabled;
	@SerializedName("post_listing_mode")
	private PostListingMode postListingMode;
	@SerializedName("enable_keyboard_navigation")
	private boolean enableKeyboardNavigation;
	@SerializedName("enable_animated_images")
	private boolean enableAnimatedImages;
	@SerializedName("collapse_bot_comments")
	private boolean collapseBotComments;
	@SerializedName("show_scores")
	private boolean showScores;
	@SerializedName("show_upvotes")
	private boolean showUpvotes;
	@SerializedName("show_downvotes")
	private boolean showDownvotes;
	@SerializedName("show_upvote_percentage")
	private boolean showUpvotePercentage;

	public SaveUserSettings(boolean showNsfw, boolean blurNsfw, boolean autoExpand, String theme, SortType defaultSortType, ListingType defaultListingType, String interfaceLanguage, String avatar, String banner, String displayName, String email, String bio, String matrixUserId, boolean showAvatars, boolean sendNotificationsToEmail, boolean botAccount, boolean showBotAccounts, boolean showReadPosts, long[] discussionLanguages, boolean openLinksInNewTab, boolean infiniteScrollEnabled, PostListingMode postListingMode, boolean enableKeyboardNavigation, boolean enableAnimatedImages, boolean collapseBotComments, boolean showScores, boolean showUpvotes, boolean showDownvotes, boolean showUpvotePercentage) {
		this.showNsfw = showNsfw;
		this.blurNsfw = blurNsfw;
		this.autoExpand = autoExpand;
		this.theme = theme;
		this.defaultSortType = defaultSortType;
		this.defaultListingType = defaultListingType;
		this.interfaceLanguage = interfaceLanguage;
		this.avatar = avatar;
		this.banner = banner;
		this.displayName = displayName;
		this.email = email;
		this.bio = bio;
		this.matrixUserId = matrixUserId;
		this.showAvatars = showAvatars;
		this.sendNotificationsToEmail = sendNotificationsToEmail;
		this.botAccount = botAccount;
		this.showBotAccounts = showBotAccounts;
		this.showReadPosts = showReadPosts;
		this.discussionLanguages = discussionLanguages;
		this.openLinksInNewTab = openLinksInNewTab;
		this.infiniteScrollEnabled = infiniteScrollEnabled;
		this.postListingMode = postListingMode;
		this.enableKeyboardNavigation = enableKeyboardNavigation;
		this.enableAnimatedImages = enableAnimatedImages;
		this.collapseBotComments = collapseBotComments;
		this.showScores = showScores;
		this.showUpvotes = showUpvotes;
		this.showDownvotes = showDownvotes;
		this.showUpvotePercentage = showUpvotePercentage;
	}

	public boolean getShowNsfw() {
	    return showNsfw;
	}

	public void setShowNsfw(boolean showNsfw) {
	    this.showNsfw = showNsfw;
	}

	public boolean getBlurNsfw() {
	    return blurNsfw;
	}

	public void setBlurNsfw(boolean blurNsfw) {
	    this.blurNsfw = blurNsfw;
	}

	public boolean getAutoExpand() {
	    return autoExpand;
	}

	public void setAutoExpand(boolean autoExpand) {
	    this.autoExpand = autoExpand;
	}

	public String getTheme() {
	    return theme;
	}

	public void setTheme(String theme) {
	    this.theme = theme;
	}

	public SortType getDefaultSortType() {
	    return defaultSortType;
	}

	public void setDefaultSortType(SortType defaultSortType) {
	    this.defaultSortType = defaultSortType;
	}

	public ListingType getDefaultListingType() {
	    return defaultListingType;
	}

	public void setDefaultListingType(ListingType defaultListingType) {
	    this.defaultListingType = defaultListingType;
	}

	public String getInterfaceLanguage() {
	    return interfaceLanguage;
	}

	public void setInterfaceLanguage(String interfaceLanguage) {
	    this.interfaceLanguage = interfaceLanguage;
	}

	public String getAvatar() {
	    return avatar;
	}

	public void setAvatar(String avatar) {
	    this.avatar = avatar;
	}

	public String getBanner() {
	    return banner;
	}

	public void setBanner(String banner) {
	    this.banner = banner;
	}

	public String getDisplayName() {
	    return displayName;
	}

	public void setDisplayName(String displayName) {
	    this.displayName = displayName;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	public String getBio() {
	    return bio;
	}

	public void setBio(String bio) {
	    this.bio = bio;
	}

	public String getMatrixUserId() {
	    return matrixUserId;
	}

	public void setMatrixUserId(String matrixUserId) {
	    this.matrixUserId = matrixUserId;
	}

	public boolean getShowAvatars() {
	    return showAvatars;
	}

	public void setShowAvatars(boolean showAvatars) {
	    this.showAvatars = showAvatars;
	}

	public boolean getSendNotificationsToEmail() {
	    return sendNotificationsToEmail;
	}

	public void setSendNotificationsToEmail(boolean sendNotificationsToEmail) {
	    this.sendNotificationsToEmail = sendNotificationsToEmail;
	}

	public boolean getBotAccount() {
	    return botAccount;
	}

	public void setBotAccount(boolean botAccount) {
	    this.botAccount = botAccount;
	}

	public boolean getShowBotAccounts() {
	    return showBotAccounts;
	}

	public void setShowBotAccounts(boolean showBotAccounts) {
	    this.showBotAccounts = showBotAccounts;
	}

	public boolean getShowReadPosts() {
	    return showReadPosts;
	}

	public void setShowReadPosts(boolean showReadPosts) {
	    this.showReadPosts = showReadPosts;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}

	public boolean getOpenLinksInNewTab() {
	    return openLinksInNewTab;
	}

	public void setOpenLinksInNewTab(boolean openLinksInNewTab) {
	    this.openLinksInNewTab = openLinksInNewTab;
	}

	public boolean getInfiniteScrollEnabled() {
	    return infiniteScrollEnabled;
	}

	public void setInfiniteScrollEnabled(boolean infiniteScrollEnabled) {
	    this.infiniteScrollEnabled = infiniteScrollEnabled;
	}

	public PostListingMode getPostListingMode() {
	    return postListingMode;
	}

	public void setPostListingMode(PostListingMode postListingMode) {
	    this.postListingMode = postListingMode;
	}

	public boolean getEnableKeyboardNavigation() {
	    return enableKeyboardNavigation;
	}

	public void setEnableKeyboardNavigation(boolean enableKeyboardNavigation) {
	    this.enableKeyboardNavigation = enableKeyboardNavigation;
	}

	public boolean getEnableAnimatedImages() {
	    return enableAnimatedImages;
	}

	public void setEnableAnimatedImages(boolean enableAnimatedImages) {
	    this.enableAnimatedImages = enableAnimatedImages;
	}

	public boolean getCollapseBotComments() {
	    return collapseBotComments;
	}

	public void setCollapseBotComments(boolean collapseBotComments) {
	    this.collapseBotComments = collapseBotComments;
	}

	public boolean getShowScores() {
	    return showScores;
	}

	public void setShowScores(boolean showScores) {
	    this.showScores = showScores;
	}

	public boolean getShowUpvotes() {
	    return showUpvotes;
	}

	public void setShowUpvotes(boolean showUpvotes) {
	    this.showUpvotes = showUpvotes;
	}

	public boolean getShowDownvotes() {
	    return showDownvotes;
	}

	public void setShowDownvotes(boolean showDownvotes) {
	    this.showDownvotes = showDownvotes;
	}

	public boolean getShowUpvotePercentage() {
	    return showUpvotePercentage;
	}

	public void setShowUpvotePercentage(boolean showUpvotePercentage) {
	    this.showUpvotePercentage = showUpvotePercentage;
	}
}
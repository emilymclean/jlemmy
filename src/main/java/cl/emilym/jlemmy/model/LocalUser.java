// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LocalUser {
	private long id;
	@SerializedName("person_id")
	private long personId;
	private String email;
	@SerializedName("show_nsfw")
	private boolean showNsfw;
	private String theme;
	@SerializedName("default_sort_type")
	private SortType defaultSortType;
	@SerializedName("default_listing_type")
	private ListingType defaultListingType;
	@SerializedName("interface_language")
	private String interfaceLanguage;
	@SerializedName("show_avatars")
	private boolean showAvatars;
	@SerializedName("send_notifications_to_email")
	private boolean sendNotificationsToEmail;
	@SerializedName("show_scores")
	private boolean showScores;
	@SerializedName("show_bot_accounts")
	private boolean showBotAccounts;
	@SerializedName("show_read_posts")
	private boolean showReadPosts;
	@SerializedName("email_verified")
	private boolean emailVerified;
	@SerializedName("accepted_application")
	private boolean acceptedApplication;
	@SerializedName("open_links_in_new_tab")
	private boolean openLinksInNewTab;
	@SerializedName("blur_nsfw")
	private boolean blurNsfw;
	@SerializedName("auto_expand")
	private boolean autoExpand;
	@SerializedName("infinite_scroll_enabled")
	private boolean infiniteScrollEnabled;
	private boolean admin;
	@SerializedName("post_listing_mode")
	private PostListingMode postListingMode;
	@SerializedName("totp_2fa_enabled")
	private boolean totp2faEnabled;
	@SerializedName("enable_keyboard_navigation")
	private boolean enableKeyboardNavigation;
	@SerializedName("enable_animated_images")
	private boolean enableAnimatedImages;
	@SerializedName("collapse_bot_comments")
	private boolean collapseBotComments;

	public LocalUser(long id, long personId, String email, boolean showNsfw, String theme, SortType defaultSortType, ListingType defaultListingType, String interfaceLanguage, boolean showAvatars, boolean sendNotificationsToEmail, boolean showScores, boolean showBotAccounts, boolean showReadPosts, boolean emailVerified, boolean acceptedApplication, boolean openLinksInNewTab, boolean blurNsfw, boolean autoExpand, boolean infiniteScrollEnabled, boolean admin, PostListingMode postListingMode, boolean totp2faEnabled, boolean enableKeyboardNavigation, boolean enableAnimatedImages, boolean collapseBotComments) {
		this.id = id;
		this.personId = personId;
		this.email = email;
		this.showNsfw = showNsfw;
		this.theme = theme;
		this.defaultSortType = defaultSortType;
		this.defaultListingType = defaultListingType;
		this.interfaceLanguage = interfaceLanguage;
		this.showAvatars = showAvatars;
		this.sendNotificationsToEmail = sendNotificationsToEmail;
		this.showScores = showScores;
		this.showBotAccounts = showBotAccounts;
		this.showReadPosts = showReadPosts;
		this.emailVerified = emailVerified;
		this.acceptedApplication = acceptedApplication;
		this.openLinksInNewTab = openLinksInNewTab;
		this.blurNsfw = blurNsfw;
		this.autoExpand = autoExpand;
		this.infiniteScrollEnabled = infiniteScrollEnabled;
		this.admin = admin;
		this.postListingMode = postListingMode;
		this.totp2faEnabled = totp2faEnabled;
		this.enableKeyboardNavigation = enableKeyboardNavigation;
		this.enableAnimatedImages = enableAnimatedImages;
		this.collapseBotComments = collapseBotComments;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	public boolean getShowNsfw() {
	    return showNsfw;
	}

	public void setShowNsfw(boolean showNsfw) {
	    this.showNsfw = showNsfw;
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

	public boolean getShowScores() {
	    return showScores;
	}

	public void setShowScores(boolean showScores) {
	    this.showScores = showScores;
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

	public boolean getEmailVerified() {
	    return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
	    this.emailVerified = emailVerified;
	}

	public boolean getAcceptedApplication() {
	    return acceptedApplication;
	}

	public void setAcceptedApplication(boolean acceptedApplication) {
	    this.acceptedApplication = acceptedApplication;
	}

	public boolean getOpenLinksInNewTab() {
	    return openLinksInNewTab;
	}

	public void setOpenLinksInNewTab(boolean openLinksInNewTab) {
	    this.openLinksInNewTab = openLinksInNewTab;
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

	public boolean getInfiniteScrollEnabled() {
	    return infiniteScrollEnabled;
	}

	public void setInfiniteScrollEnabled(boolean infiniteScrollEnabled) {
	    this.infiniteScrollEnabled = infiniteScrollEnabled;
	}

	public boolean getAdmin() {
	    return admin;
	}

	public void setAdmin(boolean admin) {
	    this.admin = admin;
	}

	public PostListingMode getPostListingMode() {
	    return postListingMode;
	}

	public void setPostListingMode(PostListingMode postListingMode) {
	    this.postListingMode = postListingMode;
	}

	public boolean getTotp2faEnabled() {
	    return totp2faEnabled;
	}

	public void setTotp2faEnabled(boolean totp2faEnabled) {
	    this.totp2faEnabled = totp2faEnabled;
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
}
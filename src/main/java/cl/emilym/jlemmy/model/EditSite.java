// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class EditSite {
	private String name;
	private String sidebar;
	private String description;
	private String icon;
	private String banner;
	@SerializedName("enable_downvotes")
	private boolean enableDownvotes;
	@SerializedName("enable_nsfw")
	private boolean enableNsfw;
	@SerializedName("community_creation_admin_only")
	private boolean communityCreationAdminOnly;
	@SerializedName("require_email_verification")
	private boolean requireEmailVerification;
	@SerializedName("application_question")
	private String applicationQuestion;
	@SerializedName("private_instance")
	private boolean privateInstance;
	@SerializedName("default_theme")
	private String defaultTheme;
	@SerializedName("default_post_listing_type")
	private ListingType defaultPostListingType;
	@SerializedName("default_sort_type")
	private SortType defaultSortType;
	@SerializedName("legal_information")
	private String legalInformation;
	@SerializedName("application_email_admins")
	private boolean applicationEmailAdmins;
	@SerializedName("hide_modlog_mod_names")
	private boolean hideModlogModNames;
	@SerializedName("discussion_languages")
	private long[] discussionLanguages;
	@SerializedName("slur_filter_regex")
	private String slurFilterRegex;
	@SerializedName("actor_name_max_length")
	private long actorNameMaxLength;
	@SerializedName("rate_limit_message")
	private long rateLimitMessage;
	@SerializedName("rate_limit_message_per_second")
	private long rateLimitMessagePerSecond;
	@SerializedName("rate_limit_post")
	private long rateLimitPost;
	@SerializedName("rate_limit_post_per_second")
	private long rateLimitPostPerSecond;
	@SerializedName("rate_limit_register")
	private long rateLimitRegister;
	@SerializedName("rate_limit_register_per_second")
	private long rateLimitRegisterPerSecond;
	@SerializedName("rate_limit_image")
	private long rateLimitImage;
	@SerializedName("rate_limit_image_per_second")
	private long rateLimitImagePerSecond;
	@SerializedName("rate_limit_comment")
	private long rateLimitComment;
	@SerializedName("rate_limit_comment_per_second")
	private long rateLimitCommentPerSecond;
	@SerializedName("rate_limit_search")
	private long rateLimitSearch;
	@SerializedName("rate_limit_search_per_second")
	private long rateLimitSearchPerSecond;
	@SerializedName("federation_enabled")
	private boolean federationEnabled;
	@SerializedName("federation_debug")
	private boolean federationDebug;
	@SerializedName("captcha_enabled")
	private boolean captchaEnabled;
	@SerializedName("captcha_difficulty")
	private String captchaDifficulty;
	@SerializedName("allowed_instances")
	private String[] allowedInstances;
	@SerializedName("blocked_instances")
	private String[] blockedInstances;
	@SerializedName("blocked_urls")
	private String[] blockedUrls;
	private String[] taglines;
	@SerializedName("registration_mode")
	private RegistrationMode registrationMode;
	@SerializedName("reports_email_admins")
	private boolean reportsEmailAdmins;
	@SerializedName("content_warning")
	private String contentWarning;
	@SerializedName("default_post_listing_mode")
	private PostListingMode defaultPostListingMode;

	public EditSite(String name, String sidebar, String description, String icon, String banner, boolean enableDownvotes, boolean enableNsfw, boolean communityCreationAdminOnly, boolean requireEmailVerification, String applicationQuestion, boolean privateInstance, String defaultTheme, ListingType defaultPostListingType, SortType defaultSortType, String legalInformation, boolean applicationEmailAdmins, boolean hideModlogModNames, long[] discussionLanguages, String slurFilterRegex, long actorNameMaxLength, long rateLimitMessage, long rateLimitMessagePerSecond, long rateLimitPost, long rateLimitPostPerSecond, long rateLimitRegister, long rateLimitRegisterPerSecond, long rateLimitImage, long rateLimitImagePerSecond, long rateLimitComment, long rateLimitCommentPerSecond, long rateLimitSearch, long rateLimitSearchPerSecond, boolean federationEnabled, boolean federationDebug, boolean captchaEnabled, String captchaDifficulty, String[] allowedInstances, String[] blockedInstances, String[] blockedUrls, String[] taglines, RegistrationMode registrationMode, boolean reportsEmailAdmins, String contentWarning, PostListingMode defaultPostListingMode) {
		this.name = name;
		this.sidebar = sidebar;
		this.description = description;
		this.icon = icon;
		this.banner = banner;
		this.enableDownvotes = enableDownvotes;
		this.enableNsfw = enableNsfw;
		this.communityCreationAdminOnly = communityCreationAdminOnly;
		this.requireEmailVerification = requireEmailVerification;
		this.applicationQuestion = applicationQuestion;
		this.privateInstance = privateInstance;
		this.defaultTheme = defaultTheme;
		this.defaultPostListingType = defaultPostListingType;
		this.defaultSortType = defaultSortType;
		this.legalInformation = legalInformation;
		this.applicationEmailAdmins = applicationEmailAdmins;
		this.hideModlogModNames = hideModlogModNames;
		this.discussionLanguages = discussionLanguages;
		this.slurFilterRegex = slurFilterRegex;
		this.actorNameMaxLength = actorNameMaxLength;
		this.rateLimitMessage = rateLimitMessage;
		this.rateLimitMessagePerSecond = rateLimitMessagePerSecond;
		this.rateLimitPost = rateLimitPost;
		this.rateLimitPostPerSecond = rateLimitPostPerSecond;
		this.rateLimitRegister = rateLimitRegister;
		this.rateLimitRegisterPerSecond = rateLimitRegisterPerSecond;
		this.rateLimitImage = rateLimitImage;
		this.rateLimitImagePerSecond = rateLimitImagePerSecond;
		this.rateLimitComment = rateLimitComment;
		this.rateLimitCommentPerSecond = rateLimitCommentPerSecond;
		this.rateLimitSearch = rateLimitSearch;
		this.rateLimitSearchPerSecond = rateLimitSearchPerSecond;
		this.federationEnabled = federationEnabled;
		this.federationDebug = federationDebug;
		this.captchaEnabled = captchaEnabled;
		this.captchaDifficulty = captchaDifficulty;
		this.allowedInstances = allowedInstances;
		this.blockedInstances = blockedInstances;
		this.blockedUrls = blockedUrls;
		this.taglines = taglines;
		this.registrationMode = registrationMode;
		this.reportsEmailAdmins = reportsEmailAdmins;
		this.contentWarning = contentWarning;
		this.defaultPostListingMode = defaultPostListingMode;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getSidebar() {
	    return sidebar;
	}

	public void setSidebar(String sidebar) {
	    this.sidebar = sidebar;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public String getIcon() {
	    return icon;
	}

	public void setIcon(String icon) {
	    this.icon = icon;
	}

	public String getBanner() {
	    return banner;
	}

	public void setBanner(String banner) {
	    this.banner = banner;
	}

	public boolean getEnableDownvotes() {
	    return enableDownvotes;
	}

	public void setEnableDownvotes(boolean enableDownvotes) {
	    this.enableDownvotes = enableDownvotes;
	}

	public boolean getEnableNsfw() {
	    return enableNsfw;
	}

	public void setEnableNsfw(boolean enableNsfw) {
	    this.enableNsfw = enableNsfw;
	}

	public boolean getCommunityCreationAdminOnly() {
	    return communityCreationAdminOnly;
	}

	public void setCommunityCreationAdminOnly(boolean communityCreationAdminOnly) {
	    this.communityCreationAdminOnly = communityCreationAdminOnly;
	}

	public boolean getRequireEmailVerification() {
	    return requireEmailVerification;
	}

	public void setRequireEmailVerification(boolean requireEmailVerification) {
	    this.requireEmailVerification = requireEmailVerification;
	}

	public String getApplicationQuestion() {
	    return applicationQuestion;
	}

	public void setApplicationQuestion(String applicationQuestion) {
	    this.applicationQuestion = applicationQuestion;
	}

	public boolean getPrivateInstance() {
	    return privateInstance;
	}

	public void setPrivateInstance(boolean privateInstance) {
	    this.privateInstance = privateInstance;
	}

	public String getDefaultTheme() {
	    return defaultTheme;
	}

	public void setDefaultTheme(String defaultTheme) {
	    this.defaultTheme = defaultTheme;
	}

	public ListingType getDefaultPostListingType() {
	    return defaultPostListingType;
	}

	public void setDefaultPostListingType(ListingType defaultPostListingType) {
	    this.defaultPostListingType = defaultPostListingType;
	}

	public SortType getDefaultSortType() {
	    return defaultSortType;
	}

	public void setDefaultSortType(SortType defaultSortType) {
	    this.defaultSortType = defaultSortType;
	}

	public String getLegalInformation() {
	    return legalInformation;
	}

	public void setLegalInformation(String legalInformation) {
	    this.legalInformation = legalInformation;
	}

	public boolean getApplicationEmailAdmins() {
	    return applicationEmailAdmins;
	}

	public void setApplicationEmailAdmins(boolean applicationEmailAdmins) {
	    this.applicationEmailAdmins = applicationEmailAdmins;
	}

	public boolean getHideModlogModNames() {
	    return hideModlogModNames;
	}

	public void setHideModlogModNames(boolean hideModlogModNames) {
	    this.hideModlogModNames = hideModlogModNames;
	}

	public long[] getDiscussionLanguages() {
	    return discussionLanguages;
	}

	public void setDiscussionLanguages(long[] discussionLanguages) {
	    this.discussionLanguages = discussionLanguages;
	}

	public String getSlurFilterRegex() {
	    return slurFilterRegex;
	}

	public void setSlurFilterRegex(String slurFilterRegex) {
	    this.slurFilterRegex = slurFilterRegex;
	}

	public long getActorNameMaxLength() {
	    return actorNameMaxLength;
	}

	public void setActorNameMaxLength(long actorNameMaxLength) {
	    this.actorNameMaxLength = actorNameMaxLength;
	}

	public long getRateLimitMessage() {
	    return rateLimitMessage;
	}

	public void setRateLimitMessage(long rateLimitMessage) {
	    this.rateLimitMessage = rateLimitMessage;
	}

	public long getRateLimitMessagePerSecond() {
	    return rateLimitMessagePerSecond;
	}

	public void setRateLimitMessagePerSecond(long rateLimitMessagePerSecond) {
	    this.rateLimitMessagePerSecond = rateLimitMessagePerSecond;
	}

	public long getRateLimitPost() {
	    return rateLimitPost;
	}

	public void setRateLimitPost(long rateLimitPost) {
	    this.rateLimitPost = rateLimitPost;
	}

	public long getRateLimitPostPerSecond() {
	    return rateLimitPostPerSecond;
	}

	public void setRateLimitPostPerSecond(long rateLimitPostPerSecond) {
	    this.rateLimitPostPerSecond = rateLimitPostPerSecond;
	}

	public long getRateLimitRegister() {
	    return rateLimitRegister;
	}

	public void setRateLimitRegister(long rateLimitRegister) {
	    this.rateLimitRegister = rateLimitRegister;
	}

	public long getRateLimitRegisterPerSecond() {
	    return rateLimitRegisterPerSecond;
	}

	public void setRateLimitRegisterPerSecond(long rateLimitRegisterPerSecond) {
	    this.rateLimitRegisterPerSecond = rateLimitRegisterPerSecond;
	}

	public long getRateLimitImage() {
	    return rateLimitImage;
	}

	public void setRateLimitImage(long rateLimitImage) {
	    this.rateLimitImage = rateLimitImage;
	}

	public long getRateLimitImagePerSecond() {
	    return rateLimitImagePerSecond;
	}

	public void setRateLimitImagePerSecond(long rateLimitImagePerSecond) {
	    this.rateLimitImagePerSecond = rateLimitImagePerSecond;
	}

	public long getRateLimitComment() {
	    return rateLimitComment;
	}

	public void setRateLimitComment(long rateLimitComment) {
	    this.rateLimitComment = rateLimitComment;
	}

	public long getRateLimitCommentPerSecond() {
	    return rateLimitCommentPerSecond;
	}

	public void setRateLimitCommentPerSecond(long rateLimitCommentPerSecond) {
	    this.rateLimitCommentPerSecond = rateLimitCommentPerSecond;
	}

	public long getRateLimitSearch() {
	    return rateLimitSearch;
	}

	public void setRateLimitSearch(long rateLimitSearch) {
	    this.rateLimitSearch = rateLimitSearch;
	}

	public long getRateLimitSearchPerSecond() {
	    return rateLimitSearchPerSecond;
	}

	public void setRateLimitSearchPerSecond(long rateLimitSearchPerSecond) {
	    this.rateLimitSearchPerSecond = rateLimitSearchPerSecond;
	}

	public boolean getFederationEnabled() {
	    return federationEnabled;
	}

	public void setFederationEnabled(boolean federationEnabled) {
	    this.federationEnabled = federationEnabled;
	}

	public boolean getFederationDebug() {
	    return federationDebug;
	}

	public void setFederationDebug(boolean federationDebug) {
	    this.federationDebug = federationDebug;
	}

	public boolean getCaptchaEnabled() {
	    return captchaEnabled;
	}

	public void setCaptchaEnabled(boolean captchaEnabled) {
	    this.captchaEnabled = captchaEnabled;
	}

	public String getCaptchaDifficulty() {
	    return captchaDifficulty;
	}

	public void setCaptchaDifficulty(String captchaDifficulty) {
	    this.captchaDifficulty = captchaDifficulty;
	}

	public String[] getAllowedInstances() {
	    return allowedInstances;
	}

	public void setAllowedInstances(String[] allowedInstances) {
	    this.allowedInstances = allowedInstances;
	}

	public String[] getBlockedInstances() {
	    return blockedInstances;
	}

	public void setBlockedInstances(String[] blockedInstances) {
	    this.blockedInstances = blockedInstances;
	}

	public String[] getBlockedUrls() {
	    return blockedUrls;
	}

	public void setBlockedUrls(String[] blockedUrls) {
	    this.blockedUrls = blockedUrls;
	}

	public String[] getTaglines() {
	    return taglines;
	}

	public void setTaglines(String[] taglines) {
	    this.taglines = taglines;
	}

	public RegistrationMode getRegistrationMode() {
	    return registrationMode;
	}

	public void setRegistrationMode(RegistrationMode registrationMode) {
	    this.registrationMode = registrationMode;
	}

	public boolean getReportsEmailAdmins() {
	    return reportsEmailAdmins;
	}

	public void setReportsEmailAdmins(boolean reportsEmailAdmins) {
	    this.reportsEmailAdmins = reportsEmailAdmins;
	}

	public String getContentWarning() {
	    return contentWarning;
	}

	public void setContentWarning(String contentWarning) {
	    this.contentWarning = contentWarning;
	}

	public PostListingMode getDefaultPostListingMode() {
	    return defaultPostListingMode;
	}

	public void setDefaultPostListingMode(PostListingMode defaultPostListingMode) {
	    this.defaultPostListingMode = defaultPostListingMode;
	}
}
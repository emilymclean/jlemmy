// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class LocalSite {
	private long id;
	@SerializedName("site_id")
	private long siteId;
	@SerializedName("site_setup")
	private boolean siteSetup;
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
	@SerializedName("legal_information")
	private String legalInformation;
	@SerializedName("hide_modlog_mod_names")
	private boolean hideModlogModNames;
	@SerializedName("application_email_admins")
	private boolean applicationEmailAdmins;
	@SerializedName("slur_filter_regex")
	private String slurFilterRegex;
	@SerializedName("actor_name_max_length")
	private long actorNameMaxLength;
	@SerializedName("federation_enabled")
	private boolean federationEnabled;
	@SerializedName("captcha_enabled")
	private boolean captchaEnabled;
	@SerializedName("captcha_difficulty")
	private String captchaDifficulty;
	private String published;
	private String updated;
	@SerializedName("registration_mode")
	private RegistrationMode registrationMode;
	@SerializedName("reports_email_admins")
	private boolean reportsEmailAdmins;
	@SerializedName("federation_signed_fetch")
	private boolean federationSignedFetch;
	@SerializedName("default_post_listing_mode")
	private PostListingMode defaultPostListingMode;
	@SerializedName("default_sort_type")
	private SortType defaultSortType;

	public LocalSite(long id, long siteId, boolean siteSetup, boolean enableDownvotes, boolean enableNsfw, boolean communityCreationAdminOnly, boolean requireEmailVerification, String applicationQuestion, boolean privateInstance, String defaultTheme, ListingType defaultPostListingType, String legalInformation, boolean hideModlogModNames, boolean applicationEmailAdmins, String slurFilterRegex, long actorNameMaxLength, boolean federationEnabled, boolean captchaEnabled, String captchaDifficulty, String published, String updated, RegistrationMode registrationMode, boolean reportsEmailAdmins, boolean federationSignedFetch, PostListingMode defaultPostListingMode, SortType defaultSortType) {
		this.id = id;
		this.siteId = siteId;
		this.siteSetup = siteSetup;
		this.enableDownvotes = enableDownvotes;
		this.enableNsfw = enableNsfw;
		this.communityCreationAdminOnly = communityCreationAdminOnly;
		this.requireEmailVerification = requireEmailVerification;
		this.applicationQuestion = applicationQuestion;
		this.privateInstance = privateInstance;
		this.defaultTheme = defaultTheme;
		this.defaultPostListingType = defaultPostListingType;
		this.legalInformation = legalInformation;
		this.hideModlogModNames = hideModlogModNames;
		this.applicationEmailAdmins = applicationEmailAdmins;
		this.slurFilterRegex = slurFilterRegex;
		this.actorNameMaxLength = actorNameMaxLength;
		this.federationEnabled = federationEnabled;
		this.captchaEnabled = captchaEnabled;
		this.captchaDifficulty = captchaDifficulty;
		this.published = published;
		this.updated = updated;
		this.registrationMode = registrationMode;
		this.reportsEmailAdmins = reportsEmailAdmins;
		this.federationSignedFetch = federationSignedFetch;
		this.defaultPostListingMode = defaultPostListingMode;
		this.defaultSortType = defaultSortType;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public long getSiteId() {
	    return siteId;
	}

	public void setSiteId(long siteId) {
	    this.siteId = siteId;
	}

	public boolean getSiteSetup() {
	    return siteSetup;
	}

	public void setSiteSetup(boolean siteSetup) {
	    this.siteSetup = siteSetup;
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

	public String getLegalInformation() {
	    return legalInformation;
	}

	public void setLegalInformation(String legalInformation) {
	    this.legalInformation = legalInformation;
	}

	public boolean getHideModlogModNames() {
	    return hideModlogModNames;
	}

	public void setHideModlogModNames(boolean hideModlogModNames) {
	    this.hideModlogModNames = hideModlogModNames;
	}

	public boolean getApplicationEmailAdmins() {
	    return applicationEmailAdmins;
	}

	public void setApplicationEmailAdmins(boolean applicationEmailAdmins) {
	    this.applicationEmailAdmins = applicationEmailAdmins;
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

	public boolean getFederationEnabled() {
	    return federationEnabled;
	}

	public void setFederationEnabled(boolean federationEnabled) {
	    this.federationEnabled = federationEnabled;
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

	public String getPublished() {
	    return published;
	}

	public void setPublished(String published) {
	    this.published = published;
	}

	public String getUpdated() {
	    return updated;
	}

	public void setUpdated(String updated) {
	    this.updated = updated;
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

	public boolean getFederationSignedFetch() {
	    return federationSignedFetch;
	}

	public void setFederationSignedFetch(boolean federationSignedFetch) {
	    this.federationSignedFetch = federationSignedFetch;
	}

	public PostListingMode getDefaultPostListingMode() {
	    return defaultPostListingMode;
	}

	public void setDefaultPostListingMode(PostListingMode defaultPostListingMode) {
	    this.defaultPostListingMode = defaultPostListingMode;
	}

	public SortType getDefaultSortType() {
	    return defaultSortType;
	}

	public void setDefaultSortType(SortType defaultSortType) {
	    this.defaultSortType = defaultSortType;
	}
}
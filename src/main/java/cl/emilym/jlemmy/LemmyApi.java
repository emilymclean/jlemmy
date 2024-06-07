// This class was generated, do not modify it directly
package cl.emilym.jlemmy;

import cl.emilym.jlemmy.model.*;
import retrofit2.*;
import retrofit2.http.*;
import java.util.List;
        
public interface LemmyApi {
	@POST("/site")
	Call<SiteResponse> createSite(CreateSite request);

	@POST("/user/leave_admin")
	Call<GetSiteResponse> leaveAdmin();

	@POST("/user/totp/generate")
	Call<GenerateTotpSecretResponse> generateTotpSecret();

	@GET("/user/export_settings")
	Call<String> exportSettings();

	@POST("/user/import_settings")
	Call<SuccessResponse> importSettings();

	@GET("/user/list_logins")
	Call<List<LoginToken>> listLogins();

	@GET("/user/validate_auth")
	Call<SuccessResponse> validateAuth();

	@GET("/account/list_media")
	Call<ListMediaResponse> listMedia(ListMedia request);

	@GET("/admin/list_all_media")
	Call<ListMediaResponse> listAllMedia(ListMedia request);

	@POST("/user/totp/update")
	Call<UpdateTotpResponse> updateTotp(UpdateTotp request);

	@GET("/modlog")
	Call<GetModlogResponse> getModlog(GetModlog request);

	@GET("/resolve_object")
	Call<ResolveObjectResponse> resolveObject(ResolveObject request);

	@POST("/community")
	Call<CommunityResponse> createCommunity(CreateCommunity request);

	@GET("/community")
	Call<GetCommunityResponse> getCommunity(GetCommunity request);

	@PUT("/community")
	Call<CommunityResponse> editCommunity(EditCommunity request);

	@GET("/community/list")
	Call<ListCommunitiesResponse> listCommunities(ListCommunities request);

	@POST("/community/follow")
	Call<CommunityResponse> followCommunity(FollowCommunity request);

	@POST("/community/block")
	Call<BlockCommunityResponse> blockCommunity(BlockCommunity request);

	@POST("/community/delete")
	Call<CommunityResponse> deleteCommunity(DeleteCommunity request);

	@PUT("/community/hide")
	Call<SuccessResponse> hideCommunity(HideCommunity request);

	@POST("/community/remove")
	Call<CommunityResponse> removeCommunity(RemoveCommunity request);

	@POST("/community/transfer")
	Call<GetCommunityResponse> transferCommunity(TransferCommunity request);

	@POST("/community/ban_user")
	Call<BanFromCommunityResponse> banFromCommunity(BanFromCommunity request);

	@POST("/community/mod")
	Call<AddModToCommunityResponse> addModToCommunity(AddModToCommunity request);

	@POST("/post")
	Call<PostResponse> createPost(CreatePost request);

	@POST("/post/delete")
	Call<PostResponse> deletePost(DeletePost request);

	@POST("/post/remove")
	Call<PostResponse> removePost(RemovePost request);

	@POST("/post/mark_as_read")
	Call<SuccessResponse> markPostAsRead(MarkPostAsRead request);

	@POST("/post/hide")
	Call<SuccessResponse> hidePost(HidePost request);

	@POST("/post/lock")
	Call<PostResponse> lockPost(LockPost request);

	@POST("/post/feature")
	Call<PostResponse> featurePost(FeaturePost request);

	@GET("/post/list")
	Call<GetPostsResponse> getPosts(GetPosts request);

	@POST("/post/like")
	Call<PostResponse> likePost(CreatePostLike request);

	@GET("/post/like/list")
	Call<ListPostLikesResponse> listPostLikes(ListPostLikes request);

	@PUT("/post/save")
	Call<PostResponse> savePost(SavePost request);

	@POST("/post/report")
	Call<PostReportResponse> createPostReport(CreatePostReport request);

	@PUT("/post/report/resolve")
	Call<PostReportResponse> resolvePostReport(ResolvePostReport request);

	@GET("/post/report/list")
	Call<ListPostReportsResponse> listPostReports(ListPostReports request);

	@GET("/post/site_metadata")
	Call<GetSiteMetadataResponse> getSiteMetadata(GetSiteMetadata request);

	@POST("/comment")
	Call<CommentResponse> createComment(CreateComment request);

	@PUT("/comment")
	Call<CommentResponse> editComment(EditComment request);

	@POST("/comment/delete")
	Call<CommentResponse> deleteComment(DeleteComment request);

	@POST("/comment/remove")
	Call<CommentResponse> removeComment(RemoveComment request);

	@POST("/comment/mark_as_read")
	Call<CommentReplyResponse> markCommentReplyAsRead(MarkCommentReplyAsRead request);

	@POST("/comment/like")
	Call<CommentResponse> likeComment(CreateCommentLike request);

	@GET("/comment/like/list")
	Call<ListCommentLikesResponse> listCommentLikes(ListCommentLikes request);

	@PUT("/comment/save")
	Call<CommentResponse> saveComment(SaveComment request);

	@POST("/comment/distinguish")
	Call<CommentResponse> distinguishComment(DistinguishComment request);

	@GET("/comment/list")
	Call<GetCommentsResponse> getComments(GetComments request);

	@GET("/comment")
	Call<CommentResponse> getComment(GetComment request);

	@POST("/comment/report")
	Call<CommentReportResponse> createCommentReport(CreateCommentReport request);

	@PUT("/comment/report/resolve")
	Call<CommentReportResponse> resolveCommentReport(ResolveCommentReport request);

	@GET("/comment/report/list")
	Call<ListCommentReportsResponse> listCommentReports(ListCommentReports request);

	@GET("/private_message/list")
	Call<PrivateMessagesResponse> getPrivateMessages(GetPrivateMessages request);

	@POST("/private_message")
	Call<PrivateMessageResponse> createPrivateMessage(CreatePrivateMessage request);

	@PUT("/private_message")
	Call<PrivateMessageResponse> editPrivateMessage(EditPrivateMessage request);

	@POST("/private_message/delete")
	Call<PrivateMessageResponse> deletePrivateMessage(DeletePrivateMessage request);

	@POST("/private_message/mark_as_read")
	Call<PrivateMessageResponse> markPrivateMessageAsRead(MarkPrivateMessageAsRead request);

	@POST("/user/register")
	Call<LoginResponse> register(Register request);

	@POST("/user/login")
	Call<LoginResponse> login(Login request);

	@POST("/user/logout")
	Call<SuccessResponse> logout();

	@GET("/user")
	Call<GetPersonDetailsResponse> getPersonDetails(GetPersonDetails request);

	@GET("/user/mention")
	Call<GetPersonMentionsResponse> getPersonMentions(GetPersonMentions request);

	@POST("/user/mention/mark_as_read")
	Call<PersonMentionResponse> markPersonMentionAsRead(MarkPersonMentionAsRead request);

	@GET("/user/replies")
	Call<GetRepliesResponse> getReplies(GetReplies request);

	@POST("/user/ban")
	Call<BanPersonResponse> banPerson(BanPerson request);

	@GET("/user/banned")
	Call<BannedPersonsResponse> getBannedPersons();

	@POST("/user/block")
	Call<BlockPersonResponse> blockPerson(BlockPerson request);

	@GET("/user/get_captcha")
	Call<GetCaptchaResponse> getCaptcha();

	@POST("/user/delete_account")
	Call<SuccessResponse> deleteAccount(DeleteAccount request);

	@POST("/user/password_reset")
	Call<SuccessResponse> passwordReset(PasswordReset request);

	@POST("/user/password_change")
	Call<SuccessResponse> passwordChangeAfterReset(PasswordChangeAfterReset request);

	@POST("/user/mark_all_as_read")
	Call<GetRepliesResponse> markAllAsRead();

	@PUT("/user/save_user_settings")
	Call<SuccessResponse> saveUserSettings(SaveUserSettings request);

	@PUT("/user/change_password")
	Call<LoginResponse> changePassword(ChangePassword request);

	@GET("/user/report_count")
	Call<GetReportCountResponse> getReportCount(GetReportCount request);

	@GET("/user/unread_count")
	Call<GetUnreadCountResponse> getUnreadCount();

	@POST("/user/verify_email")
	Call<SuccessResponse> verifyEmail(VerifyEmail request);

	@POST("/admin/add")
	Call<AddAdminResponse> addAdmin(AddAdmin request);

	@GET("/admin/registration_application/count")
	Call<GetUnreadRegistrationApplicationCountResponse> getUnreadRegistrationApplicationCount();

	@POST("/admin/purge/person")
	Call<SuccessResponse> purgePerson(PurgePerson request);

	@POST("/admin/purge/community")
	Call<SuccessResponse> purgeCommunity(PurgeCommunity request);

	@POST("/admin/purge/post")
	Call<SuccessResponse> purgePost(PurgePost request);

	@POST("/admin/purge/comment")
	Call<SuccessResponse> purgeComment(PurgeComment request);

	@POST("/custom_emoji")
	Call<CustomEmojiResponse> createCustomEmoji(CreateCustomEmoji request);

	@PUT("/custom_emoji")
	Call<CustomEmojiResponse> editCustomEmoji(EditCustomEmoji request);

	@POST("/custom_emoji/delete")
	Call<SuccessResponse> deleteCustomEmoji(DeleteCustomEmoji request);

	@GET("/federated_instances")
	Call<GetFederatedInstancesResponse> getFederatedInstances();

	@POST("/site/block")
	Call<BlockInstanceResponse> blockInstance(BlockInstance request);
}
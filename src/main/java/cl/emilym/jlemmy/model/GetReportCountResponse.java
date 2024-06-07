// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetReportCountResponse {
	@SerializedName("community_id")
	private long communityId;
	@SerializedName("comment_reports")
	private long commentReports;
	@SerializedName("post_reports")
	private long postReports;
	@SerializedName("private_message_reports")
	private long privateMessageReports;

	public GetReportCountResponse(long communityId, long commentReports, long postReports, long privateMessageReports) {
		this.communityId = communityId;
		this.commentReports = commentReports;
		this.postReports = postReports;
		this.privateMessageReports = privateMessageReports;
	}

	public long getCommunityId() {
	    return communityId;
	}

	public void setCommunityId(long communityId) {
	    this.communityId = communityId;
	}

	public long getCommentReports() {
	    return commentReports;
	}

	public void setCommentReports(long commentReports) {
	    this.commentReports = commentReports;
	}

	public long getPostReports() {
	    return postReports;
	}

	public void setPostReports(long postReports) {
	    this.postReports = postReports;
	}

	public long getPrivateMessageReports() {
	    return privateMessageReports;
	}

	public void setPrivateMessageReports(long privateMessageReports) {
	    this.privateMessageReports = privateMessageReports;
	}
}
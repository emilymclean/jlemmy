// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ResolveCommentReport {
	@SerializedName("report_id")
	private long reportId;
	private boolean resolved;

	public ResolveCommentReport(long reportId, boolean resolved) {
		this.reportId = reportId;
		this.resolved = resolved;
	}

	public long getReportId() {
	    return reportId;
	}

	public void setReportId(long reportId) {
	    this.reportId = reportId;
	}

	public boolean getResolved() {
	    return resolved;
	}

	public void setResolved(boolean resolved) {
	    this.resolved = resolved;
	}
}
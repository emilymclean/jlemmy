// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ResolvePostReport {
	@SerializedName("report_id")
	private long reportId;
	private boolean resolved;

	public ResolvePostReport(long reportId, boolean resolved) {
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
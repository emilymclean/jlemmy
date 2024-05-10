// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ResolvePrivateMessageReport {
	@SerializedName("report_id")
	private long reportId;
	private boolean resolved;

	public ResolvePrivateMessageReport(long reportId, boolean resolved) {
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
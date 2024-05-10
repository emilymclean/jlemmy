// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ReadableFederationState {
	@SerializedName("instance_id")
	private long instanceId;
	@SerializedName("last_successful_id")
	private long lastSuccessfulId;
	@SerializedName("last_successful_published_time")
	private String lastSuccessfulPublishedTime;
	@SerializedName("fail_count")
	private long failCount;
	@SerializedName("last_retry")
	private String lastRetry;
	@SerializedName("next_retry")
	private String nextRetry;

	public ReadableFederationState(long instanceId, long lastSuccessfulId, String lastSuccessfulPublishedTime, long failCount, String lastRetry, String nextRetry) {
		this.instanceId = instanceId;
		this.lastSuccessfulId = lastSuccessfulId;
		this.lastSuccessfulPublishedTime = lastSuccessfulPublishedTime;
		this.failCount = failCount;
		this.lastRetry = lastRetry;
		this.nextRetry = nextRetry;
	}

	public long getInstanceId() {
	    return instanceId;
	}

	public void setInstanceId(long instanceId) {
	    this.instanceId = instanceId;
	}

	public long getLastSuccessfulId() {
	    return lastSuccessfulId;
	}

	public void setLastSuccessfulId(long lastSuccessfulId) {
	    this.lastSuccessfulId = lastSuccessfulId;
	}

	public String getLastSuccessfulPublishedTime() {
	    return lastSuccessfulPublishedTime;
	}

	public void setLastSuccessfulPublishedTime(String lastSuccessfulPublishedTime) {
	    this.lastSuccessfulPublishedTime = lastSuccessfulPublishedTime;
	}

	public long getFailCount() {
	    return failCount;
	}

	public void setFailCount(long failCount) {
	    this.failCount = failCount;
	}

	public String getLastRetry() {
	    return lastRetry;
	}

	public void setLastRetry(String lastRetry) {
	    this.lastRetry = lastRetry;
	}

	public String getNextRetry() {
	    return nextRetry;
	}

	public void setNextRetry(String nextRetry) {
	    this.nextRetry = nextRetry;
	}
}
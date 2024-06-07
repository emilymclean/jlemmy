// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class BlockInstance {
	@SerializedName("instance_id")
	private long instanceId;
	private boolean block;

	public BlockInstance(long instanceId, boolean block) {
		this.instanceId = instanceId;
		this.block = block;
	}

	public long getInstanceId() {
	    return instanceId;
	}

	public void setInstanceId(long instanceId) {
	    this.instanceId = instanceId;
	}

	public boolean getBlock() {
	    return block;
	}

	public void setBlock(boolean block) {
	    this.block = block;
	}
}
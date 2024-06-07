// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class FederatedInstances {
	private InstanceWithFederationState[] linked;
	private InstanceWithFederationState[] allowed;
	private InstanceWithFederationState[] blocked;

	public FederatedInstances(InstanceWithFederationState[] linked, InstanceWithFederationState[] allowed, InstanceWithFederationState[] blocked) {
		this.linked = linked;
		this.allowed = allowed;
		this.blocked = blocked;
	}

	public InstanceWithFederationState[] getLinked() {
	    return linked;
	}

	public void setLinked(InstanceWithFederationState[] linked) {
	    this.linked = linked;
	}

	public InstanceWithFederationState[] getAllowed() {
	    return allowed;
	}

	public void setAllowed(InstanceWithFederationState[] allowed) {
	    this.allowed = allowed;
	}

	public InstanceWithFederationState[] getBlocked() {
	    return blocked;
	}

	public void setBlocked(InstanceWithFederationState[] blocked) {
	    this.blocked = blocked;
	}
}
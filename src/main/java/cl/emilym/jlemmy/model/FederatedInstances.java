// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
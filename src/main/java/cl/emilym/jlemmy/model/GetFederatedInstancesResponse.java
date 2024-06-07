// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetFederatedInstancesResponse {
	@SerializedName("federated_instances")
	private FederatedInstances federatedInstances;

	public GetFederatedInstancesResponse(FederatedInstances federatedInstances) {
		this.federatedInstances = federatedInstances;
	}

	public FederatedInstances getFederatedInstances() {
	    return federatedInstances;
	}

	public void setFederatedInstances(FederatedInstances federatedInstances) {
	    this.federatedInstances = federatedInstances;
	}
}
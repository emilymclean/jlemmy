// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
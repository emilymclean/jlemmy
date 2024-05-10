// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
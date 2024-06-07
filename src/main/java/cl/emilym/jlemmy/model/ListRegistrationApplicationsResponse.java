// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListRegistrationApplicationsResponse {
	@SerializedName("registration_applications")
	private RegistrationApplicationView[] registrationApplications;

	public ListRegistrationApplicationsResponse(RegistrationApplicationView[] registrationApplications) {
		this.registrationApplications = registrationApplications;
	}

	public RegistrationApplicationView[] getRegistrationApplications() {
	    return registrationApplications;
	}

	public void setRegistrationApplications(RegistrationApplicationView[] registrationApplications) {
	    this.registrationApplications = registrationApplications;
	}
}
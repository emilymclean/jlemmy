// This class was generated, do not modify it directly
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
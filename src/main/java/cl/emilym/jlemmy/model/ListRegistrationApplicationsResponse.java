// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
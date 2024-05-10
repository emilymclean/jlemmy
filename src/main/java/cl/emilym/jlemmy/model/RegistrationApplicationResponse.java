// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class RegistrationApplicationResponse {
	@SerializedName("registration_application")
	private RegistrationApplicationView registrationApplication;

	public RegistrationApplicationResponse(RegistrationApplicationView registrationApplication) {
		this.registrationApplication = registrationApplication;
	}

	public RegistrationApplicationView getRegistrationApplication() {
	    return registrationApplication;
	}

	public void setRegistrationApplication(RegistrationApplicationView registrationApplication) {
	    this.registrationApplication = registrationApplication;
	}
}
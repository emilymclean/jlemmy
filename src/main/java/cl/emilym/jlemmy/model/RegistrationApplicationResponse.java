// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
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
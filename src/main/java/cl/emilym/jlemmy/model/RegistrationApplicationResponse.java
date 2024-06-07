// This class was generated, do not modify it directly
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
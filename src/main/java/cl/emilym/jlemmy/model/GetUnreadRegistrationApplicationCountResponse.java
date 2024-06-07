// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetUnreadRegistrationApplicationCountResponse {
	@SerializedName("registration_applications")
	private long registrationApplications;

	public GetUnreadRegistrationApplicationCountResponse(long registrationApplications) {
		this.registrationApplications = registrationApplications;
	}

	public long getRegistrationApplications() {
	    return registrationApplications;
	}

	public void setRegistrationApplications(long registrationApplications) {
	    this.registrationApplications = registrationApplications;
	}
}
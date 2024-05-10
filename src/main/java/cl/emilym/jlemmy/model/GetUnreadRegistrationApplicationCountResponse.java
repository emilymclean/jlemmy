// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
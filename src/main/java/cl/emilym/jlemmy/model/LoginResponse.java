// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LoginResponse {
	private String jwt;
	@SerializedName("registration_created")
	private boolean registrationCreated;
	@SerializedName("verify_email_sent")
	private boolean verifyEmailSent;

	public LoginResponse(String jwt, boolean registrationCreated, boolean verifyEmailSent) {
		this.jwt = jwt;
		this.registrationCreated = registrationCreated;
		this.verifyEmailSent = verifyEmailSent;
	}

	public String getJwt() {
	    return jwt;
	}

	public void setJwt(String jwt) {
	    this.jwt = jwt;
	}

	public boolean getRegistrationCreated() {
	    return registrationCreated;
	}

	public void setRegistrationCreated(boolean registrationCreated) {
	    this.registrationCreated = registrationCreated;
	}

	public boolean getVerifyEmailSent() {
	    return verifyEmailSent;
	}

	public void setVerifyEmailSent(boolean verifyEmailSent) {
	    this.verifyEmailSent = verifyEmailSent;
	}
}
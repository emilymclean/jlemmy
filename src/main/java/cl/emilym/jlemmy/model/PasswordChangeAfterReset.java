// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PasswordChangeAfterReset {
	private String token;
	private String password;
	@SerializedName("password_verify")
	private String passwordVerify;

	public PasswordChangeAfterReset(String token, String password, String passwordVerify) {
		this.token = token;
		this.password = password;
		this.passwordVerify = passwordVerify;
	}

	public String getToken() {
	    return token;
	}

	public void setToken(String token) {
	    this.token = token;
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password;
	}

	public String getPasswordVerify() {
	    return passwordVerify;
	}

	public void setPasswordVerify(String passwordVerify) {
	    this.passwordVerify = passwordVerify;
	}
}
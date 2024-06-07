// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Login {
	@SerializedName("username_or_email")
	private String usernameOrEmail;
	private String password;
	@SerializedName("totp_2fa_token")
	private String totp2faToken;

	public Login(String usernameOrEmail, String password, String totp2faToken) {
		this.usernameOrEmail = usernameOrEmail;
		this.password = password;
		this.totp2faToken = totp2faToken;
	}

	public String getUsernameOrEmail() {
	    return usernameOrEmail;
	}

	public void setUsernameOrEmail(String usernameOrEmail) {
	    this.usernameOrEmail = usernameOrEmail;
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password;
	}

	public String getTotp2faToken() {
	    return totp2faToken;
	}

	public void setTotp2faToken(String totp2faToken) {
	    this.totp2faToken = totp2faToken;
	}
}
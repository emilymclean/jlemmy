// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
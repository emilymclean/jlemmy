// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class UpdateTotp {
	@SerializedName("totp_token")
	private String totpToken;
	private boolean enabled;

	public UpdateTotp(String totpToken, boolean enabled) {
		this.totpToken = totpToken;
		this.enabled = enabled;
	}

	public String getTotpToken() {
	    return totpToken;
	}

	public void setTotpToken(String totpToken) {
	    this.totpToken = totpToken;
	}

	public boolean getEnabled() {
	    return enabled;
	}

	public void setEnabled(boolean enabled) {
	    this.enabled = enabled;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GenerateTotpSecretResponse {
	@SerializedName("totp_secret_url")
	private String totpSecretUrl;

	public GenerateTotpSecretResponse(String totpSecretUrl) {
		this.totpSecretUrl = totpSecretUrl;
	}

	public String getTotpSecretUrl() {
	    return totpSecretUrl;
	}

	public void setTotpSecretUrl(String totpSecretUrl) {
	    this.totpSecretUrl = totpSecretUrl;
	}
}
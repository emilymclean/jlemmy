// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
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
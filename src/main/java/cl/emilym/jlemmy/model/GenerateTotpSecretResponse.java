// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class VerifyEmail {
	private String token;

	public VerifyEmail(String token) {
		this.token = token;
	}

	public String getToken() {
	    return token;
	}

	public void setToken(String token) {
	    this.token = token;
	}
}
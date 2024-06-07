// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetCaptchaResponse {
	private CaptchaResponse ok;

	public GetCaptchaResponse(CaptchaResponse ok) {
		this.ok = ok;
	}

	public CaptchaResponse getOk() {
	    return ok;
	}

	public void setOk(CaptchaResponse ok) {
	    this.ok = ok;
	}
}
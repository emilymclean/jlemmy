// This class was generated, do not modify it directly
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
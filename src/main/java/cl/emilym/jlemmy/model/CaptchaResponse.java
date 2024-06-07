// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CaptchaResponse {
	private String png;
	private String wav;
	private String uuid;

	public CaptchaResponse(String png, String wav, String uuid) {
		this.png = png;
		this.wav = wav;
		this.uuid = uuid;
	}

	public String getPng() {
	    return png;
	}

	public void setPng(String png) {
	    this.png = png;
	}

	public String getWav() {
	    return wav;
	}

	public void setWav(String wav) {
	    this.wav = wav;
	}

	public String getUuid() {
	    return uuid;
	}

	public void setUuid(String uuid) {
	    this.uuid = uuid;
	}
}
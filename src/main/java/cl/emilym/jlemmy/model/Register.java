// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class Register {
	private String username;
	private String password;
	@SerializedName("password_verify")
	private String passwordVerify;
	@SerializedName("show_nsfw")
	private boolean showNsfw;
	private String email;
	@SerializedName("captcha_uuid")
	private String captchaUuid;
	@SerializedName("captcha_answer")
	private String captchaAnswer;
	private String honeypot;
	private String answer;

	public Register(String username, String password, String passwordVerify, boolean showNsfw, String email, String captchaUuid, String captchaAnswer, String honeypot, String answer) {
		this.username = username;
		this.password = password;
		this.passwordVerify = passwordVerify;
		this.showNsfw = showNsfw;
		this.email = email;
		this.captchaUuid = captchaUuid;
		this.captchaAnswer = captchaAnswer;
		this.honeypot = honeypot;
		this.answer = answer;
	}

	public String getUsername() {
	    return username;
	}

	public void setUsername(String username) {
	    this.username = username;
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

	public boolean getShowNsfw() {
	    return showNsfw;
	}

	public void setShowNsfw(boolean showNsfw) {
	    this.showNsfw = showNsfw;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	public String getCaptchaUuid() {
	    return captchaUuid;
	}

	public void setCaptchaUuid(String captchaUuid) {
	    this.captchaUuid = captchaUuid;
	}

	public String getCaptchaAnswer() {
	    return captchaAnswer;
	}

	public void setCaptchaAnswer(String captchaAnswer) {
	    this.captchaAnswer = captchaAnswer;
	}

	public String getHoneypot() {
	    return honeypot;
	}

	public void setHoneypot(String honeypot) {
	    this.honeypot = honeypot;
	}

	public String getAnswer() {
	    return answer;
	}

	public void setAnswer(String answer) {
	    this.answer = answer;
	}
}
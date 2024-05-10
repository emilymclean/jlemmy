// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class ChangePassword {
	@SerializedName("new_password")
	private String newPassword;
	@SerializedName("new_password_verify")
	private String newPasswordVerify;
	@SerializedName("old_password")
	private String oldPassword;

	public ChangePassword(String newPassword, String newPasswordVerify, String oldPassword) {
		this.newPassword = newPassword;
		this.newPasswordVerify = newPasswordVerify;
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
	    return newPassword;
	}

	public void setNewPassword(String newPassword) {
	    this.newPassword = newPassword;
	}

	public String getNewPasswordVerify() {
	    return newPasswordVerify;
	}

	public void setNewPasswordVerify(String newPasswordVerify) {
	    this.newPasswordVerify = newPasswordVerify;
	}

	public String getOldPassword() {
	    return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
	    this.oldPassword = oldPassword;
	}
}
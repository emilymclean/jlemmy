// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class DeleteAccount {
	private String password;
	@SerializedName("delete_content")
	private boolean deleteContent;

	public DeleteAccount(String password, boolean deleteContent) {
		this.password = password;
		this.deleteContent = deleteContent;
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password;
	}

	public boolean getDeleteContent() {
	    return deleteContent;
	}

	public void setDeleteContent(boolean deleteContent) {
	    this.deleteContent = deleteContent;
	}
}
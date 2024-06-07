// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class RegistrationApplicationView {
	@SerializedName("registration_application")
	private RegistrationApplication registrationApplication;
	@SerializedName("creator_local_user")
	private LocalUser creatorLocalUser;
	private Person creator;
	private Person admin;

	public RegistrationApplicationView(RegistrationApplication registrationApplication, LocalUser creatorLocalUser, Person creator, Person admin) {
		this.registrationApplication = registrationApplication;
		this.creatorLocalUser = creatorLocalUser;
		this.creator = creator;
		this.admin = admin;
	}

	public RegistrationApplication getRegistrationApplication() {
	    return registrationApplication;
	}

	public void setRegistrationApplication(RegistrationApplication registrationApplication) {
	    this.registrationApplication = registrationApplication;
	}

	public LocalUser getCreatorLocalUser() {
	    return creatorLocalUser;
	}

	public void setCreatorLocalUser(LocalUser creatorLocalUser) {
	    this.creatorLocalUser = creatorLocalUser;
	}

	public Person getCreator() {
	    return creator;
	}

	public void setCreator(Person creator) {
	    this.creator = creator;
	}

	public Person getAdmin() {
	    return admin;
	}

	public void setAdmin(Person admin) {
	    this.admin = admin;
	}
}
// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class LocalImageView {
	@SerializedName("local_image")
	private LocalImage localImage;
	private Person person;

	public LocalImageView(LocalImage localImage, Person person) {
		this.localImage = localImage;
		this.person = person;
	}

	public LocalImage getLocalImage() {
	    return localImage;
	}

	public void setLocalImage(LocalImage localImage) {
	    this.localImage = localImage;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person person) {
	    this.person = person;
	}
}
// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class PersonBlockView {
	private Person person;
	private Person target;

	public PersonBlockView(Person person, Person target) {
		this.person = person;
		this.target = target;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person person) {
	    this.person = person;
	}

	public Person getTarget() {
	    return target;
	}

	public void setTarget(Person target) {
	    this.target = target;
	}
}
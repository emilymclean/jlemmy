// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
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
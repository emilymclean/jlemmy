// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class PersonView {
	private Person person;
	private PersonAggregates counts;
	@SerializedName("is_admin")
	private boolean isAdmin;

	public PersonView(Person person, PersonAggregates counts, boolean isAdmin) {
		this.person = person;
		this.counts = counts;
		this.isAdmin = isAdmin;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person person) {
	    this.person = person;
	}

	public PersonAggregates getCounts() {
	    return counts;
	}

	public void setCounts(PersonAggregates counts) {
	    this.counts = counts;
	}

	public boolean getIsAdmin() {
	    return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
	    this.isAdmin = isAdmin;
	}
}
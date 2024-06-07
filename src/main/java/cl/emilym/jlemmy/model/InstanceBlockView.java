// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class InstanceBlockView {
	private Person person;
	private Instance instance;
	private Site site;

	public InstanceBlockView(Person person, Instance instance, Site site) {
		this.person = person;
		this.instance = instance;
		this.site = site;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person person) {
	    this.person = person;
	}

	public Instance getInstance() {
	    return instance;
	}

	public void setInstance(Instance instance) {
	    this.instance = instance;
	}

	public Site getSite() {
	    return site;
	}

	public void setSite(Site site) {
	    this.site = site;
	}
}
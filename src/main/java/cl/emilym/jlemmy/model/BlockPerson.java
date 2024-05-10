// This class was generated on 2024-05-10 10:12:35.912846+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public class BlockPerson {
	@SerializedName("person_id")
	private long personId;
	private boolean block;

	public BlockPerson(long personId, boolean block) {
		this.personId = personId;
		this.block = block;
	}

	public long getPersonId() {
	    return personId;
	}

	public void setPersonId(long personId) {
	    this.personId = personId;
	}

	public boolean getBlock() {
	    return block;
	}

	public void setBlock(boolean block) {
	    this.block = block;
	}
}
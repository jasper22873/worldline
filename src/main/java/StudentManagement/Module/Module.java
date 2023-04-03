package StudentManagement.Module;


public class Module {

	private int id;
	
	
	private String fname;
	
	
	private String lname;
	

	
	private String email;
	
	private String dob;
	
	private Long PhoneNumber;

	public Students() {
		super();

	}

	public Students(Long id, String fname, String lname, long PhoneNumber) {
		super();
		this.id = id;
		this.FirstName = fname;
		this.LastName = lname;
		
		this.PhoneNumber = PhoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return fname;
	}

	public void setFirstName(String firstName) {
		this.fname = fname;
	}

	public String getLastName() {
		return lname;
	}

	public void setLastName(String lastName) {
		this.lname = lname;
	}

	
	
}









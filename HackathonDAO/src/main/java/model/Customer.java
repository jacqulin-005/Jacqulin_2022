package model;

public class Customer {
	private int id;
	private String email;
	private String fname;
	private String lname;

	public Customer() {
	}

	public Customer(String email, String fname, String lanme) {
		this.email = email;
		this.fname = fname;
		this.lname = lanme;
	}

	public Customer(int id, String email, String fname, String lanme) {
		this.id = id;
		this.email = email;
		this.fname = fname;
		this.lname = lanme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}

package Encapsulation;
		
	public class Student{
		private String studentid;
		private String fname;
		private String lname;
		private String email;
		private long phone;
		

	public Student(String studentid, String fname, String lname, String email, long phone ) {
		this.studentid = studentid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		}
	
		public Student() {
		}
		   
		public String getStudentid() {
			return studentid;
		}
		public void setStudentid(String studentid) {
			this.studentid = studentid;
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
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}	
	}



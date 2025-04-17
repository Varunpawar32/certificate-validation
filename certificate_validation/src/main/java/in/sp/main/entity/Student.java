package in.sp.main.entity;

public class Student {

	private String id;
	private String name;
	private String domain;
	private String internship_start_date;
	private String internship_end_date;
	
	public Student() {}
//	public Student(String id, String name, String domain, String internship_start_date, String internship_end_date) {
//		this.id=id;
//		this.name=name;
//		this.domain=domain;
//		this.internship_start_date=internship_start_date;
//		this.internship_end_date=internship_end_date;
//	}
	
	public Student(String name, String domain, String id) {
		this.id=id;
		this.name=name;
		this.domain=domain;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getInternship_start_date() {
		return internship_start_date;
	}
	public void setInternship_start_date(String internship_start_date) {
		this.internship_start_date = internship_start_date;
	}
	public String getInternship_end_date() {
		return internship_end_date;
	}
	public void setInternship_end_date(String internship_end_date) {
		this.internship_end_date = internship_end_date;
	}
	
	


	

}

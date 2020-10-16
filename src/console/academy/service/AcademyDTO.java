package console.academy.service;

public class AcademyDTO {
	private String acno;
	private String name;
	private String identity;
	private String job;
	private String age;
	
	public AcademyDTO() {}
	
	public AcademyDTO(
			String acno,String name,String identity,String job,String age) {
		this.acno = acno;
		this.name = name;
		this.identity = identity;
		this.job = job;
		this.age = age;
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}

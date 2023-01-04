package User;

public class EmployeeUser extends User{
	
	private String salary;
	private String job;
	public EmployeeUser(String username, String password, String salary, String job) {
		super(username, password);
		this.salary = salary;
		this.job = job;
		
		
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}

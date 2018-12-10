package bean;

public class Employee {
	private String employee_id;
	private String last_name;
	private String email;
	
	public Employee() {
		super();
	}
	public Employee(String employee_id, String last_name, String email) {
		super();
		this.employee_id = employee_id;
		this.last_name = last_name;
		this.email = email;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	
}

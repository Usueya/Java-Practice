package ex07_jdbc;

import java.util.Date;

public class EmployeesDTO {
	//원칙은 전체 컬럼을 필드로 생성해야한다.
	private  int Employee_id;
	private  String First_name;
	private  int salary;
	private  Date Hire_date;
	
	public EmployeesDTO() {};
	public EmployeesDTO(int employee_id, String first_name, int salary, Date hire_date) {
		super();
		Employee_id = employee_id;
		First_name = first_name;
		this.salary = salary;
		Hire_date = hire_date;
	}
	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHire_date() {
		return Hire_date;
	}
	public void setHire_date(Date hire_date) {
		Hire_date = hire_date;
	}
	
	@Override
	public String toString() {
		return "EmployeesDTO [Employee_id=" + Employee_id + ", First_name=" + First_name + ", salary=" + salary
				+ ", Hire_date=" + Hire_date + "]";
	}

}

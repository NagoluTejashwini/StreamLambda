package streamlambda;

import java.time.LocalDate;

import Lab9.casestudy.Department;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private String projectName;
	public Employee(int empId, String empName, int salary, String projectName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.projectName = projectName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", projectName="
				+ projectName + "]";
	}
	
	
}

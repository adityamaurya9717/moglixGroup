package employeemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
	public Employee() {
		System.out.println("employee constructor");
	}
	
	public Employee(String empId, String empFirstName, String empLastName, double empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
	}

	private String empId;
	private String empFirstName;
	private String empLastName;
	private double empSalary;
	private String address;
	private String pancard;
	private String aadhar;
	
	public double calculateSalary() {
		double hra=(10/100)*this.empSalary;
		double ta=(10/100)*this.empSalary;
		double da=(10/100)*this.empSalary;
		
		double netsalary=hra+ta+da+this.empSalary;
		
		return netsalary;
	}
	

}

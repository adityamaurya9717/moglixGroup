package employeemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Manager extends Employee{
	
	
	public Manager(String empid,String fname,String lname,double salary) {
		super(empid,fname,lname,salary);
		System.out.println("manager Constructor");
	}
	private String projectName;
	private int projectAllowance=10;
    @Override
    public double calculateSalary() {
	   // TODO Auto-generated method stub
	     return super.calculateSalary()+this.projectAllowance;
     }
	
	
}

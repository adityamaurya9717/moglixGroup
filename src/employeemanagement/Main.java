package employeemanagement;

import employeemanagement.dto.Employee;
import employeemanagement.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EmployeeService employeeService=new EmployeeService();	
		
     Employee employee=new Employee();
     employee.setEmpId("emp123");
     employee.setEmpFirstName("Aditya");
     employee.setEmpLastName("maurya");
     employee.setEmpSalary(234544.004f);
     employee.setAddress("delhi");
   String e1=  employeeService.addEmployee(employee);
     
     
   Employee emp2=new Employee();
   emp2.setEmpId("emp124");
   Employee emp3=new Employee();
   emp3.setEmpId("emp125");
   
   String e2=employeeService.addEmployee(emp2);
   String e3=employeeService.addEmployee(emp3);
   
   
   
   
   
   
   String de=employeeService.deleteEmployeeById("emp124");
   System.out.println("deletede="+de);
   
   
   Employee emp4=new Employee();
   emp4.setEmpId("emp127");
   
   employeeService.addEmployee(emp4);
   
   
   String mess=employeeService.updateEmployee(employee,"fdfd");
   System.out.println("updated status "+mess);
   
   
   
   
   
   
   
   /*  Employee e=employeeService.getEmployeeById("emp1234");
     if(e==null) {
    	 System.out.println("Employee Not exists");
     }
     else {
    	 System.out.println("Employee Exixst");
     }*/
     
     //show emp
     Employee es[]=employeeService.getEmployees();
     for (Employee employee2 : es) {
    	 if(employee2!=null)
    	 System.out.println(employee2);
		
	   }
     
    // employeeService.deleteAllEmployee();
     
     //update emp
     
      //String mess=employeeService.updateEmployee(employee,"fdfd");
	}

}

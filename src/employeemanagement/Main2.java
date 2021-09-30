package employeemanagement;

import employeemanagement.dto.Employee;
import employeemanagement.dto.Manager;

public class Main2 {
   public  final int count;
   
   public Main2() {
	count=56;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager=new Manager("em1","Aditya","maurya",557.98);
		Employee manager2=new Manager("em1","Aditya","maurya",557.98);;
      
		
		System.out.println(manager.calculateSalary());
		System.out.println(manager2.calculateSalary());
	}

}

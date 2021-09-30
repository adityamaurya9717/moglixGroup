
public class LeapYear {

	public boolean findLeapYear(int year) {
		
		if(year%4==0) {
			
			
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear lp=new LeapYear();
		int y=2020;
		boolean res=lp.findLeapYear(y);
		System.out.println(""+y+ " is Leap Year "+res);
		

	}

}

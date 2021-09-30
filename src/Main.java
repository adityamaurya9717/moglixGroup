
public class Main {
	
	public int factorial(int n) {
		int fac=1;
		for(int i=n;i>=1;i--) {
			
			fac=fac*i;
			
		}
		return fac;
		
	}
	
	
	public boolean strongnumber(int num) {
		
		int n=num;
		int newsum=0;
		while(n!=0) {
			int r=n%10;
			int x=factorial(r);
			newsum=newsum+x;
			n=n/10;
			
		}
		System.out.println(newsum);
		
		if(num==newsum)return true;
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("helo adsfsf");
       
       Main m=new Main();
       boolean res=m.strongnumber(123);
       System.out.println("result="+res);
	}

}

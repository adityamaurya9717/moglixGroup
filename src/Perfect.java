
public class Perfect {
	
	
	public boolean factors(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			  if(n%i==0) {
				  sum=sum+i;
			  }
			
			
		}
		if(n==sum) return true; 
		return false;
	} 

	public void armstrong(int n) {
		int num=n;
		double sum=0;
		while(n!=0) {
			
		int r=n%10;
		
		sum=sum+Math.pow((double)r, (double) 3);	
			n=n/10;
		}
		int a=(int) sum;
		
		if(a==num)
		System.out.println("arm strong "+a);
		else
			 System.out.println("not armstron g"+a);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Perfect p=new Perfect();
        int num=496;
        boolean res=p.factors(num);
        System.out.println(res);
        
        p.armstrong(153);
	}

}

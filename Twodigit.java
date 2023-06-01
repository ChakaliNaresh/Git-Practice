
public class Hello {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the two digit number");
	    int n=sc.nextInt();
	    int d1=n%10;
	    int d2=n/10;
	    int result=d1+d2+d1*d2;
	    if(result==n)
	    {
	    	System.out.println("it is the Special two digit number created by Nani");
	    }
	    else 
	    {
	    	System.out.println("it is not a special twow digit number created By Nani");
	 
           }
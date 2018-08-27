public class Q5
{
	public static void main(String[] x)
	{
		int i,sum=0,rev=0;
		int num=12321;
		int orig=num;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==orig)
		System.out.println("Yes "+orig+" is Pallindrome");
		else
		{
		System.out.println("Not a Pallindrome");
		}
	}
}
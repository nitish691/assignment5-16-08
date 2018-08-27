public class Q7
{
	public static void main(String[] x)
	{
		int i,rev=0;
		int num=12321;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse of a number is "+rev);
	}
}
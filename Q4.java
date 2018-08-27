public class Q4{
	public static void main(String[] x)
	{
		int a=10;
		int b=10;
		int c=10;
		if(a>b && a>c)
			System.out.println("A is greater");
		if(b>a && b>c)
			System.out.println("B is greater");
		if(c>a && c>b)
			System.out.println("C is greater");
		if(a==b && a>c)
			System.out.println("A and B are greater");
		if(b==c && b>a)
			System.out.println("B and C are greater");
		if(a==c && c>b)
			System.out.println("A and c are greater");
		if(a==b && b==c)
			System.out.println("A,B and C are equal");
	}
}
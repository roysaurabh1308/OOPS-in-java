import java.util.Scanner;
public class d2b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.: ");
		int n=sc.nextInt();
		int i;
		String s="";
		int[] a=new int[2];
		for(i=n;i>0;i/=2)
		{
			s=(i%2)+s;
		}
		System.out.println(s);
		int y=Integer.parseInt(s);
		y+=1;
		int[] o={1,2,3};
		System.out.println(y+" "+o.length);
	}
}
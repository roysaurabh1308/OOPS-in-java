
class haha
{
	static void f()
	{
		System.out.print("O");
	}
	class inn{
		void p()
		{
			System.out.print("I");
			f();
		}
	}
}

class foo extends haha
{
	
}

public class exp
{
	public static void main(String a[])
	{
		int b=9,h=1,m=8;
		System.out.print(b+h+m);
		haha j=new haha();
		haha.inn l=j.new inn();
		l.p();
		foo.f();
	}
}
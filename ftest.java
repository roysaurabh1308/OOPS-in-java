import java.lang.Math;
class pol
{
	int jok=90;
	void disp()
	{
		jok++;
		System.out.println(jok);
	}
}


class bolo{
	static int y;
	public static void main(String args[])
	{
		int x=9;
		if(x==9)
		{
			x=8;
			System.out.println(x+"$"+y);
			pol p=new pol();
			p.disp();
		}
		System.out.println(Math.pow(2,4));
	}
}
package day1112022task;

public class Staticprograms {
	 int a=3;
	 int b=5;
	 int i;
	 int j;
	
	static void values(int a,int b)
	{
		System.out.println("value of a and b");
		System.out.println(a+" "+"\n"+b);
		System.out.println();
	}
	
	static void sampleobj()
	{
		int i=8;
		int j=9;
		
		Staticprograms sobj=new Staticprograms();
		sobj.i=10;
		sobj.i=11;
		System.out.println("value of i and j :");
		System.out.println(sobj.i+"\n"+sobj.j);
		System.out.println();
	}
	
	
	
	static void run()
	{
		System.out.println("That dog is running very fast");
		System.out.println();
	}

	static{
		System.out.println("Kangaroo is running faster than dog");
		System.out.println();
	}

	void color()
	{
		System.out.println("Kangaroo color was looked like brown");
		System.out.println();
	}

	static int age(int age)
	{
		System.out.println("Kangaroo age is :");
		return age;
	}
	public static void main(String[]args)
	{
		values(88,89);
		sampleobj();
		run();
		Staticprograms sp=new Staticprograms();
		sp.color();
		System.out.println(age(3));
	}
}

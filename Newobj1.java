package Revision;

public class Newobj1 {

	public static void main(String[]args)
	{
		Doctor D1=new Doctor();
		D1.name="Mahaprabu";
		D1.age=22;
		D1.hospitalname="Maha";
		D1.area="chennai";
		D1.state="tamilnadu";


		System.out.println(D1.name
				+"\n"+D1.age
				+"\n"+D1.hospitalname
				+"\n"+D1.area
				+"\n"+D1.state);

	}
}
class Doctor{
	String name;
	int age;
	String hospitalname;
	String area;
	String state;
}


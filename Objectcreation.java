package Revision;

public class Objectcreation {
	String name;
	int age;
	String dob;
	String qualification;
	String Maritalstatus;
	void work()
	{
		System.out.println("working as Software engineer");
	}
	void hobby()
	{
		System.out.println("Content creation");
	}
	void education()
	{
		System.out.println("UG");
	}
	
	public static void main(String[] args) {
		Objectcreation O=new Objectcreation();
		O.work();
		O.hobby();
		O.education();
		
		O.name="Mahaprabu";
		O.age=22;
		O.dob="02/06/2001";
		O.qualification="Graduate";
		O.Maritalstatus="Single";
		
		
		System.out.println(O.name
				+"\n"
				+O.age
				+"\n"
				+O.dob
				+"\n"
				+O.qualification
				+"\n"
				+O.Maritalstatus);
		
	}
   	
	
	
}

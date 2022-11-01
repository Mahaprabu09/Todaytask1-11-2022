package Revision;

//create object of nurse class in main method display data present in nurse object... name: vani Age:26 Qualificatio
//create object of patients class in main method display data present in patients object...  name:suleman Bg :  o+ve age:79
//Disease : viral fever


public class Objectassignment {
	String name;
	int age;
	String Qualification;

	public static void main(String[]args)
	{
		
		Objectassignment n=new Objectassignment();
		n.name="Sharma";
		n.age=22;
		n.Qualification="BE";
		
		
		System.out.println("Doctor details :"
		        +"\n"+n.name
				+"\n"+n.age
				+"\n"+n.Qualification);
		Objectassignment1 p=new Objectassignment1();
		p.name="Sandhiya";
		p.BG="O+ve";
		p.age=22;
		p.disease="cancer";
		
		System.out.println("Patients details :"
				+"\n"+p.name
				+"\n"+p.BG
				+"\n"+p.age
				+"\n"+p.disease);	
	
	}
	}
package day37_inheritance;

public class Student extends Person{
	
	int studentid;
	String termClass;
	
	public void code(String lang) {
		
		System.out.println(name + " is coding " + lang);
	}
	
	public void attendClass() {
		
		System.out.println(name + " is attending " + termClass + " class");
	}
	
	
	

}

package day05_unary_assignment_relational_Operations;

public class typeCasting {

	public static void main(String[] args) {
		
		byte b;
		int i=81;
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		
		// c=i;  error
		c=(char)i;
		System.out.println("i = " + i + " c = " + c);
		
		
		// i=d;  error
		i=(int)d;
		System.out.println("d = "+ d + " i = " + i);
		
		
		// i=f;  error
		i=(int)f;
		System.out.println("f = " + f + " i = " + i);
		
		
		// b=d:  error
		b=(byte)d;
		System.out.println("d = " + d + " b = " + b );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

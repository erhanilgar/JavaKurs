package week03;

public class EvenNumbers {

	public static void main(String[] args) {
		
		for(int i=0; i<=1000; i+=2) {
			
				System.out.print(i + " ");			
		}
		
		System.out.println("*******");
		
		for(int i=0; i<=1000; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}

	}

}

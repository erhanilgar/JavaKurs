package lab3;

public class Question14 {

	public static void main(String[] args) {
		
		String str = "oddlyyy";
		
		if (str.length()<2) {
			System.out.println(false);
			return;
		}
		
		if (str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		

	}

}

package day08_controlFlowStatements_Part2;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		String weather= "abcd";
		
		switch (weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Go to Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");
			break;
		
		}		
		

	}

}

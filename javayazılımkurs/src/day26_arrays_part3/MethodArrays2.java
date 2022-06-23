package day26_arrays_part3;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		
		/*
		 createArray method - will accept one parameter which is arraySize
		 user will enter some cars
		 
		 
		 findCar method - will accept 2 parameters which 1- int value, toFindCar
		 if car is found - return true
		 if not return false
		 */
		
		System.out.println(findCar(4, "Honda"));	//true or false

	}
	
	public static String[] createArray (int arraySize) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] carArray = new String[arraySize];
		
				for (int i=0; i<carArray.length; i++) {
			System.out.println("Enter your car # " + (i+1));
			carArray[i] = sc.next();
		}
				return carArray;
	}
	
	public static boolean findCar(int value, String toFindCar) {
		
		for (String car : createArray(value)) {
			
			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}			
		}
		return false;
		
	}

}

package day26_arrays_part3;

import java.util.Arrays;

public class StringManipulation_Arrays {

	public static void main(String[] args) {
		
		String[] myCars = {"Honda", "Mercedes", "BMW", "Toyota", " Ford "};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2, 3));
		System.out.println(myCars[1].equals(myCars[2]));
		System.out.println(myCars[1]==myCars[2]);
		
		System.out.println("*******");
		
		for (int i=0; i<myCars.length; i++) {
			System.out.println(myCars[i].length());
		}
		
		System.out.println("*******");
		
		String str = "It will display the size of the array";
		
		String [] arr =  str.split(" ");
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		for (String value : arr) {
			System.out.println(value);
		}
		
		System.out.println();
		
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		
		

	}

}

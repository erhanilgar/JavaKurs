package lab3;

public class Question02 {

	public static void main(String[] args) {
		
		/*
		 Create a method that accepts two strings, a and b, return the
		 result of putting them together in the order abba, e.g. "Hi" and "Bye"
		 returns "HiByeByeHi". makeAbba("Hi", "Bye") - "HiByeByeHi" makeAbba("Yo",
		 "Alice") - "YoAliceAliceYo" makeAbba("What", "Up") - "WhatUpUpWhat"
		 */
		
		System.out.println( makeAbba("Hi", "Bye"));
		System.out.println( makeAbba("Bye", "Hi"));
		System.out.println( makeAbba("Yo", "Alice"));
		System.out.println( makeAbba("Ali", "Veli"));
	}

	public static String makeAbba(String str1, String str2) {
		
		return str1.concat(str2).concat(str2).concat(str1);	
		//return str1 + str2 + str2 + str1;
	}

}

package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("I'm hungry");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you hungry?");
		
		String answer = scanner.nextLine();		
		
		if (answer.equals ("yes")) {
			System.out.println("eat samosa");
		} else {
			System.out.println("do your homework");
		}
	}

}

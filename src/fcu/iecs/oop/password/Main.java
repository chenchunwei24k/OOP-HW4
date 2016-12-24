package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PasswordEncorder enc = new PasswordEncorder();
		boolean a = true;
		
		while(a){
			System.out.println("Please enter a password:");
			
			String str = scan.next();
			
			if(str.equals("exit"))	break;
			System.out.print(enc.encode(str));
			System.out.println();
			
			
		}

	}

}

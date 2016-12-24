package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		NissanTiida tiida = new NissanTiida();
		
		System.out.println("Please enter a number:");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++){
			tiida.tiida();
		}

	}

}

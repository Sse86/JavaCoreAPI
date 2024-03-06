package Coreapi;

import java.util.Scanner;
import Coreapi.DinosaurCareSystem;

public class Main {

	public static void main(String[] args) {
		DinosaurCareSystem system = new DinosaurCareSystem();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("What would you like to do?");
			System.out.println("1.Add a dinosaur");
			System.out.println("2.Log an activity");
			System.out.println("3. Exit");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 1) {
				system.addDinosaur();
		}else if(choice ==2) {
			system.logActivity();
		}else if(choice ==3) {
			break;
		}
		 

	}
        scanner.close();
 }
}
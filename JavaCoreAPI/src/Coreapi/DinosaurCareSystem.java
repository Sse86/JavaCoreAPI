package Coreapi;

import java.util.*;

public class DinosaurCareSystem {
	
	 private List<Dinosaur> dinosaurs;
	 private List<Activity> activities;
	 private Scanner scanner;
	 
	 public DinosaurCareSystem() {
		 dinosaurs = new ArrayList<>();
		 activities = new ArrayList<>();
		  scanner = new Scanner(System.in);
	 }
	 public void addDinosaur() {
		 System.out.println("Enter the name of the dinosaur:");
		 String name = scanner.nextLine();
		 
		 System.out.println("Enter the species of the dinosaur:");
		 String species = scanner.nextLine();
		 
		 System.out.println("Enter the health status of the dinosaur:");
		 String healthStatus = scanner.nextLine();
		 
		 Dinosaur dinosaur = new Dinosaur(name,species,healthStatus);
		 dinosaurs.add(dinosaur);
		 System.out.println("Dinosaur added successfully.");
	 }
	 public void logActivity() {
		 System.out.println("Enter the name of the activity:");
		 String name = scanner.nextLine();
		 
		 System.out.println("Enter the date of the activity:");
		 String date = scanner.nextLine();
		 
		 System.out.println("Select a dinosaur for the activity:");
		 for(int i=0;i<dinosaurs.size();i++) {
			 System.out.println((i+1)+". "+dinosaurs.get(i).getName());
		 }
		 int dinosaurIndex = scanner.nextInt()-1;
		 scanner.nextLine();
		 if(dinosaurIndex<0 || dinosaurIndex >=dinosaurs.size()) {
			 System.out.println("Invalid selection.");
			 return;
		 }
		 Dinosaur selectedDinosaur = dinosaurs.get(dinosaurIndex);
		 Activity activity = new Activity(name,date,selectedDinosaur);
		 activities.add(activity);
		 System.out.println("Activity logged successfully.");
	 }

}

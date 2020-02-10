package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		System.out.println("Welcome to Dayton Virtual Pet Program for All, (DVPPA)");
		System.out.println("Please select a number for a theme associated with pet inventory: ");
		System.out.println("1) Walt Disney");
		System.out.println("2) Malvel");
		System.out.println("3) Paramount");
		String themeChosen = input.nextLine();

		if (themeChosen.equals("1")) {
			myShelter.addPet(new VirtualPet("Bolt", "Superhero Dog", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Bunny", "Rabbit Police Officer ", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Simba", "Lion King", 15, 15, 15, 15));
		}
		if (themeChosen.equals("2")) {
			myShelter.addPet(new VirtualPet("Gazelle", "Pop Star Giraffe", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Ariel", "The Little Mermaid", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Farcon", "Farco Bird", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Babe", "Pig raised by sheepdog", 15, 15, 15, 15));
		}
		if (themeChosen.equals("3")) {
			myShelter.addPet(new VirtualPet("Mr Big", "Crime Mafia Boss Rat", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Duluth", "DragonFyl Eagle", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Chief Bogo", "Chief Police Officer", 15, 15, 15, 15));
			myShelter.addPet(new VirtualPet("Mickey", "Mouse", 15, 15, 15, 15));
		}

		String option = "";
		
		while (!option.equals("Quit")) {
			
			System.out.println("Virtual Pet inventory:");
			System.out.print("\tname\t");
			System.out.print("| description \t\t");
			System.out.print("| hunger \t");
			System.out.print("| thirst \t");
			System.out.print("| bathroom \t");
			System.out.print("| energy \t");
			System.out.print("| status \t");
			System.out.println();
			System.out.println(
					"----------------|-----------------------|---------------|---------------|---------------|---------------|---------------");
			myShelter.showPets();
			System.out.println();

			// game menu
			System.out.println("Please choose what would you like to do");
			System.out.println("1) Feed all the Pets.");
			System.out.println("2) Water all the Pets.");
			System.out.println("3) Let all the Pets to go to the bathroom .");
			System.out.println("4) Let all the Pets Play.");
			System.out.println("5) Play with just one Pet.");
			System.out.println("6) Choose a Pet to leave DVPPA to be adopted.");
			System.out.println("7) Invite a new Pet to DVPPA Program.");
			System.out.println("Or type 'quit' to exit this game.");
			
			option = input.nextLine();

			if (option.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You have chosen to feed all the Pets.");
			}
			if (option.equals("2")) {
				myShelter.waterAllPets();
				System.out.println(
						"You have chosen to water all the Pets. Now need to go to the bathroom has increased.");
			}
			if (option.equals("3")) {
				myShelter.letOutAllPets();
				System.out.println("You have chosen to let all the Pets go to the bathroom.");
			}
			if (option.equals("4")) {
				myShelter.playWithAllPets();
				System.out.println("You have chosen to play with all the Pets.");
			}
			if (option.equals("5")) {
				System.out.println("Which Pet would you like to play with? please Type a name:");
				String petChosen = input.nextLine();
				myShelter.playWithPetByName(petChosen);
				System.out.println("You have chosen to play with " + petChosen);
			}
			if (option.equals("6")) {
				System.out.println("Which Pet would you like to be adopted in DVPPA? Please Type name:");
				String petChosen = input.nextLine();
				myShelter.adoptPet(petChosen);
				System.out.println("You have chosen to send " + petChosen + " to a new home.");
			}
			if (option.equals("7")) {
				System.out.println("Please enter the name of the Pet you would like to add:");
				String petName = input.nextLine();
				System.out.println("Please enter a brief description of the Pet you would like to admit:");
				String petDescription = input.nextLine();
				myShelter.addPet(new VirtualPet(petName, petDescription));
				System.out.println("You have added " + petName + " the " + petDescription + " to DVPPA.");
			}
			if (option.equalsIgnoreCase("Quit")) {
				System.out.println("Goodbye!!!");
				
				input.close();
				
				System.exit(0);
			}
			myShelter.tickAllPets();
		}
	}
}

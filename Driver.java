// Project Pet bag 
// IT 145
// Created by Darren Nason
// Main method Driver.java file


import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    // Create ArrayLists for both Dog & Monkey
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // Instance variables (if needed)
    private static String menuChoice;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();


        // Menu Loop created 
         while(true){
            displayMenu();
            menuChoice = input.nextLine();
            if (menuChoice.equalsIgnoreCase("q")) {
                break;
            } else if(menuChoice.equals("1")) {
                intakeNewDog(input);
            } else if(menuChoice.equals("2")) {
                intakeNewMonkey(input);
            } else if(menuChoice.equals("3")) {
                reserveAnimal(input);
            } else if(menuChoice.equals("4")) {
                printAnimals();
            } else if(menuChoice.equals("5")) {
                printAnimals();
            } else if(menuChoice.equals("6")) {
                printAnimals();
            } else {
                System.out.println("Invalid selection please choose from the following"); // validates user input for correct entry
            }
        }
    }
    
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection: ");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
      Monkey monkey1 = new Monkey("Dolphine", "Female", "6", "50.6", "6", "20.3", "10.1", "capuchin", "05-12-2019", "United States", "intake", false, "United States");
      Monkey monkey2 = new Monkey("Blaze", "Male", "2", "82.7",  "4", "24.7", "11.6", "guenon", "02-19-2022", "United States", "phase 1", true, "United Kingdom");       

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
    }


    // Completed the intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog : dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        } 
                // Instatiates new dog with new attributes and adds the dog to the list
                Dog newDog = new Dog();
                newDog.setName(name);

                System.out.println("What is the dog's breed? ");
                newDog.setBreed(scanner.nextLine());

                System.out.println("What is the dog's gender?");
                newDog.setGender(scanner.nextLine());

                System.out.println("What is the dog's age?");
                newDog.setAge(scanner.nextLine());

                System.out.println("What is the dog's weight?");
                newDog.setWeight(scanner.nextLine());

                System.out.println("What date did you acquire this dog? Enter the following format mm/dd/yyyy: ");
                newDog.setAcquisitionDate(scanner.nextLine());

                System.out.println("Where did this dog get acquired?");
                newDog.setAcquisitionLocation(scanner.nextLine());

                System.out.println("What is this dog's training status?");
                newDog.setTrainingStatus(scanner.nextLine());

                System.out.println("Has this dog been reserved?");
                if (scanner.nextLine().equals("yes")){
                    newDog.setReserved(true);
                } else {
                    newDog.setReserved(false);
                }
                System.out.println("What country is the dog in service for?");
                newDog.setInServiceCountry(scanner.nextLine());

                // Adds dog to the arrayList
                dogList.add(newDog);

                System.out.println("Your dog has been added to the system");
                return; // Returns to menu
            }


        // Completed intakeNewMonkey

        public static void intakeNewMonkey(Scanner scanner) {
            System.out.print("What is the monkey's name? \n");
            String name = scanner.nextLine();
            for(Monkey monkey : monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
                // Instatiates new monkey sets the attributes and adds the monkey to the list
                 
                    Monkey newMonkey = new Monkey();

                    newMonkey.setName(name);

                    System.out.println("What is the monkey's gender?");
                    newMonkey.setGender(scanner.nextLine());

                    System.out.println("What is the monkey's age?");
                    newMonkey.setAge(scanner.nextLine());

                    System.out.println("What is the monkey's weight?");
                    newMonkey.setWeight(scanner.nextLine());

                    System.out.println("What's the length of the monkey's tail?");
                    newMonkey.setTailLength(scanner.nextLine());

                    System.out.println("What is the monkey's height?");
                    newMonkey.setMonkeyHeight(scanner.nextLine());

                    System.out.println("What is the body length of the monkey?");
                    newMonkey.setMonkeyBodyLength(scanner.nextLine());

                    System.out.println("What species of monkey is this?");
                    newMonkey.setMonkeySpecies(scanner.nextLine());

                    System.out.println("What date did you acquire this monkey? Enter the following format mm/dd/yyyy: ");
                    newMonkey.setAcquisitionDate(scanner.nextLine());

                    System.out.println("Where did this monkey get acquired?");
                    newMonkey.setAcquisitionLocation(scanner.nextLine());

                    switch (newMonkey.getMonkeySpecies()) {
                        case "capuchin":
                        case "guenon":
                        case "macaque":
                        case "marmoset":
                        case "squirrel monkey":
                        case "tamarin":
                            System.out.println("What is this monkey's training status?");
                            newMonkey.setTrainingStatus(scanner.nextLine());
                            break;
                        default:
                            break;
                    }

                    System.out.println("Has this monkey been reserved?");
                    if (scanner.nextLine().equals("yes")){
                        newMonkey.setReserved(true);
                    } else {
                        newMonkey.setReserved(false);
                    }

                    System.out.println("What country is the monkey in service for?");
                    newMonkey.setInServiceCountry(scanner.nextLine());
                    
                    // Adds monkey to the arrayList
                    monkeyList.add(newMonkey);
                    System.out.println("Your monkey has been added to the system");
                    return; // Returns to menu   
                }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {

            // outputs the dogs that are at the facility
            if(menuChoice.equalsIgnoreCase("4")){
            System.out.println("These are the dog's we have: " + dogList);

            // outputs the monkeys at the facility
            } else if(menuChoice.equalsIgnoreCase("5")){
                System.out.println("These are the monkey's we have " + monkeyList);
            
            // outputs all animals at the facility    
            } else if(menuChoice.equalsIgnoreCase("6")){
                System.out.println("\nThese are the animals that haven't been reserved: \n");
                for (Dog dog : dogList) {
                    if (!dog.getReserved()) {
                        System.out.print(dog);
                        }
                    }
                // Grab all monkeys that have getReserved() equals false
                for (Monkey monkey : monkeyList) {
                    if (!monkey.getReserved()) {
                        System.out.print(monkey);
                        }
                        return;
                    }
                        
            } else {
                System.out.println("Error in order to see the animals please enter: dog, monkey, or all. Thank you!");
            }
            return;
        }
}

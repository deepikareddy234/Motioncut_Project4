package Motioncut_Project4;

import java.util.Scanner;
//Text-based adventure game
public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to The Treasure Hunt!");

        System.out.println("You find yourself at the entrance of a mysterious castle rumored to hold untold riches. Are you ready to begin your quest? (yes/no)");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("You step into the castle, torch in hand, ready to uncover its secrets.");
            exploreCastle(scanner);
        } else {
            System.out.println("You decide not to embark on this adventure. Perhaps another time...");
        }
    }

    public static void exploreCastle(Scanner scanner) {
        System.out.println("You enter the castle's foyer, the air thick with dust and the scent of ancient stone.");
        System.out.println("In front of you are four doors, each leading to a different room.");
        System.out.println("Which door do you choose? (1/2/3/4)");
        int doorChoice = getValidIntInput(scanner, 1, 4);

        switch (doorChoice) {
            case 1:
                System.out.println("You open the door and enter a dimly lit hallway.");
                System.out.println("As you walk down the hallway, you trip over a hidden pressure plate and fall into a pit trap!");
                System.out.println("You find yourself back at the entrance of the castle. Try again!");
                exploreCastle(scanner);
                break;
            case 2:
                System.out.println("You open the door and step into a dusty library filled with old books.");
                System.out.println("After searching through the shelves, you find a hidden lever behind a book titled 'The Lost Chronicles'.");
                System.out.println("You pull the lever, and a secret door opens to reveal a treasure chest!");
                System.out.println("Congratulations! You've found the treasure room and claimed the riches within!");
                break;
            case 3:
                System.out.println("You open the door and find yourself in a dark chamber filled with spider webs.");
                System.out.println("You hear a faint clicking sound and realize you've triggered a trap!");
                System.out.println("Poison darts shoot out from the walls, and you= narrowly dodge them.");
                System.out.println("You decide it's too dangerous to continue and retreat back to the foyer.");
                exploreCastle(scanner);
                break;
            case 4:
                System.out.println("You open the door and enter a vast hall adorned with portraits of long-forgotten nobility.");
                System.out.println("Suddenly, a ghostly apparition materializes before you, its wailing voice echoing through the hall.");
                System.out.println("What do you do? (1. Confront the ghost / 2. Flee the hall / 3. Ignore the ghost)");
                int action = getValidIntInput(scanner, 1, 3);
                if (action == 1) {
                    System.out.println("You bravely confront the ghost, demanding answers about the castle's secrets.");
                    System.out.println("The ghost reveals the location of a hidden passage leading to the treasure room before vanishing into the ether.");
                    System.out.println("With the ghost's guidance, you successfully find the treasure room and claim the riches within!");
                } else if (action == 2) {
                    System.out.println("You flee the hall in terror, your heart pounding with fear.");
                    System.out.println("As you run, you stumble upon a hidden passage that leads to the treasure room!");
                    System.out.println("You've found the treasure room and claimed the riches within!");
                } else {
                    System.out.println("You ignore the ghost and continue exploring the hall, hoping to find another way to the treasure room.");
                    exploreCastle(scanner);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a door (1/2/3/4).");
                exploreCastle(scanner);
        }
    }

    public static int getValidIntInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return input;
    }
}

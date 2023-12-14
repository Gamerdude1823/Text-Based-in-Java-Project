import java.util.Scanner;

public class ChroniclesOfEldoria {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Chronicles of Eldoria!");
        System.out.println("Your quest is to retrieve the legendary Crystal of Lumina.");

        // Chapter 1: The Enchanted Forest
        System.out.println("\nChapter 1: The Enchanted Forest");
        System.out.println("You stand at the entrance of the Enchanted Forest.");
        Thread.sleep(1000); // Introducing a delay

        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");
        System.out.println("3. Examine the surroundings before deciding.");

        System.out.print("Your choice: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            // Chapter 2: The Mysterious Clearing
            System.out.println("\nChapter 2: The Mysterious Clearing");
            System.out.println("As you venture deeper, you come across a mysterious clearing with a sparkling pond.");
            Thread.sleep(1000);

            System.out.println("1. Friendly fairy.");
            System.out.println("2. Enigmatic unicorn.");
            System.out.println("3. Sly nymph.");

            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                // Chapter 3: The Guardian's Riddle
                System.out.println("\nChapter 3: The Guardian's Riddle");
                System.out.println("The friendly fairy presents a riddle:");
                Thread.sleep(1000);

                System.out.println("1. An echo.");
                System.out.println("2. A river.");
                System.out.println("3. A shadow.");

                System.out.print("Your choice: ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    // Chapter 4: The Bridge of Whispers
                    System.out.println("\nChapter 4: The Bridge of Whispers");
                    System.out.println("The fairy guides you to the mystical Bridge of Whispers.");
                    Thread.sleep(1000);

                    System.out.println("1. A riddle.");
                    System.out.println("2. A trade of one of your belongings.");
                    System.out.println("3. A story from your past.");

                    System.out.print("Your choice: ");
                    choice = scanner.nextInt();

                    if (choice == 2) {
                        // Chapter 5: The Whispering Willows
                        System.out.println("\nChapter 5: The Whispering Willows");
                        System.out.println("You successfully pass the Bridge of Whispers and find yourself in a grove of ancient willow trees.");
                        Thread.sleep(1000);

                        System.out.println("1. Enter the hidden door.");
                        System.out.println("2. Climb the tallest willow to get a better view.");
                        System.out.println("3. Inspect the area for any hidden clues.");

                        System.out.print("Your choice: ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                            // Chapter 6: The Crystal Chamber
                            System.out.println("\nChapter 6: The Crystal Chamber");
                            System.out.println("Upon entering the hidden door, you discover a chamber filled with the ethereal glow of the Crystal of Lumina.");
                            Thread.sleep(1000);

                            System.out.println("1. Use the enchanted key you found earlier.");
                            System.out.println("2. Cast a spell you learned from the friendly fairy.");
                            System.out.println("3. Convince the guardian spirit of the crystal to let you through.");

                            System.out.print("Your choice: ");
                            choice = scanner.nextInt();

                            if (choice == 1) {
                                // Chapter 7: The Confrontation
                                System.out.println("\nChapter 7: The Confrontation");
                                System.out.println("As you reach for the Crystal of Lumina, a dark sorcerer appears, claiming the crystal as their own.");
                                Thread.sleep(1000);

                                System.out.println("1. Engage in a magical duel.");
                                System.out.println("2. Try to negotiate and share the crystal's power.");
                                System.out.println("3. Attempt a swift escape with the crystal.");

                                System.out.print("Your choice: ");
                                choice = scanner.nextInt();

                                if (choice == 1) {
                                    // Chapter 8: The Conclusion
                                    System.out.println("\nChapter 8: The Conclusion");
                                    System.out.println("The battle is intense, and the fate of Eldoria hangs in the balance.");
                                    Thread.sleep(1000);

                                    System.out.println("1. Embrace the crystal's power to defeat the sorcerer.");
                                    System.out.println("2. Find a way to trap the sorcerer without using the crystal.");
                                    System.out.println("3. Sacrifice the crystal to save Eldoria without resorting to violence.");

                                    System.out.print("Your choice: ");
                                    choice = scanner.nextInt();

                                    // Display the ending based on the player's choice
                                    if (choice == 1) {
                                        System.out.println("\nCongratulations! You embraced the crystal's power and defeated the sorcerer. Eldoria is saved!");
                                    } else if (choice == 2) {
                                        System.out.println("\nCongratulations! You found a clever way to trap the sorcerer without using the crystal. Eldoria is saved!");
                                    } else if (choice == 3) {
                                        System.out.println("\nCongratulations! You sacrificed the crystal to save Eldoria without resorting to violence. The realm is grateful for your selflessness!");
                                    }
                                } else {
                                    System.out.println("Game over! Your choice led to Eldoria's doom.");
                                }
                            } else {
                                System.out.println("Game over! Your choice led to Eldoria's doom.");
                            }
                        } else {
                            System.out.println("Game over! Your choice led to Eldoria's doom.");
                        }
                    } else {
                        System.out.println("Game over! Your choice led to Eldoria's doom.");
                    }
                } else {
                    System.out.println("Game over! Your choice led to Eldoria's doom.");
                }
            } else {
                System.out.println("Game over! Your choice led to Eldoria's doom.");
            }
        } else {
            System.out.println("Game over! Your choice led to Eldoria's doom.");
        }
        scanner.close();
    }
}

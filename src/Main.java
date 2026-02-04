import java.util.Random;
import java.util.Scanner;

public class Main {
    // Move Naratorsanity to class level so it can be accessed by both methods
    private static int Naratorsanity = 0;
    private static int playerScore = 0;
    private static int CPUscore = 0;

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        // Show introduction only once at the beginning
        showIntroduction();
        playGame(myInput);
        myInput.close(); // Close scanner only once at the end
        System.out.println("Thank you for sparing the world today");
    }

    public static void showIntroduction() {
        System.out.println("This... Is a game...");
        System.out.println();
        System.out.println();
        System.out.println("TIBET is the name...");
        System.out.println();
        System.out.println();
        System.out.println("Now go forth and pick your champion");
    }

    public static void playGame(Scanner myInput) {
        boolean guessnow = true;
        boolean Rock = false;
        boolean Paper = false;
        boolean Scissors = false;
        boolean Lizard = false;
        boolean Spock = false;
        boolean cpurock = false;
        boolean cpupaper = false;
        boolean cpuScissors = false;
        boolean cpuLizard = false;
        boolean cpuspock = false;
        boolean tie = false;

        int min = 1;
        int max = 5;

        Random rand = new Random();
        // nextInt((max - min) + 1) + min
        int randomNum = rand.nextInt((max - min) + 1) + min;

        System.out.println("Type words Rock,     paper,     Scissors,    Lizard,     or Spock");

        // Read the actual input string from the scanner
        String userInput = myInput.nextLine().trim().toLowerCase();

        do {
            if (userInput.equals("Rock")) {
                Rock = true;
                System.out.println("You chose Rock");
                guessnow = false;
            } else if (userInput.equals("paper")) {
                Paper = true;
                System.out.println("You chose paper");
                guessnow = false;
            } else if (userInput.equals("Scissors")) {
                Scissors = true;
                System.out.println("You chose Scissors");
                guessnow = false;
            } else if (userInput.equals("Lizard")) {
                Lizard = true;
                System.out.println("You chose Lizard?");
                guessnow = false;
            } else if (userInput.equals("Spock")) {
                Spock = true;
                System.out.println("You chose Mexican Spock!!!");
                guessnow = false;
            } else {
                System.out.println("That option is not allowed in TIBET");
                userInput = myInput.nextLine().trim().toLowerCase(); // Ask for input again
            }
        } while (guessnow);

        // Reset all CPU choice flags
        cpurock = cpupaper = cpuScissors = cpuLizard = cpuspock = false;

        if (randomNum == 1) {
            cpurock = true;
            System.out.println("CPU chose Rock");
        }
        if (randomNum == 2) {
            cpupaper = true;
            System.out.println("CPU chose Paper");
        }
        if (randomNum == 3) {
            cpuScissors = true;
            System.out.println("CPU chose Scissors");
        }
        if (randomNum == 4) {
            cpuLizard = true;
            System.out.println("CPU chose Lizard");
        }
        if (randomNum == 5) {
            cpuspock = true;
            System.out.println("CPU chose Spock");
        }

        if (cpurock) {
            if (Rock) {
                System.out.println("You both used Rock which created a cannon event where they met and merged into 1");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("its a tie.");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("go again.");
                Naratorsanity++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
                tie = true;
            } else if (Paper) {
                System.out.println("Paper wakes up and slams Rock in the face with her alarm clock (while it is still ringing)");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Scissors) {
                System.out.println("Rock turns Scissors into a tree and chops her down using a mechanical beauty blender");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Lizard) {
                System.out.println("Rock waterboards Lizard");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Spock) {
                System.out.println("Spock delivers Rock's child and uses it as a bowling ball to turn dust into dust");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpupaper) {
            if (Rock) {
                System.out.println("Paper wakes up and slams Rock in the face with her alarm clock (while it is still ringing)");
                Naratorsanity++;
            } else if (Paper) {
                System.out.println("You both used Paper causing their hair to tange with each other until their heads colides knocking them both out at the same time. ");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("its a tie.");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("go again.");
                Naratorsanity++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
                tie = true;
            } else if (Scissors) {
                System.out.println("Scissors death stares Paper sending her to the spirit realm");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Lizard) {
                System.out.println("Lizard regurgitates radioactive vomit on Paper");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Spock) {
                System.out.println("Paper teaches Spock the secrets on the deep universe which causes Spock to spontainiously combust");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpuScissors) {
            if (Rock) {
                System.out.println("Rock turns Scissors into a tree and chops her down using a mechanical beauty blender");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Paper) {
                System.out.println("Scissors death stares Paper sending her to the spirit realm");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Scissors) {
                System.out.println("You both used Scissors,   they both transmorph into deaformed mentally ill crows ");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("its a tie.");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("go again.");
                Naratorsanity++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
                tie = true;
            } else if (Lizard) {
                System.out.println("Scissors puts Lizard in an exaust pipe");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Spock) {
                System.out.println("Spock plays mindgames with Scissors");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpuLizard) {
            if (Rock) {
                System.out.println("Rock waterboards Lizard");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Paper) {
                System.out.println("Lizard regurgitates radioactive vomit on Paper");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Scissors) {
                System.out.println("Scissors puts Lizard in an exaust pipe");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Lizard) {
                System.out.println("You both used Lizard,   they drooled so much it flodded the world causing both to drown (slowly and painfully ...) ");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("its a tie.");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("go again.");
                Naratorsanity++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
                tie = true;
            } else if (Spock) {
                System.out.println("Spock absorbes the soul of the Lizard turning it into salt that Elliott uses to season himself");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpuspock) {
            if (Rock) {
                System.out.println("Spock delivers Rock's child and uses it as a bowling ball to turn rock into dust");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Paper) {
                System.out.println("Paper teaches Spock the secrets on the deep universe which causes Spock to spontainiously combust");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Scissors) {
                System.out.println("Spock plays mindgames with Scissors");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Lizard) {
                System.out.println("Spock absorbes the soul of the Lizard turning it into salt that Elliott uses to season himself");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Spock) {
                System.out.println("You both used Spock,   two mexican Spocks hide under a costco shelf eat all of the samples and Explode due to over eating");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("its a tie.");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("go again.");
                Naratorsanity++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
                tie = true;
            }
        }

        // If it's a tie,  play again
        if (tie) {
            playGame(myInput); // Restart the game with same scanner
            return; // Exit current instance
        }

        // Play again logic
        System.out.println("Do wish to see a diffrenet option? (Yes/No)");
        String answer = myInput.nextLine().trim(); // Use existing scanner

        // Check if the answer starts with 'Y' or 'y'
        if (answer.length() > 0 && (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y')) {
            playGame(myInput); // Restart the game with same scanner
        }
    }
}
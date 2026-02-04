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
        boolean Tot = false;
        boolean Izzy = false;
        boolean Emma = false;
        boolean baby = false;
        boolean tetra = false;
        boolean cpuTot = false;
        boolean cpuIzzy = false;
        boolean cpuEmma = false;
        boolean cpubaby = false;
        boolean cputetra = false;
        boolean tie = false;

        int min = 1;
        int max = 5;

        Random rand = new Random();
        // nextInt((max - min) + 1) + min
        int randomNum = rand.nextInt((max - min) + 1) + min;

        System.out.println("Type words Tot,     Izzy,     Emma,     baby,     or tetra");

        // Read the actual input string from the scanner
        String userInput = myInput.nextLine().trim().toLowerCase();

        do {
            if (userInput.equals("tot")) {
                Tot = true;
                System.out.println("You chose Tot");
                guessnow = false;
            } else if (userInput.equals("izzy")) {
                Izzy = true;
                System.out.println("You chose Izzy");
                guessnow = false;
            } else if (userInput.equals("emma")) {
                Emma = true;
                System.out.println("You chose Emma");
                guessnow = false;
            } else if (userInput.equals("baby")) {
                baby = true;
                System.out.println("You chose baby?");
                guessnow = false;
            } else if (userInput.equals("tetra")) {
                tetra = true;
                System.out.println("You chose Mexican tetra!!!");
                guessnow = false;
            } else {
                System.out.println("That option is not allowed in TIBET");
                userInput = myInput.nextLine().trim().toLowerCase(); // Ask for input again
            }
        } while (guessnow);

        // Reset all CPU choice flags
        cpuTot = cpuIzzy = cpuEmma = cpubaby = cputetra = false;

        if (randomNum == 1) {
            cpuTot = true;
            System.out.println("CPU chose Tot");
        }
        if (randomNum == 2) {
            cpuIzzy = true;
            System.out.println("CPU chose Izzy");
        }
        if (randomNum == 3) {
            cpuEmma = true;
            System.out.println("CPU chose Emma");
        }
        if (randomNum == 4) {
            cpubaby = true;
            System.out.println("CPU chose baby");
        }
        if (randomNum == 5) {
            cputetra = true;
            System.out.println("CPU chose tetra");
        }

        if (cpuTot) {
            if (Tot) {
                System.out.println("You both used Tot which created a cannon event where they met and merged into 1");
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
            } else if (Izzy) {
                System.out.println("izzy wakes up and slams tot in the face with her alarm clock (while it is still ringing)");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Emma) {
                System.out.println("Tot turns Emma into a tree and chops her down using a mechanical beauty blender");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (baby) {
                System.out.println("Tot waterboards Baby");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (tetra) {
                System.out.println("tetra delivers tot's child and uses it as a bowling ball to turn dust into dust");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpuIzzy) {
            if (Tot) {
                System.out.println("izzy wakes up and slams tot in the face with her alarm clock (while it is still ringing)");
                Naratorsanity++;
            } else if (Izzy) {
                System.out.println("You both used Izzy causing their hair to tange with each other until their heads colides knocking them both out at the same time. ");
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
            } else if (Emma) {
                System.out.println("emma death stares izzy sending her to the spirit realm");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (baby) {
                System.out.println("baby regurgitates radioactive vomit on izzy");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (tetra) {
                System.out.println("izzy teaches tetra the secrets on the deep universe which causes tetra to spontainiously combust");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpuEmma) {
            if (Tot) {
                System.out.println("Tot turns Emma into a tree and chops her down using a mechanical beauty blender");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Izzy) {
                System.out.println("emma death stares izzy sending her to the spirit realm");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Emma) {
                System.out.println("You both used Emma,   they both transmorph into deaformed mentally ill crows ");
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
            } else if (baby) {
                System.out.println("emma puts baby in an exaust pipe");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (tetra) {
                System.out.println("Tetra plays mindgames with emma");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cpubaby) {
            if (Tot) {
                System.out.println("Tot waterboards Baby");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Izzy) {
                System.out.println("baby regurgitates radioactive vomit on izzy");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Emma) {
                System.out.println("emma puts baby in an exaust pipe");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (baby) {
                System.out.println("You both used baby,   they drooled so much it flodded the world causing both to drown (slowly and painfully ...) ");
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
            } else if (tetra) {
                System.out.println("Tetra absorbes the soul of the baby turning it into salt that Elliott uses to season himself");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            }
        }

        if (cputetra) {
            if (Tot) {
                System.out.println("tetra delivers tot's child and uses it as a bowling ball to turn rock into dust");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Izzy) {
                System.out.println("izzy teaches tetra the secrets on the deep universe which causes tetra to spontainiously combust");
                Naratorsanity++;
                playerScore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (Emma) {
                System.out.println("Tetra plays mindgames with emma");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (baby) {
                System.out.println("Tetra absorbes the soul of the baby turning it into salt that Elliott uses to season himself");
                Naratorsanity++;
                CPUscore++;
                System.out.println("CPU:" +CPUscore);
                System.out.println("You:" +playerScore);
            } else if (tetra) {
                System.out.println("You both used tetra,   two mexican tetras hide under a costco shelf eat all of the samples and Explode due to over eating");
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
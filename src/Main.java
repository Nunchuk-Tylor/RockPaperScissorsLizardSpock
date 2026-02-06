import java.util.Random;
import java.util.Scanner;

public class Main {
    // Achievements
    private static int paperCount = 0;     // Use Paper 20 times
    private static int scissorCount = 0;   // Use Scissor 20 times
    private static int rockCount = 0;      // Use Rock 20 times
    private static int lizardCount = 0;    // Use Lizard 20 times
    private static int spockCount = 0;     // Use Spock 20 times
    private static int losses = 0;         // Lose 10 times/ Lose 20 times
    private static int wins = 0;           // Win 10 times/ Win 20 times
    private static int winStreak = 0;      // Win Streak of 5/ Win streak of 10
    private static int loseStreak = 0;     // Lose Streak of 10


    // Game Score
    private static int playerScore = 0;
    private static int cpuScore = 0;


    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        // Show introduction only once at the beginning
        showIntroduction();
        playGame(myInput);
        myInput.close(); // Close scanner only once at the end
        System.out.println("Thank you for sparing the world today");
    }

    // The Intro Text
    public static void showIntroduction() {
        System.out.println(">>=============================================<<");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println("||    ____    ____    ____     ____   _        ||");
        System.out.println("||   / ___|  |  _ \\  |  _ \\   / ___| | |       ||");
        System.out.println("||   \\___ \\  | |_) | | |_) |  \\___\\  | |       ||");
        System.out.println("||    ___) | |  __/  |  _ <  ___) |  | |___    ||");
        System.out.println("||   |____/  |_|     |_| \\_\\|____/   |_____|   ||");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println(">>=============================================<<");
        System.out.println("This... Is a game...");
        System.out.println();
        System.out.println();
        System.out.println("SPRSL is the name...");
        System.out.println();
        System.out.println();
        System.out.println("Now go forth and pick your champion");
    }

    // Check and display achievements
    public static void checkAchievements() {
        if (paperCount == 20) {
            System.out.println("You Earned the Achievement for using Paper 20 times");
            System.out.println("--Paper King--");
        }
        if (scissorCount == 20) {
           System.out.println("You Earned the Achievement for using Scissors 20 times");
            System.out.println("--Scissor King--");
        }
        if (rockCount == 20) {
            System.out.println("You earned the achievement for using Rock 20 times");
            System.out.println("-- Rock King --");
        }
        if (lizardCount == 20) {
            System.out.println("You earned the achievement for using Lizard 20 times");
            System.out.println("-- Lizard King --");
        }
        if (spockCount == 20) {
            System.out.println("You earned the achievement for using Spock 20 times");
            System.out.println("-- Spock King --");
        }
        if (losses == 10) {
            System.out.println("You earned the achievement for losing 10 times");
            System.out.println("-- Real Loser --");
        }
        if (losses == 20) {
            System.out.println("You earned the achievement for losing 20 times");
            System.out.println("-- Ultimate Loser --");
        }
        if (wins == 10) {
            System.out.println("You earned the achievement for winning 10 times");
            System.out.println("-- Beginners Luck --");
        }
        if (wins == 20) {
            System.out.println("You earned the achievement for winning 20 times");
            System.out.println("-- Big Hot --");
        }
        if (winStreak == 5) {
            System.out.println("You earned the achievement for a winning streak of 5");
            System.out.println("-- Lucky Guy --");
        }
        if (winStreak == 10) {
            System.out.println("You earned the achievement for a winning streak of 10");
            System.out.println("-- Street King --");
        }
        if (loseStreak == 20) {
            System.out.println("You earned the achievement for a losing streak of 20");
            System.out.println("-- No Hope --");
        }
    }

    public static void playGame(Scanner myInput) {
        boolean guessNow = true; //allows player to guess
        //Player choices
        boolean rock = false;
        boolean paper = false;
        boolean scissors = false;
        boolean lizard = false;
        boolean spock = false;
        boolean cpuRock = false;
        //Computer choices
        boolean cpuPaper = false;
        boolean cpuScissors = false;
        boolean cpuLizard = false;
        boolean cpuSpock = false;
        //Game tie
        boolean tie = false;

        //Random number generator
        int min = 1;
        int max = 5;
        Random rand = new Random();
        // nextInt((max - min) + 1) + min
        int randomNum = rand.nextInt((max - min) + 1) + min;

        //asking players to start
        System.out.println("Type words Rock, Paper, Scissors, Lizard, or Spock");

        // Read the actual input string from the scanner
        String userInput = myInput.nextLine().trim().toLowerCase();

        do {// seeing what the paper put as their choice
            if (userInput.equals("rock")) {
                rock = true;
                System.out.println("You chose Rock");
                // Display Rock ASCII art
                System.out.println("    _______");
                System.out.println("---'   ____)____");
                System.out.println("          ______)");
                System.out.println("       __________)");
                System.out.println("      (____)");
                System.out.println("---.__(___)");
                rockCount++;
                guessNow = false;
            } else if (userInput.equals("paper")) {
                paper = true;
                System.out.println("You chose Paper");
                // Display Paper ASCII art
                System.out.println("    _______");
                System.out.println("---'    ____)____");
                System.out.println("           ______)");
                System.out.println("          _______)");
                System.out.println("         _______)");
                System.out.println("---.__________)");
                paperCount++;
                guessNow = false;
            } else if (userInput.equals("scissors")) {
                scissors = true;
                System.out.println("You chose Scissors");
                // Display Scissors ASCII art
                System.out.println("    _______");
                System.out.println("---'   ____)____");
                System.out.println("          ______)");
                System.out.println("       __________)");
                System.out.println("      (____)");
                System.out.println("---.__(___)");
                scissorCount++;
                guessNow = false;
            } else if (userInput.equals("lizard")) {
                lizard = true;
                System.out.println("You chose Lizard");
                // Display Lizard ASCII art
                System.out.println("---.__________");
                System.out.println("        _______)");
                System.out.println("---.______)");
                lizardCount++;
                guessNow = false;
            } else if (userInput.equals("spock")) {
                spock = true;
                System.out.println("You chose Spock");
                // Display Spock ASCII art
                System.out.println("    ⌠⌒|");
                System.out.println(" ⌠⌒⌉| |   ◜﹆◜﹆");
                System.out.println(" | ||⩧|  / // /");
                System.out.println(" |_|| | /-//=/");
                System.out.println(" | || |/ // /");
                System.out.println(" ( || | // /");
                System.out.println(" |         .______");
                System.out.println(" |         __⫫____)");
                System.out.println("  |       |");
                spockCount++;
                guessNow = false;
            } else {
                System.out.println("That option is not allowed in SPRAL");
                userInput = myInput.nextLine().trim().toLowerCase(); // Ask for input again
            }
        } while (guessNow);

        // Reset all CPU choices again for good measure
        cpuRock = cpuPaper = cpuScissors = cpuLizard = cpuSpock = false;

        // using random number generator to pick cpu choice
        if (randomNum == 1) {
            cpuRock = true;
            System.out.println("CPU chose Rock");
            // Display Rock ASCII art
            System.out.println("    _______");
            System.out.println("---'   ____)____");
            System.out.println("          ______)");
            System.out.println("       __________)");
            System.out.println("      (____)");
            System.out.println("---.__(___)");
        }
        if (randomNum == 2) {
            cpuPaper = true;
            System.out.println("CPU chose Paper");
            // Display Paper ASCII art
            System.out.println("    _______");
            System.out.println("---'    ____)____");
            System.out.println("           ______)");
            System.out.println("          _______)");
            System.out.println("         _______)");
            System.out.println("---.__________)");
        }
        if (randomNum == 3) {
            cpuScissors = true;
            System.out.println("CPU chose Scissors");
            // Display Scissors ASCII art
            System.out.println("    _______");
            System.out.println("---'   ____)____");
            System.out.println("          ______)");
            System.out.println("       __________)");
            System.out.println("      (____)");
            System.out.println("---.__(___)");
        }
        if (randomNum == 4) {
            cpuLizard = true;
            System.out.println("CPU chose Lizard");
            // Display Lizard ASCII art
            System.out.println("---.__________");
            System.out.println("        _______)");
            System.out.println("---.______)");
        }
        if (randomNum == 5) {
            cpuSpock = true;
            System.out.println("CPU chose Spock");
            // Display Spock ASCII art
            System.out.println("    ⌠⌒|");
            System.out.println(" ⌠⌒⌉| |   ◜﹆◜﹆");
            System.out.println(" | ||⩧|  / // /");
            System.out.println(" |_|| | /-//=/");
            System.out.println(" | || |/ // /");
            System.out.println(" ( || | // /");
            System.out.println(" |         .______");
            System.out.println(" |         __⫫____)");
            System.out.println("  |       |");
        }
        //If Cpu chose Rock
        if (cpuRock) {
            if (rock) {
                System.out.println("The Rocks Don't know what to do");
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
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
                tie = true;
            } else if (paper) {
                System.out.println("Paper goes side ways and Rock can't find were paper is and gives up");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (scissors) {
                System.out.println("Scissors trys to slash rock but brakes it's limbs in the process");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (lizard) {
                System.out.println("Rock waterboards Lizard by falling on top of it in a river");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (spock) {
                System.out.println("The infinanate power of Spock turns rock to dust");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            }
        }
        //If Cpu chose Paper
        if (cpuPaper) {
            if (rock) {
                System.out.println("Paper goes side ways and Rock can't find were paper is and gives up");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
            } else if (paper) {
                System.out.println("the Papers fold each other to the menecular size ");
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
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
                tie = true;
            } else if (scissors) {
                System.out.println("Scissors violently shreds Paper while it tries to run away");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (lizard) {
                System.out.println("Lizard eats a Paper snack");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (spock) {
                System.out.println("Paper absorbs the power of spock and infinatntly unfolds then smacks spock in the shmock");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            }
        }
        //If Cpu chose Scissors
        if (cpuScissors) {
            if (rock) {
                System.out.println("Rock calls his friends causing a rock slide that smash scissors to pieces");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (paper) {
                System.out.println("Scissors violently shreds Paper while it tries to run away");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (scissors) {
                System.out.println("Blades drawn they have an epic duel");
                System.out.println("blade clashing even force on each side");
                System.out.println("First it's your scissors");
                System.out.println("Then it's cpu scissors");
                System.out.println("They both go in for a final blow");
                System.out.println("Breaking both Blades");
                System.out.println("its a tie.");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("go again.");
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
                tie = true;
            } else if (lizard) {
                System.out.println("Scissors exacutes the lizard");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (spock) {
                System.out.println("Spock shows Scissors the deep universe causing it to scream then explode");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            }
        }
        //If Cpu chose Lizard
        if (cpuLizard) {
            if (rock) {
                System.out.println("Rock waterboards Lizard by falling on top of it in a river");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (paper) {
                System.out.println("Lizard eats a Paper snack");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (scissors) {
                System.out.println("Scissors exacutes the lizard");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (lizard) {
                System.out.println("You both chose lizard love wins");
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
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
                tie = true;
            } else if (spock) {
                System.out.println("Lizard slaps spock before it can move (No it's one weakness)");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            }
        }
        //If Cpu chose Spock
        if (cpuSpock) {
            if (rock) {
                System.out.println("The infinanate power of Spock turns rock to dust");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (paper) {
                System.out.println("Paper absorbs the power of spock and infinatntly unfolds then smacks spock in the shmock");
                playerScore++;
                wins++;
                winStreak++;
                loseStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (scissors) {
                System.out.println("Spock shows Scissors the deep universe causing it to scream then explode");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (lizard) {
                System.out.println("Lizard slaps spock before it can move (No it's one weakness)");
                cpuScore++;
                losses++;
                loseStreak++;
                winStreak = 0;
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
            } else if (spock) {
                System.out.println("The power of two spocks in the same place cause the universe to explode");
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
                System.out.println("CPU:    " + cpuScore);
                System.out.println("You:    " + playerScore);
                tie = true;
            }
        }

        // Check achievements after each game
        checkAchievements();

        // If it's a tie,    play again
        if (tie) {
            playGame(myInput); // Restart the game with same scanner
            return; // Exit current instance
        }

        // Play again logic
        System.out.println("Do wish to see a different option? (Yes/No)");
        String answer = myInput.nextLine().trim(); // Use existing scanner

        // Check if the answer starts with 'Y' or 'y'
        if (answer.length() > 0 && (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y')) {
            playGame(myInput); // Restart the game with same scanner
        }
    }
}

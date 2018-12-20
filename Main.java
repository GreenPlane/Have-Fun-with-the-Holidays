import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void snowman (String str){ //Method to print snowman.
        System.out.println("           ___\n"+
                "         _[___]_  _\n"+
                "          ( \" )  [_]\n"+
                "      '--(`~:~`)--|'\n"+
                "        / `-:-' \\ |\n"+
                "   __.--\\   :   /--.\n"+
                ".'`       '-----'    '-.._\n");
    }
    public static void gingerbread (String str){ //Prints gingerbread house.
        System.out.println("           )          \n" +
                "          (             \n" +
                "          _)_                                 (\n" +
                "         [I_I]                                 )\n" +
                "     ____[I_I]___________                    _(_\n" +
                "    /_ \\_[_I_] \\_  \\_  \\_\\                  [I_I]\n" +
                "   /_ \\_  \\_  \\_  \\_  \\_  \\_________________[_I_]_____\n" +
                "  /_ \\_  \\_  \\_  \\_  \\_  \\_\\_   \\_  \\_  \\_ \\[I_I]_  \\_\\\n" +
                " /__\\___\\___\\___\\___\\___\\___\\_ \\_  \\_  \\_  \\_  \\_  \\_  \\\n" +
                "    |  .---.       .---.  |\\_ \\_  \\_  \\_  \\_  \\_  \\_  \\_\\\n" +
                "    |  |_|_|       |_|_|  |  \\_  \\_  \\_  \\_  \\_  \\_  \\_  \\\n" +
                "    |  |_|_|  .'.  |_|_|  |_\\___\\___\\___\\___\\___\\___\\___\\_\\\n" +
                "    |       .'   '.       |[]   []                []   []|\n" +
                "    |   __.'       '.__   |||   ||    .------.    ||   |||\n" +
                "    |  | '._.'._.'._.' |  ||| .-||-.  |  __  |  .-||-. |||    .'.\n" +
                "    |  |  .'       '.  |  ||| |_||_|  | |  | |  |_||_| |||  .'   '.\n" +
                "    |  |.'           '.|  ||| |_||_|  | |__| |  |_||_| |||.'       '.\n" +
                "    |  '._.'._.'._.'._.'  ||| |_||_|  |o     |  |_||_| ||'._.'._.'._.'\n" +
                "    |  |.'           '.|  ||| ==||==  |      |  ==||== |||.'       '.\n" +
                "    | .'               '. |[]___[]    |      |    []___[.'           '.\n" +
                "    |'._.'._.'._.'._.'._.'|XXXXXXX\\___|______|___/XXXXX'._.'._.'._.'._.' \n" +
                "    | .'               '. |XXXXXXX|\\o__________o/|XXXXXX.'           '.~\"^\"~ \n" +
                "    .'                   '.#######|||__________|||####.'               '.\n" +
                "~\"^'._.'._.'._.'._.'._.'._.'^\"^\"~\"^\\|__________|/~\"^~'._.'._.'._.'._.'._.'\n" +
                "    .'                   '.   _ -   /__________\\  _-     __________   ~\"^\"~\n" +
                "  .'                       '.      /____________\\     (_/__________)_   _ -\n" +
                " ''._.'._.'._.'._.'._.'._.'    /______________\\   (__/\\______/\\___ \n" +
                "    ~\"^\"~\"^\"~                                               \n" +
                "             __            _ -            _ -         __ -        \"~^~\"\n" +
                "     __  -                                                   ~^~\n" +
                "                 ~^~          __  -           ~^~\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Gingerbread house or snowman?");
        String userInput = scan.nextLine();
        userInput = userInput.toLowerCase(); //Sets the entire line to lowercase in case user enters in something weird. (See next line)

        while (!(userInput.equals("gingerbread house") || userInput.equals("snowman"))){ //If userinput is stupid, then run loop until user becomes smart.
            System.out.println("bro it doesn't take a genius to type snowman or gingerbread house. Enter which one you want again.");
            userInput = scan.nextLine();
            userInput = userInput.toLowerCase();
        }

        System.out.println("Santa is bored, and he wants to have some fun before you get your picture!" + "\nChoose a number from 1-10.\nFive guesses!");
        int randomNumber = (int)(Math.random() * 10) + 1; //Creates a random number between 1 and 10 inclusive.
        System.out.println(randomNumber); //Used for testing the program.
        boolean guess = false; //Used as condition for the while loop below to continue running or stop running.
        int numberofGuesses = 5; //Fixed number of guesses (50% chance of winning).
        int showImage = 1; //This is important later on, so the user can choose whether to print the image. Prints by default, assuming user guesses correctly.

        while (guess == false){ //Loop runs until break.
            int guessInput = scan.nextInt(); //Asks for a number guess from user.
            numberofGuesses -= 1; //Decreases number of guesses after one guess is used.
            if (guessInput != randomNumber){ //When the guess is wrong.
                if (!(guessInput >= 1 && guessInput <= 10)){ //If user is stupid and doesn't choose between 1 and 10.
                    System.out.println("I don't want to call you a loser but you're really pushing my buttons here. Really?? I SAID 1 THROUGH 10!!");
                }
                else{ //If user can follow directions and enters a number between 1-10.
                    System.out.println("Hmmm...");
                }
                if (numberofGuesses > 0) { //If user still has guesses available.
                    System.out.println("Try again. " + numberofGuesses + " guesses remaining.");
                }
                else{ //If user runs out of guesses.
                    System.out.println("Oh well, try again next time!\n\nBut since this is actually a comp sci assignment, here's your picture.");
                    System.out.println("\nEnter 1 to show image, or 0 to end (sore loser) :/");
                    showImage = scan.nextInt(); //Used because the following print statements above are pushed up by the image and I want to make sure user sees the sentences.
                    break; //End operation.
                }
            }
            else{ //If user guesses correctly.
                System.out.println("Congratulations! Here's your " + userInput + "!");
                System.out.println("\nEnter 1 to show image, or 0 to end.");
                showImage = scan.nextInt(); //Used because the following print statements above are pushed up by the image and I want to make sure user sees the sentences.
                break; //End operation.
            }
        }
        if (userInput.equals("snowman") && showImage == 1){
            snowman(userInput);
        }
        else if (userInput.equals("gingerbread house") && showImage == 1){
            gingerbread(userInput);
        }
        else{
            System.out.println("See you next time!"); //If user enters 0 to end the program (I don't know why anyone WOULDN'T want a beautiful picture, but just in case).
        }

    }
}

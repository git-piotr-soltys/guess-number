import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int newRandomNumber = rand.nextInt(100);
        System.out.println(" Welcome to a very simple guess number game!");
        System.out.println(" New integer has been generated. Guess this number.");

        boolean play = true;
        int counter = 0;

        while(play == true){
            counter++;
            System.out.print(" Your guess: ");
            Scanner userInput = new Scanner(System.in);
            int yourGuess = 0;
            try{
                yourGuess = userInput.nextInt();
            }
            catch(Exception e){
                System.out.println(" Number you have typed is incorrect. Try again.");
            }
            finally {
                if (yourGuess == newRandomNumber) {
                    System.out.println(" Well done. This is the number.");
                    System.out.print(" You made it in ");
                    if(counter==1) System.out.println("1 guess.");
                    else System.out.println(counter + " guesses.");
                    play = false;
                } else if (yourGuess > newRandomNumber) {
                    System.out.println(" Sorry. Your number is too high. Try again.");
                } else {
                    System.out.println(" Sorry. Your number is too low. Try again.");
                }
            }
        }

    }
}

package projects2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random()* 99 + 1);

        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \n You will be asked to guess a number to win the game \n You have maximum 5 attempt limit ");

        do{
            System.out.println("Enter a guess number between 1 to 100\n");
            if(scn.hasNextInt()){
                    userGuessNumber = scn.nextInt();
                    if(userGuessNumber == secretNumber){
                        System.out.println("00hh00!, Your number is Correct . You win the Game!!");
                        break;
                    }else if(userGuessNumber < secretNumber){
                        System.out.println("Your Guess Number is Smaller.");
                    }else if (userGuessNumber > secretNumber) {
                        System.out.println("Your Guess Number is Greater.");
                    }
                if(attempt == 5){
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            } else{
                System.out.println("Enter a valid Integer Number");
                break;
            }
        }while(userGuessNumber != secretNumber);
    }
}

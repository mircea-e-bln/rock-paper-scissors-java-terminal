import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
    
         String selection = scan.nextLine().toLowerCase();

        if(selection.equals("yes")){
            System.out.println("Great!");
            System.out.println("\n Rock - Paper - Scissors, shoot!");
            String yourChoice = scan.nextLine();
            //random function for computer
            String computerChoice = computerChoice();
            //final result function
            String result = result(yourChoice, computerChoice);
            //printing result
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("Aww, some other time then...");
            System.exit(0);
        }
        
              

        scan.close();
    }

     public static String computerChoice(){
        double randomNumber = Math.random() * 3;
        randomNumber += 1;
        int integer = (int)randomNumber;
        
        switch (integer) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return " "; //shouldn't be possbile.
        }
            
     }



    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if((yourChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) || (yourChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) || (yourChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))){
            result = "You won!";
        } else if( (computerChoice.equalsIgnoreCase("Rock") && yourChoice.equalsIgnoreCase("Scissors")) || (computerChoice.equalsIgnoreCase("Paper") && yourChoice.equalsIgnoreCase("Rock")) || (computerChoice.equalsIgnoreCase("Scissors") && yourChoice.equalsIgnoreCase("Paper"))){
            result = "You lose";
        } else if (!yourChoice.equalsIgnoreCase("Rock") && !yourChoice.equalsIgnoreCase("Scissors") && !yourChoice.equalsIgnoreCase("Paper") ) {
            result = "Invalid input. Please type rock, paper or scissors.";
        } else {
            result = "It's a draw";
        }

        return result;
      }
 
     
    public static void printResult(String yourChoice, String computerChoice, String result){
            System.out.println("You chose: " + yourChoice);
            System.out.println("The computer chose: " + computerChoice);
            System.out.println(result);
    }

}

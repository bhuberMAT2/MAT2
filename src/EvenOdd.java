import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
	
		Scanner answer = new Scanner(System.in);						  //declares the answer scanner
		
		String contin = "yes";											  //begin While loop
		while(contin.equalsIgnoreCase("yes")){
		
		System.out.print("Please enter your name: ");
		String name = answer.nextLine();
		System.out.print("Please enter a number between 1 and 100: ");   //asking for a number from the user
		int userInput = answer.nextInt();
		 answer.nextLine();
		
		if (userInput % 2 != 0){										//begin the if else statement
			System.out.println(name + ", " + userInput + " is an ODD number");
		}else if ( userInput % 2 == 0 & userInput <= 25){
			System.out.println(name + ", " + userInput + " Even and not Weird");
		}else if (userInput % 2 == 0 & userInput >= 26 & userInput <= 60 ){
			System.out.println(name + ", " + userInput + " is a Weird number");
		}else if(userInput % 2 == 0 & userInput >= 60 ){
			System.out.println(name + ", " + userInput + " is Not Weird");
		}else {
			System.out.println(name + ", " + userInput + " Your number is wrong!");
		}
		
		
		System.out.print(name + ", Do you want to enter another number? Yes or No? ");
		contin = answer.nextLine();												//last line of the while loop
		
		
		
	}
		System.out.println("Yo dun");										//exits the while loop
		answer.close();														//closes the answer scanner
		
  }
}

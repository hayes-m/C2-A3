import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class c2a3q3_2019_MarkHayes {



	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Player[] playerArray = new Player[7];			//creates new instance of Player class

		playerArray[0] = new Player("Nick ", "Drake", 3.2);
		playerArray[1] = new Player("Elliott ", "Smith", 6.6);
		playerArray[2] = new Player("Max ", "Richter", 8.4);
		playerArray[3] = new Player("Michael ", "Giacchino", 30.6);
		playerArray[4] = new Player("Thomas ", "Newman", 14.4);		
		playerArray[5] = new Player("Philip ", "Glass", 27.4);	
		playerArray[6] = new Player ("Brody ", "Dalle", 9.4);		//constructing elements of the 'Player' class


		for (Player element : playerArray)
		{
			System.out.println("Player " + element.getForename() + element.getSurname() + " has a score of " + element.getScore() + ".");
		}		//informs the user of each element and their states

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		Scanner in = new Scanner(System.in);


		int n = 0;
		while (!((n == 1) || (n == 2)))
		{
			try
			{
				System.out.println("Sort by: \n 1.	Name\n 2.	Score");		
				n = in.nextInt();
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Invalid input. 1 or 2. ");
				in.nextLine();
			}
		}		//while loop asks for input to sort array by - name or score

		in.close();		//closes input

		if (n == 1) {
			Player.setSortType("surname");		//sets to sort by name if user inputs '1'
		}
		else if (n == 2)
		{
			Player.setSortType("score");		//sets to sort by score if user inputs '2'
		}
		else
		{
			System.out.println("Unsorted");		//leaves array alone if anything else is input
		}	

		Arrays.sort(playerArray);		//sorts the array depending on user input

		for (Player element : playerArray)
		{
			System.out.println("Player " + element.getForename() + element.getSurname() + " has a score of " + element.getScore() + ".");
		}		//prints the sorted array via a for loop


	}

}

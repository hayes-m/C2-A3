import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class c2a3q4_2019_MarkHayes {

	static int n = 20;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();		//declares the linked list variable


		list.add("One Flew Over the Cuckoo's Nest");
		list.add("Two Days in Paris");
		list.add("Three Kings");
		list.add("Four Lions");
		list.add("The Fifth Element");
		list.add("Six Degrees of Separation");
		list.add("The Seventh Seal");
		list.add("8 1/2");
		list.add("The Nines");
		list.add("Ten Items or Less");			//populates the linked list

		System.out.println(list);	//prints the original list


		Scanner in = new Scanner(System.in);


		while ((n > list.size()) || n <= 0)
		{
			try
			{
				System.out.println("Please enter a number: ");		
				n = in.nextInt();
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Invalid input. Try an integer between 1 and 10. ");
				in.nextLine();
			}			//while loop to prompt for user input: a number by which to remove linked list positions
		}

		in.close();

		prune(list, n);		//calls the 'prune' method

		System.out.println(list);		//prints the list as 'pruned'


	}

	/**
	 * @param list
	 * @param n, number by which to prune the list
	 * @return	new pruned list
	 */
	public static LinkedList<String> prune(LinkedList<String> list, int n) {

		int i = 1;
		int nth = n-1;		//declares variables

		if (nth <= 0)		//only prunes if the input number is 1 or above
		{
			System.out.println(list);
		}
		else
		{

			while (nth < list.size()) {	
				list.remove(nth);	//removes the nth position

				i++;		

				nth = n * i - i;		//iterates through the linked list to prune the nth positions
			}
		}
		return list;		//returns the final pruned list
	}
}

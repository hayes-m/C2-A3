import java.util.Arrays;

/**
 * @author M
 *
 */
public class c2a3q2_2019_MarkHayes {

	private static int attempts = 0;	//initialises class variable to count search attempts

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numbers = {40, 3, 9, 2, 6, 25};
		int searchedNumber = 10;				//initialises variables

		System.out.println("Original array is " + Arrays.toString(numbers));	//prints original order

		sort(numbers);	//calls 'sort' method

		System.out.println("In descending order, this becomes " + Arrays.toString(numbers));	//prints new order

		int result = binarySearch(numbers, 0, 5, searchedNumber);	//calls 'binarySearch' method with arguments and assigns result to a variable
		if (result != -1) 	
		{
			System.out.println("Your number is in position " + (result+1) + " of the array. It took " + attempts + " attempts to find it");	//prints position of input if found, as well as number of attempts to find
		}
		else 
			System.out.println("The number 10 was not located. It took " + attempts + " attempts to find it");	//prints number of attempts in the event of an unfound number input
	}

	/**
	 * @param numbers
	 */
	public static void sort(int[] numbers)		//'sort' method
	{
		if (numbers.length <= 1)	//leaves the array alone if there is one or less element
		{
			return;
		}

		int[] firstHalf = new int[numbers.length/2];		//assigns first half of the array to a variable
		int[] secondHalf = new int[numbers.length - firstHalf.length];		//assigns second half of array

		for (int i = 0; i < firstHalf.length; i++) 
		{
			firstHalf[i] = numbers[i];	//for loop that iterates through the first half of the array
		}	
		for (int i = 0; i < secondHalf.length; i++)
		{
			secondHalf[i] = numbers[firstHalf.length + i];	//for loop that iterates through the second half of the array
		}
		sort(firstHalf);		//calls 'sort' method on first half of array
		sort(secondHalf);		//calls 'sort' method on second half of array
		merge(firstHalf, secondHalf, numbers);		//calls 'merge' method creating an ordered array


	}

	/**
	 * @param firstHalf
	 * @param secondHalf
	 * @param numbers
	 */
	private static void merge(int[] firstHalf, int[] secondHalf, int[] numbers)
	{
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;			//initialises method variables

		while (iFirst < firstHalf.length && iSecond < secondHalf.length) {	
			if (firstHalf[iFirst] > secondHalf[iSecond]) {		
				numbers[j] = firstHalf[iFirst];
				iFirst++;			//as long as one of two numbers is greater than the other, it will be shifted to the beginning of the array, which creates a descending order
			}
			else
			{
				numbers[j] = secondHalf[iSecond];
				iSecond++;			//above calculation applies to the second half of the array, until all smaller arrays are in descending order
			}
			j++;
		}
		while(iFirst < firstHalf.length) {
			numbers[j] = firstHalf[iFirst];
			iFirst++;		//reassigns ordered array back to the larger array, merging halves together
			j++;

		}
		while(iSecond < secondHalf.length) {
			numbers[j] = secondHalf[iSecond];
			iSecond++;		//as above, reassigns ordered array
			j++;
		}
	}

	/**
	 * @param numbers
	 * @param first
	 * @param last
	 * @param value
	 * @return
	 */
	public static int binarySearch(int[] numbers, int first, int last, int value)
	{
		if (first <= last)	
		{
			int middle = (first + last) / 2;	//assigns centre value of an array to a variable
			attempts++;		//iterator to count attempts of binary search which sits in every calculation hereafter


			if (numbers[middle] == value)		
			{
				attempts++;
				return middle;		//returns position if requested value is equal to the centre value of the array
			}
			else if (numbers[middle] > value)
			{				
				attempts++;		

				return binarySearch(numbers, middle + 1, last, value);	//recursively uses method to continue search
			}
			else
			{				
				attempts++;

				return binarySearch(numbers, first, middle - 1, value);	//recursively uses method to continue search
			}
		}
		else
		{		
			attempts++;

			return -1;		//returns negative figure if input value cannot be found

		}



	}


}







package Q5;

import java.util.LinkedList;

/**
 * Write a description of class Pruner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pruner
{
    public static void prune(LinkedList<String> list, int n) {
		
			int i = 1;
			int nth = n-1;		//declares variables
			
			if (nth <= 0)		//only prunes if the input number is 1 or above
			{
				System.out.println(list);
			}
			else
			{
			
			while (nth < list.size()) {
				list.remove(nth);		//removes the nth position
				
				i++;
				
				nth = n * i - i;		//iterates through the linked list to prune the nth positions
			}
			System.out.println(list);		//returns the final pruned list
			}
	}
    }


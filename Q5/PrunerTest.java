package Q5;

import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.LinkedList;

import org.junit.Test;



public class PrunerTest {

	@Test	
	public void testPrune() {

		Pruner testPrune = new Pruner();

		LinkedList<String> actualList = new LinkedList<String>();

		actualList.add("A");
		actualList.add("B");
		actualList.add("C");
		actualList.add("D");
		actualList.add("E");
		actualList.add("F");
		actualList.add("G");
		actualList.add("H");
		actualList.add("I");
		actualList.add("J");		//populates linked list

		Pruner.prune(actualList, 4);		//calls method

		//Test 1 to succeed
		assertTrue("Correct length", actualList.size() == 8);

		//Test 2 to fail
		//assertEquals("Incorrect character", "D", ((CharSequence) actualList).charAt(3));

		JUnitCore jUnitCore = new JUnitCore();
		Result result = jUnitCore.run(PrunerTest.class);
		for (Failure failure:result.getFailures()) {
			System.out.println(failure.toString());		//Printing JUnitCore results
		}
	}

}








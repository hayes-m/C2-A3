/**
 * @author M
 *
 */
public class Player implements Comparable<Player>{				//generates the 'Boat' class for use in the 'q3' program

	private String forename = "";
	private String surname = "";
	private double score = 0;				
	private static String sortType = "";		//initialises instance variables

	/**
	 * @param forename
	 * @param surname
	 * @param score
	 */
	public Player(String forename, String surname, double score) {
		this.forename = forename;
		this.surname = surname;
		this.score = score;			

	}

	/**
	 * @returns forename
	 */
	public String getForename() {		//below - getters and setters for class variables
		return forename;
	}

	/**
	 * @param forename
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}

	/**
	 * @return surname to sort by
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname by which user can choose to sort
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return score to sort by
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score by which user can choose to sort
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return sort type chosen by user
	 */
	public static String getSortType() {
		return sortType;
	}

	/**
	 * @param sortType	set by user
	 */
	public static void setSortType(String sortType) {
		Player.sortType = sortType;
	}


	
	@Override
	public int compareTo(Player sortType) {			//compareTo method which sorts the array depending on user input
		if (Player.sortType == "surname") {
			return new String(surname).compareTo(new String(sortType.surname)); 		//sorts by surname if user wishes to sort by name
		} 

		else if (Player.sortType == "score") {
			return new Double(score).compareTo(new Double(sortType.score)); 		//sorts by score
		}

		else {
			return 0;
		}
	}		

}





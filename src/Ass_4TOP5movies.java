import java.util.ArrayList;
import java.util.List;

public class Ass_4TOP5movies {
	
//	4) create a list of the top 5 highest grossing movies of all time and print out the third movie on the list...
	

	public static void main(String[] args) {
		
// Top movies 
		
		List<String> movies =  new ArrayList<>();
		
		 movies.add("2states");
		 movies.add("Rajkumar");
		 movies.add("Jab we met");
		 movies.add("Thank you");
		 movies.add("Intelligent khadali");
		 
		 System.out.println(" 3rd movie is:: " + movies.get(2));
		 
		
		
	}

}

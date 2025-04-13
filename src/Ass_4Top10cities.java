import java.util.HashSet;
import java.util.Set;



// 2) create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size
public class Ass_4Top10cities {

	public static void main(String[] args) {
		
		
		Set<String> Top10cities = new HashSet<>();
		
		// Add top 10 most visited tourist places
        Top10cities.add("Eiffel Tower, Paris");
        Top10cities.add("Great Wall of China, China");
        Top10cities.add("Statue of Liberty, USA");
        Top10cities.add("Colosseum, Rome");
        Top10cities.add("India Gate, India");
        Top10cities.add("Christ the Redeemer, Brazil");
        Top10cities.add("Museum, Paris");
        Top10cities.add("Taj Mahal, India");
        Top10cities.add("Burj Khalifa, Dubai");
        Top10cities.add("Niagara Falls, USA/Canada");

        System.out.println("Top 10 cities ::"  + Top10cities + " Top10cities" + Top10cities.size());
        
	}

}

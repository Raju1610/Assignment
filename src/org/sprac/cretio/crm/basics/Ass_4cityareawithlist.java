package org.sprac.cretio.crm.basics;

import java.util.ArrayList;
import java.util.List;

public class Ass_4cityareawithlist {

	public static void main(String[] args) {
		
//		Create lists for city names and areas
		
		List<String> cities = new ArrayList<>();
		List<Double> areas= new ArrayList<>();
		
//		Add top 5 cities and their area

		cities.add("New York City");
		areas.add(783.8);

        cities.add("Tokyo");
        areas.add(2194.07);

        cities.add("Chicago");
        areas.add(606.1);

        cities.add("Los Angeles");
        areas.add(1302.0);

        cities.add("Houston");
        areas.add(1651.1);
        
//        Get and sum the area of 3rd and 4th cities (index 2 and 3)
        Double totalareas= areas.get(2) + areas.get(3);
        
        System.out.println( "3rd city " + cities.get(2) +"Area "+ areas.get(2) +"sq km");
        System.out.println( "4rd city " + cities.get(3) +"Area "+ areas.get(3) +"sq km");
        
        System.out.println("combined  areas +  " + totalareas + "sq km");
        
        
        
	}

}

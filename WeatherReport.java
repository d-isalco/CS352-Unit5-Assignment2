import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author John Cigas
 * David Montenegro 19 November 2020
 * CS352-Unit 5 Assignment 2
 */
public class WeatherReport {
        private LinkedList<Temperature> temperatures;

        public WeatherReport() {
            temperatures = new LinkedList<Temperature>();

            temperatures.add(new Temperature("Tampa", "FL", 59, 71));
            temperatures.add(new Temperature("Miami", "FL", 70, 82));
            temperatures.add(new Temperature("Chicago", "FL", 20, 30));
            temperatures.add(new Temperature("Denver", "FL", 12, 40));
            temperatures.add(new Temperature("Seattle", "FL", 28, 72));
            temperatures.add(new Temperature("Orlando", "FL", 57, 72));
            temperatures.add(new Temperature("Phonix", "FL", 45, 69));
            temperatures.add(new Temperature("Atanta", "FL", 36, 48));
            temperatures.add(new Temperature("Los Angeles", "FL", 45, 63));
        }

        public void displayTemperatures() {
            for (Temperature temp : temperatures) {
                System.out.println(temp.getCity() + "," +
                    temp.getState() + "," + "| Low: " +
                    temp.getLow() + "| High: " + 
                    temp.getHigh());
            }
        }
}
/*
 * Comparator to sort by the city stored in a Temperature object
 */
class SortByCity implements Comparator<Temperature> {
    // Used for sorting in ascending order of City
    public int compare(Temperature t1, Temperature t2)
    {
        return t1.getCity().compareTo(t2.getCity());
    }
}

/*
 * Comparator to sort by the high temperature stored in a Temperature object
 */
class SortByHigh implements Comparator<Temperature> {
    // Used for sorting in ascending order of high temperature
    public int compare(Temperature t1, Temperature t2)
    {
        return t1.getHigh() - t2.getHigh();
    }
}
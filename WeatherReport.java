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
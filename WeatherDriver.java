import java.io.FileNotFoundException;
/**
 * @author John Cigas
 * David Montenegro
 * 19 November 2020
 * CS352-Unit 5 Assignment 2
 */
public class WeatherDriver {

	public static void main(String[] args) {
		System.out.println("Starting simulation");

		WeatherReport report = new WeatherReport();
		report.displayTemperatures();

		/*making sure class is working properly
		Temperature tampa = new Temperature("Tampa", "FL", 50, 71);
		System.out.println("City: " + tampa.getCity());
		System.out.println("State: " + tampa.getState());
		System.out.println("Low: " + tampa.getLow());
		System.out.println("High: " + tampa.getHigh());
		System.out.println("Differential: " + tampa.Differential());
		*/

		/*
		String fileName = "weather.txt";
		try { 
			WeatherReport wr = new WeatherReport(fileName);
			System.out.println(wr.isSortedByCity());			
		} 
		catch (FileNotFoundException e ) {
			System.out.println("Can't find file " + fileName); 
		}
		catch (Exception e) {
			System.out.println("Other error: " + e.getMessage());
		}
		*/
		System.out.println("Finished simulation");
	}

}

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

		
		System.out.println("Test list sorted by City? "+
			report.isSortedByCity());

		System.out.println("Test list sorted by hihg? " +
			report.isSortedByHigh());
		
		
		System.out.println("\nSorting test list by City...");

		//Sort the LinkedList alphabetically
		report.sortWithCollections("City");

		//Display the sorte list
		report.displayTemperatures();

		//Verify the sorting worked
		System.out.println("Sorted by City? "+
			report.isSortedByCity());
		
		System.out.println("\nSorting test list by High...");

		//Create a new report with the original nine cities
		WeatherReport highReport = new WeatherReport();

		//Sort the LinkedList by high temp
		highReport.sortWithCollections("High");

		//Display the sorted temp
		highReport.displayTemperatures();

		//Verify the sorting worked
		System.err.println("Sorted by High? " +
			highReport.isSortedByHigh());

		try{
			WeatherReport fileReport = new WeatherReport("weather.txt");

			System.out.println("File loaded succesfully");
			System.out.println("Total weather records: " + 
				fileReport.getRecordCount());

			System.out.println("File sorted by City? " + 
				fileReport.isSortedByCity());
			
			System.out.println("File sorted by High? " +
				fileReport.isSortedByHigh());
		}

		catch (FileNotFoundException e){
			System.out.println("Cannot find weather.txt");
		}

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

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

		try{
			WeatherReport fileReport = new WeatherReport("weather.txt");

			System.out.println("File loaded succesfully");
			System.out.println("Total weather records: " + 
				fileReport.getRecordCount());

			System.out.println("File sorted by City? " + 
				fileReport.isSortedByCity());
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

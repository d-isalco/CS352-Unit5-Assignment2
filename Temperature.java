/**
 * @author John Cigas
 *
 * Stores low and high temperature data for a city/state 
 */
public class Temperature {
	private String city;
	private String state;
	private String low;
	private String high;

	
	/* Add appropriate instance attributes, constructors, and accessor/mutator methods */
	public Temperature(String city, String state, String low, String high){
		this.city = city;
		this.state = state;
		this.low = low;
		this.high = high;
	}
}

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

	//getter methods
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getLow() {
		return low;
	}

	public String getHigh() {
		return high;
	}

	//setter methods
	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public void setHigh(String high) {
		this.high = high;
	}
}

/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Address class
 * <p>
 * This is the main class that the persons refer to for their address, which by effect
 * is called as a super constructor for the abstract class Employee and all its subsidiaries. 
 * </p>
 */

package HW8;

public class Address {
	
	/**
	 * simple toString method
	 */
	
	@Override
	public String toString() {
		return "Address [streetnum=" + streetnum + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + "]";
	}
	
	/**
	 * street number
	 */
	public int streetnum;
	/**
	 * string attribute for name of the users street
	 */
	public String streetName;
	/**
	 * string attribute for city
	 */
	public String city;
	/**
	 * string attribute for zip code
	 */
	public String zip;
	/**
	 * string attribute for state
	 */
	public String state;
	
	Address(int streetnum, String streetName, String city, String zip, String state){
		
		setCity(city);
		setZip(zip);
		setState(state);
		setStreetName(streetName);
		setStreetNum(streetnum);
		
	}
	
	public int getStreetNum() {
		return streetnum;
	}

	public void setStreetNum(int streetnum) {
		this.streetnum = streetnum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

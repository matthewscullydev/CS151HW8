/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Person class
 * 
 * <p>
 * This is the Person class which is an extension of the address class. Since a person is an extension of an address,
 * the default super constructor must have an initialized empty address. This person class includes the first name, last name, ssn, age, and address of a person.
 * 
 * </p>
 */

package HW8;

public class Person extends Address {

	public Person()
	{
		super(0,"","","","");
	}
	
	public Person (String firstname, String lastname, int age, String ssn, Address address) {
		super(address.streetnum, address.streetName, address.city, address.zip, address.state);
		
		setFirstName(firstname);
		setLastName(lastname);
		setAddress(address);
		setAge(age);
		setSsn(ssn);
		
		
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn
				+ ", address=" + address;
	}

	/**
	 * String attribute for first name
	 */
	String firstName;
	/**
	 * String attribute for last name
	 */
	String lastName;
	/**
	 * integer attribute for age
	 */
	int age;
	/**
	 * String attribute for ssn
	 */
	String ssn;
	/**
	 * address object attribute
	 */
	Address address = new Address(streetnum, streetName, city, zip, state);
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}

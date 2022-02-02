public class Person {
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	public Person() {
		name = "none";
		address = "none";
		phone = "none";
		email = "none";
	}
	public Person(String name, String address,
                  String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
	  String output;
    output = String.format("Name: %s\nAddress: %s\nPhone: %s\nEmail: %s\n",
    		              name, address, phone, email);
	  return output;
	}
}
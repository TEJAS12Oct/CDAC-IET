package Q3;

public class Address {
	String Area, City, State, Country;
	int Pin;

//	Address() {
//		
//	}

	public Address(String area, String city, String state, String country, int pin) {
		Area = area;
		City = city;
		State = state;
		Country = country;
		Pin = pin;
	}

	@Override
	public String toString() {
		return "Address [Area=" + Area + ", City=" + City + ", State=" + State + ", Country=" + Country + ", Pin=" + Pin
				+ "]";
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		Pin = pin;
	}
}

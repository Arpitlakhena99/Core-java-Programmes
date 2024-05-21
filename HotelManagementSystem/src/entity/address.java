package entity;
public class address {

     private String houseNumber;
     private String city;
     private String district;
     private String country;
     private int pincode;
	public address(String houseNumber, String city, String district, String country, int pincode) {
		this.houseNumber = houseNumber;
		this.city = city;
		this.district = district;
		this.country = country;
		this.pincode = pincode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "address [houseNumber=" + houseNumber + ", city=" + city + ", district=" + district + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	
     
}

package entity;

public class address {
    String houseNumber;
    String city;
    String district;
    String country;
     int pincode;
	public address(String houseNumber, String city, String district, String country, int pincode) {
		this.houseNumber = houseNumber;
		this.city = city;
		this.district = district;
		this.country = country;
		this.pincode = pincode;
	}
     
}

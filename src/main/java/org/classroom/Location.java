package org.classroom;

public class Location {
	String Area;
	String City;
	
	
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
	
	public Location(String Area, String City) {
		this.setArea(Area);
		this.setCity(City);
	}
	
}

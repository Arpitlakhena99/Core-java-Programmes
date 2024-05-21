package entity;
public class Car implements Comparable<Car>{
	private int cid;
	private String brand;
	private String color;
	private double price;
	private String fueltype;
	private int model;
	private int milage;
	public Car(int cid,String brand,String color,double price,String fueltype,int model,int milage) {
		this.cid     =cid;
		this.brand   =brand;
		this.color   =color;
		this.price   =price;
		this.fueltype=fueltype;
		this.model   =model;
		this.milage  =milage;
	}
	public int getCid(){
		return cid;
	}
	public void setCid(int cid) {
		this.cid=cid;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype=fueltype;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model=model;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage=milage;
	}
	@Override
	public String toString() {
		return "Car[cid="+cid+",Brand="+brand +",color="+color+",price="+price+",fueltype="
				+fueltype+",model="+model+",milage="+milage+"]";
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
				if(this.cid>o.getCid())
				{
					return 1;
				}
				else if(this.cid<o.getCid())
				{
					return -1;
				}
				return 0;
		}
	}
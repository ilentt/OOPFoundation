package vn.elca.training;

public class Car {
	private String color;
	private int maxspeed;
	/**
	 * @param color
	 * @param maxspeed
	 */
	public Car() {
		// constructor
	}
	
	public Car(String color, int maxspeed) {
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	public void CarInfo() {
		System.out.println("Car color = " + color + "Max speed " + maxspeed);
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxspeed() {
		return maxspeed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
}

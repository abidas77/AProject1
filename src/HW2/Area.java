package HW2;


public class Area {

	private final static double pi = 3.14;
	private double radius, length, width, height;
	
	public Area()
	{
		radius = 1;
		length = 1.0;
		width = 1.0;
		height = 1.0;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static double getPI()
	{
		return pi;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getAreaRectangle()
	{
		return length * width;
	}
	
	public double getAreaCirlce()
	{
		return pi * radius * radius;
	}
	
	public double getAreaCube()
	{
		return (length * width * 2) + (length * height * 2) + (width * height * 2);
	}
	
}

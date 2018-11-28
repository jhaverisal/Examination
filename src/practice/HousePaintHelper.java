package practice;

public class HousePaintHelper {
	
	private double length,width,height,tsa;
	private int numWindows;
	private int numDoors;
	
	
	public double calcArea(double l,double b)
	{
		return l*b;
	}

	
	public double calcFourFaces(double l,double b,double h)
	{
		tsa=2*(b*h+h*l);
		return tsa;
	}
}

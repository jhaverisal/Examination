package practice;

import java.util.Scanner;

public class InputHelper {
	
	private String s;
	private int i;
	private double d;
	
	Scanner reader=new Scanner(System.in);
	
	public String readString(String msg)
	{
		System.out.println(msg);
		s=reader.next();
		return s;
		
	}
	
	public int readInt(String msg)
	{
		System.out.println(msg);
		i=reader.nextInt();
		return i;
	}
	
	public double readDouble(String msg)
	{
		System.out.println(msg);
		d=reader.nextDouble();
		return d;
	}
	

}

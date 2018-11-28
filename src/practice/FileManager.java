package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileManager {
	
	private static InputHelper helper=new InputHelper();
	public static void main(String args[])
	{
		File f = new File("menu.txt");
		
		
		String menu;
		menu=helper.readString("enter items for the menu or exit");
		PrintWriter  writer=null;
		try
		
			{
			writer=new PrintWriter(f);
		while(!menu.equalsIgnoreCase("exit"))
		{
			//writer.print("\n"+menu);
			writer.println(menu);
		menu=helper.readString("enter items for the menu or exit");
		
		}
		writer.close();
		addPrice(f);
		
		
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
	
	
	public static void addPrice(File f)
	{
		File withPrice=new File("menuPrice.txt");
		try
		(
				//Scanner reader=new Scanner(f);
				FileReader freader=new FileReader(f);
				BufferedReader  reader=new BufferedReader(freader);
				PrintWriter writer=new PrintWriter(withPrice);
		)
		{
		System.out.println("enter the price for listed items");
		String menuItem=null;
		double price=0.0;
		//freader.
		while((menuItem=reader.readLine() )!= null)
		{
			//menuItem=reader.next();
			price=helper.readDouble("enter the price of :"+menuItem);
			//System.out.println("enter the price for :"+menuItem);
			writer.println(menuItem+"\t"+price);
		}
		}
		
	catch(FileNotFoundException  e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		//return withPrice;
	}

}

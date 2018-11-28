package com.paper;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args)  {
		
		/*String query="select * from Prepositions_Std_9";
		DBConnection db=DBConnection.getInstance();
		db.executeQuery(query);*/
		String st="first";
		String s1="new";
		s1+=st;
		System.out.println(s1);
		String arr[]= {"sal","ash","lee"};
		List s=Arrays.asList(arr);
		
		try {
		for(int i=0;i<=arr.length;i++)
			System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the runtime exception got caught");
		}
		
		s.forEach(System.out::println);
		

	}

}

package practice;

import java.util.ArrayList;

public class GroceryStore {

	public static void main(String[] args) {
		int numItems=0;
		String searchItem;
		InputHelper helper=new InputHelper();
		
		ArrayList <String> items =new ArrayList<String> ();
		numItems =helper.readInt("enter the no. of items in grovery store");
		for(int i=1;i<=numItems;i++)
		
			items.add(helper.readString("Item no :"+i));

		for(String s:items)
			System.out.println(s);
		searchItem=helper.readString("enter the item to be searched");
		if(itemSearch(items,searchItem))
			System.out.println("the item is already in the list");
		else
		{
			System.out.println("item not found in the list, but will be added");
			items.add(searchItem);
			
		}
		System.out.println("the new list is: ");
		for(String s:items)
			System.out.println(s);
			
		
	}
	
	
	public static boolean itemSearch(ArrayList<String> l,String pdt)
	{
		if(l.contains(pdt))
			return true;
		else
			return false;
	}

}
